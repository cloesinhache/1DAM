/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Crea un programa que lea por teclado una cadena de caracteres e 
indique la cantidad de palabras que tiene. De la clase String, sólo se pueden 
utilizar los métodos length(), charAt() y trim().*/

/**
 *
 * @author cloer
 */
public class D05 {
    
    public static void main(String[] args) {
        
        String cadena="";
        int contador=1;
        
        Scanner lector=new Scanner (System.in);
        
        System.out.println("Introduzca una cadena");
        cadena=lector.nextLine();
        
        cadena=cadena.trim();
        for (int i = 0; i < cadena.length(); i++) {
             if (cadena.charAt(i)==' ' && cadena.charAt(i+1)!=' '){
                 contador++;
             }
        }
        System.out.println(contador);
    }
}
