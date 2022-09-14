/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio+1900, mes-1, dia);
        fecha.getYear();
        fecha.getMonth();
        fecha.getDay();
        
        System.out.println("La fecha ingresada es "+fecha);
        
        Date fechaActual = new Date();
        int diaActual=fechaActual.getDate();
        int mesActual=fechaActual.getMonth()+1;
        int anioActual=fechaActual.getYear()+1900;
        
        System.out.println("La fecha actual es"+fechaActual);
        int dif=anioActual-anio;
        
        if(mesActual<=mes) {
            
            if (dia>diaActual) {
                dif--;
            }
            
        } else {
            
            dif--;
            
        }
        
        System.out.println("La diferencia es "+dif);
        
    }
    
}
