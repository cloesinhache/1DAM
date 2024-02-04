/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 ***************************** ENUNCIADO ***********************************
 * 22 - PIRÁMIDE
 * *************************************************************************
*/

package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej22 {
    public static void main(String[] args) {
        int filas=0;
        int blancos, asteriscos;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca la altura de la pirámide:");
        filas=sc.nextInt();
        
        //Inicializo las variables blanco y asteriscos
        blancos=filas-1;
        asteriscos=1;
        
        //Bucle LÍNEAS
        //Genero tantas líneas como me indique el usuario
        for (int i = 1; i <= filas; i++) {
            
            //Bucle BLANCOS
            //Comienzo en filas-1 y lo decremento en 1 en cada salto
            for (int j = 1; j <=blancos ; j++) {
                System.out.print(" ");
            }
            
            //Bucle ASTERISCOS
            //Comienzo en 1 y lo incremento en 2 en cada salto
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }
            
            //Actualizo las variables de control
            blancos--;
            asteriscos+=2;
            System.out.println("");//Genero línea nueva
        }
        
        System.out.println("");
    }
}
