/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que pida diez números reales por teclado, 
los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y
mostrarlos por pantalla.*/


import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author cloer
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declaro las variables 
        int i, max, min;
        boolean repetir;

        //declaro el vector
        double v1[] = new double[10];

        //declaro el objeto Scanner lector
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca numeros reales");

        lector.useLocale(Locale.US); //usar punto decimal en lugar de coma
        for (i = 0; i < v1.length; i++) {
            for (i = 0; i < v1.length; i++) {
                do {
                    repetir = false;
                    try {
                        System.out.print("Número " + i + ": ");
                        v1[i] = lector.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Tipo de dato incorrecto o mal introducido");
                        lector.nextLine();
                        repetir = true;
                    }
                } while (repetir);

            }

        }

    }
}
