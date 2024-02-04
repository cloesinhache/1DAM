/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENNUNCIADO:Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado*/
/**
 *
 * @author cloer
 */
public class Repaso12 {

    public static void main(String[] args) {

        //declaro las variables
        int terminos, num1, num2, num3;
        boolean repetir = true;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //introduzco el numero de terminos y compruebo que son positivos
        while (repetir) {
            System.out.println("Introduzca el numero de terminos que desea");
            terminos = lector.nextInt();
            if (terminos <= 0) {
                System.out.println("Los terminos tienen que ser positivos");
            } else {
                repetir =false;
            }
                
        //inicio las variables
        num1 = 0;
        num2 = 1;
        
        //las imprimo porque el bucle no me las va a imprimir
        System.out.print(num1+" "+num2);
        
        //hago un for para el resto de la serie
        for (int i = 0; i < terminos; i++) {
            num3=num1+num2;
            System.out.print(" "+num3+" ");
            
            //actualizo las variables
            num1=num2;
            num2=num3;
                
            }
        }
        
        
    }
}
        
