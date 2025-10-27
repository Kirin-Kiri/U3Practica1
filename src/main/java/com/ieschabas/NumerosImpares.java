package com.ieschabas;

/**
 * Diseñar un programa que muestre el producto de los 10 primeros números impares.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class NumerosImpares {

    //Constructor por defecto de la clase NumerosImpares
    public NumerosImpares() {
    }

    /**
     * Solo imprime resultado del metodo productoDiezPrimerosImpares()
     */
    static void main() {
        System.out.println(productoDiezPrimerosImpares());
    }


    /**
     * Establece tres variables, contador, numeroImpar, resultado
     * Hacemos bucle para encontrar 10 primeros numeros impares
     * Primer if: si numero dividido por modulo es 1, es decir numero impar, se multiplica resultado por este numero encontrado
     * se suma contador(contador+1)
     * Si contador llega a 10 se para el bucle, asi llegamos a 10 numeros impares
     * En final del bucle sumamos el numero(numero+1)
     * Devuelve resultado
     *
     * @return resultado
     */
    public static long productoDiezPrimerosImpares() {

        int contador = 0;
        int numero = 0;
        long resultado = 1;

        while (true) {
            if (numero % 2 == 1) { //Verificamos si el numero es impar
                resultado *= numero; //Hacemos producto del numeroImpar
                contador++; //Sumamos contador
            }
            if (contador == 10) { //Si contador llega a 10
                break; //Paramos bucle
            }
            numero++; //Sumamos el numero para no estar siempre en bucle
        }
        return resultado; //Devolvemos resultado
    }
}
