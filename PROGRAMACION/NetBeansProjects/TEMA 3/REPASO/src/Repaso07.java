/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/*ENUNCIADO:Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/
/**
 *
 * @author cloer
 */
public class Repaso07 {

    public static void main(String[] args) {

        //declaro las variables
        int intentos = 0, num, combi;
        boolean repetir=true;

        //me invento la contraseña        
        combi = 5678;

        //declaro el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //hago un bucle while mientras repetir sea verdadero
        //introducimos numero por teclado e incrementamos los intentos en 1
        while (repetir){
            System.out.println("Introduzca la combinacion, es un numero de 4 digitos."
                    + "Tiene 4 intentos:");
            num = lector.nextInt();
            intentos++;

            //comprobamos si la combinacion es correcta y se termina el bucle
            if (num == combi) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                repetir=false;
                
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
            
            //controlamos que se hagan solo 4 intentos
            if(intentos>=4){
                repetir=false;
            System.out.println("Numero de intentos agotado");

        } }

    }

}
