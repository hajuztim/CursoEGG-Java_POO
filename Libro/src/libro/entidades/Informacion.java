/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Informacion {
 
    public String ISBN;
    public String titulo;
    public String autor;
    public int num_paginas;

    public Informacion() {
    }

    public Informacion(String ISBN, String titulo, String autor, int num_paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
    }

    
    
    
    
}
