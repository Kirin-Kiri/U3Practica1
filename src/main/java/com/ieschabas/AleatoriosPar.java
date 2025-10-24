package com.ieschabas;

import java.util.Random;
import java.util.Scanner;


public class AleatoriosPar {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int limite = 0;
        while (true) {
            System.out.println("Introduce numero de limite");
            limite = scanner.nextInt();

            if (limite != 0 && limite >= 0) {
                break;
            } else {
                System.out.println("El límite no puede ser un número negativo");
            }
        }
        AleatoriosPar aleatoriosPar = new AleatoriosPar();
        System.out.println(aleatoriosPar.parAleatorioMenorQue(limite,null));
    }

    public int parAleatorioMenorQue(int limite, Random rng) {
        int numero = 0;
        while (numero % 2 == 1) {

            numero = rng.nextInt(0, limite);


        }
        return numero;

    }
}
