/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa para calcular la suma de los cuadrados de 
los 5 primeros números naturales.*/

package ejercicio18;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //declaro variables
        int i;
        double suma;
        
        suma=0;
         for (i=1; i>=5;i+=1) {
            suma=suma+i*i;
         // suma+=math.pow(a:i,b:2)  
        } System.out.println("La suma es "+suma);
    }
    
}

