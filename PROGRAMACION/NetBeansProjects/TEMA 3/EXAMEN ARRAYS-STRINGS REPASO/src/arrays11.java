/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*ENUNCIADO:Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.*/

/**
 *
 * @author cloer
 */
public class arrays11 {
    
    public static void main(String[] args) {
        
        
        //declaro e instancio los arrays
        int v1[]=new int [100];
        int v2[]=new int [100];
        int j=99;
        
        for (int i = 0; i < v1.length; i++) {
            v1[i]=1+v1[i]+i;
        }
        
        
        for (int i = 0; i < v2.length; i++) {
            v2[i]=v1[j];
            System.out.print(v1[i]+" ");
            System.out.print(v2[i]+" ");
            System.out.println("");
            j--;
            
        }
    }//main
}
