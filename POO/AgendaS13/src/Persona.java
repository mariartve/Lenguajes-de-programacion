public class Persona {
    private String nombre;
    private int edad;
    private boolean genero;

    public Persona(String nombre, int edad, boolean genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return String.valueOf(edad);
    }

    public String isGenero() {
        return String.valueOf(genero);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }

}
