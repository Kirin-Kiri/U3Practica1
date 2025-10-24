package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {
    boolean bucle;

    public JuegoAdivinar() {
    }

    public JuegoAdivinar(boolean bucle) {
        this.bucle = bucle;
    }

    //Getters

    public boolean isBucle() {
        return bucle;
    }


    //Setters

    public void setBucle(boolean bucle) {
        this.bucle = bucle;
    }

    static void main() {
        Random random = new Random();

        int[] intentos = new int[10];
        System.out.println("Se ha establecido numero de intentos");

        JuegoAdivinar juegoAdivinar = new JuegoAdivinar();
        int resultado = juegoAdivinar.jugar(random.nextInt(0, 100), intentos);


        if (resultado != -1) {
            System.out.println("Acertaste en " + resultado + " intentos");
        } else {
            System.out.println("Se acabaron los intentos");
        }
    }

    public void evaluarIntento(int secreto, int intento, int[] intentos) {
        int intentoDeIntentos = 0;
        int contadorArray = intentos.length - 1;
        while (true) {
            if (intentos[contadorArray] != 0) {
                intentoDeIntentos = intentos[contadorArray];
                break;
            }
            contadorArray--;
        }
        if (intento < secreto) {
            System.out.println("El número es menor. Has realizado " + intentoDeIntentos + " intentos");
        }
        if (intento > secreto) {
            System.out.println("El número es mayor. Has realizado " + intentoDeIntentos + " intentos");
        }
        if (intento == secreto) {
            System.out.println("Has acertado");
            setBucle(false);
        }

    }

    public int jugar(int secreto, int[] intentos) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        setBucle(true);
        while (bucle) {
            System.out.println("Adivina numero");
            int numero = scanner.nextInt();

            contador++;
            intentos[contador - 1] = contador;

            evaluarIntento(secreto, numero, intentos);
            if (contador == intentos.length) {
                return -1;
            }
        }
        return contador;
    }


}
