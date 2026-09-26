package biblioteca;

/**
 * Clase base Libro.
 *
 * Aplica principios de POO:
 *  - Encapsulamiento: todos los atributos son private y se accede mediante get/set.
 *  - Abstracción: define el comportamiento común de cualquier libro
 *    (préstamo, devolución, visualización).
 *  - Herencia: LibroTexto, LibroTextoUNIAC y Novela heredan de ella.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPrestados;

    /** Constructor vacío por defecto */
    public Libro() {
    }

    /** Constructor con parámetros */
    public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    // Getters y setters (encapsulamiento)
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumeroEjemplares() { return numeroEjemplares; }
    public void setNumeroEjemplares(int numeroEjemplares) { this.numeroEjemplares = numeroEjemplares; }

    public int getEjemplaresPrestados() { return ejemplaresPrestados; }
    public void setEjemplaresPrestados(int ejemplaresPrestados) { this.ejemplaresPrestados = ejemplaresPrestados; }

    /** Calcula el número de ejemplares disponibles para prestar. */
    public int ejemplaresDisponibles() {
        return numeroEjemplares - ejemplaresPrestados;
    }

    /**
     * Préstamo de un ejemplar.
     * No se podrán prestar libros de los que no queden ejemplares disponibles.
     *
     * @return true si se ha podido realizar la operación, false en caso contrario.
     */
    public boolean prestar() {
        if (ejemplaresDisponibles() <= 0) {
            return false;
        }
        ejemplaresPrestados++;
        return true;
    }

    /**
     * Devolución de un ejemplar.
     * No se podrán devolver libros que no se hayan prestado.
     *
     * @return true si se ha podido realizar la operación, false en caso contrario.
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
        return "Libro{"
                + " titulo='" + titulo + '\''
                + ", autor='" + autor + '\''
                + ", numeroEjemplares=" + numeroEjemplares
                + ", ejemplaresPrestados=" + ejemplaresPrestados
                + ", disponibles=" + ejemplaresDisponibles()
                + '}';
    }
}