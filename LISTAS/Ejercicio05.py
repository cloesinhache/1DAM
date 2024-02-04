#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y posterior ordene los elementos de menor a mayor.

import random

#creamoks lista vacia
lista_romero = []

#la rellenamos
for indice in range(1,11):
	lista_romero.append(random.randint(1,10))
	
#ordeno la lista
lista_romero.sort()

print(lista_romero)