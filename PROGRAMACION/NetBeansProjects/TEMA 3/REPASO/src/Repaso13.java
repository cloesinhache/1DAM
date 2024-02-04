/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/

/**
 *
 * @author cloer
 */
public class Repaso13 {
    
    public static void main(String[] args) {
        
        //declaro las variables
        int num,negativos=0,positivos=0,intentos=0;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        
        //hago un bucle para introducir 10 numeros
        //suponemos 0 como positivo
        do {
            System.out.println("Introduzca 10 numeros");
            num=lector.nextInt();
            intentos++;
            if (num<0) {
                negativos++;
            }else{
                positivos++;
            }
            
        } while (intentos<10);
        System.out.println("Hay "+positivos+" numeros positivos");
        System.out.println("Hay "+negativos+" numeros negativos");
    }
    
}
