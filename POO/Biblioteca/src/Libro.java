public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponible; // indica si el libro esta o no disponible
    private String localizacion;

    public Libro(int codigo, String titulo, String autor, String localizacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        this.localizacion = localizacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return
                "código = " + codigo +
                ", título = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", disponible = '" + disponible + '\'' +
                ", localización = '" + localizacion + '\'';
    }

    public void imprimir(){
        System.out.println("LIBRO : " + this.toString());
    }
}
