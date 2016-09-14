/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.ejemplo.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mdominguez
 */
@Entity
public class Pedido implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String cuitCliente;
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> items;

    public Pedido() {
    }
    
    public Pedido(Date fecha, String cuitCliente) {
        this(null,fecha,cuitCliente,new ArrayList<ItemPedido>());
    }
    
    public Pedido(Integer id, Date fecha, String cuitCliente) {
        this(id,fecha,cuitCliente,new ArrayList<ItemPedido>());
    }
    
    public Pedido(Integer id, Date fecha, String cuitCliente, List<ItemPedido> items) {
        this.id = id;
        this.fecha = fecha;
        this.cuitCliente = cuitCliente;
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCuitCliente() {
        return cuitCliente;
    }

    public void setCuitCliente(String cuitCliente) {
        this.cuitCliente = cuitCliente;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }
    
    
    
}
