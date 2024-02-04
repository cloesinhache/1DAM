/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class InvertidaHueca {

    public static void main(String[] args) {

        //declaro las variables
        int altura, blancos, relleno;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //pido la altura por teclado
        System.out.println("Introduzca la altura de la piramide");
        altura = lector.nextInt();

        //inicio las variables
        blancos = 0;
        relleno = (altura * 2) - 1;

        //bucle que me genera las lineas
        for (int i = 0; i < altura; i++) {

            //bucle blancos
            for (int j = blancos; j >0; j--) {
                System.out.print(" ");

            }
            //bucle relleno
            for (int j = relleno; j > 0; j--) {
                 if (j == 1 || j == relleno||i==altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //actualizo las variables
            blancos++;
            relleno+=-2;
            System.out.println("");//salto de linea para que me cambie de fila
        }

    }
}
