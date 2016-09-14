/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.ejemplo.controller;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.transaction.Transactional;

/**
 * @author mdominguez
 */
@ViewScoped
@Named(value = "pedidoCtrl")
@Transactional
public class PedidoController implements Serializable{
    
}
