package com.ieschabas;

import java.util.Scanner;

/**
 * Realiza un menú para una aplicación de mantenimiento de vehículos.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class MenuVehiculos {

    boolean bucle;

    //Constructor por defecto de la clase MenuVehiculos
    public MenuVehiculos() {
    }

    /**
     * Constructor sobrecargado de la clase MenuVehiculos
     *
     * @param bucle
     */
    public MenuVehiculos(boolean bucle) {
        this.bucle = bucle;
    }


    /**
     * Bucle en metodo main, para que usuario elige opcion que quiere hacer
     * Despues de elegir se invoca metodo SeleccionarOpcion con numero de opcion en argumento
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        MenuVehiculos menuVehiculos = new MenuVehiculos(); //Para poder usar setters, getters
        int opcion = 0;

        menuVehiculos.setBucle(true); //Establecemos True para que bucle funciona
        while (menuVehiculos.isBucle()) { //Mientras bucle esta en true
            System.out.println("Introduce numero: ");
            System.out.println("1. Mantenimiento de clientes");
            System.out.println("2. Introducción de facturas");
            System.out.println("3. Listado de facturas");
            System.out.println("4. Finalizar");

            opcion = scanner.nextInt(); //Escaneamos opcion
            menuVehiculos.seleccionarOpcion(opcion); //Pasamos a otro metodo con opcion en argumento
        }
        scanner.close();
    }


    //Getters

    /**
     * Metodo que devuelve Bucle
     *
     * @return bucle
     */
    public boolean isBucle() {
        return bucle;
    }

    //Setters

    /**
     * Metodo que establece bucle
     *
     * @param bucle
     */
    public void setBucle(boolean bucle) {
        this.bucle = bucle;
    }


    /**
     * Depende de opcion imprime una o otra cosa
     * En caso de opcion 4 usa setter de bucle para poner false y salir del bucle
     * No devuelve nada
     *
     * @param opcion
     * @return
     */
    public String seleccionarOpcion(int opcion) {
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
                setBucle(false);
                break;
        }
        return null;
    }
}
