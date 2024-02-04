/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que calcule el valor A elevado a B (A^B) sin
hacer uso del operador de potencia (^), siendo A y B valores introducidos por 
teclado, y luego muestre el resultado por pantalla*/

package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int base,exp,potencia,i;
        
        //declaro el objeto lector scanner
        Scanner lector=new Scanner(System.in);
        
        //leo las variables
        System.out.println("Introduzca la base");
        base=lector.nextInt();
        System.out.println("Introduzca el exponente");
        exp=lector.nextInt();
        
        
        while (exp<0){
            System.out.println("El exponente debe ser positivo");
            System.out.println("Introduzca la base");
            base=lector.nextInt();
            System.out.println("Introduzca el exponente");
            exp=lector.nextInt();
        }   
        if (exp==0){
            System.out.println("La potencia es 1");
        }else{
        
        potencia=1;
        for (i=0;i<exp;i+=1){
            potencia=potencia*base;
        }
        System.out.println("La potencia es "+ potencia);
		 
        }
    
}
}



