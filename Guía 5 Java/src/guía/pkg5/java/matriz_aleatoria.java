/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg5.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class matriz_aleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int matriz [][] = new int [4][4];
        String respuesta = "";
        System.out.println("El tamaño de la matriz será 4x4");
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++) {
                
                matriz [i][j] = aleatorio.nextInt(9);
                
            }
        }
        
        System.out.println("");
        
        for (int i=0;i<matriz.length; i++) {
            for (int j=0;j<matriz.length; j++) {
                
               respuesta = respuesta + matriz [i][j] + " ";
            }
            
            respuesta = respuesta + "\n";
             
        }
        
        System.out.println(respuesta);
        
        System.out.println("\nAhora se mostrará la matriz transpuesta");
        
        int aux;
        for (int i=0; i<matriz.length;i++) {
            for (int j=0;j<i; j++) {
                
                aux = matriz [i][j];
                matriz [i][j] = matriz [j][i];
                matriz [j][i] = aux;
                
            }
        }
        
        System.out.println("");
        
        for (int i=0; i<matriz.length;i++) {
            for (int j=0; j<matriz.length; j++) {
                
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        
        
        
        
        
        
    }
    
}
