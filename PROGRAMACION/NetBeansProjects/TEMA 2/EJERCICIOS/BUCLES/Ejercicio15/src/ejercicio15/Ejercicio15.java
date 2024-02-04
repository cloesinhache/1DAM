/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:5. Realiza un programa que cuente los múltiplos de 3 desde el 1 
hasta un número que introducimos por teclado.*/

package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int numero,i,multiplos;
        
        //declaro el objeto lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        
        //programa
        multiplos=0;
        do{
            numero=lector.nextInt();
            for (i=3; i<= numero; i+=3) {
                multiplos=multiplos+1;
            }
        }while (numero<0);
        System.out.println("Hay "+multiplos+ " multiplos de 3");
    }
}
   
         
    

