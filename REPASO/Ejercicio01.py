
#Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su cubo.

import random 

#declaro una lista vacia
lista=[]

#la relleno con numeros aleatorios entre el 1 y el 10
for i in range(1,10):
    lista.append(random.randint(1,10))

for numero in lista:
    print(numero,numero**2,numero**3)