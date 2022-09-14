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
public class matriz_anti_simetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz");
        int n = leer.nextInt();
        
        
        int [][] matriz = new int[n][n];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor de la posición [" +i+ "] [" +j+ "]");
                matriz [i][j] = leer.nextInt();
                
            }
        }
        
        boolean log = false;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == -matriz[j][i]) {
                    log = true;
                }
                
            }
        }
        
        if (log) {
            System.out.println("La matriz es Anti Simétrica");
        } else {
            System.out.println("La matriz no es Anti Simétrica");
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");                
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        System.out.println("Matriz transpuesta");
        
        System.out.println(" ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + "  ");                
            }
            System.out.println("");
        }
        
        System.out.println(" ");
    }
    
}
