package biblioteca;

/**
 * Novela: hereda de Libro y agrega el tipo de novela.
 */
public class Novela extends Libro {
    public enum Tipo {
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURAS
    }

    private Tipo tipo;

    public Novela() {
        super();
    }

    public Novela(String titulo, String autor, int numeroEjemplares,
                  int ejemplaresPrestados, Tipo tipo) {
        super(titulo, autor, numeroEjemplares, ejemplaresPrestados);
        this.tipo = tipo;
    }

    public Tipo getTipo() { return tipo; }
    public void setTipo(Tipo tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return super.toString().replace("}", "")
                + ", tipo='" + tipo + "'}";
    }
}