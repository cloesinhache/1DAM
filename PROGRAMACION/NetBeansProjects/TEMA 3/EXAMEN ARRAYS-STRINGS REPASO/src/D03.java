/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Realiza un programa que muestre por pantalla un array de 9 filas por 
9 columnas relleno con números aleatorios entre 500 y 900. A continuación, el 
programa debe mostrar los números de la diagonal que va desde la esquina inferior 
izquierda a la esquina superior derecha, así como el máximo, el mínimo y la media 
de los números que hay en esa diagonal.*/
/**
 *
 * @author cloer
 */
public class D03 {

    public static void main(String[] args) {

        //declaro las variables
        int filas, columnas, maximo = 0, minimo=0, media, suma = 0;

        //declaro e instacio la matriz
        int m1[][] = new int[9][9];

        //la relleno con numeros aleatorios
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = (int) (500 + Math.random() * 401);
            }

        }
        //la imprimo
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + "\t");

            }
            System.out.println("");
        }

        //declaro el vector de la diagonal
        int diagonal[] = new int[9];

        filas = m1.length - 1;
        columnas = 0;

        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = m1[filas][columnas];

            suma += m1[filas][columnas];

            minimo = m1[m1.length - 1][0];

            if (m1[filas][columnas] < minimo) {
                minimo = m1[filas][columnas];

            } else {
                if (m1[columnas][filas] > maximo) {
                    maximo = m1[filas][columnas];
                }

            }

            filas--;
            columnas++;

        }
        
        System.out.println("El vector de la diagonal es:" );
        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i]+" ");
        }
        System.out.println("");
        System.out.println("El minimo es "+minimo);
        System.out.println("El maximo es "+maximo);
        media=suma/diagonal.length;
        System.out.println("La media es "+media);
    }//main
}
