/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO: Crea un programa que cree un array de enteros de tamaño 100 y lo 
rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10).
Luego pedirá un valor N y mostrará en qué posiciones del array aparece N. */
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaro las variables
        int i;
        int valor;

        //declaro el objeto Scanner lector
        Scanner lector = new Scanner(System.in);

        //cambio la coma por el punto
        lector.useLocale(Locale.US);

        //declaro e instancio el array
       int v1[] = new int[100];

        for (i = 0; i < v1.length; i++) {
            v1[i] = (int)(1 + Math.random() * 10);
        }

        System.out.println("Introduzca un valor entre 1 y 10:");
        valor = lector.nextInt();

        for (i = 0; i < v1.length; i++) {
            if (v1[i] == valor) {
                System.out.println("Posiciones que coinciden con"+valor +"="+ i);
            }
        }
                
    }
}

    

