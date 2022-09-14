/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;

import java.util.Scanner;
import puntos.entidades.Informacion;

/**
 *
 * @author MegaTecnologia
 */
public class Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir la función de suma de distancia
	double sum;
	// Información del mensaje de salida del programa

	System.out.println("---------- Calcula la distancia entre dos puntos ----------");
	System.out.println("Introduzca las coordenadas de los dos puntos que desea calcular:");
	System.out.println("El punto de abscisas x del primer punto es:");
        Scanner leer = new Scanner(System.in);   
	// Definir las coordenadas horizontales y verticales del primer punto de la entrada del objeto
	Informacion p1 = new Informacion();
	int x1 = leer.nextInt();
	System.out.println("El punto de abscisas y del primer punto es:");
	int y1 = leer.nextInt();
	// Usa el método set para pasar parámetros
	p1.setx(x1);
	p1.sety(y1);
	
	// Ingrese las coordenadas horizontal y vertical del segundo punto
	System.out.println("El punto de abscisas x del segundo punto es:");
	Informacion p2 = new Informacion();
	int x2 = leer.nextInt();
	System.out.println("El punto de abscisas y del segundo punto es:");
	int y2 = leer.nextInt();
	// Usa el método set para pasar parámetros
	p1.setx(x2);
	p1.sety(y2);
	// Pasar las coordenadas a la función dis
	dis(x1, x2, y1, y2);

    }
    // Definir la función dis para calcular la distancia de suma y devolver los caracteres de print
    public static void dis(int x1,int x2,int y1,int y2) {
	double sum = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	System.out.println("Entraste ("+x1+","+y1+")("+x2+","+y2+") La distancia entre dos puntos es:"+sum);
    }
    
}
    

