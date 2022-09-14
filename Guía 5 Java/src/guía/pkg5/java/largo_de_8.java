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
public class largo_de_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 carácteres, no más, no menos. De no ser así el programa escribirá INCORRECTO");
        frase = leer.next();
        int largo = frase.length();
                
        if (largo==8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
