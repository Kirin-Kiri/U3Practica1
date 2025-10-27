package com.ieschabas;

import java.util.Scanner;

/**
 * Calcula el área y la longitud de una circunferencia en función del radio.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class Circunferencia {

    //Constructor por defecto de la clase Circunferencia
    public Circunferencia() {
    }

    /**
     * Bucle, donde pedimos al usuario que introduzca radio
     * Comprobamos el radio, si es menor que 0 sale mensaje y pedimos otra vez el numero
     * Si no, se acaba bucle
     * Imprimimos resultados con return de metodo Area y Longitud
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Circunferencia circunferencia = new Circunferencia(); //Usar no estaticos en estatico main
        double radio = 0;

        while (true) { //Radio
            System.out.println("Introduce el radio");
            radio = scanner.nextDouble(); //Escaneamos numero de usuario
            if (radio < 0) { //Si es menor que 0
                System.out.println("El radio no puede ser un número negativo"); //Sale mensaje
            } else break; //Si no se acaba bucle
        }
        System.out.println("Area: " + circunferencia.area(radio)); //Imprimimos calculo de area
        System.out.println("Longitud: " + circunferencia.longitud(radio)); //Imprimimos calculo de longitud
        scanner.close();
    }

    /**
     * Devuelve area
     *
     * @param radio
     * @return area
     */
    public double area(double radio) {
        return Math.PI * Math.pow(radio, 2); //Devuelve area, calculando PI por r*r
    }

    /**
     * Devuelve longitud
     *
     * @param radio
     * @return
     */
    public double longitud(double radio) {
        return 2 * Math.PI * radio; //Devuelve longitud, calculando 2 por PI por radio
    }
}
