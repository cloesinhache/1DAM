/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO: Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
separados por espacios. Muestra también el máximo, el mínimo y la media de esos 
números.*/

package ejercicio31;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        //declaro las variables
        int num,max,min,media,suma,contador;
        
        //inicio las variables
        max=100;
        min=199;
        contador=0;
        suma=0;
        
        //hago un bucle for pàra generar 50 numeros
        for (int i=1;i<=50;i++) {
            //genero el numero entre 0 y 50 con math.random y multiplicando por 100
            //para empezar con 100 lo sumo al principio
            //obligo a que sea entero con int
           num=100+(int)(Math.random()*100);   
           //uso prin sin ln para que se imprima en la misma linea
            System.out.print(num);
            System.out.print(" ");
            suma=suma+num;
            contador=contador+1;
        
            
            if (num>max) {
            max=num;
          }else if (num<min) {
            min=num;
          }
        }
        
        System.out.println(""); //salto de linea
        media=suma/contador;
        System.out.println("El menor es "+min);
        System.out.println("El mayor es "+max);
        System.out.println("La media es "+media);
    }
        
}

        
      
  
    
