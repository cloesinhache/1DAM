/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.*/
/**
 *
 * @author cloer
 */
public class numerocuadradocubo {

    public static void main(String[] args) {

        //declaro e instancio los 3 arrays
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        //relleno el array numero con el math.random
        //aprovecho el mismo bucle para rellenar los otros arrays
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
            cubo[i] = (int) (Math.pow(numero[i], 3));
        }

        //imprimo el resultado en 3 columnas
        for (int i = 0; i < cubo.length; i++) {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t" + cubo[i]);
        }

    }//main

}
