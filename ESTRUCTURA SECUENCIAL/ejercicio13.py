#CLOE ROMERO SALGUERO

#ENUNCIADO: Realizar un algoritmos que lea un número y que muestre su raíz cuadrada 
#y su raíz cúbica. Python3 no tiene ninguna función predefinida que permita calcular
#la raíz cúbica, ¿Cómo se puede calcular?

from math import sqrt

x=float(input("Introduzca un número"))
cuadrada=sqrt(x)
#Para calcular la cubica, convertimos la raiz en potencia. 
#Lo de dentro de la raiz es la base, el exponente es 1 partido por 3
cubica=x**(1/3)
print("Raiz cuadrada de",x, "es=" ,cuadrada)
print("Raiz cubica de" ,x, "es=",cubica)

