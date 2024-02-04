/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*EUNCIADO: Escribe un programa que dado el precio de un artículo y 
el precio de venta real nos muestre el porcentaje de descuento realizado*/

package ejercicio06;
import java.util.Scanner;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro las variables 
        float precio,precioVenta;
           
        //Declaro el objeto de lector Scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el precio del artículo y el precio "
                + "de venta real");
        
        //Lo utilizaré para leer las variables introducidas
        precio=lector.nextFloat();
        precioVenta=lector.nextFloat();
        
        //Calculo el descuento
        System.out.println("El descuento es "+(100 -((precioVenta/precio)*100)
                +("%")));
    }
    
}
