/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

/**
 *
 * @author danie
 */
public class Usuario {
    int numCedula;
    String apellidos;
    String nombres;
    String contraseña;
    int numCelular;
    
    public Usuario(){
        
    }
    
    public Usuario(int numCedula, String apellidos, String nombres, String contraseña, int numCelular){
        this.numCedula = numCedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.contraseña = contraseña;
        this.numCelular = numCelular;
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
    
    
    public void consultarServicio(){
        
    }
}
