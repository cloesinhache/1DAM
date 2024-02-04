/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:. Realiza un programa que lea un número y a continuación escriba el  
carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en 
que el valor leído no sea positivo se deberá escribir un único asterisco.*/

package ejercicio19;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int i,x;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Escriba un numero");
        
        //leo x
        x=lector.nextInt();
        
        //programa
        if (x<0){
            System.out.println("*");
        } else{
            for (i=0;i<=x;i+=1) {
                System.out.print("*" );
                
            }
        }
  
    }
    
}
