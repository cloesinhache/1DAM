/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//ENUNCIADO:PIRAMIDE INVERTIDA

package ejercicio22;
import java.util.Scanner;
/**
 *
 * @author cloer
 */
public class Ejercicio22 {

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
        blancos=filas-1;
        //si tiene 3 filas, la primera será 2 espacios,asterisco,dos espacios 
        asteriscos=1;
        

        //necesito tres bucles for
        //el primero se encarga de imprimir tantas lineas como se indiquen
        for (i=1;i<=filas;i+=1){
            //empiezo por los blancos que es lo primero que aparece en la pirámide
            for (j=1;j<=blancos;j+=1){
                System.out.print(" ");
            }
        //es print para que me los ponga en la misma linea
        
        //continuo con los asteriscos
        for (j=1;j<=asteriscos; j+=1) {
            System.out.print("*");
        }
        //actualizo las variables
            blancos--;
            asteriscos+= 2;
        System.out.println("");   //hago un salto de linea    
            
    } System.out.println("");
}
}
        

