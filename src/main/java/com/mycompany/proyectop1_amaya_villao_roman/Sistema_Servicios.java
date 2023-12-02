/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoEntrega;
import Enums.TipoPago;
import Enums.TipoUsuario;
import java.util.ArrayList;
import java.util.Scanner;
import manejoArchivos.ManejoArchivos;
import static manejoArchivos.ManejoArchivos.LeerValidando;
import static manejoArchivos.ManejoArchivos.escribirArchivo;
import java.util.Date;
import java.time.*;
/**
 *
 * @author danie
 */
public class Sistema_Servicios {

    static ArrayList<Usuario> listaUsuarios;
    static ArrayList<Vehiculo> listaVehiculos;
    static ArrayList<Servicio> listaServicios;
    


    public static void mostrarMenuCliente() {
        System.out.println("1. Solicitar servicio de taxi\n2. Solicitar entrega encomienda\n3.Consultar servicios");

    }

    public static void mostrarMenuConductor() {
        System.out.println("1. Consultar servicio asignado\n2. Datos de su vehículo");

    }
    

    public static void cargarVehiculo(){
        ArrayList<String[]> datosVehiculo = LeerValidando("vehiculos.txt", true);
        for (String[] dato : datosVehiculo){
            listaVehiculos.add(new Vehiculo(dato[0],dato[1],dato[2],dato[3],dato[4]));
        }
    }
    /**
     * Metodo que lee el archivo Usuarios y crea los objetos de los mismos para
     * agregarlos a la lista de Usuarios
     */
    public static void cargarUsuarios() {
        // Código para leer el archivo "usuarios.txt" y crear objetos de Usuario
        // basado en los datos leídos. Luego, los objetos se agregan a la lista de Usuarios.
        ArrayList<String[]> datosUsuarios = LeerValidando("usuarios.txt", false);
        for (String[] dato : datosUsuarios) {
            switch (dato[6]) {
                case "C" -> {
                    listaUsuarios.add(new Cliente(Integer.parseInt(dato[0]), dato[1], dato[2], dato[3], Integer.parseInt(dato[4]), TipoUsuario.valueOf(dato[5])));

                    break;
                }
                case "R" -> {
                    listaUsuarios.add(new Conductor(Integer.parseInt(dato[0]), dato[1], dato[2], dato[3], Integer.parseInt(dato[4]), TipoUsuario.valueOf(dato[5])));
                    break;
                
                }
            }
        }
    }


    /**
     *
     * Escrbie en el ficehero pagos.txt todos los pagos que se ha realizado
     *
     * @param pago El pago que se realizo
     */
    /*public static void createPago(Pago pago) {
        // Código para crear un pago y guardar la información en un archivo.
        ManejoArchivos.escribirArchivo("pagos.txt", pago.toString());
    }*/
    public static void crearCliente(Cliente cliente){
        //código para crear a los clientes que ingresan por primera vez y deben colocar sus datos
        ManejoArchivos.escribirArchivo("clientes.txt", cliente.toString());

    }
    

    public static Conductor buscarConductores(){
        ArrayList<String[]> datosConductor = LeerValidando("conductores.txt", true);
        for(String[] conductor:datosConductor){
            if(conductor[1].equals("D")){
                System.out.println(datosConductor.indexOf(conductor[0])+". "+conductor[0]+" "+conductor[1]+" "+conductor[2]+" "+conductor[3]);
                
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una Opción");
        int opcion=sc.nextInt();
        System.out.println("Usted ha elegido la opción: "+opcion);
        String[] cond=datosConductor.get(opcion);
        int cedulaConductor=Integer.parseInt(cond[0]);
        for(Usuario listaU:listaUsuarios){
            if(listaU instanceof Conductor){
                if(listaU.getNumCedula()==cedulaConductor){
                    System.out.println(listaU.getNumCedula()+listaU.getNumCelular());
                    return new Conductor(cedulaConductor,listaU.getApellidos(),listaU.getNombres(),listaU.getContrasena(),listaU.getNumCelular(),listaU.getTipoUsuario());
                }
            }
            
        }
        return null;   
    }
        
    
    
    
    public void crearServicios(){
        int id=0;
        for(Servicio ser:listaServicios){
            ManejoArchivos.escribirArchivo("servicios.txt", id+","+ser.getTipoentrega()+","+ser.getCliente().getNumCedula()+","+ser.getConductor().nombres+","+ser.getOrigen()+","+ser.getDestino()+","+ser.getFecha()); 
            id=id+1;
        }
        
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CARGANDO LISTAS
        Sistema_Servicios.cargarUsuarios();

        String sesion = "n";

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("         BIENVENIDO AL SISTEMA          ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //Inicio de sesión
        while (sesion.equals("n")) {

            System.out.print("USUARIO: ");
            String user = sc.nextLine();
            System.out.print("CONTRASEÑA: ");
            String password = sc.nextLine();

            //Validar información
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getUsuario().equals(user) && usuario.getContrasena().equals(password)) {
                    System.out.println("INGRESO EXITOSO");

                    //Comprobanco si el usuario es un conductor
                    if (usuario instanceof Conductor ) {
                        Conductor conductor=(Conductor)usuario;
                        Sistema_Servicios.mostrarMenuConductor();

                        int opc2 = 0;
                        while (opc2 != 4) {
                            System.out.println("Ingrese opcion: ");
                            opc2 = sc.nextInt();
                            sc.nextLine();
                            switch (opc2) {
                                case 1 -> {
                                    conductor.consultarServicio(listaServicios);
                                    break;
                                }
                                case 2 -> {
                                    conductor.consultarDatosVehiculo(listaVehiculos);
                                    break;
                                }

                                default ->
                                    System.out.println("Opcion invalida");
                            }
                        }
                    }

                    //Comprobando si el usuario es un cliente
                    if (usuario instanceof Cliente) {
                        Cliente cliente = (Cliente) usuario;
                        Sistema_Servicios.mostrarMenuCliente();
                        int opc = 0;
                        while (opc != 5) {
                            System.out.println("Ingrese opcion: ");
                            opc = sc.nextInt();
                            sc.nextLine();
                            switch (opc) {
                                case 1 -> {
                                    Scanner sc1=new Scanner(System.in);


                                    //if(usuario.getNumCedula().equals())
                                    System.out.println("Cuantos pasajeros van a viajar : ");
                                    int pas=sc1.nextInt();
                                    System.out.println("Origen:");
                                    String or=sc1.nextLine();
                                    System.out.println("Destino:");
                                    String des=sc1.nextLine();
                                    System.out.println("Tipo de pago (TC/E): ");
                                    String pago=sc1.nextLine();
                                    Pago pago1=new Pago();
                                    double paga=pago1.viajes(pago);
                                    System.out.println("Conductores disponibles");
                                    Sistema_Servicios.buscarConductores();
                                    LocalDate D1=LocalDate.now();
                                    LocalTime tiempo=LocalTime.now();
                                    Conductor cond=buscarConductores();
                                    
                                    Taxi t1=new Taxi(or, des, D1, tiempo, cond, paga,cliente, pas);
                                    //Conductor conductor1=(Conductor)usuario;
                                    //Taxi tax=new Taxi(or,des,fecha,conductor1,);
                                    Conductor c1=new Conductor(usuario.getNumCedula(),usuario.getApellidos(), usuario.getNombres(), usuario.getContrasena(), usuario.getNumCelular(), usuario.getTipoUsuario());
                                    Sistema_Servicios.mostrarMenuCliente();
                                }

                                    
                                
                                case 2 -> {
                                    int i = 0;
                                    System.out.println("Qué tipo de encomienda desea hacer?");
                                    TipoEntrega tipoEncomienda = TipoEntrega.valueOf(sc.nextLine());
                                    System.out.println("Ingrese cuántos productos va a pedir");
                                    String cantidad = sc.nextLine();
                                    System.out.println("Ingrese el peso de todo");
                                    String peso = sc.nextLine();
                                    String subtotal = "5.0";
                                    String linea = i++ +","+tipoEncomienda+","+cantidad+","+peso+","+subtotal;
                                    escribirArchivo("encomiendas.txt", linea);
                                    Sistema_Servicios.mostrarMenuCliente();
                                }
                                case 3 ->{
                                    cliente.consultarServicio(listaServicios);
                                    Sistema_Servicios.mostrarMenuCliente();
                                }
                                default ->
                                    System.out.println("Opcion invalida");
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Desea Salir del programa No (n) Si(s):");
        sesion = sc.nextLine();

    }

}
