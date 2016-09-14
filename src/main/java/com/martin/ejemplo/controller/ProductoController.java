/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.ejemplo.controller;

import com.martin.ejemplo.modelo.Producto;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.primefaces.event.SelectEvent;

/**
 * @author mdominguez
 */
@ViewScoped
@Named(value = "prodCtrl")
@Transactional
public class ProductoController implements Serializable {

    @Inject @ViewScoped
    ProductoListaController pdl;
     
    private Producto producto;

    @PersistenceContext(unitName = "ejemploPU")
    private EntityManager em;
    
    public String nuevoProducto(){
        this.producto = new Producto();
        return null;
    }

    public String cancelarEdicion(){
        this.producto = null;
        return null;
    }
    
   public void onRowUnselect(SelectEvent event) {
        System.out.println("Paso evento onRowUnselect");
      
   }
    

   public void onRowSelect(SelectEvent event) {
        System.out.println("Paso evento onRowSelect");
      
   }
    
    public String guardarProducto(){
        System.out.println("Paso 3:"+this.producto);
        if(producto!=null){
            if(producto.getId() != null && producto.getId()>0){
                        this.producto= em.merge(this.producto);
            }else{
                // agrego a la lista
                em.persist(this.producto);
                pdl.getProductos().add(this.producto);
            }
        }
        this.producto = null;
        return null;
    }

    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    
}
