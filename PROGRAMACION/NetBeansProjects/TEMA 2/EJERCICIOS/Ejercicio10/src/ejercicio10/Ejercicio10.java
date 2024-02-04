/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Escribe un programa que lee dos números, calcula y muestra el 
valor de su suma, resta, producto y división. 
(Ten en cuenta la división por cero).*/

package ejercicio10;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaro las variables
        int x,y;
        
        //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca dos números");
        
        //Lo utilizaré para leer las variables introducidas
            x=lector.nextInt();
            y=lector.nextInt();
        
        //Hago las operaciones que me piden: suma,resta,producto y división
        System.out.println ("La suma es " + (x+y));
        System.out.println("La resta  es " +(x-y));
        System.out.println("La multiplicación es " +(x*y));
        if (y!=0) {
         System.out.println(("La división es " +(x/y)));    
        } else {
            System.out.println("No se puede realizar la división entre"
                + " 0, lo siento");
        }
              
    }
}