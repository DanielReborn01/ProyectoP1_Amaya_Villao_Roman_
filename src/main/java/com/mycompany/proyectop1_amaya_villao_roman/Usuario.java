/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoUsuario;

/**
 *
 * @author danie
 */
public abstract class Usuario {
    /**
     * 
     */
    protected String apellidos, nombres, contrasena;
    /**
     * 
     */
    protected int numCedula, numCelular;
    /**
     * 
     */
    protected TipoUsuario tipoUsuario;
    /**
     * 
     */
    protected String usuario;
    /**
     * Constructor de la clase Usuario
     * @param numCedula
     * @param apellidos
     * @param nombres
     * @param contraseña
     * @param numCelular 
     * @param tipoUsuario
     * @param usuario
     */
    public Usuario(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, TipoUsuario tipoUsuario){
        this.numCedula = numCedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.contrasena = contrasena;
        this.numCelular = numCelular;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
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
    /**
     * Método que devuelve el usuario del Usuario.
     * 
     * @return El usuario del Usuario
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Método set para el usuario del Usuario.
     * 
     * @param usuario El usuario a establecer
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
