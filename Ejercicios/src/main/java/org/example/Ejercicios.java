package org.example;

import java.util.Scanner;

public class Ejercicios {

    public void actividad0 (){
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);       //Este comando sirve para habilitar el teclado.


        String nombre = entrada.next();                 //Cada vez qu pongo "entrada" activa el teclado
                                                        //para introducir variables del ipo declarado.

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();                  //El .next() sirve para indicar el tipo de variable introducida.

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2){

            System.out.println("Introduce un número:");
            num1 = entrada.nextInt();                   //En este caso .nextInt() se trata de un numero.

            System.out.println("Introduce otro número:");
            num2 = entrada.nextInt();

            if (num1 == num2){
                System.out.println("ERROR. Los numeros son iguales");
            }

        }
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }
    public void ejercicio1 (){
        System.out.println("Bienvenido! Introduzca un número porfavor: ");

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        if(num > 0){
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        }else
            System.out.println("El número es natural.");

    }
}


