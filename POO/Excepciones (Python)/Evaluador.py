import re
from Num import Num
from Op import Op
from Excepcion import Excepcion
class Evaluador:
    def enlistar(self, operacion):
        lista = []
        l = re.split("\s", operacion)
        try:
            for i in l:
                x = re.search("^[0-9]+$", i)
                y = re.search("[+/*-]", i)
                if y:
                    o = Op(i)
                    lista.append(o)
                elif x:
                    n = Num(int(i))
                    lista.append(n)
                else:
                    raise Excepcion("Error, la operación contiene un carácter inválido")
        except Excepcion as e:
            print(e.mensaje)
        return lista

    def operar(self, n1, n2, operador):
        resultado = 0
        if operador == "+":
            resultado = n1 + n2;
            return resultado;
        if operador ==  "-":
            resultado = n1 - n2;
            return resultado;
        if operador ==  "*":
            resultado = n1 * n2;
            return resultado;
        if operador ==  "/":
            resultado = n1 / n2;
            return resultado;
        return resultado;

    def resultado(self, lista):
        result = Num(-1)
        try:
            for i, j in enumerate(lista):
                i = 0
                if len(lista) < 3:
                    raise Excepcion("Los elementos de la expresión no están ordenados en infijo")
                n1 = lista[i]
                operador = lista[i+1]
                n2 = lista[i+2]
                if type(n1).__name__ == "Op":
                    raise Excepcion("Los elementos de la expresión no están ordenados en infijo")
                elif (type(n1).__name__ == "Num") and (type(n2).__name__ == "Num") and (type(operador).__name__ == "Op") :
                    result.setNum(self.operar(n1.getNum(),n2.getNum(),operador.getOp()))
                    lista.insert(0,result)
                    del lista[1:4]
                else:
                    raise Excepcion("Los elementos de la expresión no están ordenados en infijo")
                if len(lista) == 1:
                    return result
        
        except Excepcion as e:
            print(e.mensaje)
        return result

