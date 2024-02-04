/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO.Escribe un programa que rellene un array de 20 elementos con números 
enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación 
el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos 
de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array escribiendo 
los números que se quieren resaltar entre corchetes.*/
/**
 *
 * @author cloer
 */
public class D08 {

    public static void main(String[] args) {

        //declaro las variables
        int opcion;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //declaro e instancio el array
        int v1[] = new int[20];

        //relleno el array
        for (int i = 0; i < v1.length; i++) {
            v1[i] = (int) (Math.random() * 401);
        }

        //muestro el array
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println("");//estetico

        System.out.println("¿Quiere resaltar los multiplos de 5 o de 7?.Escriba el numero: ");
        opcion = lector.nextInt();

        if (opcion == 5) {
            for (int i = 0; i < v1.length; i++) {
                if (v1[i] % 5 == 0) {
                    System.out.print("[ " + v1[i] + " ]");
                }else{
                    System.out.print(v1[i]+" ");
                }

            }
        } else {
            if (opcion == 7) {
                for (int i = 0; i < v1.length; i++) {
                    if (v1[i] % 7 == 0) {
                        System.out.println("[ " + v1[i] + " ]");
                    }
                    else{
                        System.out.print(v1[i]+" ");
                    }

                }
            }
        }
        System.out.println("");//estetico
        
    }//main
}
