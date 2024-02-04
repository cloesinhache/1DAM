/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int cantidad, billeteCandidato, numBilletes;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad en euros: ");
        cantidad=sc.nextInt();
        
        billeteCandidato=500;
        do {
            numBilletes=cantidad/billeteCandidato;
            cantidad=cantidad%billeteCandidato;
            System.out.println("Billetes de "+billeteCandidato+" = "+numBilletes);
            switch (billeteCandidato) {
                case 500:
                    billeteCandidato=200;
                    break;
                case 200:
                    billeteCandidato=100;
                    break;
                case 100:
                    billeteCandidato=50;
                    break;
                case 50:
                    billeteCandidato=20;
                    break;
                case 20:
                    billeteCandidato=10;
                    break;
                case 10:
                    billeteCandidato=5;
                    break;
                case 5:
                    cantidad=0;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (cantidad>0);
        
    }
    
}
