/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO.Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.*/

/**
 *
 * @author cloer
 */
public class Pecera {
    
    public static void main(String[] args) {
        
int altura, anchura, lineaPez, colPez;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
        altura = sc.nextInt();

        System.out.println("Ahora introduzca la anchura (como mínimo 4):");
        anchura = sc.nextInt();

        lineaPez = (int) ((Math.random() * (altura - 2)) + 2);
        colPez = (int) ((Math.random() * (anchura - 2)) + 2);

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= anchura; j++) {
                if (i == 1 || i == altura) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == anchura) {
                        System.out.print("*");
                    } else {
                        if (i == lineaPez && j == colPez) {
                            System.out.print("&");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }

            }
            System.out.println("");
        }
        System.out.println("");
    }
}

