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
public class nota_entre_0_y_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int num;
        Scanner leer = new Scanner(System.in);
                
        do {
            
            System.out.println("Ingrese una nota entre 0 y 10. De no serlo el programa pedirá la nota otra vez.");
            num = leer.nextInt();
            
        } while (num > 10 || num < 0);
        
        System.out.println("Perfecto!");
    }
    
}
