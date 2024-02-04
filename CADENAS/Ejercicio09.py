#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 19/11/2023---------------------------

#ENUNCIADO:Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.

#introducimos cadena principal y subcadena
cadena_romero=str(input("Introduzca una cadena:"))
subcadena_romero=str(input("Introduzca una subcadena:"))

#comprobamos si la cadena contiene la subcadena con un if
if subcadena_romero in cadena_romero:
    print("La cadena",cadena_romero,"contiene", subcadena_romero)
else:
    print("La cadena",cadena_romero,"no  contiene", subcadena_romero)
