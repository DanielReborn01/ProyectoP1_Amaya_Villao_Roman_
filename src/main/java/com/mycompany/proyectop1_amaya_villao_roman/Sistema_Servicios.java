/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyectop1_amaya_villao_roman;

import Enums.TipoUsuario;
import java.util.ArrayList;
import java.util.Scanner;
import manejoArchivos.ManejoArchivos;
import static manejoArchivos.ManejoArchivos.LeerValidando;

/**
 *
 * @author danie
 */
public class Sistema_Servicios {

    static ArrayList<Usuario> listaUsuarios;
    static ArrayList<Vehiculo> listaVehiculos;
    static ArrayList<Servicio> listaServicios;


    public static void mostrarMenuCliente() {
        System.out.println("1. Solicitar servicio de taxi\n2. Solicitar comida a domicilio\n3. Solicitar entrega encomienda\n4.Consultar servicios");

    }

    public static void mostrarMenuConductor() {
        System.out.println("1. Consultar servicio asignado\n2. Datos de su vehículo");

    }
    
    public static void consultarServicio(){
        
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
    public static void createPago(Pago pago) {
        // Código para crear un pago y guardar la información en un archivo.
        ManejoArchivos.EscribirArchivo("pagos.txt", pago.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CARGANDO LISTAS
        Sistema_Servicios.cargarUsuarios();

        String sesion = "n";

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("BIENVENIDO AL SISTEMA");
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
                    if (usuario instanceof Conductor conductor) {
                        Sistema_Servicios.mostrarMenuConductor();

                        int opc2 = 0;
                        while (opc2 != 4) {
                            System.out.println("Ingrese opcion: ");
                            opc2 = sc.nextInt();
                            sc.nextLine();
                            switch (opc2) {
                                case 1 -> {
                                    conductor.consultarServicio();
                                    Sistema_Servicios.consultarServicio();
                                    break;
                                }
                                case 2 -> {
                                    conductor.consultarDatosVehiculo();
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
                                    cliente.solicitarTaxi();
                                    Sistema_Servicios.mostrarMenuCliente();
                                }
                                case 2 -> {
                                    cliente.solicitarComida();
                                    Sistema_Servicios.mostrarMenuCliente();
                                }
                                case 3 -> {
                                    cliente.solicitarEntrega();
                                    Sistema_Servicios.mostrarMenuCliente();
                                }
                                case 4 ->{
                                    Sistema_Servicios.consultarServicio();
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
