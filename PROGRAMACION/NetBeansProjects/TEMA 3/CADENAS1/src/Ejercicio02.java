/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que pida diez números reales por teclado, 
los almacene en un array, y luego muestre la suma de todos los valores.*/


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here

        //declaro las variables
        int i, suma = 0;
        boolean repetir;
        //declaro el nuevo vector
        //como es real uso double
        double v1[] = new double[10]; 

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca números con decimales");

        //copia y pega de jesus para usar punto decimal en lugar de coma
        lector.useLocale(Locale.US);

        for (i = 0; i < v1.length; i++) {
            do {
                repetir = false;
                try {
                    System.out.print("Número " + i + ": ");
                    v1[i] = lector.nextDouble();
                    suma=suma+i;
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato incorrecto o mal introducido");
                    lector.nextLine();
                    repetir = true;
                }
            } while (repetir);
        }
        System.out.println("La suma es " + suma);

        System.out.println("");//salto de linea
    }
}
