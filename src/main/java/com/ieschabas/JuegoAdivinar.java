package com.ieschabas;

import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número.
 *
 * @author Oleksiy
 * @version 1.1
 */

public class JuegoAdivinar {

    int ultimoContador;

    //Constructor por defecto de la clase JuegoAdivinar
    public JuegoAdivinar() {
    }

    /**
     * Constructor sobrecargado de la clase JuegoAdivinar
     *
     * @param ultimoContador
     */
    public JuegoAdivinar(int ultimoContador) {
        this.ultimoContador = ultimoContador;
    }

    //Getters

    /**
     * Metodo que devuelve ultimoContador
     *
     * @return
     */
    public int getUltimoContador() {
        return ultimoContador;
    }

    //Setters

    /**
     * Metodo que establece ultimoContador
     *
     * @param ultimoContador
     */
    public void setUltimoContador(int ultimoContador) {
        this.ultimoContador = ultimoContador;
    }

    /**
     * Preguntamos al usuario que establece numero secreto
     * Hacemos bucle que no se acaba hasta que no recibira -1 de vuelta
     * Se crea array intentos en tamaño de contador
     * Preguntamos al usuario numero que piensa que es
     * Guardamos en array con posicion contador - 1
     * Pasamos numero secreto al metodo jugar, con numero secreto y el array con los intentos hechos
     * Si resultado del metodo jugar es -1 continuamos adivinando, si no - rompemos bucle
     */

    static void main() {
        Scanner scanner = new Scanner(System.in);

        JuegoAdivinar juegoAdivinar = new JuegoAdivinar(); //Para usar metodos no estaticos

        System.out.println("Establece numero secreto");
        int secreto = scanner.nextInt();
        int contador = 1;
        while (true) {
            int[] intentos = new int[contador];
            System.out.println("Adivina numero");
            intentos[contador - 1] = scanner.nextInt();
            if (juegoAdivinar.jugar(secreto, intentos) != -1) {
                break;
            }
            contador++;
        }
    }

    /**
     * Recibe numero secreto, array intentos
     * Si intentos es null o longitud de array es 0 - devolvemos -1
     * Hacemos bucle, donde intento es ultimo elemento del array intentos
     * Pasamos a evaluar el intento al metodo evaluarIntento
     * Si intento es igual a numero secreto - devolvemos el numero de intento correcto
     * En final sumamos el contador
     * @param secreto
     * @param intentos
     * @return
     */
    public int jugar(int secreto, int[] intentos) {
        if (intentos == null || intentos.length == 0) {
            return -1;
        }
        for (int i = 0; getUltimoContador() < intentos.length; i++) {
            int intento = intentos[getUltimoContador()];

            evaluarIntento(secreto, intento, intentos);

            if (intento == secreto) {
                return i + 1; // devolvemos numero de intento correcto cuando se ha acertado
            }
            setUltimoContador(getUltimoContador() + 1);
        }
        return -1; // no acertó
    }

    /**
     * Solo evalua el intento
     * @param secreto
     * @param intento
     * @param intentos
     */
    public void evaluarIntento(int secreto, int intento, int[] intentos) {
        if (intento < secreto) {
            System.out.println("El número es menor. Has realizado " + (getUltimoContador() + 1) + " intentos");
        } else if (intento > secreto) {
            System.out.println("El número es mayor. Has realizado " + (getUltimoContador() + 1) + " intentos");
        } else {
            System.out.println("Has acertado!");
        }
    }
}
