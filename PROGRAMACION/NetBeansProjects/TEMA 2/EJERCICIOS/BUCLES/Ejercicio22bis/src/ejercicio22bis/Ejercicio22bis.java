/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//ENUNCIADO:PIRAMIDE INVERTIDA

package ejercicio22bis;
import java.util.Scanner;
/**
 *
 * @author cloer
 */
public class Ejercicio22bis {

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
        
        //Inicializo las variables blanco y asteriscos
        blancos=0;
        //empezamos con todos los espacios rellenos,sin huecos 
        asteriscos=filas*2-1;
        //si tiene 3 filas, en la primera habrá 5 asteriscos, el doble-1
        

        //necesito tres bucles for
        //el primero se encarga de imprimir tantas lineas como se indiquen
        for (i=filas;i>=1;i+=-1){
        //empiezo por los espacios
        for (j=blancos;j>=0;j+=-1)
                System.out.print(" ");
        //sigo con los asteriscos
            for (j=asteriscos;j>0;j+=-1) {
                System.out.print("*");
            }        //es print para que me los ponga en la misma linea

        //actualizo las variables
            blancos++;
            asteriscos+=-2;
        System.out.println("");   //hago un salto de linea    
            
    }System.out.println("");
}
}

        
