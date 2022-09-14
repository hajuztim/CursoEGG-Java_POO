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
public class par_o_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
        Scanner  leer = new Scanner(System.in); 
        System.out.println("Por favor ingrese un número y el programa le mostrará si el número es par o impar");
        num = leer.nextInt();
        
        if (num %2 == 0){
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
        
        
    }
    
}
