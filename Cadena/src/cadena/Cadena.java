/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import cadena.entidades.Informacion;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String invertido, comparar, unir, reemplazar;
        int vocales, letra;
        int contadorvocales=0, contadorrepetir=0;
        
        Informacion a1 = new Informacion();
        
        System.out.println("Por favor ingrese una frase:");
        
        a1.setFrase(leer.nextLine());
        
        a1.setLongitud(a1.getFrase().length());
        
        System.out.println("");
        
        System.out.println("La longitud de la frase es de "+a1.getLongitud()+" carácteres.");
        
        System.out.println("");
        
        vocales = a1.mostrarVocales();
        
        System.out.println("La frase contiene un total de "+vocales+" vocales.");
        
        System.out.println("");
        
        System.out.print("La frase se va a invertir: ");
        
        invertido = a1.invertirFrase();
        
        System.out.println(invertido);
        
        letra = a1.vecesRepetido();
        
        System.out.println("La letra a buscar se repite un total de "+letra+" veces.");
        
        System.out.println("");
        
        System.out.println("Ahora introduzca una segunda frase. La nueva frase se comparará con la frase original en longitud.");
        
        a1.setFrase2(leer.nextLine());
        
        a1.setLongitud2(a1.getFrase2().length());
        
        comparar = a1.compararLongitud();
        
        System.out.println(comparar);
        
        System.out.println("Ahora se unirán las frases.");
        
        unir = a1.unirFrases();
        
        System.out.println(unir);
        
        System.out.println("Ahora se reemplazará todas las letras 'a' que contenga la frase por una a elección");
        
        reemplazar = a1.reemplazar();
        
        System.out.println(reemplazar);
        
        System.out.println("Ahora le pediremos un carácter y la función dirá si la frase contiene dicho carácter o no (true ó false)");
        
        a1.contiene();
        
        
    }
    
}
