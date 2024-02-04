/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio34;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           long num=0, copia, alReves;
        boolean repetir=false;
        
        Scanner sc=new Scanner(System.in);
        
        do{
            repetir=false;
            try{
                System.out.println("Introduzca un número: ");
                num=sc.nextLong();
            }
            catch(InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
        }while(repetir==true); 
                
        copia=num;
        alReves=0;
        
        while (copia>0) {
            alReves= (alReves*10)+copia%10;
            copia/=10;
        }
        
        System.out.println("alReves = " + alReves);
        
        if(num==alReves){
            System.out.println("El número "+num+" es capicúa");
        }
        else{
            System.out.println("El número "+num+" NO es capicúa");
        }
    }
    
}

    
    

