/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que contenga un vector de tamaño N definido por 
una constante. A continuación, lee N números por teclado y almacénalos en dicho 
vector. Luego, desplaza los elementos de manera que el de la posición 0 pase a 
la posición 1, el de la posición 1 a la 2, etc. El número que se encuentra en la 
posición final debe pasar a la número 0. Muestra por pantalla el resultado inicial 
y el final. Utiliza un solo vector para todo el proceso.*/
/**
 *
 * @author cloer
 */
public class D02 {

    public static void main(String[] args) {

        //declaro las variables
        int ultimo, posiciones;
        final int TAMAÑO;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //pido el tamaño por teclado
        System.out.println("Introduzca el tamaño del array: ");
        TAMAÑO = lector.nextInt();

        //declaro e instancio el vector
        int v1[] = new int[TAMAÑO];

        //relleno el vector con numeros introducidos por teclado
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca numeros: ");
            v1[i] = lector.nextInt();
        }

        //muestro el vector inicial
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");

        }

        System.out.println("¿Cuantas posiciones quiere moverlo?");
        posiciones = lector.nextInt();

        for (int j = 0; j < posiciones; j++) {

            //creo una variable donde almaceno el ultimo numero
            ultimo = v1[TAMAÑO - 1];

            //muevo las posiciones
            for (int i = TAMAÑO - 1; i > 0; i--) {
                v1[i] = v1[i - 1];
            }
            System.out.println("");
            v1[0] = ultimo;

            for (int i = 0; i < TAMAÑO; i++) {
                System.out.print(v1[i] + " ");

            }
        }
    }//main
}
