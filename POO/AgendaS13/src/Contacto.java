abstract class Contacto {

    private Persona p;
    private String telefono;
    private String direccion;
    private String correo;

    public Contacto(Persona p, String telefono, String direccion, String correo) {
        this.p = p;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public Persona getPersona() {
        return p;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public abstract void imprimir();
    public abstract void modificarContacto(int edad, boolean genero, String telefono, String direccion, String correo, String atributo);
    public abstract void ventanas();

    @Override
    public String toString() {
        return "Contacto{" +
                "persona=" + p +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
