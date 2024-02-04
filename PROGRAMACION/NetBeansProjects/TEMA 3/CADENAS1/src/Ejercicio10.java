/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO: Crea un programa para realizar cálculos relacionados con la altura
(en metros) de personas. Pedirá un valor N y luego almacenará en un array N 
alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima 
así como cuántas personas miden por encima y por debajo de la media.*/
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaro las variables
        int i, personas, debajo = 0, encima = 0;
        double altura,suma=0, max, min, media;

        //declaro el lector Scanner
        Scanner lector = new Scanner(System.in);

        //cambio la coma por el punto
        lector.useLocale(Locale.US);

        //introduzco cuantas personas
        System.out.println("Introduzca cuantas alturas va a introducir");
        personas = lector.nextInt();

        //declaro e instancio el array
        double v1[] = new double[personas];

        for (i = 0; i < v1.length; i++) {
            System.out.println("Introduzca la altura " + i + " :");
            altura = lector.nextDouble();
            v1[i]=altura;
           
        }
        max = v1[0];
        min = v1[0];
        for (i = 0; i < v1.length; i++) {
             suma = suma + v1[i];
            if (v1[i] > max) {
                max = v1[i];
            }
            if (v1[i] < min) {
                min = v1[i];
            }
        }
        media = suma / personas;
        for (i = 0; i < v1.length; i++) {

            if (v1[i] > media) {
                encima++;
            } else {
                debajo++;
            }

        }
        System.out.println("La altura minima es " + min);
        System.out.println("La altura maxima es " + max);
        System.out.println("La altura media es " + media);
        System.out.println("Hay " + debajo + " personas por debajo de la media");
        System.out.println("Hay " + encima + " por encima de la media");
    }
}
