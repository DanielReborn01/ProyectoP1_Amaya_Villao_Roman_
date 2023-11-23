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
    public Servicio(String origen,String destino, String fecha, Conductor conductor, double valorPagar){
        this.origen=origen;
        this.destino=destino;
        this.fecha = fecha;
        this.conductor = conductor;
        this.ValorPagar = valorPagar;
    }
    
    public void pagoServicio(double valorPagar){
        
    }
    
}
