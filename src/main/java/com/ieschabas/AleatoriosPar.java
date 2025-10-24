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
    }

    public int parAleatorioMenorQue(int limite, Random rng) {
        return 4;

    }

}
