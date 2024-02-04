/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Escribe un programa que lee dos números y nos dice cuál es el mayor 
o si son iguales*/

package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author cloer
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int x,y;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        
        //leo ambos numeros
        x=lector.nextInt();
        y=lector.nextInt();
        
        //hago el programa
        if (x==y){
            System.out.println("Son iguales");
        }else{
            if(x>y){
                System.out.println(x+" es mayor que "+y);
            } else{
                System.out.println(y+" es mayor que "+x);
            }
        }
    }
    
}
