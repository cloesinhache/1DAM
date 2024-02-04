/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*ENUNCIADO:Crea un programa que pida dos valores enteros N y M, luego cree un 
array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.*/
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int i, n, m;

        //lector Scanner
        Scanner lector = new Scanner(System.in);

        lector.useLocale(Locale.US);

        System.out.println("Introduzca el tamaño del array");
        n = lector.nextInt();
        System.out.println("Introduzca el numero que lo formará");
        m = lector.nextInt();
        //vector
        int v1[] = new int[n];

        for (i = 0; i < n; i++) {
            v1[i] = m;
        }
        System.out.println("Valores introducidos:");
       
            System.out.print(i+"");

            System.out.println("");//salto de linea

        }
    }

