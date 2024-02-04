#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#Diseñar el algoritmo correspondiente a un programa, que:
#Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco_romero’.
#Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras que el resto de los elementos contendrán el valor 0.
#Visualiza el contenido de la matriz en pantalla.


marco_romero = []
filas_romero = 5
columnas_romero = 15

for i in range(0,filas_romero):
	fila = []
	for j in range(0,columnas_romero): 
		# Si estoy en el extremo izquierdo, derecho, superior o inferior
		if i == 0 or i == filas_romero - 1 or j == 0 or j == columnas_romero -1:
			fila.append(1)
		else:
			fila.append(0)
	marco_romero.append(fila)
	
# Recorro para mostrar tabla
for fila in marco_romero:
	for elemento in fila:
		print(elemento," ",end="")
	print()

