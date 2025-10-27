package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Escribe un algoritmo que devuelva la suma de dos enteros aleatorios (entre 0 y 1000), repetirlo 20 veces.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class SumasAleatorias {

    //Constructor por defecto de la clase SumasAleatorias
    public SumasAleatorias() {
    }


    /**
     * Bucle
     * En bucle preguntamos cuantas repeticiones quiere hacer usuario
     * Si 0 mayor del numero nos sale mensaje
     * si no, se acaba el bucle
     * En array resultado guardamos return de generarSumas
     * Con el for imprimimos array resultado
     */
    static void main() {
        Random rng = new Random();
        SumasAleatorias sumasAleatorias = new SumasAleatorias();
        Scanner scanner = new Scanner(System.in);

        int repeticiones = 0;
        while (true) { //Bucle
            System.out.println("Introduce numero de repeticiones");
            repeticiones = scanner.nextInt(); //Escaneamos
            if (repeticiones <= 0) { //Si repeticiones menor que 0
                System.out.println("Las repeticiones no puede ser un número negativo");
            } else break; //Se acaba bucle
        }

        int[] resultado = sumasAleatorias.generarSumas(repeticiones, rng); //Guardamos return en un array
        for (int i = 0; i < resultado.length; i++) { //Imprimimos resultado
            System.out.println((i + 1) + ": " + resultado[i]);
        }
        scanner.close();
    }

    /**
     * Bucle con for
     * Se genera numero y se suma a la variable numero
     *
     * @param rng
     * @return numero
     */
    public int sumaDosAleatorios(Random rng) {
        int numero = 0;
        for (int i = 0; i <= 1; i++) { //Bucle para dos veces
            numero += rng.nextInt(0, 1001); //El numero generado se suma a la variable numero
        }
        return numero; //Devuelve numero
    }

    /**
     * Se crea array resultado con longitud de repeticiones(de argumento que hemos pasado)
     * Cada elemento de array se rellenera con los numeros generados y sumados de la variable sumaDosAleatorios
     *
     * @param repeticiones
     * @param rng
     * @return resultado
     */
    public int[] generarSumas(int repeticiones, Random rng) {
        int[] resultado = new int[repeticiones]; //Se crea array de longitud de repeticiones
        for (int i = 0; i < repeticiones; i++) { //Bucle a la longitud de array
            resultado[i] = sumaDosAleatorios(rng); //Elemento de array contiene dos numeros generados y sumados por metodo sumaDosAleatorios
        }
        return resultado; //Devolvemos array resultado

    }
}
