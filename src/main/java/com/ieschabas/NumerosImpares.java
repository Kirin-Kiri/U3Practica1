package com.ieschabas;

public class NumerosImpares {

    static void main() {
        System.out.println(productoDiezPrimerosImpares());
    }

    public NumerosImpares() {
    }

    public static long productoDiezPrimerosImpares() {

        int contador = 0;
        int numeroImpar = 0;
        long resultado = 1;

        while (true) {
            if (numeroImpar % 2 == 1) {
                resultado *= numeroImpar;
                numeroImpar++;
                contador++;
            }
            if (contador == 10) {
                break;
            }
            numeroImpar++;
        }
        return resultado;
    }
}
