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
     * Constructor de la clase Cliente
     * @param numCedula cédula del cliente
     * @param apellidos apellidos del cleinte
     * @param nombres nombres del cliente
     * @param contraseña contraseña del usuario
     * @param numCelular número telefónico del cliente
     * @param edad edad del cliente
     * @param numTarjeta número de la tarjeta de crédito del cliente
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
