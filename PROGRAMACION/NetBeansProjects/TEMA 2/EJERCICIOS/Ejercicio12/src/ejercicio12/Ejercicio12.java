/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:  Escribe un programa que lee un número y me dice si es positivo o 
negativo, consideraremos el cero como positivo*/

package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaro las variables
        int x;
        
        //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un número para saber si es "
                + "positivo o negativo");
            
        //Lo utilizaré para leer las variables introducidas
            x=lector.nextInt();
        
        //Compruebo si es positivo o negativo
        if (x>=0) {
            System.out.println("Es positivo");
        } else { System.out.println("Es negativo");
        }
    }
    
}
