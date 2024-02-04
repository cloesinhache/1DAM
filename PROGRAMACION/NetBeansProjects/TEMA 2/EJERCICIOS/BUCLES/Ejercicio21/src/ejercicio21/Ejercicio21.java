/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que pida dos número enteros A y B, siendo B 
mayor que A. Luego visualiza los números desde A hasta B e indicar cuantos hay 
que sean pares*/

package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int A,B,i,pares;
        
        //declaro el Scanner lector
        Scanner lector=new Scanner(System.in);
        
        //INTRODUZCO LAS VARIABLES
        System.out.println("Introduzca el numero A");
        A=lector.nextInt();
        System.out.println("Introduzca el numero B(DEBE SER MAYOR QUE A");
        B=lector.nextInt();
        
        //OBLIGO A QUE B SEA MAYOR QUE A CON UN BUCLE
        if (A>B) {
            do{
                System.out.println("Vuelva a introducir B");
                 B=lector.nextInt();
        }while (B>A); 
            
        //HAGO EL PROGRAMA
        pares=0;
        for (i=A;i<=B;i+=1) {
        System.out.println(i+"");
        if (i%2==0){
        pares=pares+1;
                }
            }  
        System.out.println(i);
        System.out.println("La cantidad de pares es"+pares);
    }               
}
}
