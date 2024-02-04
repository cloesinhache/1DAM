#CLOE ROMERO SALGUERO

#ENUNCIADO: Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos
#circunferencias y las clasifique en uno de estos estados:
#exteriores
#tangentes exteriores
#secantes
#tangentes interiores
#interiores
#concéntricas

import math
x1=(int(input("Introduzca la x del primer punto:")))
y1=(int(input("Introduzca la y del primer punto:")))
x2=(int(input("Introduzca la x del segundo punto:")))
y2=(int(input("Introduzca la y del segundo punto:")))
r1=(int(input("Introduzca el radio de la primera circunferencia:")))
r2=(int(input("Introduzca el radio de la segunda circunferencia:")))
distancia= math.sqrt(math.pow((x2-x1),2)+math.pow((y2-y1),2))

if (distancia == 0):
  print("concéntricas")
elif (distancia>(r1+r2)):
    print("exteriores")
elif((distancia>0) and distancia<math.abs(r1-r2)):
    print("interiores")
elif (distancia == (r1+r2)):
      print("tangentes exteriores")
elif (distancia == math.abs(r1-r2)):
    print("tangentes interiores")
elif (distancia<(r1+r2) and distancia>math.abs(r1-r2)):
    print("secantes")