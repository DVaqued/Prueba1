/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaquedano_angel_prueba1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        int opciones = 0;

        //Ejercicio 1
        String palabranormal = "";

        //Ejercicio 2
        int numero = 0;
        int suma = 0;

        //Ejercicio 3
        while (true) {
            System.out.println("\n---Menu---"
                    + "\n1. Palabra al reves."
                    + "\n2. Numero perfecto"
                    + "\n3. Primos"
                    + "\n4. Votaciones"
                    + "\n5. Salir");
            System.out.println("Favor ingrese la opcion que desea realizar: ");
            opciones = lea.nextInt();
            if (opciones > 0 && opciones <= 5) {
                switch (opciones) {
                    case 1:
                        System.out.println("Bienvenido al ejerecicio palabra al reves!");
                        System.out.println("Favor ingrese una palabra: ");
                        palabranormal = lea.next();
                        for (int contador = palabranormal.length() - 1; contador >= 0; contador--) {
                            System.out.print(palabranormal.charAt(contador)
                                    + "\n ");
                        }

                        break;
                    case 2:
                        System.out.println("Bienvenido al ejercicio numero perfecto!");
                        System.out.println("Favor ingrese el numero al que desea evaluar: ");
                        numero = lea.nextInt();
                        for (int contador1 = 1; contador1 < numero; contador1++) {
                            if (numero % contador1 == 0) {
                                suma = suma + contador1;
                            }
                        }
                        if (suma == numero) {
                            System.out.println("Su numero es perfecto.");
                            break;
                        } else {
                            System.out.println("Su numero no es perfecto.");

                        }

                    case 3:
                        int numRandom = random.nextInt(100);
                        System.out.println(numRandom);
                        int suma2 = 0;
                        for (int contador1 = 1; contador1 <= numRandom; contador1++) {
                            if (numRandom % contador1 == 0) {
                                suma2 += contador1;
                            }
                        }
                        if (suma2 == numRandom + 1) {
                            System.out.println("Su numero es primo.");
                        } else {
                            System.out.println("No es un numero primo.");
                        }
                    case 4:
                        

                        break;

                    case 5:
                        System.out.println("Gracias!");
                        System.exit(0);

                }
            } else {
                System.out.println("Favor ingrese una opcion valida");
            }
        }
    }
}
