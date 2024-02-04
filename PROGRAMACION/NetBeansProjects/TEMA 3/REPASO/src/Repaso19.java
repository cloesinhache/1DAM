/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado*/

/**
 *
 * @author cloer
 */
public class Repaso19 {
    
    public static void main(String[] args) {
        //declaro las variables
        int altura,blancos,relleno;
        String caracter;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        
        //leo la altura y el caracter
        System.out.println("Introduzca la altura de su piramide:");
        altura=lector.nextInt();
        System.out.println("Introduzca el caracter de relleno:");
        caracter=lector.next();
        
        //inicio las variables
        blancos=altura-1;
        relleno=1;
        
        //necesito un for que me genere las lineas que desee
        for (int i = 0; i < altura; i++) {
            
            //for blancos
            for (int j = 0; j < blancos; j++) {
                //uso print para que me o imprima todo en la misma linea
                System.out.print(" ");
                
            }
            //for de relleno
            for (int j = 0; j < relleno; j++) {
                //uso print para que me o imprima todo en la misma linea
                System.out.print(caracter);
                
            }
           //actulizo las variables
           blancos--;
           relleno+=2;
            System.out.println("");//salto de linea para pasar a la siguiente fila
          
        }
        System.out.println("");//salto de linea estetico
     
    }
    
}
