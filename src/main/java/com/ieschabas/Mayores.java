package com.ieschabas;

import java.util.Scanner;

/**
 * Escribe un algoritmo que devuelva el mayor de dos números.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class Mayores {

    //Constructor por defecto de la clase Mayores
    public Mayores() {
    }

    /**
     * Escanea dos numero de usuario, imprime return de max2
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Mayores mayores = new Mayores();

        System.out.println("Introduce primer numero");
        int number1 = scanner.nextInt(); //Primer numero
        System.out.println("Introduce segundo numero");
        int number2 = scanner.nextInt();//Segundo numero
        System.out.println("Numero mayor: " + mayores.max2(number1, number2)); //Imprime return de max2 pasando argumentos numero1 numero2
        scanner.close();
    }

    /**
     * Calcula numero mayor de dos
     *
     * @param a
     * @param b
     * @return
     */
    public int max2(int a, int b) {
        return Math.max(a, b); //Utilizamos Math.max que devuelve numero mayor de dos, y devolvemos resultado
    }
}
