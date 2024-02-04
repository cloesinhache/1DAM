/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/***************************** ENUNCIADO ***************************************
23. Realiza un programa que pida un número y construya por pantalla su pirámide
* HUECA.
*******************************************************************************/
package ej23;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, blancos=1, asteriscos=1;
        
        Scanner sc= new Scanner(System.in);
        
        //Pedimos el número por teclado
        System.out.println("Introduzca un número positivo: ");
        num=sc.nextInt();
        
        //Si el número no es mayor que 0, informamos y finalizamos el programa
        if (num<=0) {
            System.out.println("El número ha de ser positivo.");
        }
        else{
            
            //Hacemos un bucle for desde 1 hasta el número indicado, que será
            //el número de filas que tendrá la pirámide
            for (int i = 1; i <= num; i++) {
                
                //Pintamos los espacios en blanco, que serán más en las filas 
                //superiores. En la primera hay num-1 blancos, en la segunda 
                //num-2 blancos, etc. 
                //De esta forma, comenzamos el bucle en 1 la primera vez, 
                //en 2 la segunda, etc.
                for (int j = blancos; j < num; j++) {
                    System.out.print(" ");
                }
                
                //Pintamos ASTERISCOS. En todas las filas excepto en la última,
                //la pirámide está hueca.
                if (i<num) {
                    //Pintamos el primer y último ASTERISCO de cada fila.
                    for (int j = 1; j <= asteriscos; j++) {
                    if (j==1||j==asteriscos) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                //Para la siguiente fila, hay 2 asteriscos más.
                asteriscos+=2;
                //Incrementamos blancos para pintar uno menos cada vez.
                blancos++;
                System.out.println("");
                }else{
                    //Estamos en la última fila. Todo son asteriscos
                    for (int j = 1; j < num*2; j++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
             
    }
    
}
}
