/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import java.util.Scanner;
import nespresso.entidades.Cafetera;

/**
 *
 * @author MegaTecnologia
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cafetera a1 = new Cafetera();
        
        a1.setCapacidadMaxima(1000);
        
        a1.setCantidadActual(800);
        
        System.out.println("La cafetera tiene una capacidad de 1000ml y tiene 800ml en su interior.");
        
        System.out.println("Ahora se servirá una taza. De los 800 ¿Cuánto desea servirse? La taza tiene una capacidad de 500ml.");
        
        a1.setServirTaza(leer.nextInt());
        
        a1.setTaza(a1.getServirTaza());
        
        if (a1.getTaza() > 500) {
            
            System.out.println("La cantidad excede la capacidad. Se llenará la taza a una medida elegida de 450 ml");
            
            a1.setTaza(450);
            
        } else {
            
            System.out.println("La taza se llenó a " +a1.getTaza()+ " ml.");
            
        }
        
        a1.setCantidadActual(a1.getCantidadActual() - a1.getServirTaza());
        
        System.out.println("A la cafetera le quedan " +a1.getCantidadActual()+ " ml.");
        
        System.out.println("Ahora los ml restantes de la taza se tirarán.");
        
        a1.setVaciarCafetera(a1.getCantidadActual() - a1.getCantidadActual());
        
        System.out.println("La cafetera actualmente contiene " +a1.getVaciarCafetera()+ " ml.");
        
        System.out.println("Se agregará café a la cafetera. Diga cuánto.");
        
        a1.setAgregarCafe(leer.nextInt());
        
        if (a1.getAgregarCafe() > 1000 ) {
            
            System.out.println("La cantidad excede la capacidad. Así que se llenará la cafetera a 1000 ml");
            
            a1.setCantidadActual(1000);
                
        } else {
            
            System.out.println("Se agregaron "+a1.getAgregarCafe()+ " ml a la cafetera.");
            
        }
        
    }

    
}
