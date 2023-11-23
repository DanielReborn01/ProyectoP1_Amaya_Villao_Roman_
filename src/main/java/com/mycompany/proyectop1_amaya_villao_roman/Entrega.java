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
    private int numProductos;
    private double peso;
    private TipoPago pago;
    private TipoEntrega entrega;

    public Entrega(int numProductos, TipoPago pago, TipoEntrega entrega, String origen, String destino, String fecha, Conductor conductor, double valorPagar) {
        super(origen, destino, fecha, conductor, valorPagar);
        this.numProductos = numProductos;
        this.pago = pago;
        this.entrega = entrega;
    }
    
}
