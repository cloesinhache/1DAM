/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Crea un programa que pida 10 números enteros por teclado, los 
almacene en un array y luego muestre por separado la suma de todos los valores 
positivos y negativos.*/

/**
 *
 * @author cloer
 */
public class arrays04 {
    
    public static void main(String[] args) {
        
        //declaro las variables
        int sumaPos=0,sumaNeg=0;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        
        //declaro el instancio el array
        int v1[]=new int [10];
        
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca 10 numeros");
            v1[i]=lector.nextInt();
            
            if (v1[i]>0){
                sumaPos+=v1[i];
            }else{
                if (v1[i]<0){
                    sumaNeg+=v1[i];
                }
            }
            
        }
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i]+" ");
            
        }
        System.out.println(""); //estetico
        System.out.println("La suma de negativos es "+ sumaNeg);
        System.out.println("La suma de positivos es "+ sumaPos);
    }//main
}
