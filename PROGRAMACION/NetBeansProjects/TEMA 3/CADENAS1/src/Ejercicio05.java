/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Crea un programa que pida veinte números reales por teclado, los 
almacene en un array y luego lo recorra para calcular y mostrar la media: (
suma de valores) / nº de valores.*/



import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //variables
        int i, numeros = 0, media,suma=0;
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
                    numeros++;
                    suma=suma+i;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Tipo de dato incorrecto o mal introducido");
                    lector.nextLine();
                    repetir = true;
                }
            } while (repetir);
            
        } media=suma/numeros;
        System.out.println("La media es"+media);

    }
    
}
