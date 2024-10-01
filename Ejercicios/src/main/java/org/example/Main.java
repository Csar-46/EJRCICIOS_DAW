package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        int edad = 0;
        final int edad_voto = 18;
        boolean  error = true;

        System.out.println();
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();
        System.out.println("Hola " + nombre + ". Introduce tu edad:");

        while (error == true){
            try {

                edad = entrada.nextInt();
                error = false;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un dato válido:");
                entrada.nextLine();

            }
        }

        while (edad<0){
            System.out.println("Introduce de nuevo tu edad:");
            edad = entrada.nextInt();
        }

        if (edad < edad_voto) {

            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            System.out.println("Te faltan " + (edad_voto - edad) + " años para ser mayor de edad.");

        } else
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");

    }
}