package biblioteca;

/**
 * LibroTexto: hereda de Libro y agrega el curso al cual está asociado.
 */
public class LibroTexto extends Libro {
    private String curso;

    /** Constructor vacío por defecto */
    public LibroTexto() {
        super();
    }

    /** Constructor con parámetros */
    public LibroTexto(String titulo, String autor, int numeroEjemplares,
                      int ejemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, ejemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return super.toString().replace("}", "")
                + ", curso='" + curso + "'}";
    }
}