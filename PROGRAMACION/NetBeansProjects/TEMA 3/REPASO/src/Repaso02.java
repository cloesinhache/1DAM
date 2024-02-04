/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

 */
/**
 *
 * @author cloer
 */
public class Repaso02 {

    public static void main(String[] args) {

        //declaro las variables
        int num = 0;

        //bucle while
        //mientras el numero sea menor que 100, lo vamos incrementando 
        //cuando llegue a 100 parará
        //si es divisible entre , lo imprime
        while (num <= 100) {
            num++;
            if (num % 5 == 0) {
                System.out.println(num);

            }

        }

    }

}
