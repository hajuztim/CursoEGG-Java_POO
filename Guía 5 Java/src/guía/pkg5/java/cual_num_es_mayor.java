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
public class cual_num_es_mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int num1, num2;
       Scanner  leer = new Scanner(System.in); 
        System.out.println("Por favor ingrese 2 números y el programa le mostrará el mayor");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
       
        if (num1 > num2){ 
            System.out.println("El número más grande es " +num1); 
        } else {
            System.out.println("El número más grande es " +num2);
        }        
        
    }
    
}
