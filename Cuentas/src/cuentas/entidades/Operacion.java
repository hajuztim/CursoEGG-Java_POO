/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Operacion {
    
    private int num1;
    private int num2;
    
    public int suma;
    public int resta;
    public int multiplicacion;
    public int division;

    public Operacion(int num1, int num2, int suma, int resta, int multiplicacion, int division) {
        this.num1 = num1;
        this.num2 = num2;
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }

    public Operacion() {
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
    
    
    
}
