/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.ejemplo.controller;

import com.martin.ejemplo.modelo.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @author mdominguez
 */
@ViewScoped
@Named(value = "listaProdCtrl")
@Transactional
public class ProductoListaController implements Serializable {

    private List<Producto> productos;
    private Producto productoSeleccionado;

    @PersistenceContext(unitName = "ejemploPU")
    private EntityManager em;

    @PostConstruct
    public void init(){        
        this.productos = em.createQuery("SELECT p FROM Producto p").getResultList();        
        if(this.productos==null){
            this.productos = new ArrayList<Producto>();
        }
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> producto) {
        this.productos = producto;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }
    
    
    
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    
}
