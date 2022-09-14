/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.Scanner;
import libro.entidades.Informacion;

/**
 *
 * @author MegaTecnologia
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del libro");
        
        Informacion A1 = new Informacion("978-987-25620-2-1", leer.next(), "Agustín Sanchez", 325);
        
        System.out.println("ISBN del Libro: "+A1.ISBN+"\nTítulo: "+A1.titulo+"\nAutor: "+A1.autor+"\nNúmero de páginas: "+A1.num_paginas);
        
    }
    
}
