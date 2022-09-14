/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Cafetera {
    
    private int capacidadMaxima;
    private int cantidadActual;
    private int servirTaza;
    private int vaciarCafetera;
    private int agregarCafe;
    private int llenarCafetera;
    private int taza;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getServirTaza() {
        return servirTaza;
    }

    public int getVaciarCafetera() {
        return vaciarCafetera;
    }

    public int getAgregarCafe() {
        return agregarCafe;
    }

    public int getLlenarCafetera() {
        return llenarCafetera;
    }

    public void setServirTaza(int servirTaza) {
        this.servirTaza = servirTaza;
    }

    public void setVaciarCafetera(int vaciarCafetera) {
        this.vaciarCafetera = vaciarCafetera;
    }

    public void setAgregarCafe(int agregarCafe) {
        this.agregarCafe = agregarCafe;
    }

    public void setLlenarCafetera(int llenarCafetera) {
        this.llenarCafetera = llenarCafetera;
    }

    public int getTaza() {
        return taza;
    }

    public void setTaza(int taza) {
        this.taza = taza;
    }
    
    
    
    
    

   

    
    
    
    
}
