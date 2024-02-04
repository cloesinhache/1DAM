/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
producto y división.
*/
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
        /*Identifico las variables locales*/
        int a, b;
        //Declaro el objeto lector de clase Scanner
            Scanner lector=new Scanner(System.in);
            System.out.println("Introduzca dos números");
            
            //Lo utilizaré para leer las variables introducidas
            a=lector.nextInt();
            b=lector.nextInt();
            
            //Hago las operaciones que me piden
            
            System.out.println("La suma es "  +(a+b));
            System.out.println("La resta es " +(a-b));
            System.out.println("La multiplicación es " +(a*b));
            System.out.println("La división es " +(a/b));
    }
    
}
