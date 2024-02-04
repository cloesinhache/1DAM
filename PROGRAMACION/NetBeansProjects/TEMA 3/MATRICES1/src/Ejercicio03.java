/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Crea un programa que cree una matriz de tamaño NxM (tamaño introducido 
por teclado) e introduzca en ella NxM valores (también introducidos por teclado).
Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores 
son mayores que cero, cuántos son menores que cero y cuántos son igual a cero.

 */
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        //VARIABLES
        int filas, columnas, cero = 0, mayor = 0, menor = 0;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //pedimos tamaño
        System.out.println("Introduzca las filas");
        filas = lector.nextInt();
        System.out.println("Introduzca las columnas");
        columnas = lector.nextInt();

        //declaro e instacio la matriz
        int m1[][] = new int[filas][columnas];

        //pido los valores
        System.out.println("Introduzca los valores");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = lector.nextInt();
                

            }
        }

        //imprimo la matriz
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + "\t");

            }
            //salto de fila
            System.out.println("");
        }
        //estetico
        System.out.println("");

    }//main
}
