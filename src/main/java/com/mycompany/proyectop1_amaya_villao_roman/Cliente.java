/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoServicio;
import java.util.ArrayList;

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
     * @param usuario 
     */
    public Cliente(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, String usuario, int edad, int numTarjeta){
        super(numCedula, apellidos, nombres, contraseña, numCelular, usuario);
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
    
    public void consultarServicio(ArrayList<Servicio>ListaServicioCliente){
        for(Servicio s:ListaServicioCliente){
            if(s.getTiposervicio().equals(TipoServicio.E)){
                Entrega e=(Entrega)s;    
                System.out.println("Servicio Encomienda"+'\n'+ "Tipo Encomienda: "+e.getTipoentrega()+'\n'+"Fecha: "+e.getFecha()+'\n'+"Desde: "+e.getOrigen()+'\n'+"Hasta: "+e.getDestino());
            }
            else if(s.getTiposervicio().equals(TipoServicio.T)){
                Taxi t=(Taxi)s;
                System.out.println("Servicio Taxi"+'\n'+ "Tipo Taxi: "+t.getNumPersonas()+'\n'+"Fecha: "+t.getFecha()+'\n'+"Desde: "+t.getOrigen()+'\n'+"Hasta: "+t.getDestino());
                
            }
        
            
        }
    }    
}
