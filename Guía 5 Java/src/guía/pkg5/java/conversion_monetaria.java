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
public class conversion_monetaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor de euro. Este programa mostrará las equivalencias de 3 monedas.");
        
        double euros;
        euros = introeuros();
        
    }   
        
    
    public static double introeuros() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Euros a cambiar.");
        double euros;
        euros = leer.nextDouble();
        System.out.println("Ahora elija a que moneda cambiarlo.");
        
        System.out.println("1. Libras\n"
                + "2. Dólares\n"
                + "3. Yenes\n"
                + "4. Salir");
        
        int opcion = leer.nextInt();
        double cuenta;
                
        switch(opcion){
            case 1:
                cuenta = euros*0.86;
                System.out.println("Usted tiene " +cuenta+ " libras" );
                break;
            case 2:
                cuenta = euros*1.28611;
                System.out.println("Usted tiene " +cuenta+ " dólares ");
                break;
            case 3:
                cuenta = euros* 129.852;
                System.out.println("Usted tiene " +cuenta+ " yenes " );
                break;
            case 4:
                System.out.println("Usted ha salido del sistema");
                break;               
        }
        
        return 0;
    }
    

        
}   
        
        
    
    

