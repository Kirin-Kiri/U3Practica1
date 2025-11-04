package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Escribe un algoritmo que devuelva el mayor de tres números aleatorios (entre 0 y 1000), repetirlo 20 veces
 *
 * @author Oleksiy
 * @version 1.0
 */

public class MayoresAleatorios3 {

    //Constructor por defecto de la clase MayoresAleatorios3
    public MayoresAleatorios3() {
    }

    /**
     * Bucle, escaneamos numero de repeticiones, si es menor que 0 sale mensaje y pide de nuevo
     * Se crea array resultado, que guarda return del metodo generarMaximos3, pasando repeticiones en argumentos
     * Con el for se imprime el resultado
     */
    static void main() {
        Random rng = new Random(); //Para generar numeros random
        Scanner scanner = new Scanner(System.in);
        MayoresAleatorios3 mayoresAleatorios3 = new MayoresAleatorios3(); //Para usar no estaticos en estaticos(main)

        int repeticiones = 0;
        while (true) { //Bucle para verificar numero de repeticiones
            System.out.println("Introduce numero de repeticiones");
            repeticiones = scanner.nextInt(); //Escaneamos
            if (repeticiones <= 0) { //Si repeticiones menor que 0
                System.out.println("Las repeticiones no puede ser un número negativo"); //Sale mensaje
            } else break; //Si no, se acaba
        }
        int[] resultado = mayoresAleatorios3.generarMaximos3(repeticiones, rng); //Guardamos return del generador en una array
        for (int i = 0; i < resultado.length; i++) { //Imprimimos el resultado
            System.out.println((i + 1) + ": " + resultado[i]);
        }
        scanner.close();
    }

    /**
     * Utilizando Math.max compara a y b, y luego numero mayor con el c
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }


    /**
     * Se crea arrau de la longitud de repeticiones
     * Cada elemento igual a numero mayor generado por max3
     * Devuelve resultado
     *
     * @param repeticiones
     * @param rng
     * @return resultado
     */
    public int[] generarMaximos3(int repeticiones, Random rng) {
        int[] resultado = new int[repeticiones]; //Array a la longitud de repeticiones
        if (rng == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < repeticiones; i++) { //Bucle para rellenar array
            resultado[i] = max3(rng.nextInt(0, 1001), rng.nextInt(0, 1001), rng.nextInt(0, 1001));
        }
        return resultado; //Devolvemos resultado
    }
}
