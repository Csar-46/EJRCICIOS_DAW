package org.example;

import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial (){
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);       //Este comando sirve para habilitar el teclado.


        String nombre = entrada.next();                 //Cada vez qu pongo "entrada" activa el teclado
                                                        //para introducir variables del ipo declarado.

        System.out.println("¿A qué curso vas?");
        String curso = entrada.next();                  //El .next() sirve para indicar el tipo de variable introducida.

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        System.out.println("Introduce un número:");
        int num1 = entrada.nextInt();                   //En este caso .nextInt() se trata de un numero.

        System.out.println("Introduce otro número:");
        int num2 = entrada.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado es: " + resultado);
    }
}
