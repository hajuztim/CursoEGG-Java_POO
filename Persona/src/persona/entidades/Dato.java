/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.entidades;

import java.util.Scanner;


/**
 *
 * @author MegaTecnologia
 */
public class Dato {
    
    Scanner leer = new Scanner(System.in);
    
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private int altura;

    public Dato() {
    }

    public Dato(String nombre, int edad, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
        
    public void crearPersona() {
        
        System.out.println("Nombre");
        nombre = leer.next();
        
        System.out.println("Edad");
        edad = leer.nextInt();
        
        System.out.println("Sexo (Hombre, Mujer, Otro)");
        sexo = leer.next();
        
        System.out.println("Peso");
        peso = leer.nextInt();
        
        System.out.println("Altura");
        altura = leer.nextInt();
        
    }
    
    public int calcularIMC() {
        
        int resultado;
        double imc = (peso/Math.pow(altura,2));
        
        if (imc < 20) {
            resultado = -1;
        } else if (imc >=20 && imc <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        
        System.out.println(""+resultado);
        
        return resultado;
    }
    
    public boolean esMayorDeEdad() {
        boolean band;
        
        if(edad<18) {
            band = false;
            System.out.println("La persona es menor de edad");
        } else {
            band = true;
            System.out.println("La persona es mayor de edad");
        }
        
        return band;
        
    }
    

    
}
