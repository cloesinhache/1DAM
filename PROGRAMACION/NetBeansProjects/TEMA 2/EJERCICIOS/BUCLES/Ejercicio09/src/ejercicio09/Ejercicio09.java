/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
naturales*/
package ejercicio09;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro el contador
        int i,suma,producto;
       
        
        //programa
         suma=0;
        producto=0;
        for (i=0;i<=10;i+=1){
            suma=i+i;
            producto=i*i;  
        }
           System.out.println("La suma es "+ suma);    
           System.out.println("El producto es "+ producto);
    }
    
}
