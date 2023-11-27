/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;
import Enums.TipoPago;
import java.util.Random;
/**
 *
 * @author GabrielVillao
 */
public class Pago {
    private int id_pago=1110;
    private TipoPago Tipopago;
    private double subtotal;
    Random random=new Random();
    public Pago(TipoPago Tipopago) {
        this.id_pago = id_pago++;
        this.Tipopago = Tipopago;
        this.subtotal = (random.nextInt(41) + 5)*0.5;

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



    
    public double valorRuta(TipoPago tipopago){
        if(tipopago.equals(tipopago.TC)){
            return (subtotal*0.15)+subtotal;
        }else{
            return subtotal;
        }
        
    }
    

    
    
}
