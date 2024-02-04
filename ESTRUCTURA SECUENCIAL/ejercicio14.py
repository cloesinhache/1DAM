#CLOE ROMERO SALGUERO

#ENUNCIADO: Dado un número de dos cifras, diseñe un algoritmo que permita obtener el 
#número invertido. Ejemplo, si se introduce 23 que muestre 32.

x=int(input("Introduzca un numero de dos cifras"))
if 10<=x <=99:
    unidades =x%10
    decenas =x//10
    invertido = unidades * 10 + decenas

    print("El número invertido de",x, "es" ,invertido)
else:
    print("El número no es de dos cifras.")