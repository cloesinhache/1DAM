#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina 
#cuando se introduce un espacio.

cadena_romero=str(input("Introduzca un caracter:"))
while (cadena_romero!=" "):
    #empiezo por las vocales porque solo hay 5
    #.lower buscado en internet
    if cadena_romero.lower() in ['a', 'e', 'i', 'o', 'u']:
        print("VOCAL")
    else:
        print("NO VOCAL")

    cadena_romero=str(input("Introduzca un caracter. Espacio para terminar:"))
