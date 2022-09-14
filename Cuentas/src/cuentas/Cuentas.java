/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import cuentas.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Cuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        Operacion a1 = new Operacion(0, 0, 0, 0, 0, 0);
        
        System.out.println("Ingrese dos números, estos se operarán en; suma, resta, multiplicación y división");
        
        a1.setNum1(leer.nextInt());
        a1.setNum2(leer.nextInt());
        
        System.out.println("Ahora se mostrará el resultado de la suma");
        
        a1.suma = a1.getNum1() + a1.getNum2();
        
        System.out.println(a1.suma);
        
        System.out.println("Ahora se mostrará el resultado de la resta");
        
        a1.resta = a1.getNum1() - a1.getNum2();
        
        System.out.println(a1.resta);
        
        System.out.println("Ahora se mostrará el resultado de la multiplicación");
        
        if (a1.getNum1() == 0 || a1.getNum2() == 0) {
            
            System.out.println("Error. Uno de los números equivale a 0. No puede realizarse la multiplicación");
            System.out.println(a1.multiplicacion);
        } else {
            
            a1.multiplicacion = a1.getNum1() * a1.getNum2();
            
            System.out.println(a1.multiplicacion);
            
        }
        
        System.out.println("Ahora se mostrará el resultado de la división");
        
        if (a1.getNum1() == 0 || a1.getNum2() == 0) {
            
            System.out.println("Error. Uno de los números equivale a 0. No puede realizarse la división");
            System.out.println(a1.division);
        } else {
            
            a1.multiplicacion = a1.getNum1() / a1.getNum2();
            
            System.out.println(a1.multiplicacion);
            
        }
        
        
    }

}
