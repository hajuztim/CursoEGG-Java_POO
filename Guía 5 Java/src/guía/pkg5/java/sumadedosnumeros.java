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
public class sumadedosnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float suma, num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese dos valores para sumar");
        num1 = leer.nextFloat();
        num2 = leer.nextFloat();
        
        suma=num1+num2;
        
        System.out.println("El resultado es " + suma );
    }
    
}
