import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private LinkedList<Libro> listaLibros;
    private LinkedList<Socio> listaSocios;
    private LinkedList<Prestamo> listaPrestamos;

    public Biblioteca() {
        this.listaLibros = new LinkedList<>();
        this.listaSocios = new LinkedList<>();
        this.listaPrestamos = new LinkedList<>();
    }

    //Agregar socios
    public void agregarSocio(Socio s){
        this.listaSocios.add(s);
    }

    //Agregar libros
    public void agregarLibro(Libro l){
        this.listaLibros.add(l);
    }

    //Realizar prestamo
    public void realizarPrestamo(Prestamo p){
        for (Libro l : this.listaLibros){
            if (l.isDisponible() && l.getCodigo() == p.getCodigo()){
                l.setDisponible(false);
                l.setLocalizacion("Prestado al socio "+String.valueOf(p.getNumeroSocio()));
                this.listaPrestamos.add(p);
                System.out.println("Prestamo registrado con éxito");
                break;
            }
            else if (l.isDisponible()==false && l.getCodigo() == p.getCodigo()){
                System.out.println("El libro solicitado no está disponible");
            }
        }
        for (Socio s : this.listaSocios){
            if (s.getNumeroSocio() == p.getNumeroSocio()){
                int c = s.getCantidadPrestamos();
                s.setCantidadPrestamos(c+=1);
                break;
            }
        }
    }

    public void imprimirlibros(){
        for (Libro l : this.listaLibros){
            l.imprimir();
        }
    }

    public void imprimirSocios(){
        for (Socio s : this.listaSocios){
            s.imprimir();
        }
    }

    public void tresPrestamos(){
        this.listaSocios
                .stream()
                .filter(s -> s.getCantidadPrestamos() > 3)
                .forEach(Socio::imprimir);
    }
}
