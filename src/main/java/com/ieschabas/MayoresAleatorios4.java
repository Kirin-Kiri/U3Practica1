package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Diseña un algoritmo que devuelva el mayor de cuatro números aleatorios (entre 0 y 1000), repetirlo 20 veces.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class MayoresAleatorios4 {

    //Constructor por defecto de la clase MayoresAleatorios4
    public MayoresAleatorios4() {
    }

    /**
     * Bucle, escaneamos numero de repeticiones, si es menor que 0 sale mensaje y pide de nuevo
     * Se crea array resultado, que guarda return del metodo generarMaximos4, pasando repeticiones en argumentos
     * Con el for se imprime el resultado
     */
    static void main() {
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);
        MayoresAleatorios4 mayoresAleatorios4 = new MayoresAleatorios4();

        int repeticiones = 0;
        while (true) {
            System.out.println("Introduce numero de repeticiones");
            repeticiones = scanner.nextInt();
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no puede ser un número negativo");
            } else break;
        }
        int[] resultado = mayoresAleatorios4.generarMaximos4(repeticiones, rng);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println((i + 1) + ": " + resultado[i]);
        }
        scanner.close();
    }


    /**
     * Con el Math.max se comparan numero a y b, luego c y d, y en final se compara a|b y c|d
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public int max4(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    /**
     * Se crea arrau de la longitud de repeticiones
     * Cada elemento igual a numero mayor generado por max4
     * Devuelve resultado
     *
     * @param repeticiones
     * @param rng
     * @return resultado
     */
    public int[] generarMaximos4(int repeticiones, Random rng) {
        int[] resultado = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            resultado[i] = max4(rng.nextInt(0, 1001), rng.nextInt(0, 1001), rng.nextInt(0, 1001), rng.nextInt(0, 1001));
        }
        return resultado;
    }
}
