/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

/**
 *
 * @author cloer
 */
public class Repaso01 {

    public static void main(String[] args) {

        //uso un bucle for
        //opcion 1: empezamos en el 0 hasta el 100 y vamos de 5 en 5
        for (int i = 0; i <= 100; i+=5) {
            System.out.println(i);
        }
        
        //otra opcion sería dejando en incremento en 1
        for (int i = 0; i <= 100; i++) {
            //hacemos un if para cumplir que seaa divisible entre 
            if (i % 5 == 0) {
                System.out.println(i);

            }

        }

    }

}
