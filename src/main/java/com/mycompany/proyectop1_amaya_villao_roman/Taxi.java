/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoPago;
import Enums.TipoEntrega;
import Enums.TipoServicio;
import java.util.ArrayList;
import java.time.*;

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
     * @param hora
     * @param conductor
     * @param cliente
     * @param valorPagar
     * @param numPersonas 
     * @param Tiposervicio
     * 
     */
    public Taxi(String origen, String destino, LocalDate fecha, LocalTime hora,Conductor conductor, Cliente cliente, double valorPagar, TipoServicio Tiposervicio, int numPersonas){
        super(origen, destino, fecha, hora, conductor, cliente, valorPagar, Tiposervicio);
        this.numPersonas = numPersonas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }
    
    

    
}
