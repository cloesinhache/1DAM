/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/
/**
 *
 * @author cloer
 */
public class Repaso09 {

    public static void main(String[] args) {

        //declaro las variables
        int num, digitos = 1;

        //declaro el lector Scanner
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca un numero para saber cuantos digitos tiene");
        num = lector.nextInt();

        do {
            digitos++;
            num=num/10;

        } while (num >10);
        System.out.println("Tiene "+digitos+" digitos");
    }

}
