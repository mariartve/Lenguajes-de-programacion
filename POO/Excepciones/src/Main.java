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

/*Resultado:
1. Operacion: 512 * 30 / 2: El resultado de la operación es: 7680
2. Operacion: 512x * 30 / 2: Error, la operación contiene un carácter inválido, El resultado de la operación es: -1
3. Operacion: 512 * + 30 / 2: Los elementos de la expresión no están ordenados en infijo, El resultado de la operación es: -1
*/
