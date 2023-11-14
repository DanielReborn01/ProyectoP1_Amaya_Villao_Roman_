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
    ArrayList<Ruta> rutas = new ArrayList<>();
    String fecha;
    Conductor conductor;
    double ValorPagar;
    public Servicio(ArrayList<Ruta>rutas, String fecha, Conductor conductor, double valorPagar){
        this.rutas = rutas;
        this.fecha = fecha;
        this.conductor = conductor;
        this.ValorPagar = valorPagar;
    }
    
    public void pagoServicio(double valorPagar){
        
    }
    
}
