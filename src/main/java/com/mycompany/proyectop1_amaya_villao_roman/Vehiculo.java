/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoVehiculo;

/**
 *
 * @author danie
 */
public class Vehiculo {
    String placa;
    String modelo;
    String marca;
    int codigoVehiculo;
    TipoVehiculo tipovehiculo;
    
    
    /**
     * Constructor de la clase Vehiculo
     * @param placa
     * @param modelo
     * @param marca
     * @param codigoVehiculo
     * @param tipovehiculo
     */
    public Vehiculo(String placa, String  modelo, String marca, int codigoVehiculo, TipoVehiculo tipovehiculo){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.codigoVehiculo=codigoVehiculo;
        this.tipovehiculo=tipovehiculo;
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

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }
    
    
    
    
}
