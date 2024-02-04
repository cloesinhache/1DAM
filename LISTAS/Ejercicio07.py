#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUCIADO:Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, pida valores para ‘lista1’ y 
#‘lista2’ y calcule lista3=lista1+lista2.

#creo listas vacias
lista1_romero = []
lista2_romero = []
lista3_romero = []

#las relleno
for indice in range(0,5):
	lista1_romero.append(int(input("Introduce los elementos de la lista 1:")))
for indice in range(0,5):
	lista2_romero.append(int(input("Introduce los elementos de la lista 2:")))

for indice in range(0,5):
	lista3_romero.append(lista1_romero[indice] + lista2_romero[indice])

print(lista3_romero)
