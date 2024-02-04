#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Diseñar el algoritmo correspondiente a un programa, que:
#Crea una matriz_romero (lista con dos dimensiones) de 5x5 enteros.
#Carga la matriz_romero con valores numéricos enteros.
#Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla.

import random

matriz_romero = []
for i in range(1,6):
	fila = []
	for j in range(1,6):
		matriz_romero.append(random.randint(1,10))
	matriz_romero.append(fila)

#suma de las filas
i = 1
for fila in matriz_romero:
	print("La suma de los elemento de la fila es :" , sum(fila))
	i += 1

#suma de las columnas
for j in range(1,6):
	suma = 0
	for fila in matriz_romero:
		suma = suma + fila[j - 1]
	print("La suma de los elemento de la columna es ",suma)
