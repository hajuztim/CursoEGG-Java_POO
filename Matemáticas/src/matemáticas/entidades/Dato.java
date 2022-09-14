/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matemáticas.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Dato {
    
    double num1;
    double num2;
    
    
    
    
    
    public Dato() {
    }

    public Dato(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    public int devolverMayor() {
        
        if (num1>num2) {
            
            System.out.println(num1+" es el mayor.");
            
        } else {
            
            System.out.println(num2+" es el mayor.");
            
        }
        return 0;
        
    }
    
    public int calcularPotencia() {
        
        System.out.println("Se redondearán y luego se calculará la potencia");
        
        System.out.println(Math.round(num1));
        System.out.println(Math.round(num2));
        
        if (num1>num2) {
            
            System.out.println(Math.pow(num1, num2));
            
        } else {
            
            System.out.println(Math.pow(num2, num1));
            
        }
        
        return 0;
    }
    
    public int calculaRaiz() {
        
        System.out.println("Primero se obtendrá el valor absoluto");
        
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));
        
        if (num1<num2) {
            
            System.out.println(Math.sqrt(num1));
            
        } else {
            
            System.out.println(Math.sqrt(num2));
            
        }
        
        return 0;
        
    }
    
    
}
