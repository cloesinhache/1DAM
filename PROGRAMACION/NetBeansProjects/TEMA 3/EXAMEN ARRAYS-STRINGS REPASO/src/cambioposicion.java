/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que lea 5 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/
/**
 *
 * @author cloer
 */
public class cambioposicion {

    public static void main(String[] args) {
        //declaro las variables
        int aux;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //declaro e instancio el array
        int v1[] = new int[5];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca 5 numeros");
            v1[i] = lector.nextInt();
        }
        aux = v1[v1.length - 1];
        
        for (int i = 0; i < v1.length; i++) {
            v1[i] = v1[i + 1];
            System.out.print(aux + " " + v1[i] + " ");

        }

    }
}
