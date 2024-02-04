/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
escriba M en todas sus posiciones y lo muestre por pantalla.*/
/**
 *
 * @author cloer
 */
public class arrays06 {

    public static void main(String[] args) {

        //declaro las variables
        int tamaño, valor;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //pido tamaño y contenido
        System.out.println("Introduzca el tamaño del array");
        tamaño = lector.nextInt();
        System.out.println("Introduzca el contenido:");
        valor = lector.nextInt();

        //declaro e instamcio el array
        int v1[] = new int[tamaño];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = valor;
        }
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

        System.out.println("");//estetico
    }

}
