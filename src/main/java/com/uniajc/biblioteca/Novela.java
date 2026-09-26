package com.uniajc.biblioteca;

/**
 * Novela: extensión de Libro que puede ser de diferentes tipos.
 * Tipos soportados: histórica, romántica, policíaca, realista, ciencia ficción, aventuras.
 */
public class Novela extends Libro {
    public static final String HISTORICA = "histórica";
    public static final String ROMANTICA = "romántica";
    public static final String POLICIACA = "policíaca";
    public static final String REALISTA = "realista";
    public static final String CIENCIA_FICCION = "ciencia ficción";
    public static final String AVENTURAS = "aventuras";

    private String tipo;

    /** Constructor vacío por defecto. */
    public Novela() {
        super();
    }

    /** Constructor con parámetros. */
    public Novela(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String tipo) {
        this(titulo, autor, ejemplares, ejemplaresPrestados, tipo, null);
    }

    /** Constructor con parámetros e ISBN. */
    public Novela(String titulo, String autor, int ejemplares, int ejemplaresPrestados,
                  String tipo, String isbn) {
        super(titulo, autor, ejemplares, ejemplaresPrestados, isbn);
        this.tipo = tipo;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo='" + tipo + "'}";
    }
}