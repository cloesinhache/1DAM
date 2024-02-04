/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO.Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.*/
/**
 *
 * @author cloer
 */
public class maxymin {

    public static void main(String[] args) {

        //declaro las variables
        int maximo = 0, minimo = 0;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //declaro e instancio el array
        int v1[] = new int[10];

        //hago un bucle for para rellenar el array
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca un numero");
            v1[i] = lector.nextInt();

            //en el mismo bucle inicio el minimo al primer elemento y voy
            //comparando
            minimo = v1[0];
            if (v1[i] < minimo) {
                minimo = v1[i];
            }
            if (v1[i] > maximo) {
                maximo = v1[i];
            }
        }
        //imprimo resultados
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
            if (v1[i] == minimo) {
                System.out.print("minimo ");
            }
            if (v1[i] == maximo) {
                System.out.print("maximo ");
            }

        }

    }//main

}
