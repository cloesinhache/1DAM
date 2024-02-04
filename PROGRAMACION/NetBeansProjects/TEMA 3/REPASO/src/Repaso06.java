/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.*/
/**
 *
 * @author cloer
 */
public class Repaso06 {

    public static void main(String[] args) {

        //declaro e inicializo las variables
        //inicio en 340 para que me muestre el 320
        int i = 340;

        //bucle do while
        do {
            i += -20;
            System.out.println(i);

        } while (i > 160);

    }

}
