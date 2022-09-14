/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Arrays;

/**
 *
 * @author MegaTecnologia
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] A = new int[50];
        double[] B = new double[20];
        int contador = 0;
        
        System.out.println("Arreglo A");
        
        for (int i=0;i<A.length;i++) {
            
            A[i] = (int) (Math.random()*50)+1;
            System.out.println("Posición "+contador+": "+A[i]);
            contador++;
        }
        
        Arrays.sort(A);
        
        for (int i = 0; i < 10; i++) {
            
            B[i] = A[i];
                    
        }
        
        Arrays.fill(B, 10, 20, 0.5);
        System.out.println("A: ");
        System.out.println(Arrays.toString(A));
        System.out.println("B: ");
        System.out.println(Arrays.toString(B));
        
        
        
        
        
    }
    
}
