package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Realiza un programa que obtenga un número par aleatorio menor que el que el usuario introduzca.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class AleatoriosPar {

    //Constructor por defecto de la clase AleatoriosPar
    public AleatoriosPar() {
    }

    /**
     * Hacemos bucle
     * Pedimos que introduzca numero de limite
     * Si numero no es igual a 0 y mayor/igual que cero acabmos el bucle
     * si no sale mensaje que el numero no puede ser negativo(y 0)
     * Creamos objeto de la clase, para poder usar metodo no estaticos
     * Imprimimos lo que devuelve metodo parAleatorioMenorQue, con argumento numero limite y rng(objeto de random)
     */
    static void main() {
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);

        int limite = 0;
        while (true) { //Bucle
            System.out.println("Introduce numero de limite");
            limite = scanner.nextInt();

            if (limite != 0 && limite >= 0) { //Miramos que numero ha introducido usuario, si no es 0 y menor que cero
                break;
            } else {
                System.out.println("El límite no puede ser un número negativo"); //Si es asi se sale mensaje
            }
        }
        AleatoriosPar aleatoriosPar = new AleatoriosPar(); //Creamos objeto, para poder usar metodos no estaticos
        System.out.println(aleatoriosPar.parAleatorioMenorQue(limite, rng)); //Imprimimos return de parAleatorioMenorQue
        scanner.close();
    }

    /**
     * Hace bucle
     * Genera un numero de 0 al limite y se guarda en variable numero
     * Si numero es par acabar bucle, si no se continua
     * Devuelve numero
     *
     * @param limite
     * @param rng
     * @return numero
     */
    public int parAleatorioMenorQue(int limite, Random rng) {
        int numero = 0; //numero generado
        while (true) {
            numero = rng.nextInt(0, limite); //generamos numero
            if (numero % 2 == 0) { //Verificamos si es par
                break; //Acabamos bucle
            }
        }
        return numero; //Devolvemos numero

    }
}
