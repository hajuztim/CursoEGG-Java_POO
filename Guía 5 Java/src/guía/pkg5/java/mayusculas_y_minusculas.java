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
public class mayusculas_y_minusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase y el programa se lo mostrará en mayúsculas y después en minúsculas");
        frase = leer.next();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
    }
    
}
