/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*Enunciado:Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.

 */
/**
 *
 * @author cloer
 */
public class Repaso03 {

    public static void main(String[] args) {

        //declaro la variable
        int num = 0;

        //bucle do while
        do {
            num++;
            if (num % 5 == 0) {

                System.out.println(num);
            }

        } while (num < 100);

    }

}
