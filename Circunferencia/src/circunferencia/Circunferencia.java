/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import circunferencia.entidades.Formula;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Formula a1 = new Formula(0, 0);

        System.out.println("Ingrese el valor del radio de la circunferencia");

        a1.setRadio(leer.nextInt());

        System.out.println("El radio que ingresó es: " + a1.getRadio());

        System.out.println("Se harán los cálculos del área y el perímetro de la circunferencia:");

        a1.area = 3.1416 * Math.pow(a1.getRadio(), 2);

        a1.perimetro = 2 * Math.PI * a1.getRadio();

        System.out.println("Área: " + a1.area + "\nPerímetro: " + a1.perimetro);

    }

}
