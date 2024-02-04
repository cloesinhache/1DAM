
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*ENUNCIADO:. Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre la suma de todos los valores.*/

/**
 *
 * @author cloer
 */
public class arrays02 {
    
    public static void main(String[] args) {
        
        //declaro la variable
        int suma=0;
        
        //declaro e instancio el array
        int v1[] = new int[10];

        //declaro el Scanner
        Scanner lector = new Scanner(System.in);

        //lo relleno
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca 10 numeros");
            v1[i] = lector.nextInt();
            suma=suma+v1[i];

        }
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");
        }
        System.out.println("");//estetico
        
        System.out.println("La suma de todos los elementos es "+suma);
        
        System.out.println("");//estetico

    }//main
}
