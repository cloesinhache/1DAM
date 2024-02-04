/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado*/
/**
 *
 * @author cloer
 */
public class Repaso11 {

    public static void main(String[] args) {

        //declaro las variables
        int num,cuadrado,cubo;

        //declaro el objeto Scanner lector
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el numero para iniciar");
        num = lector.nextInt();
        
        System.out.println(""); //salto de linea estetico

        for (int i = num; i < num + 5; i++) {
            cuadrado = (int)(Math.pow(i, 2));
            cubo = (int)(Math.pow(i, 3));

            System.out.println(i + "   "+ cuadrado +"   "+ cubo);


        }

    }

}
