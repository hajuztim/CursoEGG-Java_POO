/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena.entidades;

import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Informacion {
    
    //Atributos
    
    private String frase;
    private int longitud;
    private String frase2;
    private int longitud2;

    
    // Getters y Setters
    
    public int getLongitud2() {
        return longitud2;
    }

    public void setLongitud2(int longitud2) {
        this.longitud2 = longitud2;
    }
    
    public String getFrase2() {
        return frase2;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
    // Métodos
    
    public int mostrarVocales() {
        
        int contadorvocales=0;
        
        for (int i=0;i<frase.length();i++) {
            
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'A') || 
                (frase.charAt(i) == 'e') || (frase.charAt(i) == 'E') || 
                (frase.charAt(i) == 'i') || (frase.charAt(i) == 'I') || 
                (frase.charAt(i) == 'o') || (frase.charAt(i) == 'O') || 
                (frase.charAt(i) == 'u') || (frase.charAt(i) == 'U')) {
                
                contadorvocales++;
                
            }
        }
        
        return contadorvocales;
        
    }
        
    public String invertirFrase() {
        
        int contador;
        char []invertir=frase.toCharArray();
        for (contador=frase.length()-1; contador>=0; contador--) {
            System.out.print(""+invertir[contador]);
        }
        System.out.println("");
        return "";
        
    }
            
    public int vecesRepetido() {
        
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int posicion = 0;
        
        String letra;
       
        System.out.println("Ingrese una letra a buscar:");
        letra = leer.next();
        
        while (posicion != -1) {
            
            contador++;
            posicion = frase.indexOf(letra, posicion+1);
            
        }
        contador--;
        
        
        return contador;
    }        
                
    public String compararLongitud() {
        
        int largo1;
        int largo2;
        
        largo1 = frase.length();
        largo2 = frase2.length();
        
        System.out.println("La longitud de la primera frase es de "+largo1+". Mientras que la de la nueva frase es de "+largo2);
        
        return "";
    }        
            
    public String unirFrases() {
        
        System.out.print(frase+" "+frase2);
        
        return "";
    }        
        
    public String reemplazar() {
        
        Scanner leer = new Scanner(System.in);
        
        
        String caracternuevo = leer.next();
        String reemplazar = "a";
        
        String resultante = frase.replace(reemplazar, caracternuevo);
        
        return resultante;
    }    
    
    public boolean contiene() {
        
        Scanner leer = new Scanner(System.in);
        
        boolean contiene = false;
        String letrabuscar = leer.next();
        
        if (frase.contains(letrabuscar)) {
         
            contiene = true;
        }
            
        System.out.println(contiene);
       
        return contiene;
    }
    
}
