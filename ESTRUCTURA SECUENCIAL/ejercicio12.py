#CLOE ROMERO SALGUERO

#ENUNCIADO:Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el 
#plano. Calcula y muestra la distancia entre ellos.

from math import fabs
x1=float(input("Introduzca la coordenada x del primer punto"))
y1=float(input("Introduzca la coordenada y del primer punto"))
x2=float(input("Introduzca la coordenada x del segundo punto"))
y2=float(input("Introduzca la coordenada y del segundo punto"))
distanciax=fabs(x1-x2)
distanciay=fabs(y1-y2)
print("La distancia entre los puntos x es", distanciax, "y la distancia entre los puntos y es", distanciay)