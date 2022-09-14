/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Dato {
    
    private int base;
    private int altura;
    
    public int superficie;
    public int perimetro;
    
    
    public Dato() {
    }
    
    public Dato(int base, int altura, int superficie, int perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }

    
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    
    
    
    
    
    
    
    
    
}
