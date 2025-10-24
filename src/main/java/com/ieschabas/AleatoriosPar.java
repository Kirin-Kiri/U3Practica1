package com.ieschabas;

import java.util.Random;
import java.util.Scanner;


public class AleatoriosPar {
    static void main() {
        Random rng = new Random();
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
        System.out.println(aleatoriosPar.parAleatorioMenorQue(limite,rng));
    }

    public int parAleatorioMenorQue(int limite, Random rng) {
        int numero = 0;
        while (true) {
            numero = rng.nextInt(0, limite);
            if (numero %2 == 0){
                break;
            }
        }
        return numero;

    }
}
