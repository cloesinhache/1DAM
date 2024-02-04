/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa.

/**
 *
 * @author cloer
 */
public class arrays12 {

    public static void main(String[] args) {

        //declaro las variables
        String opcion;
        int v,p;
        boolean repetir = true;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //declaro e instancio los vectores
        int v1[] = new int[10];

        //lo relleno
        for (int i = 0; i < v1.length; i++) {
            v1[i] = (int) (Math.random() * 10);
        }

        do {
            System.out.println("A.Mostrar valores");
            System.out.println("B.Introducir valor");
            System.out.println("Salir");

            System.out.println("Escriba la opcion a elegir;");
            opcion = lector.nextLine();
            opcion = opcion.toLowerCase();

            switch (opcion) {
                case ("a"):
                    for (int i = 0; i < v1.length; i++) {
                        System.out.print(v1[i]+" ");
                        
                    }
                    System.out.println("");
                    break;
                case ("b"):
                    System.out.println("Escriba un valor");
                    v=lector.nextInt();
                    System.out.println("Escriba la posicion");
                    p=lector.nextInt();
                       v1[p]=v;
                    
                    break;
                case ("c"):
                    System.out.println("Saliendo...");
                    repetir = false;
                    break;
            }
        } while (repetir);

    }
}
