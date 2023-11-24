/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Servicio {
    private String origen;
    private String destino;
    private String fecha;
    private Conductor conductor;
    double ValorPagar;
    
    /**
     * Constructor de la clase Servicio
     * @param origen
     * @param destino
     * @param fecha
     * @param conductor
     * @param valorPagar 
     */
    public Servicio(String origen,String destino, String fecha, Conductor conductor, double valorPagar){
        this.origen=origen;
        this.destino=destino;
        this.fecha = fecha;
        this.conductor = conductor;
        this.ValorPagar = valorPagar;
    }
    
    
    /**
     * Este método se encarga del pago del servicio
     * @param valorPagar es el valor que el cliente debe pagar
     */
    public void pagoServicio(double valorPagar){
        
    }
    
}
