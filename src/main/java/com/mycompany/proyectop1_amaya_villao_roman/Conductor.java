/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

/**
 *
 * @author danie
 */
public class Conductor extends Usuario{
    String numLicencia;
    String estado;
    Vehiculo vehiculo;
    
    /**
     * Constructor de la clase Conductor
     * @param numCedula cédula del conductor
     * @param apellidos apellidos del conductor
     * @param nombres nombres del conductor
     * @param contraseña contraseña del conductor
     * @param numCelular número telefónico del conductor
     * @param numLicencia licencia del conductor
     * @param estado estado del conductor
     * @param vehiculo vehículo del conductor
     */
    public Conductor(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, String numLicencia, String estado, Vehiculo vehiculo){
        super(numCedula, apellidos, nombres, contraseña, numCelular);
        this.numLicencia = numLicencia;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    
}
