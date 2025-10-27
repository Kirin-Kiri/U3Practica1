package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número.
 *
 * @author Oleksiy
 * @version 1.0
 */

public class JuegoAdivinar {
    boolean bucle;

    //Constructor por defecto de la clase JuegoAdivinar
    public JuegoAdivinar() {
    }

    /**
     * Constructor sobrecargado de la clase JuegoAdivinar
     *
     * @param bucle
     */
    public JuegoAdivinar(boolean bucle) {
        this.bucle = bucle;
    }

    //Getters

    /**
     * Metodo que devuelve Bucle
     *
     * @return
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
     * Se crea un array intentos para 10 intentos
     * Se crea objeto de la clase para poder usar metodos no estaticos(jugar) dentro de estaticos(main)
     * Guardamos en variable resultado el return del metodo jugar con argumento que genera numero de 0 a 100, y pasamos array intentos
     * Si el resultado no es igual a -1 sale en que intento usuario acertado
     * si no pone Que los intentos se han acabado
     */
    static void main() {
        Random random = new Random(); //Para usar Random

        int[] intentos = new int[10];
        System.out.println("Se ha establecido numero de intentos");

        JuegoAdivinar juegoAdivinar = new JuegoAdivinar(); //Para usar metodos no estaticos
        int resultado = juegoAdivinar.jugar(random.nextInt(0, 101), intentos); //Guardamos en variable resultado el return de jugar


        if (resultado != -1) { //Si resultado no es igual a -1
            System.out.println("Acertaste en " + resultado + " intentos"); //Sale en que intento acertado
        } else {
            System.out.println("Se acabaron los intentos"); //Si no que se han acabado los intentos, game over
        }
    }

    /**
     * Establece contador
     * Establece bucle a true
     * En bucle se nos pregunta el numero
     * Se suma el contador
     * Hacemos que contador sea valor de intentos[contador - 1], es para contar bien los intentos
     * Invocamos evaluarintento, le pasamos numero secreto, numero y array intentos
     * Si contador es igual a longitud de array, devolver -1
     * Se devuelve contador despues de bucle
     *
     * @param secreto
     * @param intentos
     * @return contador
     */
    public int jugar(int secreto, int[] intentos) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0; //Contador
        setBucle(true); //Bucle
        while (bucle) {
            System.out.println("Adivina numero");
            int numero = scanner.nextInt(); //Escaneamos numero introducido

            contador++; //Sumamos contador
            intentos[contador - 1] = contador; //Establecemos nuevo valor del contador

            evaluarIntento(secreto, numero, intentos); //Invocamos metodo con argumentos, secreto, numero y arrau intentos
            if (contador == intentos.length) { //Si contador llega a la longitud de array(en este caso hasta 10) se devuelve -1
                return -1;
            }
        }
        scanner.close();
        return contador; //devolvemos contador
    }

    /**
     * En argumentos accepta numero secreto, intento y array intentos
     * Lo que hace es evaluar intento
     * Para eso necesitamos saber que intento es, en array intentos se pone cual intento es
     * entonces desde final de array empezamos a buscar un numero que no sea 0, ese numero seria nuestro ultimo intento
     *
     * Luego si intento menor que secreto nos sale mensaje
     * Si intento mayor que secreto nos sale mensaje
     * Si intento igual que secreto nos sale mensaje y se acaba el bucle
     * @param secreto
     * @param intento
     * @param intentos
     */
    public void evaluarIntento(int secreto, int intento, int[] intentos) {
        int intentoDeIntentos = 0;
        int contadorArray = intentos.length - 1; //Igual a longitud de array intentos-1
        while (true) { //Bucle
            if (intentos[contadorArray] != 0) { //Si el elemento(contador) no es igual a 0 se acaba el bucle ya que hemos encontrado ultimo intento
                intentoDeIntentos = intentos[contadorArray]; //Guarda numero encontrado
                break; //Acaba bucle
            }
            contadorArray--; //Bajamos al siguente elemento
        }
        if (intento < secreto) { //Si intento menor que secreto sale mensaje con numero de intento
            System.out.println("El número es menor. Has realizado " + intentoDeIntentos + " intentos");
        }
        if (intento > secreto) { //Si intento mayor que secreto sale mensaje con numero de intento
            System.out.println("El número es mayor. Has realizado " + intentoDeIntentos + " intentos");
        }
        if (intento == secreto) { //SI intento igual que secreto sale mensaje y se acaba bucle
            System.out.println("Has acertado");
            setBucle(false); //Acabamos bucle
        }

    }

}
