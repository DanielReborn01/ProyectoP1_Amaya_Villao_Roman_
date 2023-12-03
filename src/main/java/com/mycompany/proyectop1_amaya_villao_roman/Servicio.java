/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoEntrega;
import Enums.TipoServicio;
import java.util.ArrayList;
import java.time.*;



/**
 *
 * @author danie
 */
public class Servicio {
    protected int id;
    protected String origen;
    protected String destino;
    protected LocalDate fecha;
    protected LocalTime hora;
    protected Conductor conductor;
    protected double ValorPagar;
    protected TipoServicio Tiposervicio;
    protected Cliente cliente;
    
    
    /**
     * Constructor de la clase Servicio
     * @param origen
     * @param destino
     * @param fecha
     * @param hora
     * @param conductor
     * @param cliente
     * @param valorPagar 
     * @param Tiposervicio
     */
    public Servicio(String origen,String destino, LocalDate fecha,LocalTime hora, Conductor conductor, Cliente cliente,double valorPagar, TipoServicio Tiposervicio){
        this.origen=origen;
        this.destino=destino;
        this.fecha = fecha;
        this.hora=hora;
        this.conductor = conductor;
        this.cliente=cliente;
        this.ValorPagar = valorPagar;
        this.Tiposervicio=Tiposervicio;
        id=id+1;
    }
    
    
    /**
     * Este método se encarga del pago del servicio
     * @param valorPagar es el valor que el cliente debe pagar
     */


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

    public LocalTime getHora() {
        return hora;
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

    public TipoServicio getServicio() {
        return Tiposervicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoServicio getTiposervicio() {
        return Tiposervicio;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

    
    
}
