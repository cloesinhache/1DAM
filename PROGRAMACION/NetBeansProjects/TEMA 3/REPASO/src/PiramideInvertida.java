/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class PiramideInvertida {
    
    public static void main(String[] args) {
        
        //declaro las variables
        int altura,blancos, relleno;
        
        //declaro el lector Scanner
        Scanner lector=new Scanner(System.in);
        
        //introduzco la altura
        System.out.println("Introduzca la altura de la piramide");
        altura=lector.nextInt();
        
        //inicializo las variables
        blancos=0;
        relleno=(altura*2)-1;
        //hago un bucle para generar las lineas indicadas
        for (int i = 0; i < altura; i++) {
            
            //bucle blancos
            for (int j = blancos; j >0; j--) {
                System.out.print(" "); 
                
            }
            for (int j = relleno; j >0; j--) {
                System.out.print("*");
                
            }
            //actualizo las variables
            relleno+=-2;
            blancos++;
            System.out.println("");//salto de linea para que me cambie de fila
            
            
            
            
        }
        
    }
}
