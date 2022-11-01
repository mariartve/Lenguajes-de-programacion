from Evaluador import Evaluador
def main():
    print("Ingrese la operación: ")
    x = input()
    e = Evaluador()
    expresion = e.enlistar(x)
    print("El resultado de la operación es: ", e.resultado(expresion).getNum())

if __name__ == '__main__':
    main()
    
"""Resultado:
1. Operacion: 512 * 30 / 2: El resultado de la operación es:  7680.0
2. Operacion: 512x * 30 / 2: Error, la operación contiene un carácter inválido, El resultado de la operación es: -1
3. Operacion: 512 * + 30 / 2: Los elementos de la expresión no están ordenados en infijo, El resultado de la operación es: -1
"""
