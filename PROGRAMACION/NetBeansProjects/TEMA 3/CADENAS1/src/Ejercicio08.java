/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que cree un array con 100 números reales aleatorios 
entre 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor 
real R. Por último, mostrará cuántos valores del array son igual o superiores a R.*/
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaro las variables
        int i, acumulador = 0;
        double valor;

        //declaro el objeto Scanner lector
        Scanner lector = new Scanner(System.in);

        //cambio la coma por el punto
        lector.useLocale(Locale.US);

        //declaro e instancio el array
        double v1[] = new double[100];

        for (i = 0; i < v1.length; i++) {
            v1[i] = Math.random();
        }
        
        System.out.println("Introduzca un valor decimal:");
        valor = lector.nextDouble();

        for (i = 0; i < v1.length; i++) {
            if (v1[i] >= valor) {
                acumulador++;
            }
        }
        System.out.println("Hay " + acumulador + " son iguales o superiores a " + valor);
    }
}
