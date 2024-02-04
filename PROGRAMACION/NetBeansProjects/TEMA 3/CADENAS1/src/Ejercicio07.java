
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*ENUNCIADO:Crea un programa que pida dos valores enteros P y Q, luego cree un 
array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.*/

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
          //variables
        int i, n, m;

      

        //lector Scanner
        Scanner lector = new Scanner(System.in);
        
        lector.useLocale(Locale.US);
          
        System.out.println("Introduzca el tamaño del array");
        n=lector.nextInt();
        
        //vector
        int v1[] = new int [n];  
        
        for (i = 0; i < n; i++) {
            while (n>0){
            System.out.println("Introduzca el numero que lo formará");
            m=lector.nextInt();
            v1[m] = lector.nextInt();
            }
                    
        }  System.out.println("Valores introducidos:");
        
            for (i = 0; i < v1.length; i++) {
                System.out.println(i+"");
            
        }
            
            System.out.println("");//salto de linea

    }
}

    

