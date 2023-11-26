/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import java.util.ArrayList;
import Enums.TipoEntrega;
/**
 *
 * @author danie
 */
public class Servicio {
    private String origen;
    private String destino;
    private String fecha;
    private Conductor conductor;
    double ValorPagar;
    private TipoEntrega tipoentrega;
    private Cliente cliente;
    
    /**
     * Constructor de la clase Servicio
     * @param origen
     * @param destino
     * @param fecha
     * @param conductor
     * @param valorPagar
     * @param cliente
     */
    public Servicio(String origen,String destino, String fecha, Conductor conductor, double valorPagar, Cliente cliente){
        this.origen=origen;
        this.destino=destino;
        this.fecha = fecha;
        this.conductor = conductor;
        this.ValorPagar = valorPagar;
        this.cliente=cliente;
    }
    
    
    /**
     * Este método se encarga del pago del servicio
     * @param valorPagar es el valor que el cliente debe pagar
     */
    public void pagoServicio(double valorPagar){
        
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public double getValorPagar() {
        return ValorPagar;
    }

    public void setValorPagar(double ValorPagar) {
        this.ValorPagar = ValorPagar;
    }

    public TipoEntrega getTipoentrega() {
        return tipoentrega;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
