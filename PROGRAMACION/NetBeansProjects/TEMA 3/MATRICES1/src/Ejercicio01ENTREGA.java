/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*ENUNCIADO:Se desean guardar y representar las notas de 5 alumnos en 4 asignaturas 
(números aleatorios con decimales entre 0 y 10) en una matriz. Además, tanto para 
cada asignatura como para cada alumno, se precisa obtener y almacenar la nota 
máxima, mínima y la media aritmética.*/

/**
 *
 * @author Cloe Romero
 */
public class Ejercicio01ENTREGA {

    public static void main(String[] args) {

        //declaro las variables
        final int ALUMNOS = 5, ASIGNATURAS = 4;
        final int FILAS = ALUMNOS + 3, COLUMNAS = ASIGNATURAS + 3;
        double max, min, suma;

        //declaro e instancio la matriz
        double m1[][] = new double[FILAS][COLUMNAS];

        //relleno la matriz con math.random
        for (int i = 0; i < ALUMNOS; i++) {
            for (int j = 0; j < ASIGNATURAS; j++) {
                m1[i][j] = Math.random() * 10;
            }
        }

        //calculo el max, min y media de cada fila y columna
        for (int i = 0; i < ALUMNOS; i++) {
            max = 0.0;
            min = 10.0;
            suma = 0.0;
            for (int j = 0; j < ASIGNATURAS; j++) {
                suma += m1[i][j];
                if (m1[i][j] > max) {
                    m1[i][COLUMNAS - 3] = m1[i][j];
                    max = m1[i][j];
                }
                if (m1[i][j] < min) {
                    m1[i][COLUMNAS - 2] = m1[i][j];
                    min = m1[i][j];
                }
            }
            m1[i][COLUMNAS - 1] = suma / ASIGNATURAS;
        }

        for (int j = 0; j < ASIGNATURAS; j++) {
            max = 0.0;
            min = 10.0;
            suma = 0.0;
            for (int i = 0; i < ALUMNOS; i++) {
                suma += m1[i][j];
                if (m1[i][j] > max) {
                    m1[FILAS - 3][j] = m1[i][j];
                    max = m1[i][j];
                }
                if (m1[i][j] < min) {
                    m1[FILAS - 2][j] = m1[i][j];
                    min = m1[i][j];
                }
            }
            m1[FILAS - 1][j] = suma / ALUMNOS;
        }

        //imprimo los resultados
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.printf("%.2f\t", m1[i][j]);
            }
            System.out.println();
        }
    }
}
