/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int caracter;
        int longitud;
        int lineas;
        int respuesta;
        Scanner sc=new Scanner (System.in);
        
        //Pregunto al usuario si desea tener 10 líneas o un número aleatorio
        System.out.println("Indique si desea 10 líneas o un número aleatorio"
                + "de ellas");
        System.out.println("0 - 10 líneas / 1- Aleatorio");
        respuesta=sc.nextInt();
        
        //Indico al bucle si son 10 líneas o es aleatorio
        if (respuesta==0) {
            lineas=10;
        } else {
            lineas=(int)(Math.random()*11)+1;
        }
                
        
        //Genero las diez líneas
        for (int i = 0; i < lineas; i++) {
            
            //Calculo la longitud de cada línea
            longitud=(int)(Math.random()*40)+1;
            
            //Bucle con tope en la longitud calculada anteriormente
            for (int j = 0; j < longitud; j++) {
                
                //Calculo el número del carácter aleatorio
                caracter=(int)(Math.random()*6);
                
                switch (caracter) {
                    case 0:
                        System.out.print("*");
                        break;
                    case 1:
                        System.out.print("-");
                        break;
                    case 2:
                        System.out.print("=");
                        break;
                    case 3:
                        System.out.print(".");
                        break;
                    case 4:
                        System.out.print("|");
                        break;
                    case 5:
                        System.out.print("@");
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            System.out.println("");
        }
    }
    
}

    
    

