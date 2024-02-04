#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#Diseñar el algoritmo correspondiente a un programa, que:

#Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
#Carga la tabla de forma que los componentes pertenecientes a la diagonal de la matriz_romero tomen el valor 1 y el resto el valor 0.
#Muestra el contenido de la tabla en pantalla.

#creo una matriz vacia
matriz_romero = []

for i in range(0,5):
	fila = []
	for j in range(0,5): 
		#en diagonal inicializo a 1
		if i == j or i == 4 - j:
			fila.append(1)
		#si no diagonal inicializo a 0
		else:
			fila.append(0)
	matriz_romero.append(fila)


for fila in matriz_romero:
	for elemento in fila:
		print(elemento," ",end="")
	print()
	
