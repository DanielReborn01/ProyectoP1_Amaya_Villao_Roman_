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
    
}
