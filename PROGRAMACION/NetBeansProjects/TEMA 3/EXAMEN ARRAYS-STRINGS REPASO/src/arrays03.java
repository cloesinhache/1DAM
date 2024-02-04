
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*ENUNCIADO:Crea un programa que pida diez números reales por teclado, los almacene 
en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.*/

/**
 *
 * @author cloer
 */
public class arrays03 {
    
    public static void main(String[] args) {
        
        //declaro las variables
        int maximo=0,minimo=0;
        
        //declaro e instancio el array
        int v1[] = new int[10];

        //declaro el Scanner
        Scanner lector = new Scanner(System.in);

        //lo relleno
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca 10 numeros");
            v1[i] = lector.nextInt();
            
            minimo=v1[0];
            
            if (v1[i]>maximo){
                maximo=v1[i];
            }
            
            if (v1[i]<minimo){
                minimo=v1[i];
            }

        }
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");
        }
        System.out.println("El maximo es "+maximo+ " y el minimo es "+ minimo);

    }
}
