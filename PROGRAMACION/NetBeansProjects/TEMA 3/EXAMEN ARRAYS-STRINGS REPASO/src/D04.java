/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Crea un algoritmo que pida 5 palabras por teclado y que al final nos 
muestre la de mayor y menor longitud. Si coinciden dos o más palabras con la mayor 
o menor longitud, entonces se mostrará la primera que se introdujo.*/
/**
 *
 * @author cloer
 */
public class D04 {

    public static void main(String[] args) {

        //declaro las variables
        String palabra="",palabraMin="",palabraMax="";

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca una palabra");
            palabra = lector.nextLine();
            
            if (i==0){
              palabraMin = palabra;  
            }
            
            if (palabra.length() < palabraMin.length()) {
                palabraMin = palabra;
            } else {
                if (palabra.length() > palabraMax.length()) {
                    palabraMax = palabra;
                }
            }

        }//for
        
        System.out.println("La palabra mas larga es "+palabraMax+" con "+palabraMax.length()+" caracteres");
        System.out.println("La palabra mas corta es "+palabraMin+" con "+palabraMin.length()+" caracteres");
    }//main

}
