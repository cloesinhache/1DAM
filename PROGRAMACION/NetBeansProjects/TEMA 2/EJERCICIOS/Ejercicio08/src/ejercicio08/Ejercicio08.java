/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de
edad” solo si lo somos*/

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
        //Declaro la variable
        int edad;
        
         //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca su edad");
        
        //Lo utilizaré para leer la variable introducida
            edad=lector.nextInt();
            
        //Compruebo si es mayor de edad
        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        }
         
    }
}
    

