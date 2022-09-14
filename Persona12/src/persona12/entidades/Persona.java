/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona12.entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Persona {
    
    private String nombre;
    private String nombre2;
    private int dia;
    private int dia2;
    private int mes;
    private int mes2;
    private int anio;
    private int anio2;
    private int dif;
    private int dif2;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String crearPersona() {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        
        System.out.println("Ingrese el día");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        
        Date fechaDeNacimiento = new Date(anio+1900, mes-1, dia);
        fechaDeNacimiento.getYear();
        fechaDeNacimiento.getMonth();
        fechaDeNacimiento.getDay();
        
        return "";
    }
    
    public int CalcularEdad() {
        
        Date fechaActual = new Date();
        int diaActual=fechaActual.getDate();
        int mesActual=fechaActual.getMonth()+1;
        int anioActual=fechaActual.getYear()+1900;
        
        dif=anioActual-anio;
        
        if(mesActual<=mes) {
            
            if (dia>diaActual) {
                dif--;
            }
            
        } else {
            
            dif--;
            
        }
        
        dif=dif+1;
        
        System.out.println("Su edad es de "+dif);
        
        return dif;
    }
    
    public boolean menorQue() {
        
        //Persona 2
        Scanner leer = new Scanner(System.in);
        
        nombre2 = "Carlos";
        dia2 = 2;
        mes2 = 6;
        anio2 = 2003;
        
        Date fechaDeNacimiento = new Date(anio+1900, mes-1, dia);
        fechaDeNacimiento.getYear();
        fechaDeNacimiento.getMonth();
        fechaDeNacimiento.getDay();
        
        //Edad de la persona nueva
        Date fechaActual = new Date();
        int diaActual=fechaActual.getDate();
        int mesActual=fechaActual.getMonth()+1;
        int anioActual=fechaActual.getYear()+1900;
        
        dif2=anioActual-anio;
        
        if(mesActual<=mes) {
            
            if (dia>diaActual) {
                dif2--;
            }
            
        } else {
            
            dif2--;
            
        }
        
        dif2=dif2+1;
        
        //¿Menor o mayor de edad?
        boolean edad;
        
        if (dif2 > dif) {
            
            edad = true;
            System.out.println("Es menor de edad");
                        
        } else {
            
            edad = false;
            System.out.println("Es mayor de edad");
        }
        
        return edad;
    }
    
    public String mostrarPersona() {
        
        System.out.println("Nombre: "+nombre2);
        System.out.println("Fecha de cumpleaños: ");
        System.out.println("Día: "+dia2);
        System.out.println("Mes: "+mes2);
        System.out.println("Año: "+anio2);
        
        return "";
    }
    
}




