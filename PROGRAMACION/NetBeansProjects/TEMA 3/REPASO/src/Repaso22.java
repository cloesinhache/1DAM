/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos

 */
/**
 *
 * @author cloer
 */
public class Repaso22 {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j!=0) 
                    System.out.println(i);
        }

    }
}
}
