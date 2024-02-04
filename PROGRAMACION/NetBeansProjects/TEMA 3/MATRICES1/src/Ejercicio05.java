/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        //declaro las variables
        int personas,hombres = 0, mujeres = 0, sumahombres = 0, sumamujeres = 0;
         
        //declaro el objeto lector Scanner
        Scanner lector=new Scanner(System.in);
        
       
        System.out.println("Introduzca el número de personas:");
        personas = lector.nextInt();
        
        //delclaro e instancio la matriz
        int m1[][] = new int [personas][2];

        //rrelleno la matriz con dos for, uno para las columnas y otro para las
        //filas
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (j == 0) {
                    System.out.println("Introduzca el género de la persona (0-hombre y 1-mujer):");
                    m1[i][j] = lector.nextInt();
                }
                if (j == 1) {
                    System.out.println("Introduzca el sueldo:");
                    m1[i][j] = lector.nextInt();
                }
            }
        }
        
        //imprimo la matriz
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println("");//salto de linea para que me cambie de fila
        }
        //hago la media
        for (int i = 0; i < m1.length; i++) {
            if (m1[i][0] == 0) {
                hombres++;
                sumahombres += m1[i][1];
            }
            if (m1[i][0] == 1) {
                mujeres++;
                sumamujeres += m1[i][1];
            }
        }
        System.out.println("La media de sueldo de los hombres es: " + (sumahombres / hombres));
        System.out.println("El media de sueldo de las mujeres es: " + (sumamujeres / mujeres));
    }

}
