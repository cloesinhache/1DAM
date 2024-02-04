/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Realiza un programa que calcule la estatura media, mínima y máxima 
en centímetros de personas de diferentes países. El array que contiene los nombres 
de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “USA”}. Los datos 
sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con 
números aleatorios generados al azar entre 140 y 210. Los decimales de la media se 
pueden despreciar. Los nombres de los países se deben mostrar utilizando el array 
de países (no se pueden escribir directamente).*/
/**
 *
 * @author cloer
 */
public class D09 {

    public static void main(String[] args) {

        //declaro las variables
        int maximo, minimo, suma, media;

        //declaro el array paises:
        String paises[] = {"España", "Rusia", "Japón", "USA"};

        //declaro e instancio la matriz
        int m1[][] = new int[4][10];

        //relleno la matriz
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = (int) (140 + Math.random() * 71);
            }
        }

        //compruebo el minimo,maximo y suma de cada fila
        for (int i = 0; i < m1.length; i++) {
            System.out.print(paises[i]+"\t");
            suma = 0;
            maximo = 140;
            minimo = 210;
            for (int j = 0; j < m1[i].length; j++) { 
                System.out.print(m1[i][j] + "\t");
                suma += m1[i][j];
                if (m1[i][j] < minimo) {
                    minimo = m1[i][j];
                } else {
                    if (m1[i][j] > maximo) {
                        maximo = m1[i][j];
                    }
                }
            }
            System.out.print(maximo+" ");
            System.out.print(minimo+" ");
            System.out.print((suma/m1[i].length)+" ");
            
            System.out.println("");//salto de línea
        }//for gordo
        
    }//main
}
