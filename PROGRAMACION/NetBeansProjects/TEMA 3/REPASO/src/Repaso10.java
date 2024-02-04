/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/
/**
 *
 * @author cloer
 */
public class Repaso10 {

    public static void main(String[] args) {

        //declaro las variables
        int num, media, contador = 0, suma = 0;

        //declaro el lector Scanner
        Scanner lector = new Scanner(System.in);

        //bucle do-while
        do {
            System.out.println("Introduzca un numero positivo.Parará cuando "
                    + "introduzca un negativo o un 0");
            num = lector.nextInt();
            contador++;
            suma = suma + num;

            if (0 >= num) {
                contador--;
                suma = suma - num;
            }

        } while (num > 0);

        media = suma / contador;
        System.out.println("La media es de " + media);
    }

}
