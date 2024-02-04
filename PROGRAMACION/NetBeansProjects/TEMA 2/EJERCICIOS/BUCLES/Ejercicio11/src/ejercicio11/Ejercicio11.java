/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*Realiza un programa que sume independientemente los pares y los impares de 
los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas 
sumas*/

package ejercicio11;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int i,sumaPar,sumaImpar;
        
        //inicio los contadores
        sumaPar=0;
        sumaImpar=0;
        for (i=100;i<200;i+=1){
           if (i%2==0){
           sumaPar=sumaPar+i;
           }else {
               sumaImpar=sumaImpar+i;
           }
                                     
        }
        System.out.println("La suma de los pares es"+sumaPar);
        System.out.println("La suma de los impares es"+sumaImpar);
        
        
        
        
        
    }
    
}
