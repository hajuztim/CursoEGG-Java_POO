/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancion;

import cancion.entidades.Informacion;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Informacion a1 = new Informacion();
        
        System.out.println("Introduzca el nombre del autor de la canción");
        a1.setAutor(leer.nextLine());
        
        System.out.println("Introduzca el nombre de la canción");
        a1.setTitulo(leer.nextLine());
        
        System.out.println("Se mostrará al información");
        System.out.println("Autor: "+a1.getAutor());
        System.out.println("Canción: "+a1.getTitulo());
       
        
    }
    
}
