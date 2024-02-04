/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.*/

/**
 *
 * @author cloer
 */
public class arrayinverso {

    public static void main(String[] args) {

        //declaro las variables
        int numero;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //declaro e instancio el vector
        int v1[] = new int[10];

        //pido los 10 numeros en un bucle for
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca un numero: ");
            numero = lector.nextInt();
            v1[i] = numero;
        }
        
        for (int i = 9; i >= 0; i--) {
            System.out.print(v1[i]+" ");    
        }
        
        System.out.println(""); //estetico
        
    }//main
}
