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
     *
     * @param numCedula
     * @param apellidos
     * @param nombres
     * @param contraseña
     * @param numCelular
     * @param numLicencia
     * @param estado
     * @param vehiculo
     */
    public Conductor(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, String numLicencia, String estado, Vehiculo vehiculo){
        super(numCedula, apellidos, nombres, contraseña, numCelular);
        this.numLicencia = numLicencia;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }
    
    
    
}
