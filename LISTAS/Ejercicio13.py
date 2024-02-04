#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y los kilómetros que conducen cada día de la semana.
#Para guardar esta información se van a utilizar dos arreglos:
#nombre: Lista para guardar los nombre de los conductores.
#km: Tabla para guardar los kilómetros que realizan cada día de la semana.
#Se quiere generar una nueva lista (“total_kms”) con los kilómetros totales que realza cada conductor.

#Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha realizado.

dias_romero =["Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"]
nombre_romero = []
km_romero = []

#leo el número de conductores
while True:
	conductores_romero = int(input("¿Cuántos conductores tiene la empresa?:"))
	if conductores_romero>0: 
		break

#recorro hasta el número de conductores
for i in range(0,conductores_romero):
	nombre_romero.append(input("Introduzca el nombre del conductor",i+1,":"))
	#leo los km por día
	km_dias_romero = []
	for j in range(0,7):
		km_dias_romero.append(int(input("¿Cuántos km ha realizado el dia",j,"?:")))
	km_romero.append(km_dias_romero)
# Recorro las listas para calcular el total de kilómetros
totalkm_romero = []
for km in km_romero:
	totalkm_romero.append(sum(km))
# Recorro las listas para mostrar la información de salida
for nombre_romero, km in zip(nombre_romero, totalkm_romero):
	print(nombre_romero,"ha realizado",km_romero)
