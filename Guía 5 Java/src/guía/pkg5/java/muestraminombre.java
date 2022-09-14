/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg5.java;

import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class muestraminombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor");
        nombre = leer.next();
        System.out.println("Su nombre es " +nombre);
        
    }
    
}
