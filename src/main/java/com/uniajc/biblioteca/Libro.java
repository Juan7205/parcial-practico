package com.uniajc.biblioteca;

/**
 * Clase base que representa un libro.
 * Aplica los principios de POO: abstracción (define el concepto genérico de libro),
 * encapsulamiento (atributos privados con getters/setters) y herencia (es extendida por
 * LibroTexto, LibroTextoUNIAC y Novela).
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;         // número total de ejemplares
    private int ejemplaresPrestados; // número de ejemplares actualmente prestados
    private String isbn;            // identificador único del libro

    
    public Libro() {
    }

    
    public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
        this(titulo, autor, ejemplares, ejemplaresPrestados, null);
    }

    
    public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.isbn = isbn;
    }

    

    public String getTitutlo() {
        return titulo;
    }

    public void setTitutlo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Valida si el ISBN del libro cumple con el formato ISBN-13.
     * El formato debe ser 13 dígitos (guiones son ignorados) y el dígito de
     * control debe coincidir con el algoritmo de validación oficial.
     *
     * @return true si el ISBN es válido, false en caso contrario.
     */
    public boolean esIsbnValido() {
        if (isbn == null) {
            return false;
        }
        String digitos = isbn.replaceAll("[^0-9]", "");
        if (digitos.length() != 13) {
            return false;
        }
        int suma = 0;
        for (int i = 0; i < 12; i++) {
            int d = Character.getNumericValue(digitos.charAt(i));
            suma += (i % 2 == 0) ? d : d * 3;
        }
        int digitoControl = (10 - (suma % 10)) % 10;
        return digitoControl == Character.getNumericValue(digitos.charAt(12));
    }

    /** Calcula el número de ejemplares disponibles para prestar. */
    public int ejemplaresDisponibles() {
        return ejemplares - ejemplaresPrestados;
    }

    /**
     * Presta un ejemplar del libro.
     * No se podrán prestar libros de los que no queden ejemplares disponibles.
     * Incrementa el atributo de ejemplares prestados.
     *
     * @return true si se pudo realizar la operación, false en caso contrario.
     */
    public boolean prestar() {
        if (ejemplaresDisponibles() <= 0) {
            return false;
        }
        ejemplaresPrestados++;
        return true;
    }

    /**
     * Devuelve un ejemplar del libro.
     * No se podrán devolver libros que no se hayan prestado.
     * Disminuye el atributo de ejemplares prestados (una devolución libera un ejemplar).
     *
     * @return true si se pudo realizar la operación, false en caso contrario.
     */
    public boolean devolver() {
        if (ejemplaresPrestados <= 0) {
            return false;
        }
        ejemplaresPrestados--;
        return true;
    }

    @Override
    public String toString() {
        return "Libro{titutlo='" + titulo + "', autor='" + autor
                + "', ejemplares=" + ejemplares
                + ", ejemplaresPrestados=" + ejemplaresPrestados
                + ", isbn='" + isbn + "'}";
    }
}