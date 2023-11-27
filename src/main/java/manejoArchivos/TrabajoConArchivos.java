/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArchivos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Verónica
 */
public class TrabajoConArchivos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] arg) {
        ManejoArchivos.escribirArchivo("archivosalida.txt","Hola!");
        ManejoArchivos.escribirArchivo("archivosalida.txt","Afios!");
        ManejoArchivos.escribirArchivo("archivosalida.txt","NUevo!");
        ManejoArchivos.LeerArchivo("archivo.txt");
        Date today = Calendar.getInstance().getTime();
         System.out.println(today);
        
        
    }
    
}
