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
public class vector_numeros_aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int num, i;
        num = leer.nextInt();       
        
        int vector [] = new int [num];
        
        System.out.println("Se mostrarán los números aleatorios a continuación.");
        
        for (i = 0; i<num; i++) {
            
            vector[i]=(int) (Math.random()*100);
            
            System.out.println(vector[i]);
            
        }
       
        System.out.println("Por favor ingrese un número a buscar");
        
        int buscar = leer.nextInt();
        int cont = 0;
        int posicion = i;
        
        for (i = 0; i<num; i++){
            
            if (vector[i]==num){
                cont=cont+1;
            }
        }
           
        System.out.println("El número se encuentra en la posición " +posicion);
        
        
        if (cont>0){
            
            System.out.println("Este número se encuentra " +cont+ " veces");

        } else {
            
            System.out.println("Este número no se encuentra repetido");
            
        }
      
        
        
    }
    
}
