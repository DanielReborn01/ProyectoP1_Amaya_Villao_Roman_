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
    String hora_de_partida;
    
    /**
     * Constructor de la clase Taxi
     * @param origen
     * @param destino
     * @param fecha
     * @param conductor
     * @param valorPagar
     * @param numPersonas
     * @param cliente
     * @param hora_de_partida
     */
    public Taxi(String origen, String destino, String fecha, Conductor conductor, double valorPagar,Cliente cliente, int numPersonas, String hora_de_partida){
        super(origen, destino, fecha, conductor, valorPagar, cliente);
        this.numPersonas = numPersonas;
        this.hora_de_partida=hora_de_partida;
    }

    
    public int getNumPersonas(){
        return numPersonas;
        
    }

    
    public void setNumPersonas(int numPersonas) {    
        this.numPersonas = numPersonas;
    }
    
    public String getHora_de_partida() {
        return hora_de_partida;
    }    
/**
     * Método utilizado
     * al momento de pagar un servicio
     * @param valorPagar 
     */
    


    @Override
    public void pagoServicio(double valorPagar) {
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
