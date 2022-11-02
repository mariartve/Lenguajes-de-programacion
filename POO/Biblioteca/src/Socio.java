public class Socio {
    private int numeroSocio;
    private String nombre;
    private String direccion;
    private int cantidadPrestamos;

    public Socio(int numeroSocio, String nombre, String direccion) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadPrestamos = 0;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setCantidadPrestamos(int cantidadPrestamos) {
        this.cantidadPrestamos = cantidadPrestamos;
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    @Override
    public String toString() {
        return "número de socio = " + numeroSocio +
                ", nombre = '" + nombre + '\'' +
                ", dirección = '" + direccion + '\'' +
                ", cantidad de prestamos = '" + cantidadPrestamos + '\'';
    }

    public void imprimir(){
        System.out.println("SOCIO : " + this.toString());
    }
}
