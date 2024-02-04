/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
El programa pedirá la altura. El programa inserta un espacio y pinta dos 
asteriscos menos en la base para simular la curvatura de las esquinas inferiores.*/

package ejercicio28;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int altura;
        
        //declaro lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca la altura de la u");
        altura=lector.nextInt();
     
        
  
        for (int i = 0; i < altura; i++) {
            System.out.println("*       *");
            
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < altura; j++) {
                if (j==1||j==altura-1)
                    System.out.println("*");
                else{
                    System.out.println(" ");
                }
                
            }
        }
        System.out.println("");
    }
    
}
