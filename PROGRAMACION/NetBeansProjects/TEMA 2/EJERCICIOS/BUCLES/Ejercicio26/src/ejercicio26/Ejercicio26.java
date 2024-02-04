/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que pida un número por teclado y que luego 
muestre ese número al revés*/

package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int  num,num2,num3;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un numero de mínimo dos cifras");
        
        //leo num
        num=lector.nextInt();
        
        for (int i=0;i<num;i++) {
            
        num2=num/10;
        num3=num&10;
        
        
                System.out.println(num3);
            }
            
        }
        
    }
   
