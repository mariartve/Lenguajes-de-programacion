from Evaluador import Evaluador
def main():
    print("Ingrese la operación: ")
    x = input()
    e = Evaluador()
    expresion = e.enlistar(x)
    print("El resultado de la operación es: ", e.resultado(expresion).getNum())

if __name__ == '__main__':
    main()