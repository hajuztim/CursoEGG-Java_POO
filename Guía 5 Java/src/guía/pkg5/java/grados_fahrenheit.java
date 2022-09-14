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
public class grados_fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double F, C;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados en Centígrados y el programa los pasará a Fahrenheit");
        C = leer.nextDouble();
        
        F = 32 + (9 * C / 5);
        
        System.out.println( C + " grados centígrados equivalen a " + F + " grados Fahrenheit");
    }
    
}
