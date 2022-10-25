import java.util.LinkedList;

public class Agenda {
    private LinkedList<Contacto> listaContactos;
    private LinkedList<Evento> listaEventos;

    public Agenda() {
        this.listaContactos = new LinkedList<>();
        this.listaEventos = new LinkedList<>();
    }

    //Agregar contactos
    public void agregarContacto(ContactoT1 c){
        this.listaContactos.add(c);
    }
    public void agregarContacto(ContactoT2 c){
        this.listaContactos.add(c);
    }

    //Agregar eventos
    public void agregarEvento(EventoT1 e){
        this.listaEventos.add(e);
    }
    public void agregarEvento(EventoT2 e){
        this.listaEventos.add(e);
    }


    //Eliminar contactos
    public void eliminarContacto(String nombre){
        for(Contacto c : this.listaContactos){
            if (c.getPersona().getNombre().equals(nombre)){
                this.listaContactos.remove(c);
                break;
            }
        }
    }

    //Eliminar eventos
    public void eliminarEvento(String nombre){
        for(Evento e : this.listaEventos){
            if (e.getNombre().equals(nombre)){
                this.listaEventos.remove(e);
                break;
            }
        }
    }

    //Modificar contactos
    public void modificarContacto(String nombre, int edad, boolean genero, String telefono, String direccion, String correo, String atributo){
        for(Contacto c : this.listaContactos){
            if (c.getPersona().getNombre().equals(nombre)){
                c.modificarContacto(edad,genero,telefono, direccion, correo, atributo);
                break;
            }
        }

    }

    //Modificar eventos
    public void modificarEvento(String nombre, String fecha, String hora, String lugar, String a1, String a2, String a3){
        for(Evento e : this.listaEventos){
            if (e.getNombre().equals(nombre)){
                e.modificarEvento(fecha, hora, lugar, a1, a2, a3);
                break;
            }
        }

    }

    //ImprimirContactos
    public void imprimirContactos(){
        for(Contacto c : this.listaContactos)
            c.imprimir();
    }

    //ImprimirEventos
    public void imprimirEventos(){
        for(Evento e : this.listaEventos)
            e.imprimir();
    }

    //Mostrar ventanas con información de los contactos
    public void mostrarVentanas(){
        for(Contacto c : this.listaContactos)
            c.ventanas();
    }
}
