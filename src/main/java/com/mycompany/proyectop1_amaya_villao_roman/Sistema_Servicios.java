/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectop1_amaya_villao_roman;


import Enums.TipoUsuario;
import java.util.ArrayList;
import static manejoArchivos.ManejoArchivos.LeerValidando;
import Enums.TipoVehiculo;
import Enums.Disponibilidad;
import Enums.TipoEntrega;
import Enums.TipoPago;
import Enums.TipoServicio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import manejoArchivos.ManejoArchivos;

/**
 *
 * @author danie
 */
public class Sistema_Servicios {

    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    static ArrayList<Servicio> listaServicios = new ArrayList<>();

    /**
     * Metodo que muestra el menu del usuario tipo cliente
     */
    /**
     * Se crean los 3 métodos de la clase principal y el método main
     */
    public static void iniciarSesion() {

    }

    public static void mostrarMenuCliente() {
        System.out.println("1. Solicitar servicio de taxi\n2.  Solicitar entrega encomienda\n3. Consultar servicios");

    }

    public static void mostrarMenuConductor() {
        System.out.println("1. Consultar servicio asignado\n2. Datos de su vehículo");

    }

    public static void cargarVehiculos() {
        ArrayList<String[]> datosVehiculos = LeerValidando("vehiculos.txt", true);
        for (String[] vehiculo : datosVehiculos) {
            listaVehiculos.add(new Vehiculo(vehiculo[1], vehiculo[2], vehiculo[3], Integer.parseInt(vehiculo[0]), TipoVehiculo.valueOf(vehiculo[4])));
        }

    }
    // Código para leer el archivo "usuarios.txt" y crear objetos de Usuario
    // basado en los datos leídos. Luego, los objetos se agregan a la lista de Usuarios.

    public static void cargarUsuarios() {

        ArrayList<String[]> datosUsuarios = LeerValidando("usuarios.txt", true);
        for (String[] dato : datosUsuarios) {
            switch (dato[6]) {
                case "C" -> {
                    listaUsuarios.add(new Cliente(Integer.parseInt(dato[0]), dato[2], dato[1], dato[4], Integer.parseInt(dato[5]), dato[3], 0, 0));
                    break;
                }
                case "R" -> {
                    ArrayList<String[]> datosConductor = LeerValidando("conductores.txt", true);
                    ArrayList<String[]> datosVehiculo = LeerValidando("vehiculos.txt", true);

                    for (String[] conductor : datosConductor) {
                        if (conductor[0].equals(dato[0])) {
                            for (String[] vehiculos : datosVehiculo) {
                                if (conductor[2].equals(vehiculos[0])) {
                                    Vehiculo v2 = new Vehiculo(vehiculos[1], vehiculos[2], vehiculos[3], Integer.parseInt(vehiculos[0]), TipoVehiculo.valueOf(vehiculos[4]));

                                    listaUsuarios.add(new Conductor(Integer.parseInt(dato[0]), dato[2], dato[1], dato[4], Integer.parseInt(dato[5]), dato[3], Integer.parseInt(conductor[0]), Disponibilidad.valueOf(conductor[1]), v2));
                                    //listaVehiculos.add(v2);
                                    break;
                                }
                            }
                        }
                    }

                }
            }
        }

    }

    public static Conductor buscarConductores() {
        ArrayList<String[]> datosConductor = LeerValidando("conductores.txt", true);
        ArrayList<String[]> datosVehiculo = LeerValidando("vehiculos.txt", true);

        for (String[] conductor : datosConductor) {
            if (conductor[1].equals("D")) {
                System.out.println(datosConductor.indexOf(conductor[0]) + ". " + conductor[0] + " " + conductor[1] + " " + conductor[2] + " " + conductor[3]);
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Ingrese el número del conductor con el que desea ir: ");
                int opcion = sc1.nextInt();
                for (Usuario usuario : listaUsuarios) {
                    if (usuario instanceof Conductor) {

                        String[] opcionEscogida = datosConductor.get(opcion);
                        if (usuario.getNumCedula() == Integer.parseInt(opcionEscogida[0])) {
                            for (String[] vehiculos : datosVehiculo) {
                                if (opcionEscogida[2].equals(vehiculos[0])) {
                                    Vehiculo v2 = new Vehiculo(vehiculos[1], vehiculos[2], vehiculos[3], Integer.parseInt(vehiculos[0]), TipoVehiculo.valueOf(vehiculos[4]));
                                    Conductor c1 = new Conductor(usuario.getNumCedula(), usuario.getApellidos(), usuario.getNombres(), usuario.getContraseña(), usuario.getNumCelular(), usuario.getUsuario(), Integer.parseInt(opcionEscogida[0]), Disponibilidad.D, v2);
                                    return c1;

                                }
                            }
                        }
                    }
                }
                //Conductor c1=new Conductor(int numCedula, String apellidos, String nombres, String contraseña, int numCelular, String usuario ,String numLicencia, Disponibilidad estado, Vehiculo vehiculo);
            }
        }
        return null;
    }

    public static void crearServicios() {
        int id = 0;
        for (Servicio ser : listaServicios) {
            ManejoArchivos.EscribirArchivo("servicios.txt", id + "," + ser.getServicio() + "," + ser.getCliente().getNumCedula() + "," + ser.getConductor().nombres + "," + ser.getOrigen() + "," + ser.getDestino() + "," + ser.getFecha());
            id = id + 1;
        }

    }

    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("         BIENVENIDO AL SISTEMA          ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        cargarVehiculos();
        cargarUsuarios();
        String sesion = "n";
        Scanner sc = new Scanner(System.in);
        while (sesion.equals("n")) {

            System.out.print("USUARIO: ");
            String user = sc.nextLine();
            System.out.print("CONTRASEÑA: ");
            String password = sc.nextLine();

            //Validar información
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getUsuario().equals(user) && usuario.getContraseña().equals(password)) {
                    System.out.println("INGRESO EXITOSO");

                    if (usuario instanceof Conductor) {
                        Conductor conductor = (Conductor) usuario;
                        Sistema_Servicios.mostrarMenuConductor();

                        int opc2 = 0;
                        while (opc2 != 4) {
                            System.out.println("Ingrese opcion: ");
                            opc2 = sc.nextInt();
                            sc.nextLine();

                            if (opc2 == 1) {
                                conductor.consultarServicio(listaServicios);
                            } else if (opc2 == 2) {
                                conductor.consultarDatosVehiculo(listaVehiculos);
                            } else {
                                System.out.println("Opcion invalida");
                            }
                        }
                    }
                }

                //Comprobando si el usuario es un cliente
                if (usuario instanceof Cliente) {
                    Cliente cliente = (Cliente) usuario;
                    if (cliente.getEdad() == 0 && cliente.getNumTarjeta() == 0) {
                        System.out.println("Coloque su edad:");
                        int edad = sc.nextInt();
                        cliente.setEdad(edad);
                        System.out.println("Coloque su num de tarjeta:");
                        int numTarjeta = sc.nextInt();
                        cliente.setNumTarjeta(numTarjeta);

                    }

                    mostrarMenuCliente();
                    int opc = 0;
                    while (opc != 5) {
                        System.out.println("Ingrese opcion: ");
                        opc = sc.nextInt();
                        sc.nextLine();
                        if (opc == 1) {
                            Scanner sc1 = new Scanner(System.in);

                            //if(usuario.getNumCedula().equals())
                            System.out.println("¿Cuantos pasajeros van a viajar? : ");
                            int pas = sc1.nextInt();
                            System.out.println("¿Desde donde va a partir?: ");
                            String or = sc1.nextLine();
                            System.out.println("¿A que lugar prefiere ir?: ");
                            String des = sc1.nextLine();

                            System.out.println("¿Cual va a ser su tipo de pago?: ");
                            TipoPago tipopago = null;
                            int opciones = sc.nextInt();
                            switch (opciones) {
                                case 1:
                                    tipopago = TipoPago.TARJETA;
                                    break;
                                case 2:
                                    tipopago = TipoPago.EFECTIVO;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");

                            }

                            Pago pago1 = new Pago();
                            double paga = pago1.viajes(tipopago);
                            System.out.println("Conductores disponibles");
                            Conductor cond = Sistema_Servicios.buscarConductores();
                            LocalDate D1 = LocalDate.now();
                            LocalTime tiempo = LocalTime.now();

                            Taxi t1 = new Taxi(or, des, D1, tiempo, cond, cliente, paga, TipoServicio.T, pas);
                            //Conductor conductor1=(Conductor)usuario;
                            //Taxi tax=new Taxi(or,des,fecha,conductor1,);

                            ManejoArchivos.EscribirArchivo("pagos.txt", pago1.getId_pago() + "," + D1 + "," + t1.id + "," + paga + "," + cliente.numCedula + "," + (pago1.getSubtotal() * 0.5) + "," + paga);
                            ManejoArchivos.EscribirArchivo("viajes.txt", t1.id + "," + pas + "," + pago1.getSubtotal() + "," + paga);

                            Servicio s1 = t1;
                            listaServicios.add(s1);
                            Sistema_Servicios.crearServicios();
                            Sistema_Servicios.mostrarMenuCliente();
                        } else if (opc == 2) {
                            System.out.println("Lugar de donde se retiraria la Encomienda: ");
                            String or = sc.nextLine();
                            System.out.println("¿A que lugar lo desea enviar?: ");
                            String des = sc.nextLine();
                            System.out.println("Qué tipo de encomienda desea hacer?\n1 MEDICINA \n2 ROPA\n3 DOCUMENTOS");
                            int opcion = sc.nextInt();
                            TipoEntrega tipoentrega = null;
                            if (opcion == 1) {
                                System.out.println("1. MEDICAMENTOS");
                                tipoentrega = TipoEntrega.MEDICAMENTOS;
                            } else if (opcion == 2) {
                                System.out.println("2. ROPA");
                                tipoentrega = TipoEntrega.ROPA;
                            } else if (opcion == 3) {
                                System.out.println("3. DOCUMENTOS");
                                tipoentrega = TipoEntrega.DOCUMENTOS;
                            } else {
                                System.out.println("Opción invalida");
                            }

                            System.out.println("Ingrese cuántos productos va a pedir: ");
                            int cantidad = sc.nextInt();

                            LocalDate fecha = LocalDate.now();
                            LocalTime tiempo = LocalTime.now();
                            System.out.println("Ingrese el peso: ");
                            int peso = sc.nextInt();
                            double subtotal = 4.0;
                            System.out.println("Como desea pagar? 1.TC\n2.E)");
                            TipoPago tipopago = null;
                            int opciones = sc.nextInt();
                            if (opciones == 1) {
                                tipopago = TipoPago.TARJETA;
                                break;
                            } else if (opciones == 2) {
                                tipopago = TipoPago.EFECTIVO;
                                break;
                            } else {
                                System.out.println("Opcion invalida");
                            }

                            System.out.println("Conductores disponibles: ");
                            Sistema_Servicios.buscarConductores();
                            Conductor cond = buscarConductores();

                            //String linea = i++ +","+tipoEncomienda+","+cantidad+","+peso+","+subtotal;
                            //
                            Entrega entrega = new Entrega(or, des, fecha, tiempo, cond, cliente, subtotal, TipoServicio.E, cantidad, tipopago, tipoentrega, peso);
                            ManejoArchivos.EscribirArchivo("encomiendas.txt", entrega.toString());
                            Servicio s1 = entrega;
                            listaServicios.add(s1);

                            Sistema_Servicios.mostrarMenuCliente();
                        } else if (opc == 3) {
                            cliente.consultarServicio();
                            Sistema_Servicios.mostrarMenuCliente();
                        } else {
                            System.out.println("Opción inválida");
                        }
                    }
                }
            }
        }

    }
}

