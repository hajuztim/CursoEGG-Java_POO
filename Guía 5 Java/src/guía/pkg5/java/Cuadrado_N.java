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
public class Cuadrado_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, i, j;
        Scanner leer = new Scanner(System.in);        
        System.out.println("Por favor ingrese el tamaño del cuadrado");
        num = leer.nextInt();
        
        if (num >= 0 && num <= 10) {
            
            //línea superior
            for(i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            //centro de la forma
            for (i = 0; i < num-2; i++) {
                System.out.print("*");
                for(j = 0; j < num-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            //línea inferior
            for(i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        } else {
            System.out.println("Error. No se encuentra dentros de los parámetros establecidos.");
        }
        
    }
    
}
