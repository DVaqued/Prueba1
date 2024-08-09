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
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int opciones = 0;

        //Ejercicio 1
        String palabranormal = "";

        //Ejercicio 2
        int numero = 0;
        int suma = 0;

        //MENU
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        
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
                            cont1++;
                        }
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
                        cont2++;

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
                            System.out.println("Divisiores: 1 y " + numRandom);
                        } else {
                            System.out.println("No es un numero primo.");
                        }
                        cont3++;
                        
                    case 4:
                        int votosporhacer = 0;
                        int votoAzul = 0;
                        int votoRojo = 0;
                        int votoAmarillos = 0;
                        int votoNegro = 0;
                        int votoNulo = 0;
                        int votostotal = 0;
                        String voto = "";

                        System.out.println("Cuantos votos desea ingresar: ");
                        votosporhacer = lea.nextInt();

                        for (int contador2 = 0; contador2 < votosporhacer; contador2++) {
                                System.out.println("---PLANILLAS---"
                                        + "\nAZUL"
                                        + "\nROJO"
                                        + "\nAMARILLO"
                                        + "\nNEGRO");
                                System.out.println("Favor ingrese que voto hara: ");
                                voto = lea.next().toUpperCase();
                            if (voto.equals("AZUL")) {
                                votoAzul++;
                                votostotal++;
                            } else if (voto.equals("AMARILLO")) {
                                votoAmarillos++;
                                votostotal++;

                            } else if (voto.equals("ROJO")) {
                                votoRojo++;
                                votostotal++;

                            } else if (voto.equals("NEGRO")) {
                                votoNegro++;
                                votostotal++;

                            } else {
                                System.out.println("Voto nulo.");
                                votoNulo++;
                                votostotal-=votoNulo;
                            }
                        }
                            double valido = (votostotal * 100) / votosporhacer;

                            if (valido > 60) {
                                if (votoAzul > votoRojo && votoAzul > votoNegro && votoAzul > votoAmarillos) {
                                    System.out.println("Ganador partido AZUL con: " + votoAzul + " voto(s)");
                                } else if (votoRojo > votoAzul && votoRojo > votoNegro && votoRojo > votoAmarillos) {
                                    System.out.println("Ganador partido ROJO con: " + votoRojo + " voto(s)");
                                } else if (votoNegro > votoRojo && votoNegro > votoAzul && votoNegro > votoAmarillos) {
                                    System.out.println("Ganador partido NEGRO con: " + votoNegro + " voto(s)");
                                } else if (votoAmarillos > votoAzul && votoAmarillos > votoRojo && votoAmarillos > votoNegro) {
                                    System.out.println("Ganador partido AMARILLO con: " + votoAmarillos + " voto(s)");
                                } else {
                                    System.out.println("Gano nulos");
                                }
                            } else {
                                System.out.println("No se realizo porque la cantidad de votos validos es el 60% de los votos totales");

                                System.out.println("No gano nadie");
                            }
                            cont4++;

                case 5:
                        System.out.println("Se ha ingresado al ejercicio uno "+cont1+" veces."
                                + "\nSe ha ingresado al ejercicio dos "+cont2+" veces."
                                + "\nSe ha ingresado al ejercicio tres "+cont3+" veces."
                                + "\nSe ha ingresado al ejercicio cuatro "+cont4+" veces.");
                        System.out.println("Gracias!");
                        System.exit(0);
                }
                
                } else {
                System.out.println("Favor ingrese una opcion valida");
            }
        }
    }
}