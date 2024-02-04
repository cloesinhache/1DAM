/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que pida veinte números enteros por teclado, 
los almacene en un array y luego muestre por separado la suma de todos los 
valores positivos y negativos.*/


import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

/**
 *
 * @author cloer
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int i, sumaPos = 0, sumaNeg = 0;
        boolean repetir;

        //vector
        double v1[] = new double[20];

        //lector Scanner
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca numeros con decimales");

        lector.useLocale(Locale.US);
             
        for (i = 0; i < v1.length; i++) {
            do {
                repetir = false;
                try {
                    System.out.print("Número " + i + ": ");
                    v1[i] = lector.nextDouble();
                    if (i > 0) {
                        sumaPos = sumaPos + i;
                    } else {
                        if (i < 0) {
                            sumaNeg = sumaNeg + i;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato incorrecto o mal introducido");
                    lector.nextLine();
                    repetir = true;
                }
            } while (repetir);

        } System.out.println("La suma de todos los positivos es"+sumaPos);
        System.out.println("La suma de todos los negativos es"+sumaNeg);

    }
}
