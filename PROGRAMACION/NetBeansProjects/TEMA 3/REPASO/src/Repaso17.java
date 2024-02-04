/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/
/**
 *
 * @author cloer
 */
public class Repaso17 {

    public static void main(String[] args) {

        //declaro las variables
        int num, suma = 0;
        boolean repetir = true;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //compruebo que el numero introducido es positivo
        while (repetir) {
            System.out.println("Introduzca el numero de partida");
            num = lector.nextInt();
            if (num <= 0) {
                System.out.println("El numero debe ser positivo");
            } else {
                repetir = false;
            }

            for (int i = num; i < num + 100; i++) {
                suma = suma + i;
            }
        }
        System.out.println("La suma es " + suma);

    }

}
