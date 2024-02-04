/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que lea y acepte únicamente aquellos que sean 
mayores que el último dado. La introducción de números finaliza con la 
introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.*/

package ejercicio17;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int i,numero,introducidos,fallados,anterior;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el numero con que el quiere comenzar");
        //leo n
        numero=lector.nextInt();
        
        //programa
        introducidos=0;
        fallados=0;
        anterior=0;
        do {
            anterior=numero;
            System.out.println("Siga introduciendo numeros");
            numero=lector.nextInt();
            if (numero<=anterior){
                System.out.println("El numero tiene que ser mayor");
                introducidos=introducidos+1;
                fallados=fallados+1;
            }else{
                introducidos=introducidos+1;
            }
        } while(numero!=0);
        System.out.println("El total de numeros introducidos es "+introducidos);
        System.out.println("El total de numeros fallados es "+fallados);
    }
    
}
