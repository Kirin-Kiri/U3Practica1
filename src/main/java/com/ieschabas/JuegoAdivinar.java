package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class JuegoAdivinar {

    static void main() {
        Random random = new Random(); //Para usar Random

        int[] intentos = new int[10];
        System.out.println("Se ha establecido numero de intentos");

        JuegoAdivinar juegoAdivinar = new JuegoAdivinar(); //Para usar metodos no estaticos
        int resultado = juegoAdivinar.jugar(random.nextInt(0, 101), intentos); //Guardamos en variable resultado el return de jugar


    }


    public int jugar(int secreto, int[] intentos) {
        if (intentos == null || intentos.length == 0) {
            return -1;
        }
        for (int i = 0; i < intentos.length; i++) {
            int intento = intentos[i];
            evaluarIntento(secreto, intento, );

            if (intento == secreto) {
                return i + 1; // número del intento (1-based)
            }
        }
        return -1; // no acertó
    }


    public void evaluarIntento(int secreto, int intento, int[] intentos) {



        if (intento < secreto) {
            System.out.println("El número es menor. Has realizado " + n + " intentos");
        } else if (intento > secreto) {
            System.out.println("El número es mayor. Has realizado " + n + " intentos");
        } else {
            System.out.println("Has acertado!");
        }

    }

}
