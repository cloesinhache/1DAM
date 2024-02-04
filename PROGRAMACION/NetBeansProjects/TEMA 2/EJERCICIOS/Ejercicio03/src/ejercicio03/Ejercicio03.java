/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Escribe un programa que calcule el área de un cuadrado cuyo lado se 
introduce por teclado*/


package Ejercicio03;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables locales
        int lado;
        
        //Declaro el objeto lector de clase Scanner
                Scanner lector=new Scanner(System.in);
                System.out.println("Introduzca el lado del cuadrado");
               
                //Lo utilizaré para leer la variable lado desde teclado
                lado=lector.nextInt();
                
                System.out.print("El área del cuadrado es " +(lado*lado));
    }
    
}
