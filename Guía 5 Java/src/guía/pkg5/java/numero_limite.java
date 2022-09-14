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
public class numero_limite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int num, limite, suma = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Establezca un límite");
        limite = leer.nextInt();
        
        do {
            System.out.println("Ingrese valores, estos se sumarán hasta tocar el límite");
            
            num = leer.nextInt();
            
            suma = suma+num;
            System.out.println(suma);
            
        } while (suma < limite);
        
        
        
    }
    
}
