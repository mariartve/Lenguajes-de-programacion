public class Prestamo {
    private String fecha;
    private int codigo;
    private int numeroSocio;

    public Prestamo(String fecha, int codigo, int numeroSocio) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.numeroSocio = numeroSocio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }
}
