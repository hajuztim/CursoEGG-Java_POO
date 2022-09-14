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
public class RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase, FDE = "&&&&&";
        int correctos = 0, incorrectos = 0, largo;
        
        System.out.println("Ingrese las secuencias que desee");
        do { 
            frase = leer.next();
            largo = frase.length();
            if (frase.substring(0,1).toUpperCase().equals("X") && frase.substring(largo-1, largo).toUpperCase().equals("O") && largo <= 5) {
                correctos++;
            } else if (!frase.equals(FDE)) {
                incorrectos++;
            }          
        } while (!frase.equals(FDE));
        
        System.out.println("\nSecuencias CORRECTAS: " + correctos + "\nSecuencias INCORRECTAS: " + incorrectos);
        
        
    }
    
}
