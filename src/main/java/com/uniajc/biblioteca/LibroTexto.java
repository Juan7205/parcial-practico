package com.uniajc.biblioteca;

/**
 * LibroTexto: extensión de Libro que agrega el curso al cual está asociado el libro.
 */
public class LibroTexto extends Libro {
    private String curso;

   
    public LibroTexto() {
        super();
    }
    
    
    public LibroTexto(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String curso) {
        this(titulo, autor, ejemplares, ejemplaresPrestados, curso, null);
    }

    /** Constructor con parámetros e ISBN. */
    public LibroTexto(String titulo, String autor, int ejemplares, int ejemplaresPrestados,
                      String curso, String isbn) {
        super(titulo, autor, ejemplares, ejemplaresPrestados, isbn);
        this.curso = curso;
    }

    public String getcurso() {
        return curso;
    }

    public void setcurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", curso='" + curso + "'}";
    }
}