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
public class primerletra_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase, primerletra;
        Scanner leer = new Scanner (System.in);
        frase = leer.next();
        primerletra = (frase.substring(0,1));
               
        if (primerletra.equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        
        
    }
    
}
