/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

/**
 *
 * @author danie
 */
public abstract class Usuario {
    int numCedula;
    String apellidos;
    String nombres;
    String contraseña;
    int numCelular;
    String usuario;
    
    /**
     * Constructor de la clase Usuario
     * @param numCedula
     * @param apellidos
     * @param nombres
     * @param contraseña
     * @param numCelular 
     * @param usuario
     */
    public Usuario(int numCedula, String apellidos, String nombres, String contraseña, int numCelular,String usuario){
        this.numCedula = numCedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.contraseña = contraseña;
        this.numCelular = numCelular;
        this.usuario=usuario;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Método que permite consultar el servicio
     */
    public void consultarServicio(){
    }
   
    
    /**
     * Método que sirve para consultar los datos del vehículo
     */
    public void consultarDatosVehiculo(){
    }
}
