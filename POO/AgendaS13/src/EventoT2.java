public class EventoT2 extends Evento{
    private String aporte;
    private String estilo;
    private String asunto;

    public EventoT2(String nombre, String fecha, String hora, String lugar, String aporte, String estilo, String asunto) {
        super(nombre, fecha, hora, lugar);
        this.aporte = aporte;
        this.estilo = estilo;
        this.asunto = asunto;
    }

    public void setAporte(String aporte) {
        this.aporte = aporte;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public void modificarEvento(String fecha, String hora, String lugar, String aporte, String asunto, String estilo) {
        setFecha(fecha);
        setHora(hora);
        setLugar(lugar);
        setAporte(aporte);
        setAsunto(asunto);
        setEstilo(estilo);
    }

    @Override
    public void imprimir(){
        System.out.println("EVENTO2 : " + this.toString());
    }

    @Override
    public String toString() {
        return "EventoT2{" +
                super.toString() + '\'' +
                "aporte='" + aporte + '\'' +
                ", asunto='" + asunto + '\'' +
                ", estilo='" + estilo + '\'' +
                '}';
    }
}
