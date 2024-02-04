/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Crea un programa que pida dos valores enteros P y Q, luego cree un 
array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.*/

/**
 *
 * @author cloer
 */
public class arrays07 {

    public static void main(String[] args) {

        // declarar variables
        int primero, ultimo, distancia;

        // declarar el objeto Scanner
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el valor inicial");
        primero = lector.nextInt();

        System.out.println("Introduzca el valor final");
        ultimo = lector.nextInt();

        distancia = ultimo - primero;

        // declarar e instanciar el array
        int v1[] = new int[distancia];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = primero + i;
        }

        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

    }//main

}
