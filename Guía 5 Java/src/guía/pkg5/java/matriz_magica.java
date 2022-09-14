/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guía.pkg5.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class matriz_magica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz");
        int n = leer.nextInt();
        
        int [][] m = new int[n][n];
        int suma_columna[] = new int[m.length];
        int suma_filas = 0;
        
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el valor de la posición [" +i+ "] [" +j+ "]");
                m[i][j] = leer.nextInt();
                
            }
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");                
            }
            System.out.println(" ");
        } 
        
        System.out.println(" ");
        
        System.out.println("A continuación se mostrarán los cálculos");
        
        System.out.println(" ");
        
        for (int i=0; i<m.length;i++) {
            for (int j=0;j<m[0].length;j++) {
                System.out.println(m[i][j]+" ");
                suma_filas += m[i][j];
                suma_columna[i] += m[j][i];
            }
            System.out.print("= "+suma_filas);
            System.out.println("");
            suma_filas = 0;
            
        }
        System.out.println(Arrays.toString(suma_columna));
        
        
    }
    
}
