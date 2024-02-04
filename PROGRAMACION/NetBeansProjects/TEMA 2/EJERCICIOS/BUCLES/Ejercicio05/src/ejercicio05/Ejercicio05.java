/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1*/

package ejercicio05;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Declaro la variable
        int n,i,factorial;
        
         //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un número");
        
        //Lo utilizaré para leer las variables introducidas
        n=lector.nextInt();
        
        //bucle do while
        i=n;
        factorial=1;
        while (i>1) {
            factorial=factorial*i;
            i=i-1;
        }
            System.out.println("El factorial de " +n+ " es " +factorial);
            
        }
        
    }
    

