/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona12;

import java.util.Scanner;
import persona12.entidades.Persona;

/**
 *
 * @author MegaTecnologia
 */
public class Persona12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Persona a1 = new Persona();
        
        System.out.println("Cree una persona");
        a1.crearPersona();
        
        System.out.println("Ahora se calculará su edad: ");
        a1.CalcularEdad();
        
        System.out.println("Ahora se dirá si la persona es mayor o menor de edad");
        a1.menorQue();
        
        System.out.println("Ahora se mostrarán datos de la nueva persona creada");
        a1.mostrarPersona();
        
        
        
        
    }
    
}
