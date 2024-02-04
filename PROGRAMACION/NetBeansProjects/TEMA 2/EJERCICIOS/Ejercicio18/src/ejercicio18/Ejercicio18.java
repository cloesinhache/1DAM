/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:. Escribe un programa que calcula el salario neto semanal de un 
trabajador en función del número de horas trabajadas y la tasa de impuestos 
de acuerdo a las siguientes hipótesis:
• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
• Las tasas de impuestos son:
• Los primeros 500 euros son libres de impuestos.
• Los siguientes 400 tienen un 25% de impuestos.
• Los restantes un 45% de impuestos.
 Escribir nombre, salario bruto, tasas y salario neto.*/

package ejercicio18;
import java.util.Scanner;

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
     
          //Declaro las variables
        double horas,tarifa,bruto,tasa,neto;
        
        //Declaro el objeto de lector scanner
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el numero de horas y la tarifa "
                + "por hora");
        
        //Lo utilizaré para leer las variables introducidas
        horas=lector.nextDouble();
        tarifa=lector.nextDouble();
        
        //Copruebo cual es el salario bruto
        if (horas<=35) {
            bruto=horas*tarifa;
            System.out.println("El salario bruto es " +bruto);       
        }else {
            bruto=35*tarifa+(horas-35)*tarifa*1.5;
            System.out.println("El salario bruto es " +bruto);
        }
        if (bruto<=500){
            tasa=0;
            bruto=neto;
                System.out.println("El salario neto es" +neto);
                System.out.println("La tasa aplicada es" +tasa);
                System.out.println("El salario bruto es" +bruto);
        }else{ 
            if (bruto<=900){
                tasa=0.25;
                neto=500+(bruto-500)*tasa;
                System.out.println("El salario neto es" +neto);
                System.out.println("La tasa aplicada es" +tasa);
                System.out.println("El salario bruto es" +bruto);
            } else{
                tasa=0.45;
                neto=500+400*0.75+(bruto-900)*tasa;
                System.out.println("El salario neto es" +neto);
                System.out.println("La tasa aplicada es" +tasa);
                System.out.println("El salario bruto es" +bruto);
            }
        }
    }  
    
    
}
