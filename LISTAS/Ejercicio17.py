#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#Crear un programa que añada números a una lista hasta que introducimos un número negativo. A continuación debe crear una nueva lista igual que la anterior pero eliminando los 
#números duplicados. Muestra esta segunda lista para comprobar que hemos eliminados los duplicados.

lista_romero = []
lista2_romero = []

num = int(input("Introduzca numeros positivos. Introduzca un negativo para terminar:"))
while (num>=0):
    lista_romero.append(num)
    num = int(input("Introduzca numeros positivos. Introduzca un negativo para terminar:"))

# Recorro la lista y voy añadiendo en la segunda lista los que no están repetidos
for num in lista_romero:
    if num not in lista2_romero:
        lista2_romero.append(num)

print(lista2_romero)
