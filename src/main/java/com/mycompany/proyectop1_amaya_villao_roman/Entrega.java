/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoEntrega;
import Enums.TipoPago;
import java.time.*;

/**
 *
 * @author danie
 */
public class Entrega extends Servicio{
    private int numProductos;
    private double peso;
    private TipoPago pago;
    
    /**
     * Constructor de la clase Entrega
     * @param numProductos
     * @param pago
     * @param entrega
     * @param origen
     * @param destino
     * @param fecha
     * @param tiempo
     * @param conductor
     * @param valorPagar 
     * @param cliente
     */
    public Entrega(String origen, String destino, LocalDate fecha, LocalTime tiempo, Conductor conductor, double valorPagar,Cliente cliente,int numProductos, TipoPago pago, TipoEntrega entrega) {
        super(origen, destino, fecha, tiempo, conductor, valorPagar, cliente);
        this.numProductos = numProductos;
        this.pago = pago;
    }
    
    
}
