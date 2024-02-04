/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Escribir un programa que pida el nombre completo al usuario y lo muestre
sin vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, "Jesús Pérez" se mostrará "Jss Prz".*/

/**
 *
 * @author cloer
 */
public class D06 {
    
    public static void main(String[] args) {
        String nombre;
        char c;
        
        Scanner lector=new Scanner(System.in);
        
        String vocales="aeiouáéíóú";
        
        System.out.println("Introduzca el nombre");
        nombre=lector.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            c=Character.toLowerCase(nombre.charAt(i));
            if (vocales.indexOf(c)==-1) 
                System.out.print(nombre.charAt(i));
        }
        System.out.println("");
    }
}
