/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

//ENUNCIADO:Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
/**
 *
 * @author cloer
 */
public class Repaso20 {

    public static void main(String[] args) {

        //declaro las variables
        int altura, blancos, relleno;
        String caracter;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //Introduzco la altura y el caracter
        System.out.println("Introduzca la altura de la piramide");
        altura = lector.nextInt();
        System.out.println("Introduzca el caracter de relleno");
        caracter = lector.next();

        //inicio las variables
        blancos = altura - 1;
        relleno = 1;

        //hago un for para que me genere las lineas
        for (int i = 1; i <= altura; i++) {

            //bucle blancos
            for (int j = 1; j <= blancos; j++) {
                System.out.print(" ");
            }
            //bucle relleno
            for (int j = 1; j <= relleno; j++) {
                if (j == 1 || j == relleno || i == altura) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            //actualizo las variables
            blancos--;
            relleno += 2;
            System.out.println("");//salto de linea para que me cambie de fila

        }
    }

}
