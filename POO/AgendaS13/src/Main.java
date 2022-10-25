public class Main {
    public static void main(String[] args){
        Agenda agendaLaboral = new Agenda();
        System.out.println("***AGREGANDO CONTACTOS***");
        agendaLaboral.agregarContacto(new ContactoT1("Mariana", 18, true, "83352318", "Detras de la plaza", "mav@gmail.com", "Amazon"));
        agendaLaboral.agregarContacto(new ContactoT1("Luis", 27, false, "88888888", "Detras del mercado", "luis@gmail.com", "Walmart"));
        agendaLaboral.agregarContacto(new ContactoT1("Karla", 35, true, "87521470", "Frente a la iglesia", "karla@gmail.com", "Facebook"));

        System.out.println("***IMPRIMIENDO CONTACTOS***");
        agendaLaboral.imprimirContactos();
        //agendaLaboral.mostrarVentanas();
        //agendaLaboral.eliminarContacto("Mariana");
        //agendaLaboral.modificarContacto("Mariana", 20, true, "83718760", "Detras de la plaza", "mari@gmail.com", "Dos Pinos");

        System.out.println("***AGREGANDO EVENTOS***");
        agendaLaboral.agregarEvento(new EventoT1("Congreso Internacional", "25/10/2022", "8:30 am", "Estadio nacional", "Congreso", "Conferencistas", "Cambio climatico"));
        agendaLaboral.agregarEvento(new EventoT1("Reunion Diseñadores", "28/10/2022", "1:00 pm", "Sala de juntas", "Reunion", "Diseñadores del proyecto", "Afiches publicitarios"));
        System.out.println("***IMPRIMIENDO EVENTOS***");
        agendaLaboral.imprimirEventos();
        //------------------------------------------------------------------------------------------------------------------------------------

        Agenda agendaFamiliar = new Agenda();
        System.out.println("\n"+"***AGREGANDO CONTACTOS***");
        agendaFamiliar.agregarContacto(new ContactoT2("Maria", 14, true, "83741200",
                "Detras de la plaza", "maria@gmail.com", "Hermana"));
        agendaFamiliar.agregarContacto(new ContactoT2("Carlos", 45, false, "87950021",
                "Detras del mercado", "carlos@gmail.com", "Padre"));
        agendaFamiliar.agregarContacto(new ContactoT2("Pamela", 67, true, "89210045",
                "Frente a la iglesia", "pamela@gmail.com", "Abuela"));

        System.out.println("***IMPRIMIENDO CONTACTOS***");
        agendaFamiliar.imprimirContactos();

        System.out.println("***AGREGANDO EVENTOS***");
        agendaFamiliar.agregarEvento(new EventoT2("Fiesta de aniversario", "14/11/2022", "7:00 pm","Casa de la abuela", "20000", "Casual", "Bodas de oro"));
        agendaFamiliar.agregarEvento(new EventoT2("Fiesta de cumpleaños", "02/11/2022", "2:00 pm", "Casa de Maria", "15000", "Formal", "Quinceaños de Maria"));
        System.out.println("***IMPRIMIENDO EVENTOS***");
        agendaFamiliar.imprimirEventos();

        //agendaFamiliar.eliminarEvento("Fiesta de aniversario");
        //agendaFamiliar.modificarEvento("Fiesta de aniversario", "15/11/22", "7:15 pm", "Casa de la abuela", "20000", "Formal", "Bodas de oro");


    }
}
