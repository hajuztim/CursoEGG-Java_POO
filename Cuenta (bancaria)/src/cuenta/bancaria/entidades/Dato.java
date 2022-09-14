/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.bancaria.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Dato {
    
    private int numcuenta;
    private int dni;
    private int saldo_actual;
    private double ingreso;
    private double retiro;
    private int datos;
    private int saldo;
    private double extraccion;
    public double getSaldo_actual;
    
    

    public Dato() {
    }

    public Dato(int numcuenta, int dni, int saldo_actual, double ingreso, double retiro, int datos, int saldo, int extraccion) {
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldo_actual = saldo_actual;
        this.ingreso = ingreso;
        this.retiro = retiro;
        this.datos = datos;
        this.saldo = saldo;
        this.extraccion = extraccion;
        
        
    }

    

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setSaldo_actual(int saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setExtraccion(double extraccion) {
        this.extraccion = extraccion;
    }

    public int getDni() {
        return dni;
    }

    public int getDatos() {
        return datos;
    }

    public int getSaldo() {
        return saldo;
    }

    public double getExtraccion() {
        return extraccion;
    }

    public double getIngreso() {
        return ingreso;
    }

    public double getRetiro() {
        return retiro;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    
}
