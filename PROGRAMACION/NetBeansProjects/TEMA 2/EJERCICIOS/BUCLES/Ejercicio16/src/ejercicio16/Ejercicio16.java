/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa en java que pida un número entero positivo y 
nos diga si es primo o no*/

package ejercicio16;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int numero,i;
        boolean primo=false;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un numero positivo");
        
        //leo el numero
        numero=lector.nextInt();
        
        //Compruebo si es positivo
        if (numero<=0){
            System.out.println("El numero debe ser positivo");
        }else{
            if (numero==1){
                System.out.println("Es un caso especial");
            }else{
                for(i=2;i<= Math.sqrt(numero);i+=1) {
                i=2;
                while (i<=Math.sqrt(numero)&& primo==false){
                        if (numero%i!=0){
                primo=true;
                    System.out.println("El numero es primo");
                        }else{
                            System.out.println("El numero no es primo");
            }
            
            }
        }      
    }
            }
    }
}



        