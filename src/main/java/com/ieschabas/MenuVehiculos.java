package com.ieschabas;

import java.util.Scanner;

public class MenuVehiculos {

    public MenuVehiculos() {
    }

    public String seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        boolean bucle = true;
        while (bucle) {
            System.out.println("Introduce numero: ");
            System.out.println("1. Mantenimiento de clientes");
            System.out.println("2. Introducción de facturas");
            System.out.println("3. Listado de facturas");
            System.out.println("4. Finalizar");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Menu de mantenimiento de clientes");
                    break;
                case 2:
                    System.out.println("Menu de introducción de facturas");
                    break;
                case 3:
                    System.out.println("Menu de listado de facturas");
                    break;
                case 4:
                    System.out.println("Finalizacion del programa");
                    bucle = false;
                    break;
            }
        }
        return null;
    }
}
