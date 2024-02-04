/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que pida un número entero N entre 0 y 20 y 
luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, 
repitiendo cada número tantas veces como su valor*/

package ejercicio20;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int numero,i,j;
        
        //declaro el scanner lector
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un numero entre 0 y 20");
        
        //leo el numero
        numero=lector.nextInt();
        
        //programa
        for (i=0;i<=numero;i+=1) { //control de salto de linea
            System.out.println("");
            for (j=1;j<=i;j+=1) {   //imprime i j veces
                System.out.print(i); //print para que no nos salte de linea
                
            }
            
                
            
            
        }
        
    }
    
}
