/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre todos sus valores
 */
/**
 *
 * @author cloer
 */
public class arrays01 {

    public static void main(String[] args) {

        //declaro e instancio el array
        int v1[] = new int[10];

        //declaro el Scanner
        Scanner lector = new Scanner(System.in);

        //lo relleno
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca 10 numeros");
            v1[i] = lector.nextInt();

        }
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");

        }

    }

}
