/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/
/**
 *
 * @author cloer
 */
public class Repaso16 {

    public static void main(String[] args) {

        //declaro las variables
        int num;
        boolean primo = true;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //leo el numero    
        System.out.println("Introduzca un numero");
        num = lector.nextInt();

        //compruebo si es primo
        //lo vamos dividiendo entre los numeros hasta llegar a su raiz cuadrada
        //empiezo por 2 porque por 1 ya sabemos que se puede dividir
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
            }

        }
        //escribo el resultado
        if (primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

}
