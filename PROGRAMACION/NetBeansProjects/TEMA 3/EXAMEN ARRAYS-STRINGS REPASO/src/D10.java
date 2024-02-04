/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Dado un vector, implemente un método que inserte un elemento en una 
posición dada del vector. Como aclaración, al insertar un elemento en el vector, 
desplaza una posición hacia la derecha a los elementos del vector que han de quedar 
detrás del elemento insertado. Además, la inserción ocasiona la “desaparición” 
del último elemento del vector.*/
/**
 *
 * @author cloer
 */
public class D10 {

    public static void main(String[] args) {

        //declaro las variables
        int posicion, valor, tamaño;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el tamaño del vector: ");
        tamaño = lector.nextInt();

        //declaro e instancio el array
        int v1[] = new int[tamaño];
        int aux[] = new int[tamaño];

        //relleno el vector
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca los valores del vector: ");
            v1[i] = lector.nextInt();
            aux[i] = v1[i];
        }

        //lo muestro
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println("");
        //pregunto la posicion
        System.out.println("Indique que valor quiere insertar");
        valor = lector.nextInt();

        do {

            System.out.println("Introduzca la posicion:");
            posicion = lector.nextInt();
        } while (posicion <= 0 || posicion > tamaño - 1);

        //INSERCIÓN
        //Si la posición es la última, lo escribimos directamente
        if (posicion == (tamaño - 1)) {
            v1[tamaño - 1] = valor;
        } else {
            //Comenzando por el siguiente, guardo los elementos que almacené
            //en el vector aux.
            for (int i = posicion; i < aux.length - 1; i++) {
                v1[i+1]=aux[i];
            }
            v1[posicion] = valor;
        }
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");
            
        }
    }

}

