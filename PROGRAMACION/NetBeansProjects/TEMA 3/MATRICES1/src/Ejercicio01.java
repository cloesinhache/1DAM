/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que cree una matriz de tamaño 5x5 que almacene los 
números del 1 al 25 y luego muestre la matriz por pantalla.

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        //declaro la variable
        int num = 1;
        //declaro e instancio la matriz
        int m1[][] = new int[5][5];

        //la rellenamos
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = num;
                num++;
                System.out.print(m1[i][j] + "\t");
            }
             System.out.println("");
        }
       
    }

}

