#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 19/11/2023---------------------------

#ENUNCIADO:Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.
#hacemos lo mismo que en el ejercicio 6, pero creando una variable para compararlos

#introducimos una cadena
cadena_romero=str(input("Introduzca una cadena:"))

#la invertimos usando slicing
invertida_romero=cadena_romero[::-1]

#comprobamos si la cadena es un palíndromo con un if
if (cadena_romero==invertida_romero):
    print(cadena_romero, "es un palíndromo.")
else:
     print(cadena_romero, "no es un palíndromo.")
