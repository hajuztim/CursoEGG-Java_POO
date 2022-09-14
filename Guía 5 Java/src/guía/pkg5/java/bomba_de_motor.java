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
public class bomba_de_motor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor entre 1 y 4. Estos mismos incluidos. Y se le mostrará la bomba correspondiente.");
        num = leer.nextInt();
        
        if (num >= 1 && num <= 4){
            
            switch (num) {
                case 1: 
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2: 
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3: 
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
            }
            
        } else if (num < 1 || num > 4) {
            System.out.println("No existe un valor válido para tipo de bomba");
        }
        
        System.out.println("¡Hasta la próxima!");
        
    }
    
}
