/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Enunciado:Pirámide hueca

package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author cloer
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int filas,blancos,asteriscos,i,j;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide");
        
        //leo las filas
        filas=lector.nextInt();
        
        //inicio las variables
        blancos=filas-1;
        asteriscos=1;      
        //necesitare tres bucles
        //el primero se va a encargar de imprimir las filas que yo indique
        for (i=1;i<=filas; i++) {
            
            //bucle de los espacios
            for (j=1;j<=blancos;j++) {
                System.out.print(" ");
            }
                
            //bucle de los asteriscos   
             for (j=1;j<=asteriscos; j++) {
            //imprimo asteriscos solo en los bordes y en la base
                if (j==1 || j==asteriscos || i==filas) {
                    System.out.print("*");
                } else {
            //imprimo espacios en el centro de la pirámide
                    System.out.print(" ");
                }
             }
            blancos--;
            asteriscos+=2;
            System.out.println("");  //salto de linea
        

    }
   
    }
}
    



