package com.ieschabas;

import java.util.Scanner;

public class Circunferencia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Circunferencia circunferencia = new Circunferencia();
        double radio = 0;

        while (true) {
            System.out.println("Introduce el radio");
            radio = scanner.nextDouble();
            if (radio < 0) {
                System.out.println("El radio no puede ser un número negativo");
            } else break;
        }
        System.out.println("Area: " + circunferencia.area(radio));
        System.out.println("Longitud: " + circunferencia.longitud(radio));
    }

    public double area(double radio) {
        return Math.PI * Math.pow(radio,2);
    }

    public double longitud(double radio) {
        return 2 * Math.PI * radio;
    }
}
