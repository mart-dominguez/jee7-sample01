/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.ejemplo.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author mdominguez
 */
@Entity
public class ItemPedido implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private Double cantidad;

    @ManyToOne
    @JoinColumn(columnDefinition = "ID_PRODUCTO")
    private Producto producto;
    @ManyToOne
    @JoinColumn(columnDefinition = "ID_PEDIDO")
    private Pedido pedido;

    public ItemPedido(Integer id, Producto producto, Double cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public ItemPedido(Producto producto, Double cantidad) {
        this(null,producto,cantidad);
    }

    public ItemPedido() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    
        
    
}
