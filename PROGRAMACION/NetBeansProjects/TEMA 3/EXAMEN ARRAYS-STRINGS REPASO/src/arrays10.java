/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Locale;

/*ENUNCIADO:. Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.*/
/**
 *
 * @author cloer
 */
public class arrays10 {

    public static void main(String[] args) {

        //declaro las variables
        int numAlturas;
        double maximo = 0, minimo = 0, media, suma = 0;

        //declaro lector Scanner
        Scanner lector = new Scanner(System.in);
        lector.useLocale(Locale.US);

        System.out.println("Introduzca el numero de alturas");
        numAlturas = lector.nextInt();

        //declaro e instancio el array
        double v1[] = new double[numAlturas];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca una altura: ");
            v1[i] = lector.nextDouble();
            suma += v1[i];

            minimo = v1[0];

            if (v1[i] < minimo) {
                minimo = v1[i];
            }
            if (v1[i] > maximo) {
                maximo = v1[i];
            }
        }
        System.out.println("La maxima es " + maximo);
        System.out.println("La minima es " + minimo);
        media = suma / v1.length;
        System.out.println("La media es " + media);

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] > media) {
                System.out.print(v1[i] + " estan por encima de la media");
                System.out.println("");
            }
            if (v1[i] < media) {
                System.out.print(v1[i] + "estan por debajo de la media");
            }
        }

    } //main
}
