#CLOE ROMERO SALGUERO

#ENUNCIADO: Dados los catetos de un triángulo rectángulo, calcular su hipotenusa

from math import sqrt

cateto1=(float(input("Introduzca la medida del primer cateto")))
cateto2=(float(input("Introduzca la medida del segundo cateto")))
hipotenusa=sqrt(cateto1**2 + cateto2**2)
print("La hipotenusa es",hipotenusa)