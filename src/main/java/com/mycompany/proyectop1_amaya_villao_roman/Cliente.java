/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoUsuario;
import java.util.ArrayList;
import static manejoArchivos.ManejoArchivos.LeerValidando;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Cliente extends Usuario{
    private int edad;
    private int numTarjeta;
    private final ArrayList<String[]> datosClientes = LeerValidando("clientes.txt", true); // Datos de los clientes almacenados en un archivo
    
    /**
     * Constructor de la clase Cliente
     * @param numCedula cédula del cliente
     * @param apellidos apellidos del cleinte
     * @param nombres nombres del cliente
     * @param contraseña contraseña del usuario
     * @param numCelular número telefónico del cliente
     * @param tipoUsuario el tipo usuario
     * @param edad edad del cliente
     * @param numTarjeta número de la tarjeta de crédito del cliente
     * @param ListaServicioCliente
     */
    public Cliente(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, TipoUsuario tipoUsuario){
        super(numCedula, apellidos, nombres, contraseña, numCelular, tipoUsuario);
 
        // Recuperar datos del cliente desde un archivo (clientes.txt) y asignarlos a las variables correspondientes
        for (String[] dato : datosClientes) {
            if (dato[0].equals(numCedula)) {
                this.edad = Integer.parseInt(dato[1]);
                this.numTarjeta = Integer.parseInt(dato[2]);
            }
        }
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
    @Override
    public String toString(){
        return numCedula+","+edad+","+numTarjeta;
    }
    
    public void consultarServicio(ArrayList<Servicio>ListaServicioCliente){
        for(Servicio s:ListaServicioCliente){
            if(s.getTipoentrega().equals('E')){
                Entrega e=(Entrega)s;    
                System.out.println("Servicio Encomienda"+'\n'+ "Tipo Encomienda: "+e.getTipoentrega()+'\n'+"Fecha: "+e.getFecha()+'\n'+"Desde: "+e.getOrigen()+'\n'+"Hasta: "+e.getDestino());
            }
            else if(s.getTipoentrega().equals('T')){
                Taxi t=(Taxi)s;
                System.out.println("Servicio Taxi"+'\n'+ "Tipo Taxi: "+t.getNumPersonas()+'\n'+"Fecha: "+t.getFecha()+'\n'+"Desde: "+t.getOrigen()+'\n'+"Hasta: "+t.getDestino());
                
            }
        
            
        }
    }

}
