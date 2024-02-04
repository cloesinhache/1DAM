/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa donde el usuario "piensa" un número del 1 al 
100 y el ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo 
números una y otra vez hasta adivinarlo (el usuario deberá indicarle al 
ordenador si es mayor, menor o igual al número que ha pensado)*/

package ejercicio13;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int num,min,max;
        String respuesta;
        boolean acierto=false;
        
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Piense en un numero del 1 al 100");
        
        min=0;
        max=101;
       while (acierto==false){
            num=(max+min)/2;
            if(num>=1){
                System.out.println("¿Es "+num+" tu número?: Indica = + o -:");
                respuesta=lector.next();
                switch(respuesta){
                    case"=":
                    acierto=true;
                    System.out.println("Acerté");
                    break;
                    case "+":
                        min=max;
                        break;
                    case "-":
                        max=num;
                        break;
                    default:
                }
            }else{
                min+=1;
            }
                
            }
        
    }
    
}
