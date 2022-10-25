public class ContactoT1 extends Contacto {
    private String empresa;

    public ContactoT1(String nombre, int edad, boolean genero, String telefono, String direccion, String correo, String empresa) {
        super(new Persona(nombre, edad, genero), telefono, direccion, correo);
        this.empresa = empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void imprimir(){
        System.out.println("CONTACTO1 : " + this.toString());
    }

    @Override
    public void ventanas(){
        T1Frame pantalla = new T1Frame();
        pantalla.setSize(400,400);
        pantalla.nombreTxt.setText(this.getPersona().getNombre());
        pantalla.edadTxt.setText(this.getPersona().getEdad());
        pantalla.generoTxt.setText(this.getPersona().isGenero());
        pantalla.telefonoTxt.setText(this.getTelefono());
        pantalla.direccionTxt.setText(this.getDireccion());
        pantalla.correoTxt.setText(this.getCorreo());
        pantalla.empresaTxt.setText(this.empresa);
        pantalla.setVisible(true);
    }

    @Override
    public void modificarContacto(int edad, boolean genero, String telefono, String direccion, String correo, String empresa){
        getPersona().setGenero(genero);
        getPersona().setEdad(edad);
        setTelefono(telefono);
        setDireccion(direccion);
        setCorreo(correo);
        setEmpresa(empresa);
    }

    @Override
    public String toString() {
        return "ContactoT1{" +
                super.toString() + '\'' +
                "empresa='" + empresa + '\'' +
                '}';
    }

}
