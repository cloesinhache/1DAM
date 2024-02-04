/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*ENUNCIADO:Realiza un programa que pinte una X hecha de asteriscos. El programa
debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor 
o igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
*       *
  *   *
    *
  *   *
*       *
 */
package ejercicio36;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declaro las variables
        int altura=0;
        boolean repetir;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);
        
        //compruebo que la altura es igual o mayor que 3 e impar
        do {
            repetir=false;
            try {
                System.out.println("Introduzca la altura de la X:");
                altura=lector.nextInt();
                
            }catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());
                lector.nextLine();
                repetir=true;
            }
            if (altura<=3||altura%2==0) {
                System.out.println("Debe ser igual o mayor que 3 e impar");               
            } else{
                
            //lo enfoco como una matriz y voy a necesitar 2 bucles
            //el primero se va a encargar de imprimir las filas que yo indique. 
            for (int i = 0;i<altura;i++) {
            //el segundo for se encargará de las columnas
            for (int j=0;j<altura;j++) {
                //si i es igual a j, se imprimira la primera diagonal
                //Es como si en una matriz tuvieramos (0,0)(1,1)(2,2)
                //i=altura-j-1 nos imprime la diagonal contraria
                //Si necesito la coordenada (0,2) -> 0=altura(3)-j(2)-1
                if (i==j||i==altura-j-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(""); //hago salto de linea
            }
        }
        } while (repetir);
    }
}
