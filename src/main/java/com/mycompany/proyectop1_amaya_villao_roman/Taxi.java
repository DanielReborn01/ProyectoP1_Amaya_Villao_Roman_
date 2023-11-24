/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoPago;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Taxi extends Servicio{
    int numPersonas;
    
    /**
     * Constructor de la clase Taxi
     * @param origen
     * @param destino
     * @param fecha
     * @param conductor
     * @param valorPagar
     * @param numPersonas 
     */
    public Taxi(String origen, String destino, String fecha, Conductor conductor, double valorPagar, int numPersonas){
        super(origen, destino, fecha, conductor, valorPagar);
        this.numPersonas = numPersonas;
    }
    
    /**
     * Método utilizado
     * al momento de pagar un servicio
     * @param valorPagar 
     */
    @Override
    public void pagoServicio(double valorPagar){
        
    }
    /**
     * Método utilizado al momento de pagar
     * un servicio
     * @param valorPagar
     * @param formaPago 
     */
    public void pagoServicio(double valorPagar, TipoPago formaPago){
        
    }
}
