/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que muestre los números desde el 1 hasta un 
número N que se introducirá por teclado*/

package ejercicio04;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro la variable
        int n;
        
         //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca hasta el número que quiera llegar");
        
        //Lo utilizaré para leer la variable introducida
        n=lector.nextInt();
        
        for(int i=1; i<=n; i+=1){
            System.out.println(i);
        }
           
    }
    
}
