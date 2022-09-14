/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;
import rectangulo.entidades.Dato;

/**
 *
 * @author MegaTecnologia
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Dato a1 = new Dato(0, 0, 0, 0);
        
        System.out.println("Ingrese la base y altura del rectángulo");
        
        System.out.print("Base: ");
        
        a1.setBase(leer.nextInt());
        
        System.out.print("Altura: ");
        
        a1.setAltura(leer.nextInt());
        
        //Superficie
        
        a1.superficie = a1.getBase() * a1.getAltura();
        System.out.println("Superficie: "+a1.superficie);
        
        //Perímetro
        
        a1.perimetro = (a1.getBase()+a1.getAltura()) * 2;
        System.out.println("Perímetro: "+a1.perimetro);
        
        
        
    }
    
}
