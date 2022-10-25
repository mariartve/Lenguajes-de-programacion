abstract class Evento {
    private String nombre;
    private String fecha;
    private String hora;
    private String lugar;

    public Evento(String nombre, String fecha, String hora, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public abstract void modificarEvento(String fecha, String hora, String lugar, String a1, String a2, String a3);
    public abstract void imprimir();

    @Override
    public String toString() {
        return "Evento{" +
                "nombre=" + nombre +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
