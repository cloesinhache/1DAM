/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Escribe un programa que lea un valor correspondiente a una 
distancia en millas marinas y escriba la distancia en metros. Sabiendo que una
milla marina equivale a 1.852 metros*/

package ejercicio07;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaro las variables
        double distancia;
        final int metro=1852;
        
        //Declaro el el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Escriba una distancia en millas");
        
       //Lo utilizaré para leer la variable introducida
        distancia=lector.nextDouble();
        
        //Hago la conversión de millas a metros
        System.out.println(("La distancia en metros es ") +distancia*metro);
        
                
        
        
    }
    
}
