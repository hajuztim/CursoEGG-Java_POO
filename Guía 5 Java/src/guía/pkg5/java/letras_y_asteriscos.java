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
public class letras_y_asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num1, num2, num3, num4; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 números comprendidos entre 1 y 20. Al imprimirlos se mostraran con la cantidad respectiva de asteriscos.");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        System.out.println("Números impresos:");
        
        if (num1 >= 1 && num1 <= 20) {
            
            System.out.print(num1);
            
           for(int i = 0; i < num1; i++) {
              System.out.print("*");
            }
           
        } else {
            System.out.print("Este número está fuera de los parámetros requeridos.");
        }
        
        System.out.println("  ");
        
        if (num1 >= 1 && num2 <= 20) {
            
            System.out.print(num2);
            
           for(int i = 0; i < num2; i++) {
              System.out.print("*");
            }
           
        } else {
            System.out.println("Este número está fuera de los parámetros requeridos.");
        }
      
        System.out.println(" ");
        
        if (num1 >= 1 && num3 <= 20) {
            
            System.out.print(num3);
            
           for(int i = 0; i < num3; i++) {
              System.out.print("*");
            }
           
        } else {
            System.out.println("Este número está fuera de los parámetros requeridos.");
        }
      
        System.out.println(" ");
        
        if (num1 >= 1 && num4 <= 20) {
            
            System.out.print(num4);
            
           for(int i = 0; i < num4; i++) {
              System.out.print("*");
            }
           
        } else {
            System.out.println("Este número está fuera de los parámetros requeridos.");
        }
      
        System.out.println(" ");
        
    }
        
}
    

