/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria;

import cuenta.bancaria.entidades.Dato;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Dato a1 = new Dato(0, 0, 15000, 0, 0, 0, 0, 0);
        
        System.out.println("Por favor ingrese sus datos de cuenta");
        System.out.print("Número de cuenta: ");
        
        a1.setNumcuenta(leer.nextInt());
        
        System.out.println("Documento Nacional de Identidad (DNI)");
        
        a1.setDni(leer.nextInt());
        
        System.out.print("Se mostrará su saldo actual: ");
        
        System.out.println(a1.getSaldo_actual()+ " pesos");
        
        System.out.print("Va a ingresar dinero a la cuenta. Diga cuánto: " );
        
        a1.setIngreso(leer.nextDouble());
        
        a1.getSaldo_actual= a1.getSaldo_actual() + a1.getIngreso();
        
        System.out.println("Su saldo actual es de: "+a1.getSaldo_actual+" pesos");
        
        System.out.print("Va a retirar dinero de la cuenta. Diga cuánto: ");
        
        a1.setRetiro(leer.nextDouble());
        
        a1.getSaldo_actual= a1.getSaldo_actual - a1.getRetiro();
        
        System.out.println("Su saldo actual es de "+a1.getSaldo_actual+ " pesos");
        
        System.out.println("Ahora va a hacer una extracción rápida del 20% ");
        
        a1.setExtraccion((a1.getSaldo_actual / 100 ) * 20);
        
        a1.getSaldo_actual= a1.getSaldo_actual - a1.getExtraccion();
        
        System.out.println("Su saldo actual es de "+a1.getSaldo_actual+ " pesos");
        
        System.out.println("Se mostrarán los datos de la cuenta");
        
        System.out.println("Documento Nacional de Identidad (DNI): "+a1.getDni()+ "\nNúmero de cuenta: "+a1.getNumcuenta()+"\nSaldo actual: "+a1.getSaldo_actual);
        
        System.out.println("¡Hasta pronto!");
        
        
        
    }
    
}
