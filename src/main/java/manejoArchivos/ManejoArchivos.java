package manejoArchivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author Verónica
 */
public class ManejoArchivos {
    /**
     * Este metodo lee el archivo y devuelve las lineas del mismo en formato ArrayList
     * @param nombrearchivo nombre del archivo
     * @return ArrayList 
     */
    public static ArrayList<String> LeerArchivo(String nombrearchivo) {
        ArrayList<String> lineas = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(nombrearchivo);
            fr = new FileReader(archivo,StandardCharsets.UTF_8);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
//                System.out.println(linea);
                lineas.add(linea);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta una excepción
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lineas;

    }

    /**
     * Este método escribe un archivo linea por linea
     * @param nombreArchivo el nombre del archivo a Escribir
     * @param linea La linea que se desea escribir
     */
    public static void EscribirArchivo(String nombreArchivo, String linea) {

        FileWriter fichero = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(nombreArchivo,true);
            bw = new BufferedWriter(fichero);
            bw.write(linea+"\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    //fichero.close();
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /**
     * Este método verifica si para leer el archivo se debe saltar la primera linea o no
     * @param nombreArchivo El nombre de archivo a escribir
     * @param saltarPrimeraLinea Si se desea omitir la primera linea
     * @return ArrayList de las palabras de a linea
     */
    public static ArrayList<String[]> LeerValidando(String nombreArchivo,boolean saltarPrimeraLinea){
        ArrayList<String> lineas=ManejoArchivos.LeerArchivo(nombreArchivo);
        ArrayList<String[]> datos=new ArrayList<>();
        int i;
        if(saltarPrimeraLinea){ 
            for(i=1;i<lineas.size();i++){
                datos.add(lineas.get(i).split(","));
            }
        }else{
            for(i=0;i<lineas.size();i++){
            datos.add(lineas.get(i).split(","));
            }
        }
        
        return datos;
    }
}
