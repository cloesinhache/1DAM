/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Escribe un programa que kea un numero N que imprima una piramide 
de numeros con N filas*/

package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int blancos,numero,filas,mitad1,mitad2;
        
        //declaro el objeto Scanner lector
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el numero de filas");
        
        //leo las filas
        filas=lector.nextInt();
        
        //incio las variables
        blancos=filas-1;
        numero=1;
        
        
        //necesito un bucle for para imprmir las filas que me indiquen
        for (int i=1; i<=filas; i++) {
                       
            //necesito otro bucle para pintar los blancos
            for (int j=1;j<=blancos; j++) {
                System.out.print(" ");
            }
            //pinto los numeros
            for (int j=1;j<=i;j++){
            System.out.print(j);
            }
            for (int j=(i-1);j>=1;j--){   
            System.out.print(j);
            }
            //actualizo las variables
            blancos--;
            numero+=2;
            System.out.println("");
        }
    
}
}

