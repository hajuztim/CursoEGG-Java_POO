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
public class eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la frase eureka, el programa dirá si es correcto o no");
        frase = leer.next();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
