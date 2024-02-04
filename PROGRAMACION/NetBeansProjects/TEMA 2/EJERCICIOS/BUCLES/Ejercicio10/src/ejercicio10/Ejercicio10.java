/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*Enunciado:Realiza un programa que lea una secuencia de notas (con valores que
van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota
con valor 10.*/

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
        
        //declaro las variables
        int nota;
        boolean diez=false;
         
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        
          
        //programa
        do{ 
            System.out.println("Introduzca una serie de notas"); 
            nota=lector.nextInt();
            if (nota==10) 
                diez=true;
            }while (nota!=-1);
     
        if (diez==true) {
            System.out.println("Hay notas con valor 10");
        }else{
            System.out.println("No se ha introducido ningún 10");
          
    }
    
}
}
