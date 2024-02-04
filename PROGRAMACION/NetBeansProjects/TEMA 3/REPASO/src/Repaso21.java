/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo*/
/**
 *
 * @author cloer
 */
public class Repaso21 {

    public static void main(String[] args) {

        //declaro variables
        int num, mediaImpares, impares = 0, contador = 0, suma = 0, max = 0;
        boolean repetir = true;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //voy introduciendo numeros y aumento el contador
        while (repetir) {
            System.out.println("Introduzca un numero");
            num = lector.nextInt();
            contador++;

            //separo pares de impares
            //a los impares les incremento el contador para despues hacer la media
            //y hago la suma total
            if (num % 2 != 0) {
                impares++;
                suma = suma + num;
            } else {
                if (num > max) {
                    max = num;
                }
            }
            //excluyo al posible numero negativo impar que me modificaria la media 
            //los pares no necesitan excplusion porque siempre mostrará el mas alto
            if (num <= 0) {
                repetir = false;
                if (num % 2 != 0) {
                    impares--;
                    suma=suma-num;
                }
            }
        }
        mediaImpares = suma / impares;
        System.out.println("Se han introducido " + (contador - 1) + " numeros");
        System.out.println("La media de los impares es " + mediaImpares);
        System.out.println("El mayor de los pares es " + max);

    }
}
