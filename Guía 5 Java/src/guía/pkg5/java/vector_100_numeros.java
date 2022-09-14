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
public class vector_100_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int [] vector;
        vector = new int [100];
        
        int subindice = 0;
        while (subindice < 100) {
            vector [subindice] = subindice + 1;
            subindice++;
        }
        
        System.out.println("Se mostrarán 100 números en el vector");
        for (int i = 99; i >= 0; i--) {
            
            System.out.println(vector[i]);
            
        }
        
    }
    
}
