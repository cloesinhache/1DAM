/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/*ENUNCIADO.Crea un programa que cree un array de enteros de tamaño 100 y lo 
rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). 
Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.*/
/**
 *
 * @author cloer
 */
public class arrays09 {

    public static void main(String[] args) {

        //declaro las variables
        int numero=0;
        boolean repetir;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //declaro e instancio el array
        int v1[] = new int[100];

        for (int i = 0; i < v1.length; i++) {
            v1[i] = 1 + (int) (Math.random() * 10);
        }

        do {
            repetir = false;
            try {
                System.out.println("Introduzca un numero");
                numero = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor mal introducido. Tipo de excepcion:" + e.toString());
                lector.nextLine();
                repetir = true;
            }
            
        } while (repetir);
        System.out.println("Aparece en las posiciones:");
        for (int i = 0; i < v1.length; i++) {
            if (v1[i]==numero){
                
                System.out.print(i+" ");
                
            }
            
        }
    }

}
