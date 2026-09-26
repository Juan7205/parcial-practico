package biblioteca;

/**
 * LibroTextoUNIAC: subclase de LibroTexto que indica la facultad que lo publicó.
 */
public class LibroTextoUNIAC extends LibroTexto {
    private String facultad;

    public LibroTextoUNIAC() {
        super();
    }

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares,
                           int ejemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, ejemplaresPrestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }

    @Override
    public String toString() {
        return super.toString().replace("}", "")
                + ", facultad='" + facultad + "'}";
    }
}