/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

/*ENUNCIADO:Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.*/
/**
 *
 * @author cloer
 */
public class arrays08 {

    public static void main(String[] args) {

        //declaro las variables
        double numero=0;
        boolean repetir;

        //declaro el lector Scanner
        Scanner lector = new Scanner(System.in);
        lector.useLocale(Locale.US);

        //declaro e instancio el array
        double v1[] = new double[100];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = Math.random();
        }
        do{
            repetir=false;
            try {
                System.out.println("Indique un numero");
                numero = lector.nextDouble();
            }
            catch (InputMismatchException e){
                 System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                lector.nextLine();
                repetir = true;
            }
        }while (repetir);
        

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == numero || v1[i] > numero) {
                System.out.print(v1[i] + " ");
            }

        }
    }//main

}
