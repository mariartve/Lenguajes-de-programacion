public class ContactoT2 extends Contacto {
    private String parentesco;

    public ContactoT2(String nombre, int edad, boolean genero, String telefono, String direccion, String correo, String parentesco) {
        super(new Persona(nombre, edad, genero), telefono, direccion, correo);
        this.parentesco = parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void imprimir(){
        System.out.println("CONTACTO2 : " + this.toString());
    }

    @Override
    public void ventanas(){
        T2Frame pantalla = new T2Frame();
        pantalla.setSize(400,400);
        pantalla.nombreTxt.setText(this.getPersona().getNombre());
        pantalla.edadTxt.setText(this.getPersona().getEdad());
        pantalla.generoTxt.setText(this.getPersona().isGenero());
        pantalla.telefonoTxt.setText(this.getTelefono());
        pantalla.direccionTxt.setText(this.getDireccion());
        pantalla.correoTxt.setText(this.getCorreo());
        pantalla.parentescoTxt.setText(this.parentesco);
        pantalla.setVisible(true);
    }

    @Override
    public void modificarContacto(int edad, boolean genero,String telefono, String direccion, String correo, String parentesco){
        getPersona().setGenero(genero);
        getPersona().setEdad(edad);
        setTelefono(telefono);
        setDireccion(direccion);
        setCorreo(correo);
        setParentesco(parentesco);
    }

    @Override
    public String toString() {
        return "ContactoT2{" +
                super.toString() + '\'' +
                "parentesco='" + parentesco + '\'' +
                '}';
    }
}
