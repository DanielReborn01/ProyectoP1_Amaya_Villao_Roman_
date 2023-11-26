/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

/**
 *
 * @author danie
 */
public class Vehiculo {
    String placa;
    String modelo;
    String marca;
    int codigoVehiculo;
    char tipoVehiculo;
    
    /**
     * Constructor de la clase Vehiculo
     * @param codigoVehiculo
     * @param placa
     * @param modelo
     * @param marca
     * @param tipoVehiculo
     */
    public Vehiculo(int codigoVehiculo,String placa, String  modelo, String marca, char tipoVehiculo){
        this.codigoVehiculo=codigoVehiculo;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoVehiculo=tipoVehiculo;
        
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public char getTipoVehiculo() {
        return tipoVehiculo;
    }
    
    
}
