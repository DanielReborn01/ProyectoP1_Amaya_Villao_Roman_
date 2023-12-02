/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import java.util.ArrayList;
import Enums.TipoEntrega;
import java.time.*;
/**
 *
 * @author danie
 */
public class Servicio {
    protected String origen;
    protected String destino;
    protected LocalDate fecha;
    protected LocalTime tiempo;
    protected Conductor conductor;
    double ValorPagar;
    protected TipoEntrega tipoentrega;
    protected Cliente cliente;
    
    protected int id;
    
    /**
     * Constructor de la clase Servicio
     * @param origen
     * @param destino
     * @param fecha
     * @param tiempo
     * @param conductor
     * @param valorPagar
     * @param cliente
     */
    public Servicio(String origen,String destino, LocalDate fecha,LocalTime tiempo, Conductor conductor, double valorPagar, Cliente cliente){
        this.origen=origen;
        this.destino=destino;
        this.fecha = fecha;
        this.tiempo=tiempo;
        this.conductor = conductor;
        this.ValorPagar = valorPagar;
        this.cliente=cliente;
        this.id=2000;
        id=id+1;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getTiempo() {
        return tiempo;
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
    
    public String toString(){
        return id+"/"+tipoentrega+"/"+cliente.getNumCedula()+"/"+conductor.getNombres()+"/"+origen+"/"+destino+"/"+fecha+"/"+tiempo;
    }
    
    public double valorRuta(){
        return ValorPagar;
    }
    
    
}
