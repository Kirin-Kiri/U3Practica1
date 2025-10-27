package com.ieschabas;

import java.util.Scanner;

/**
 * Main con el menu de elegir ejercicio
 *
 * @author Oleksiy
 * @version 1.0
 */

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige ejercicio");
        System.out.println("1. MenuVehiculos");
        System.out.println("2. NumerosImpares");
        System.out.println("3. JuegoAdivinar");
        System.out.println("4. AleatoriosPar");
        System.out.println("5. SumasAleatorias");
        System.out.println("6. Circunferencia");
        System.out.println("7. Mayores");
        System.out.println("8. MayoresAleatorios3");
        System.out.println("9. MayoresAleatorios4");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                MenuVehiculos menuVehiculos = new MenuVehiculos();
                menuVehiculos.main();
            case 2:
                NumerosImpares numerosImpares = new NumerosImpares();
                numerosImpares.main();
            case 3:
                JuegoAdivinar juegoAdivinar = new JuegoAdivinar();
                juegoAdivinar.main();
            case 4:
                AleatoriosPar aleatoriosPar = new AleatoriosPar();
                aleatoriosPar.main();
            case 5:
                SumasAleatorias sumasAleatorias = new SumasAleatorias();
                sumasAleatorias.main();
            case 6:
                Circunferencia circunferencia = new Circunferencia();
                circunferencia.main();
            case 7:
                Mayores mayores = new Mayores();
                mayores.main();
            case 8:
                MayoresAleatorios3 mayoresAleatorios3 = new MayoresAleatorios3();
                mayoresAleatorios3.main();
            case 9:
                MayoresAleatorios4 mayoresAleatorios4 = new MayoresAleatorios4();
                mayoresAleatorios4.main();
        }
        scanner.close();
    }
}
