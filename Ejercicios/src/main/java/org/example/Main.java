package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int multiplicando = 0;
        int multiplicador = 0;

        boolean error = true;
        boolean error2 = true;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un multiplicando de 3 cifras:");

        while (error == true) { //Controlamos que el valor del multiplicador sea numerico
            try {

                multiplicando = entrada.nextInt();
                while (multiplicando <= 0) { //Controlamos que el multiplicando no sea ni negativo ni 0
                    System.out.println("ERROR. Introduce un multiplicando válido:");
                    multiplicando = entrada.nextInt();

                }
                error = false;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor numérico:");
                entrada.nextLine();

            }
        }

        System.out.println("Introduce un multiplicador de 3 cifras:");

        while (error2 == true) { //Controlamos que el valor del multiplicando sea numerico
            try {

                multiplicador = entrada.nextInt();
                while (multiplicador <= 0) { //Controlamos que el multiplicador no sea ni negativo ni 0
                    System.out.println("ERROR. Introduce un multiplicador válido:");
                    multiplicador = entrada.nextInt();

                }
                error2 = false;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor numérico:");
                entrada.nextLine();

            }
        }

        String multiplicandotxt = Integer.toString(multiplicando);      /*Con este comando estamos cambiando el caracater numerico de la variable multiplicando a texto.*/
        String multiplicandotxt_1 = multiplicandotxt.substring(0,1);
        String multiplicandotxt_2 = multiplicandotxt.substring(1,2);
        String multiplicandotxt_3 = multiplicandotxt.substring(2,3);

        int multiplicando_1 = Integer.parseInt(multiplicandotxt_1);    /*Con este comando estamos cambiando el caracater de texto de la variable multiplicando a numero.*/
        int multiplicando_2 = Integer.parseInt(multiplicandotxt_2);
        int multiplicando_3 = Integer.parseInt(multiplicandotxt_3);

        String multiplicadortxt = Integer.toString(multiplicador);
        String multiplicadortxt_1 = multiplicadortxt.substring(0,1);
        String multiplicadortxt_2 = multiplicadortxt.substring(1,2);
        String multiplicadortxt_3 = multiplicadortxt.substring(2,3);

        int multiplicador_1 = Integer.parseInt(multiplicadortxt_1);
        int multiplicador_2 = Integer.parseInt(multiplicadortxt_2);
        int multiplicador_3 = Integer.parseInt(multiplicadortxt_3);

        System.out.println("La primera cifra es " + multiplicando_1);
        System.out.println("La primera cifra es " + multiplicando_2);
        System.out.println("La primera cifra es " + multiplicando_3);

        System.out.println("La primera cifra es " + multiplicador_1);
        System.out.println("La primera cifra es " + multiplicador_2);
        System.out.println("La primera cifra es " + multiplicador_3);

    }
}