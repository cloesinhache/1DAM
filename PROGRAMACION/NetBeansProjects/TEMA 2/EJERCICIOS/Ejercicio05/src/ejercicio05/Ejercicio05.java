/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Escribe un programa que toma como dato de entrada un número que
corresponde a la longitud de un radio y nos escribe la longitud de la 
circunferencia, el área del círculo y el volumen de la esfera que corresponden 
con dicho radio*/



package ejercicio05;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Identifico las variables locales
        double r;
        double pi=Math.PI;
        
        //Declaro el objeto de lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia");
        
        //Lo utilizaré para leer las variables introducidas
        r=lector.nextDouble();
        
        //Hago las operaciones que me piden
        System.out.println("La longitud de la circunferencia es " +r*2*pi);
        System.out.println("El área del circulo es " +pi*r*r);
        System.out.println("El volumen de la esfera es " +((4/3)*pi*Math.pow(r, 3)));
    }
    
}
