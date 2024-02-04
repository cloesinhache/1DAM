#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Mostrar en pantalla los N primeros números primos. Se pide por teclado la cantidad de números primos que queremos mostrar.

import math

cantidad_romero= int(input("Ingrese la cantidad de números primos que desea mostrar: "))
primo_romero=2 
#dos es el primer primo

while (cantidad_romero>0):
    es_primo=True
    #tengo que crear una variable limite porque el for no soporta float en sus condiciones
    limite_romero=int(math.sqrt(primo_romero)+1)

    for i in range(2,limite_romero):
        if (primo_romero%i==0):
            es_primo=False
            break
    
    #si es primo lo imprimimos y reducimos el contador de números primos
    if es_primo:
        print(primo_romero)
        cantidad_romero=cantidad_romero-1
    primo_romero=primo_romero+1
