/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) 
separados por espacios.*/

package ejercicio30;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaro las variables
        int num;
        
        //hago un bucle for pàra generar 20 numeros
        for (int i=1;i<=20;i++) {
            //genero el numero entre 0 y  10 con math.random y multiplicando por 10
            //obligo a que sea entero con int
            
            //para incluir el 10 uso 11
           num=(int)(Math.random()*11);   
           //uso prin sin ln para que se imprima en la misma linea
           System.out.print(num);
            System.out.print(" ");
        }
        
      
    }
    
}
