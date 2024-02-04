/*-----------------------------------------------------------------------------------------------------------..
...
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class Rombohueco {

    public static void main(String[] args) {

        //declaro las variables
        int altura, blancos, relleno, blancos2, relleno2;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //introduzco la altura del rombo
        System.out.println("Introduzca la altura del rombo.Debe ser impar");
        altura = lector.nextInt();

        //inicializo las variables
        //es la mitad del rombo, por lo que dividimos dividimos la altura entre 2
        blancos = altura/2;
        relleno = 1;

        //empiezo con una piramide normal hueca
        //el primer for me genera las lineas que he indicado
        for (int i = 1; i <= altura / 2; i++) {

            //bucle blancos
            for (int j = 1; j <= blancos; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= relleno; j++) {
                if (j == 1 || j == relleno) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            //actualizo variables
            blancos--;
            relleno += 2;
            System.out.println("");//salto de linea para que me cambie de fila
        }

        //piramide invertida hueca
        //inicio las variables
        blancos2 = 0;
        relleno2 = altura;

        //genero las lineas restantes
        for (int i = 0; i < (altura/2)+1; i++) {

            //bucle blanco
            for (int j = blancos2; j >=1; j--) {
                System.out.print(" ");
            }
            //bucle relleno
            for (int j = relleno2; j >=1; j--) {
                if (j==1||j==relleno2){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }

            //actualizo las variables
            blancos2++;
            relleno2+=-2;
            System.out.println("");//cambio de linea para que salte a la siguiente fila
        }

    }//main
}
