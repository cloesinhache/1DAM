/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que cree una matriz de 10x10 e introduzca los valores 
de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará 
la matriz por pantalla.
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //DECLARO LAS VARIABLES
        int num = 1;

        //declaro e instancio la matriz
        int m1[][] = new int[10][10];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = (i+1)*(j+1);
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println("");
        }
    }//main
}
