public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        //Agregar libros
        System.out.println("***AGREGANDO LIBROS***");
        b.agregarLibro(new Libro(1, "Don Quijote de la Mancha","Miguel de Cervantes", "Pasillo 1"));
        b.agregarLibro(new Libro(2, "El principito", "Antoine de Saint-Exupéry", "Pasillo 2"));
        b.agregarLibro(new Libro(3, "Las aventuras de Alicia en el país de las maravillas", "Lewis Carroll", "Pasillo 3"));
        b.agregarLibro(new Libro(4,"El alquimista", "Paulo Coelho", "Pasillo 1"));
        b.agregarLibro(new Libro(5, "Ana de las Tejas Verdes", "Lucy Maud Montgomery", "Pasillo 2"));
        b.agregarLibro(new Libro(6, " Cien años de soledad", "Gabriel García Márquez", "Pasillo 3"));
        b.agregarLibro(new Libro(7, "Dinero", "Martin Amis", "Pasillo 1"));
        b.agregarLibro(new Libro(8, "Todas las almas", "Javier Marías", "Pasillo 2"));
        b.agregarLibro(new Libro(9, "Lo raro es vivir", "Carmen Martín Gaite", "Pasillo 3"));
        b.agregarLibro(new Libro(10, "Orgullo y prejuicio", "Jane Austen", "Pasillo 1"));

        //Agregar socios
        System.out.println("\n***AGREGANDO SOCIOS***");
        b.agregarSocio(new Socio(1, "Juan Carlos Quesada", "500 norte del hospital"));
        b.agregarSocio(new Socio(2, "Ana Raquel Arias", "150 sur de la plaza"));
        b.agregarSocio(new Socio(3, "Julian Vargas", "400 este del parque"));

        //Realizar prestamos
        System.out.println("\n***REALIZANDO PRESTAMOS***");
        b.realizarPrestamo(new Prestamo("1/11/2022", 1, 1));
        b.realizarPrestamo(new Prestamo("1/11/2022", 2, 1));
        b.realizarPrestamo(new Prestamo("1/11/2022", 3, 1));
        b.realizarPrestamo(new Prestamo("1/11/2022", 4, 1));
        b.realizarPrestamo(new Prestamo("1/11/2022", 5, 2));
        b.realizarPrestamo(new Prestamo("1/11/2022", 8, 2));
        b.realizarPrestamo(new Prestamo("1/11/2022", 10, 3));


        //Imprime los libros que tiene la biblioteca (Permite observar su estado)
        System.out.println("\n***IMPRIMENDO LIBROS***");
        b.imprimirlibros();

        //Imprime los socios que tiene la biblioteca
        System.out.println("\n***IMPRIMENDO SOCIOS***");
        b.imprimirSocios();

        //Imprime los socios que tengan más de 3 prestamos
        System.out.println("\n***IMPRIMIENDO SOCIOS CON MÁS DE 3 PRESTAMOS***");
        b.tresPrestamos();

        /*RESULTADO:
        ***AGREGANDO LIBROS***

        ***AGREGANDO SOCIOS***

        ***REALIZANDO PRESTAMOS***
        Prestamo registrado con éxito
        Prestamo registrado con éxito
        Prestamo registrado con éxito
        Prestamo registrado con éxito
        Prestamo registrado con éxito
        Prestamo registrado con éxito
        Prestamo registrado con éxito

        ***IMPRIMENDO LIBROS***
        LIBRO : código = 1, título = 'Don Quijote de la Mancha', autor = 'Miguel de Cervantes', disponible = 'false', localización = 'Prestado al socio 1'
        LIBRO : código = 2, título = 'El principito', autor = 'Antoine de Saint-Exupéry', disponible = 'false', localización = 'Prestado al socio 1'
        LIBRO : código = 3, título = 'Las aventuras de Alicia en el país de las maravillas', autor = 'Lewis Carroll', disponible = 'false', localización = 'Prestado al socio 1'
        LIBRO : código = 4, título = 'El alquimista', autor = 'Paulo Coelho', disponible = 'false', localización = 'Prestado al socio 1'
        LIBRO : código = 5, título = 'Ana de las Tejas Verdes', autor = 'Lucy Maud Montgomery', disponible = 'false', localización = 'Prestado al socio 2'
        LIBRO : código = 6, título = ' Cien años de soledad', autor = 'Gabriel García Márquez', disponible = 'true', localización = 'Pasillo 3'
        LIBRO : código = 7, título = 'Dinero', autor = 'Martin Amis', disponible = 'true', localización = 'Pasillo 1'
        LIBRO : código = 8, título = 'Todas las almas', autor = 'Javier Marías', disponible = 'false', localización = 'Prestado al socio 2'
        LIBRO : código = 9, título = 'Lo raro es vivir', autor = 'Carmen Martín Gaite', disponible = 'true', localización = 'Pasillo 3'
        LIBRO : código = 10, título = 'Orgullo y prejuicio', autor = 'Jane Austen', disponible = 'false', localización = 'Prestado al socio 3'

        ***IMPRIMENDO SOCIOS***
        SOCIO : número de socio = 1, nombre = 'Juan Carlos Quesada', dirección = '500 norte del hospital', cantidad de prestamos = '4'
        SOCIO : número de socio = 2, nombre = 'Ana Raquel Arias', dirección = '150 sur de la plaza', cantidad de prestamos = '2'
        SOCIO : número de socio = 3, nombre = 'Julian Vargas', dirección = '400 este del parque', cantidad de prestamos = '1'

        ***IMPRIMIENDO SOCIOS CON MÁS DE 3 PRESTAMOS***
        SOCIO : número de socio = 1, nombre = 'Juan Carlos Quesada', dirección = '500 norte del hospital', cantidad de prestamos = '4'
        */
    }
}
