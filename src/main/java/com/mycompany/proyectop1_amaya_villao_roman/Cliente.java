/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

/**
 *
 * @author danie
 */
public class Cliente extends Usuario{
    private int edad;
    private int numTarjeta;

    /**
     *
     * @param numCedula
     * @param apellidos
     * @param nombres
     * @param contraseña
     * @param numCelular
     * @param edad
     * @param numTarjeta
     */
    public Cliente(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, int edad, int numTarjeta){
        super(numCedula, apellidos, nombres, contraseña, numCelular);
        this.edad = edad;
        this.numTarjeta = numTarjeta;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    
}
