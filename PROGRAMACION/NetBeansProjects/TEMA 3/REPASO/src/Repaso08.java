/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

//ENUNCIADO.Muestra la tabla de multiplicar de un número introducido por teclado

/**
 *
 * @author cloer
 */
public class Repaso08 {
    
    public static void main(String[] args) {
        
        //declaro las variables
        int num,tabla;
        
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Introduzca el numero del que quiere obtener la tabla");
        num=lector.nextInt();
        
        System.out.println("");//salto de linea estetico
        
        for (int i = 1; i <=10; i++) {
            tabla=num*i;
            System.out.println(num+"x"+i+"="+tabla);
            
        }
        
        
    }
}
