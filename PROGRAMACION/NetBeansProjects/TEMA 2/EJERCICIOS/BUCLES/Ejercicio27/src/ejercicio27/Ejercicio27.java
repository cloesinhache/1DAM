/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que pinte la letra L por pantalla hecha con a
steriscos. El programa pedirá la altura. El palo horizontal de la L tendrá una 
longitud de la mitad (división entera entre 2) de la altura más uno.*/

package ejercicio27;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int altura;
        
        //declaro lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide");
        
        //leo la altura
        altura=lector.nextInt();
        
        for (int i=0;i<altura-1; i++) {
            System.out.println("*");
        }
        for (int i=0;i<(altura+1)/2; i++) {
            System.out.print("* "); 
        }
        System.out.println("");
        
        
    }
    
}
