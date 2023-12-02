/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoPago;
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
     * @param tiempo
     * @param conductor
     * @param valorPagar
     * @param numPersonas
     * @param cliente
     * @param hora_de_partida
     * 
     */
    public Taxi(String origen, String destino, LocalDate fecha, LocalTime tiempo, Conductor conductor, double valorPagar,Cliente cliente, int numPersonas){
        super(origen, destino, fecha, tiempo, conductor, valorPagar, cliente);
        this.numPersonas = numPersonas;
    }

    
    public int getNumPersonas(){
        return numPersonas;
        
    }

    
    public void setNumPersonas(int numPersonas) {    
        this.numPersonas = numPersonas;
    }
    

        
    @Override
    public String toString(){
        return id+","+tipoentrega+","+cliente.getNumCedula()+","+conductor.getNombres()+","+origen+","+destino+","+fecha+","+tiempo;

    }

    
    
}
