#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 4/12/2023---------------------------

#ENUNCIADO:Escribe un programa python que pida un número por teclado y que cree un diccionario cuyas claves sean desde el número 1 hasta el número indicado, 
#y los valores sean los cuadrados de las claves.

#creo un diccionario vacio
dict1_romero= {}

#le pido un numero al usuario
numero_romero=int(input("Introduzca un numero:"))

#relleno el diccionario con las claves y los valores
for clave in range (1,numero_romero+1):
    dict1_romero[clave] = clave ** 2

#el metodo items me devuelve el conjunto clave valor. 
for clave, valor in dict1_romero.items():
    print(clave,"->" ,valor)
