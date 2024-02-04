/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.*/
/**
 *
 * @author cloer
 */
public class Repaso15 {

    public static void main(String[] args) {
        //declaro las variables
        int base, exponente;
        boolean repetir = true;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //introduzco la base por teclado
        System.out.println("Introduzca la base de la potencia");
        base = lector.nextInt();

        //compruebo que el exponente sea positivo con un while
        while (repetir) {
            System.out.println("Introduzca el exponente");
            exponente = lector.nextInt();
            if (exponente >= 0) {
                repetir = false;
            } else {
                System.out.println("El exponente debe ser positivo");

            }
            //hago un for que me calcule la potencia
            for (int i = 1; i <= exponente; i++) {

                System.out.println(base + " " + i);

            }

        }
    }

}
