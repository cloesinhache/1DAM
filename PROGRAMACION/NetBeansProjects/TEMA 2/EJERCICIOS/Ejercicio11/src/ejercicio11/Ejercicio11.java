/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Escribe un programa que lee 2 números y muestra el mayor*/

package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro las variables
        int a,b;
        
        //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca dos números, el sistema le dirá"
                + "cual es el mayor");
        
        //Lo utilizaré para leer las variables introducidas
        a=lector.nextInt();
        b=lector.nextInt();
        
        //Compruebo cual es el mayor
        if (a>b) {
            System.out.println(a+ " es  el mayor");
        } else { 
            System.out.println(b+ " es el mayor");
        }
        
    }
    
}
