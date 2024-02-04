#CLOE ROMERO SALGUERO

#ENUNCIADO:Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados
#por una #distancia d. El que está detrás viaja a una velocidad mayor. 
#Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) 
#y sus respectivas velocidades (km/h) y con esto determinar y mostrar en que 
#tiempo (minutos) alcanzará el vehículo más rápido al otro.

v1=int(input("Introduzca la velocidad del primer coche (km/h)"))
v2=int(input("Introduzca la velocidad del segundo coche (km/h)"))
distancia=float(input("Introduzca la distancia entre los coches en km"))
if v2>v1:
#Distancia entre velocidades porque km/h
#Lo multiplicamos por 60 para que nos de los minutos. 
    tiempo=distancia/(v2-v1)*60
    print("Tardará", tiempo, "minutos en alcanzarlo")
else:
    print("El segundo vehiculo debe ir a mayor velocidad que el primero")