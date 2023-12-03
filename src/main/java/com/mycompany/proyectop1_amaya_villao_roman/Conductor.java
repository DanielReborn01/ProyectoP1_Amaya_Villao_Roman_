/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.Disponibilidad;
import Enums.TipoServicio;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Conductor extends Usuario{
    int numLicencia;
    Disponibilidad estado;
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
     * @param usuario
     */
    public Conductor(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, String usuario ,int numLicencia, Disponibilidad estado, Vehiculo vehiculo){
        super(numCedula, apellidos, nombres, contraseña, numCelular, usuario);
        this.numLicencia = numLicencia;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public Disponibilidad getEstado() {
        return estado;
    }

    public void setEstado(Disponibilidad estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    @Override
    public void consultarServicio(){ 
    }
    
    public void consultarServicio(ArrayList<Servicio>ListaServicioConductor){
        for(Servicio s:ListaServicioConductor){
            if(s.getServicio().equals(TipoServicio.E)){
                Entrega e=(Entrega)s;    
                System.out.println("Tipo: Encomienda"+'\n'+ "Tipo Encomienda: "+e.getServicio()+'\n'+"Fecha: "+e.getFecha()+'\n'+"Desde: "+e.getOrigen()+'\n'+"Hasta: "+e.getDestino());
            }
            else if(s.getServicio().equals(TipoServicio.T)){
                Taxi t=(Taxi)s;
                System.out.println("Tipo: Taxi"+'\n'+ "Tipo Taxi: "+t.getServicio()+'\n'+"Fecha: "+t.getFecha()+'\n'+"Desde: "+t.getOrigen()+'\n'+"Hasta: "+t.getDestino());
                
            }
        
            
        }
    }
    
    public void consultarDatosVehiculo(ArrayList<Vehiculo>Listavehiculo){
            for(Vehiculo v:Listavehiculo){
                if(v.getCodigoVehiculo()==vehiculo.getCodigoVehiculo()){    
                    System.out.println(v.getCodigoVehiculo()+" "+v.getMarca()+" "+v.getModelo()+" "+v.getPlaca()+" "+v.getTipovehiculo());

                }    
            }
            
        }    
    
    
}
