/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia*/
/**
 *
 * @author cloer
 */
public class Repaso14 {

    public static void main(String[] args) {

        //declaro las variables
        int base, exponente, potencia = 1;
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
            for (int i = 0; i < exponente; i++) {
                potencia = potencia * base;
                exponente--;
            }
            System.out.println(potencia);
        }

    }

}
