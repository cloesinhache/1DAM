#CLOE ROMERO SALGUERO

#ENUNCIADO: Pide al usuario dos números y muestra la “distancia” entre ellos 
#(el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

from math import fabs
x=float(input("Introduzca un número "))
y=float(input("Introduzca un número "))
distancia=fabs(x-y)
print("La distancia es ", distancia)
