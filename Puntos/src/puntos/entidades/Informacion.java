/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Informacion {
    // Definir el objeto individual
    private int x;
    private int y;

    
    // Sin método de parámetro
    public Informacion() {
		
    }
    // Método con parámetros
    public Informacion(int x,int y ) {
	this.x = x;
	this.y = y;
	
    }
    // establecer el método de obtención
    public void setx( int x){
	this.x = x;
	
    }
    public int getx() {
	return x;
    }
    public void sety(int y) {
	this.y = y;
	
    }
    public int gety() {
	return y;
    }
}
