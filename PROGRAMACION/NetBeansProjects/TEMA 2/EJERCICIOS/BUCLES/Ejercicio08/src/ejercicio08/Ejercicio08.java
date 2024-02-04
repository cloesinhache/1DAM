/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que lea una secuencia de números no nulos hasta
que se introduzca un 0, y luego muestre si ha leído algún número negativo, 
cuantos positivos y cuantos negativos*/
package ejercicio08;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        boolean negativo ;
        int n,positivo, negativo2;
        
        //declaro el objeto lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un número");
        
        //inicio los contadores
        negativo=false;
        negativo2=0;
        positivo=0;
        //inicio el bucle
        do {
            n=lector.nextInt();
            if (n<0){
                negativo=true;
                negativo2=negativo2+1;
            }else{
                if (n>0)
                positivo=positivo+1;
        } while(n!=0);
        
        
        if (negativo==true){
            System.out.println("Hay numeros negativos");
            System.out.println("Hay "+negativo2+"numeros negativos");
            System.out.println("Hay "+ positivo+"numeros positivos");
 
        }   

     }
}





