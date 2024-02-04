#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 19/11/2023---------------------------

#ENUNCIADO:Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayúsculas.

#introducimos nombre y apellidos
nombre_romero =str(input("Introduce un nombre y los apellidos:"))

#si lo que queremos es la misma cadena, pero que  nombre y apellidos empiecen por mayusculas, usamos title
print(nombre_romero.title())

#si lo que queremos es obtener las iniciales y escribirlas en mayusculas:
#dividimos la cadena en plaabras con split
palabras_romero= nombre_romero.split()

#usamos join para unirlo todo y con upper ponemos en mayuscula el elemento 0 de cada palabra
print(''.join([palabra[0].upper() for palabra in palabras_romero]))