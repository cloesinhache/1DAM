/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:. Crea un programa que pida veinte números reales por teclado, los almacene en un array y
luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.

/**
 *
 * @author cloer
 */
public class arrays05 {
    
    public static void main(String[] args) {
        
        //declaro las variables
        int suma=0,media;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        
        //declaro e instancio el array
        int v1[]=new int[10];
        
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca numeros");
            v1[i]=lector.nextInt();
            suma+=v1[i];
        }
        
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");  
        }
        media=suma/v1.length;
        System.out.println("La media es "+media);
    }
    
}
