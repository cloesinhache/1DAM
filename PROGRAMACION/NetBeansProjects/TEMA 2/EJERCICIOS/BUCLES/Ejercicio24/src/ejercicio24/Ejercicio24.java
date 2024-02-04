/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//ENUNCIADO:SERIE DE FIBONACCI


package ejercicio24;
/**
 *
 * @author cloer
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int num1,num2,suma,i;
        
        //inicio las variables
        suma=0;
        num1=0;
        num2=1;
                
        //programa
        //uso dos for, el primero para decidir hasta que numero llego
        for (i=0;i<=10;i++) {
            suma=num1+num2;
            System.out.println(suma);

            //actualizo las variables
            num1=num2;
            num2=suma;
        }           

    }
    
}
