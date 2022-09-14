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
public class doble_triple_raiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double num1, doble, triple;
        Scanner leer = new Scanner (System.in);
        System.out.println("Eliga un número que tenga raíz cuadrada exacta. Se mostrará su doble, su triple y su raíz cuadrada.");
        
        num1 = leer.nextDouble();
        
        doble = num1+num1;
        triple = num1+num1+num1;
        int raiz = (int) Math.sqrt(num1);
        
        System.out.println("El número elegido es " + num1 + " Su doble es " + doble + " Su triple es " + triple + " Y su raíz es " + raiz);
              
    }
    
}
