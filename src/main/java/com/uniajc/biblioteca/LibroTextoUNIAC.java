package com.uniajc.biblioteca;

/**
 * LibroTextoUNIAC: subclase de LibroTexto que agrega la facultad que lo publicó.
 */
public class LibroTextoUNIAC extends LibroTexto {
    private String facultad;

    /** Constructor vacío por defecto. */
    public LibroTextoUNIAC() {
        super();
    }

    /** Constructor con parámetros. */
    public LibroTextoUNIAC(String titulo, String autor, int ejemplares, int ejemplaresPrestados,
                           String curso, String facultad) {
        this(titulo, autor, ejemplares, ejemplaresPrestados, curso, facultad, null);
    }

    /** Constructor con parámetros e ISBN. */
    public LibroTextoUNIAC(String titulo, String autor, int ejemplares, int ejemplaresPrestados,
                           String curso, String facultad, String isbn) {
        super(titulo, autor, ejemplares, ejemplaresPrestados, curso, isbn);
        this.facultad = facultad;
    }

    public String getfacultad() {
        return facultad;
    }

    public void setfacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + ", facultad='" + facultad + "'}";
    }
}