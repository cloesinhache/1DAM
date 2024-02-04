#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Crea una lista e inicialízala con 5 cadenas de caracteres leídas por teclado. Copia los elementos de la lista en otra lista 
#pero en orden inverso, y muestra sus elementos por la pantalla.

#creamos una lista vacia
lista_romero=[]
copia_romero=[]

#vamos pidiendo valores
for i in range (1,6):
    valor_romero=int(input("Introduzca los valores de la lista:"))
    lista_romero.append(valor_romero)

#copio la lista en otra
copia_romero = lista_romero[:]
#le doy la vuelta
copia_romero.reverse()

print(copia_romero)


