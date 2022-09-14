/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matemáticas;

import matemáticas.entidades.Dato;

/**
 *
 * @author MegaTecnologia
 */
public class Matemáticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dato a1 = new Dato();
        
        a1.setNum1(Math.random());
        a1.setNum2(Math.random());
        
        System.out.println("Se generarán números aleatorios");
        System.out.println("Se comprobará cuál de ambos números es el mayor de ambos.");
        
        a1.devolverMayor();
        
        System.out.println("Se calculará la potencia del mayor.");
        
        a1.calcularPotencia();
        
        System.out.println("Se calculará la raíz del número menor.");
        
        a1.calculaRaiz();
        
        
    }
    
}
