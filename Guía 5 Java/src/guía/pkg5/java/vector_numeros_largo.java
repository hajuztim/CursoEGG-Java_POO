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
public class vector_numeros_largo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int num, i;
        num = leer.nextInt();       
        int divisor = 10, cont=0, res=0;
        int vector [] = new int [num];
        
        
        for (i = 0; i<num; i++) {
            
            vector[i]=(int) (Math.random()*99999);
            
            System.out.println(vector[i]);
            
            do {
            
                res = vector[i] / divisor;
                cont++;
                divisor = divisor * 10;
                       
            } while (res>=1);
        
                System.out.println("el número " +vector[i]+ " tiene " +cont+ " digitos");
                cont=0;
                res=0;
                divisor = 10;
                
        }
    }
    
}
