/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoEntrega;
import Enums.TipoPago;

/**
 *
 * @author danie
 */
public class Entrega extends Servicio{
    private int numProductos;
    private double peso;
    private TipoPago pago;
    private TipoEntrega entrega;
    
    /**
     * Constructor de la clase Entrega
     * @param numProductos
     * @param pago
     * @param entrega
     * @param origen
     * @param destino
     * @param fecha
     * @param conductor
     * @param valorPagar 
     * @param cliente
     */
    public Entrega(String origen, String destino, String fecha, Conductor conductor, double valorPagar,Cliente cliente,int numProductos, TipoPago pago, TipoEntrega entrega) {
        super(origen, destino, fecha, conductor, valorPagar, cliente);
        this.numProductos = numProductos;
        this.pago = pago;
        this.entrega = entrega;
    }
    
}
