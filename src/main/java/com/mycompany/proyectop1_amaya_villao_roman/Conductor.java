/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoUsuario;
import java.util.ArrayList;
import static manejoArchivos.ManejoArchivos.LeerValidando;

/**
 *
 * @author danie
 */
public class Conductor extends Usuario{
    String numLicencia;
    String estado;
    String codigoVehiculo;
    private final ArrayList<String[]> datosConductores = LeerValidando("conductores.txt", true); // Datos de los conductores almacenados en un archivo
    /**
     * Constructor de la clase Conductor
     * @param numCedula cédula del conductor
     * @param apellidos apellidos del conductor
     * @param nombres nombres del conductor
     * @param contraseña contraseña del conductor
     * @param numCelular número telefónico del conductor
     * @param tipoUsuario tipo usuario
     * @param numLicencia licencia del conductor
     * @param estado estado del conductor
     * @param vehiculo vehículo del conductor
     */
    //constructor
    public Conductor(int numCedula,String apellidos, String nombres, String contraseña, int numCelular, TipoUsuario tipoUsuario){
        super(numCedula, apellidos, nombres, contraseña, numCelular, tipoUsuario);
        for (String[] dato : datosConductores) {
            if (dato[0].equals(numCedula)) {
                this.numLicencia = dato[3];
                this.estado = dato[1];
                this.codigoVehiculo = dato[2];
            }
        }
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

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }
    
    @Override
    public void consultarServicio(){ 
    }
    
    public void consultarServicio(ArrayList<Servicio>ListaServicioConductor){
        for(Servicio s:ListaServicioConductor){
            if(s.getTipoentrega().equals('E')){
                Entrega e=(Entrega)s;    
                System.out.println("Tipo: Encomienda"+'\n'+ "Tipo Encomienda: "+e.getTipoentrega()+'\n'+"Fecha: "+e.getFecha()+'\n'+"Desde: "+e.getOrigen()+'\n'+"Hasta: "+e.getDestino());
            }
            else if(s.getTipoentrega().equals('T')){
                Taxi t=(Taxi)s;
                System.out.println("Tipo: Taxi"+'\n'+ "Tipo Taxi: "+t.getTipoentrega()+'\n'+"Fecha: "+t.getFecha()+'\n'+"Desde: "+t.getOrigen()+'\n'+"Hasta: "+t.getDestino());
                
            }
        
            
        }
    }
    //public void 
    
}
