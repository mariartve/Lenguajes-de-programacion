import java.util.*;
public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la operación: ");
        String operacion = sc.nextLine();

        Evaluador e = new Evaluador();
        List expresion = e.enlistar(operacion);
        System.out.println("El resultado de la operación es: "+e.resultado(expresion).getNum());
    }
}
