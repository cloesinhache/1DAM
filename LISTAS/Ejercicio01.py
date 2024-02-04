#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada 
#elemento de la lista junto con su cuadrado y su cubo.

import random

#creamos una lista vacia y un for con rango del 1 al 11. 
lista_romero=[]
for i in range (1,11):
    #usamos append para añadir valores
    lista_romero.append(random.randint(1, 10))

for numero in lista_romero:
    print(numero,numero**2,numero**3)
                   