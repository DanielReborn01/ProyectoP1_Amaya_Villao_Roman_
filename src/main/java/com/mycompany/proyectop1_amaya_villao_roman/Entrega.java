/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoEntrega;
import Enums.TipoPago;
import Enums.TipoServicio;
import java.time.*;


/**
 *
 * @author danie
 */
public class Entrega extends Servicio{
    private int numProductos;
    private int peso;
    private TipoPago pago;
    private TipoEntrega tipoentrega;
    
    /**
     * Constructor de la clase Entrega
     * @param numProductos
     * @param pago
     * @param origen
     * @param destino
     * @param fecha
     * @param hora
     * @param conductor
     * @param cliente
     * @param valorPagar
     * @param tipoentrega
     * @param Tiposervicio
     * @param peso
     */
    public Entrega(String origen, String destino, LocalDate fecha,LocalTime hora, Conductor conductor, Cliente cliente,double valorPagar, TipoServicio Tiposervicio, int numProductos,TipoPago pago, TipoEntrega tipoentrega ,int peso) {
        super(origen, destino, fecha, hora, conductor, cliente, valorPagar, Tiposervicio);
        this.numProductos = numProductos;
        this.pago = pago;
        this.peso=peso;
        this.tipoentrega=tipoentrega;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public TipoPago getPago() {
        return pago;
    }

    public void setPago(TipoPago pago) {
        this.pago = pago;
    }

    public TipoEntrega getTipoentrega() {
        return tipoentrega;
    }
    


    
    
}
