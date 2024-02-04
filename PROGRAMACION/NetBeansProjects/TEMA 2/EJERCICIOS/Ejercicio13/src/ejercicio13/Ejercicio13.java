/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Escribe un programa que lee dos números y los visualiza en orden 
ascendente.*/

package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author cloer
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int x,y;
        
        //declaro el objeto lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        
        //leo ambos numeros
        x=lector.nextInt();
        y=lector.nextInt();
        
        //hago el programa
        if (x>y){
            System.out.println(y);
            System.out.println(x);
        }else{
            System.out.println(x);
            System.out.println(y);
        }
    }
    
}
