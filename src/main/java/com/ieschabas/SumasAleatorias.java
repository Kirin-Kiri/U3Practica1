package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

public class SumasAleatorias {
    static void main() {
        Random rng = new Random();
        SumasAleatorias sumasAleatorias = new SumasAleatorias();
        Scanner scanner = new Scanner(System.in);

        int repeticiones = 0;
        while (true) {
            System.out.println("Introduce numero de repeticiones");
            repeticiones = scanner.nextInt();
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no puede ser un número negativo");
            } else break;
        }

        int[] resultado = sumasAleatorias.generarSumas(repeticiones, rng);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println((i + 1) + ": " + resultado[i]);
        }

    }

    public int sumaDosAleatorios(Random rng) {
        int numero = 0;
        for (int i = 0; i <= 1; i++) {
            numero += rng.nextInt(0, 1001);
        }
        return numero;
    }

    public int[] generarSumas(int repeticiones, Random rng) {
        int[] resultado = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            resultado[i] = sumaDosAleatorios(rng);
        }
        return resultado;

    }
}
