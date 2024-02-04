/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:. Escribe un programa que lea una calificación numérica entre 0 y 
10 y la transforma en calificación alfabética, escribiendo el resultado.
• de 0 a <3 Muy Deficiente.
• de 3 a <5 Insuficiente.
• de 5 a <6 Bien.
• de 6 a <9 Notable
• de 9 a 10 Sobresaliente*/

package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author cloer
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int nota;
        
        //declaro el objeto Scanner lector
        Scanner lector=new Scanner(System.in);
        System.out.println("Escriba la calificación");
       
        
        //programa
           nota=lector.nextInt();  
           if (nota<0 && nota>10){
               System.out.println("Calificacion incorrecta");
           }else{
            switch (nota) {
            case 1:
                System.out.println("Muy deficiente");
                 break;
            case 2:
                System.out.println("Muy deficiente");
                 break;
              case 3:
                System.out.println("Muy deficiente");
                 break;
            case 4:
                System.out.println("Insuficiente");
                 break;
            case 5:
                System.out.println("Bien");
                 break;
            case 6:
                System.out.println("Bien");
                 break;
            case 7:
                System.out.println("Notable");
                 break;
            case 8:
                System.out.println("Notable");
                 break;
            case 9:
                System.out.println("Sobresaliente");
                break;   
            case 10:
            System.out.println("Sobresaliente");
                 break;
            } 
        }
    }
}
