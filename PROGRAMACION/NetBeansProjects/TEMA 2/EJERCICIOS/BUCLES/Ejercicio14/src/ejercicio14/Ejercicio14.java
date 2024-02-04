/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*ENUNCIADO:Realiza un programa que dada una cantidad de euros que el usuario 
introduce por teclado  (múltiplo de 5 €) mostrará los billetes de cada tipo que 
serán necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200,
100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible. Por 
ejemplo, si el usuario introduce 145 el programa indicará que será necesario
1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por 
ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de 
billetes posible)*/

package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author Cloe Romero
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int cantidad,billeteCandidato,numBilletes;
        
        //declaro el objeto lector scanner
        Scanner lector =new Scanner(System.in);
        
        //introduzco y leo la cantidad en euros
        System.out.println("Introduzca la cantidad en euros");
        cantidad=lector.nextInt();
        
        //programa
        billeteCandidato=500;
        do {
        numBilletes=(cantidad/billeteCandidato);
        cantidad=cantidad%billeteCandidato;
        System.out.println("Billetes de "+billeteCandidato+"="+numBilletes);
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
            case 20: 
                billeteCandidato=10;
                break;
            case 10:
                billeteCandidato=5;
            case 5:
                break;
            default:
            }
        } while (cantidad<=0);
    }
}

