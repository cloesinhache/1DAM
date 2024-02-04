#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 19/11/2023---------------------------

#ENUNCIADO:Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.

#introducimos la cadena y la subcadena por teclado
cadena_romero=str(input("Introduce una cadena:"))
subcadena_romero=str(input("Introduce la subcadena por la que tiene que emmpezar:"))

#hacemos un if usando la funcion startswith
if cadena_romero.startswith(subcadena_romero):
    print("La cadena comienza con la subcadena",subcadena_romero)
else:
    print("La cadena no empieza con la subcadena",subcadena_romero)
