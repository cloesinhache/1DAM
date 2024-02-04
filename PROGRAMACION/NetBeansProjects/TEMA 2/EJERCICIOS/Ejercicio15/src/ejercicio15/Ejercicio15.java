/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*Escribe un programa que lea tres números distintos y nos diga cuál es el 
mayor*/

package ejercicio15;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaro las variables
        int a,b,c;
        
        //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca tres números, el sistema indicará cual"
                + "es el mayor");
        
        //Lo utilizaré para leer las variables introducidas
            a=lector.nextInt();
            b=lector.nextInt();
            c=lector.nextInt();
        
        //Compruebo cual es el mayor
        if (a>b && a>c){
        System.out.println("El " +a +" es el mayor");
        } else{ 
            if (b>a && b>c) { 
                System.out.println("El " +b +" es el  mayor");
            } else { 
                System.out.println("El " +c+ " es el mayor");
            }
            }
        }
    }
    
