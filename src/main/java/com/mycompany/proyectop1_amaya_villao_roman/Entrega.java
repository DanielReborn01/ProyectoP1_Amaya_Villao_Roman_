/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

/**
 *
 * @author danie
 */
public class Entrega extends Servicio{
    int numProductos;
    double peso;
    TipoPago pago;
    TipoEntrega entrega;
    public void pagoSevicios(String origen,String destino, String fecha, Conductor conductor, double valorPagar, TipoPago pago, TipoEntrega entrega, double peso, int numProductos){
        super(String origen,String destino, String fecha, Conductor conductor, double valorPagar);
    }
}
