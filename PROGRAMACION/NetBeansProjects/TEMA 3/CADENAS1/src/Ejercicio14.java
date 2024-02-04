/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que cree un array de enteros e introduzca la 
siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
hasta introducir 10 diez veces, y luego la muestre por pantalla*/
/**
 *
 * @author cloer
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //delclaro las vaeiables
        int i, j, numero, posicion;

        //Declaro y instancio el array.Lo llamo v1
        int v1[] = new int[55];  //he llegado a la conclusion de que es 55 a papel

        posicion = 0;
        numero = 1;

        //el primer for me introduce 10 veces lo que yo quiera en el array
        for (i = 0; i < 10; ++i) {
            //el segundo for me hace las repeticiones de los numeros tantas
            //veces como sea su valor (2 veces 2,3 veces 3)
            for (j = 0; j <= i; ++j) {
                v1[posicion] = numero;
                posicion++;

            }
            numero++;
        }

        System.out.println("La secuencia es:");
        for (i = 0; i < 55; ++i) {
            System.out.print(v1[i] + " ");
        }
    }
}
