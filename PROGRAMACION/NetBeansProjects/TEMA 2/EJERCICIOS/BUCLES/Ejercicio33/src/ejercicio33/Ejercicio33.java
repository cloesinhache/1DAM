/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*ENUNCIADO:Escribe un programa que muestre 20 notas generadas al azar. 
Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o 
sobresaliente. Al final aparecerá el número de suspensos, el número de 
suficientes, el número de bienes, etc.*/
package ejercicio33;

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro las variables
        int sobre, not, bien, sufi, suspenso, limite;

        //inicio las variables
        suspenso = 0;
        sufi = 0;
        bien = 0;
        not = 0;
        sobre = 0;

        for (int i=0;i<20;i++) {
            limite = (int)(Math.random()*5);
            switch (limite) {
                case 0:
                    System.out.println("suspenso");
                    suspenso++;
                    break;
                case 1:
                    System.out.println("suficiente");
                    sufi++;
                    break;
                case 2:
                    System.out.println("bien");
                    bien++;
                    break;
                case 3:
                    System.out.println("notable");
                    not++;
                    break;
                case 4:
                    System.out.println("sobresaliente");
                    sobre++;
                default:
                    
                    
                

            }

        }
        System.out.println("");//imprimo salto de linea
        
        System.out.println("Hay " + suspenso + " suspensos");
        System.out.println("Hay " + sufi + " suficientes");
        System.out.println("Hay " + bien + " bien");
        System.out.println("Hay " + not + " notables");
        System.out.println("Hay " + sobre + " sobresalientes");
    }
}
