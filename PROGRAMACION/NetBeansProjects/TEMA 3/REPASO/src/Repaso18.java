/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.*/
/**
 *
 * @author cloer
 */
public class Repaso18 {

    public static void main(String[] args) {

        //declaro las variables
        int primero, ultimo;
        boolean repetir = true;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //introduzco el primer numero
        System.out.println("Introduzca el numero inicial");
        primero = lector.nextInt();

        //compruebo que el segundo no es igual
        while (repetir) {

            System.out.println("Introduzca el numero final");
            ultimo = lector.nextInt();

            if (primero == ultimo) {
                System.out.println("Los numeros deben ser distintos");
            } else {
                repetir = false;
            }
            System.out.println("");//salto de linea estetico

            if (primero < ultimo) {
                for (int i = primero; i <= ultimo; i += 7) {
                    System.out.println(i);
                }
            } else {
                for (int i = ultimo; i <= primero; i += 7) {
                    System.out.println(i);
                }

            }

        }
    }
}
