public class EventoT1 extends Evento{
    private String tipo;
    private String asistentes;
    private String tema;


    public EventoT1(String nombre, String fecha, String hora, String lugar, String tipo, String asistentes, String tema) {
        super(nombre, fecha, hora, lugar);
        this.tipo = tipo;
        this.asistentes = asistentes;
        this.tema = tema;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAsistentes(String asistentes) {
        this.asistentes = asistentes;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void modificarEvento(String fecha, String hora, String lugar, String tipo, String asistentes, String tema) {
        setFecha(fecha);
        setHora(hora);
        setLugar(lugar);
        setTipo(tipo);
        setAsistentes(asistentes);
        setTema(tema);
    }

    @Override
    public void imprimir(){
        System.out.println("EVENTO1 : " + this.toString());
    }

    @Override
    public String toString() {
        return "EventoT1{" +
                super.toString() + '\'' +
                "tipo='" + tipo + '\'' +
                ", asistentes='" + asistentes + '\'' +
                ", tema='" + tema + '\'' +
                '}';
    }
}
