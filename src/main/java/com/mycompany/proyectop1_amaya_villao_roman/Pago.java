/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;
import Enums.TipoPago;
/**
 *
 * @author GabrielVillao
 */
public class Pago {
    private int id_pago;
    private TipoPago Tipopago;
    private double subtotal;
    private double costoServicio;

    public Pago(int id_pago, TipoPago Tipopago, double subtotal, double costoServicio) {
        this.id_pago = id_pago;
        this.Tipopago = Tipopago;
        this.subtotal = subtotal;
        this.costoServicio = costoServicio;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public TipoPago getTipopago() {
        return Tipopago;
    }

    public void setTipopago(TipoPago Tipopago) {
        this.Tipopago = Tipopago;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getcostoServicio() {
        return costoServicio;
    }

    public void setcostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }
    
    public double valorRuta(TipoPago tipopago){
        if(tipopago.equals(tipopago.TC)){
            return (costoServicio*0.15)+costoServicio;
        }else{
            return costoServicio;
        }
        
    }
    
    
}
