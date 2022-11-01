import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Evaluador {

    public Evaluador() {
    }

    public List enlistar(String operacion){
        List lista = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(operacion,"+/-* ", true);
        try {
            while (st.hasMoreTokens()) {
                String tk = st.nextToken();
                if (tk.matches("[0-9]*")){
                    Num n = new Num(Integer.valueOf(tk));
                    lista.add(n);
                }
                else if(tk.matches("[+/*[-]]+")){
                    Op o = new Op(tk);
                    lista.add(o);
                }
                else if(tk.equals(" ")){
                    continue;
                }
                else {
                    throw new Excepcion("Error, la operación contiene un carácter inválido");
                }
            }
       } catch (Excepcion e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    public int operar(int n1, int n2, String operador){
        int resultado = 0;
        switch (operador){
            case "+":
                resultado = n1 + n2;
                return resultado;
            case "-":
                resultado = n1 - n2;
                return resultado;
            case "*":
                resultado = n1 * n2;
                return resultado;
            case "/":
                resultado = n1 / n2;
                return resultado;
        }
        return resultado;
    }

    public Num resultado(List lista){
        Num result = new Num(-1);
        Object n1, n2, operador;
        Num num1, num2;
        Op op;

        try {
            for(int i = 0; i < lista.size();){
                if (lista.size() < 3){
                    throw new Excepcion("Los elementos de la expresión no están ordenados en infijo");
                }
                n1 = lista.get(i);
                operador = lista.get(i+1);
                n2 = lista.get(i+2);
                if(n1.getClass().toString().equals("class Op")){
                    throw new Excepcion("Los elementos de la expresión no están ordenados en infijo");
                }
                else if((n1.getClass().toString().equals("class Num")) && (operador.getClass().toString().equals("class Op")) && (n2.getClass().toString().equals("class Num"))){
                    num1 = (Num) n1;
                    num2 = (Num) n2;
                    op = (Op) operador;

                    result.setNum(operar(num1.getNum(),num2.getNum(),op.getOp()));
                    lista.add(0, result);
                    lista.subList(1, 4).clear();

                }else {
                    throw new Excepcion("Los elementos de la expresión no están ordenados en infijo");
                }
                if (lista.size() == 1) {
                    return result;
                }
            }

        }catch (Excepcion e) {
            System.err.println(e.getMessage());
        }

        return result;
    }
}
