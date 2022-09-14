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
public class cinco_opciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num1, num2, opcion, operacion;
        String SoN = "N";
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca dos números enteros positivos.");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
                
        do {
            
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch (opcion){
             
                case 1:
                    operacion = num1 + num2;
                    System.out.println("El resultado de la suma de " +num1+ " y de " +num2+ " es " +operacion);
                    break;
                case 2:
                    operacion = num1 - num2;
                    System.out.println("El resultado de la resta de " +num1+ " y de " +num2+ " es " +operacion);
                    break;
                case 3:
                    operacion = num1 * num2;
                    System.out.println("El resultado de la multiplicación de " +num1+ " y de " +num2+ " es " +operacion);
                    break;
                case 4:
                    operacion = num1 % num2;
                    System.out.println("El resultado de la división de " +num1+ " y de " +num2+ " es " +operacion);
                    break;
                case 5: 
                    System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                    System.out.println("AVISO: DEBE SER EN MAYÚSCULAS LA RESPUESTA (S/N) SINO EL PROGRAMA SEGUIRÁ");
                    SoN = leer.next();
                    break;
            }  
        } while ("N".equals(SoN));
        
    }
    
}
