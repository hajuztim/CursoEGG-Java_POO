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
public class numeros_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, suma = 0, contador = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ahora se mostrará un programa que solo admite 20 números enteros. Al final se sumarán, si el número es negativo no se sumará y si introduce un 0 el programa terminará ahí.");
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            contador = contador+1;
            System.out.println("El contador es " +contador);
            if (num > 0){
                suma = suma+num;
            }
            if (num < 0);{
            suma = suma;  
            }
        } while (num != 0 && contador != 20);
        
        System.out.println("La suma total de los números es " +suma);
        
        
    }
    
}
