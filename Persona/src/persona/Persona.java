/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Scanner;
import persona.entidades.Dato;


/**
 *
 * @author MegaTecnologia
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Dato a1 = new Dato();
        Dato a2 = new Dato();
        Dato a3 = new Dato();
        Dato a4 = new Dato();
        
        int peso1, peso2, peso3, peso4;
        int cont=0, contM=0, contE=0, contMA=0;
        boolean mayor1, mayor2, mayor3, mayor4;
        
        System.out.println("Valores Persona 1");
        a1.crearPersona();
        System.out.println("Resultado altura:");
        peso1 = a1.calcularIMC();
        mayor1 = a1.esMayorDeEdad();

        switch (peso1){
            case 1: contE++;
            break;
            case 0: cont++;
            break;
            case -1: contM++;
            break;
        }
        
        if (mayor1 ==true){
            contMA++;
        }
        
        System.out.println("");
        
        System.out.println("Valores Persona 2");
        a2.crearPersona();
        System.out.println("Resultado altura:");
        peso2 = a2.calcularIMC();
        mayor2 = a2.esMayorDeEdad();

        switch (peso2){
            case 1: contE++;
            break;
            case 0: cont++;
            break;
            case -1: contM++;
            break;
        }
        
        if (mayor2 ==true){
            contMA++;
        }
        
        System.out.println("");
        
        System.out.println("Valores Persona 3");
        a3.crearPersona();
        System.out.println("Resultado altura:");
        peso3 = a3.calcularIMC();
        mayor3 = a3.esMayorDeEdad();

        switch (peso3){
            case 1: contE++;
            break;
            case 0: cont++;
            break;
            case -1: contM++;
            break;
        }
        
        if (mayor3 ==true){
            contMA++;
        }
        
        System.out.println("");
        
        System.out.println("Valores Persona 4");
        a4.crearPersona();
        System.out.println("Resultado altura:");
        peso4 = a4.calcularIMC();
        mayor4 = a4.esMayorDeEdad();

        switch (peso4){
            case 1: contE++;
            break;
            case 0: cont++;
            break;
            case -1: contM++;
            break;
        }
        
        if (mayor4 ==true){
            contMA++;
        }
        
        System.out.println("");
        
        System.out.println(cont+" Persona/s están en su peso ideal"
                + "\n"+contM+" Personas están bajas de peso"
                        + "\n"+contE+" Personas están excedidas de peso");
                System.out.println(contMA+" Son mayores de edad");
        
    }

   
    
}
