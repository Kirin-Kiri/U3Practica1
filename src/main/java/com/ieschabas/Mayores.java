package com.ieschabas;

import java.util.Scanner;

public class Mayores {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Mayores mayores = new Mayores();

        System.out.println("Introduce primer numero");
        int number1 = scanner.nextInt();
        System.out.println("Introduce segundo numero");
        int number2 = scanner.nextInt();
        System.out.println("Numero mayor: " + mayores.max2(number1, number2));
    }
    public int max2 ( int a, int b){
        if (a < b){
            return b;
        } else return a;
    }
}
