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
public class Taxi extends Servicio{
    int numPersonas;
    public Taxi(String origen, String destino, String fecha, Conductor conductor, double valorPagar, int numPersonas){
        super(origen, destino, fecha, conductor, valorPagar);
        this.numPersonas = numPersonas;
    }
    @Override
    public void pagoServicio(double valorPagar){
        
    }
    public void pagoServicio(double valorPagar, TipoPago formaPago){
        
    }
}
