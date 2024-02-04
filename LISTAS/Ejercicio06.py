#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCADO:Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. 
#Debes usar listas. Para simplificarlo vamos a suponer que febrero tiene 28 días.

#creo lista de dias
dias_romero = [31,28,31,30,31,30,31,31,30,31,30,31]

#compruebo que se introduce bien el mes
repetir=True
while repetir:
	mes_romero = int(input("Introduce un mes en formato numero:"))
	if (mes_romero < 1 or mes_romero > 12):
		print("Error: mes incorrecto.")
	if (mes_romero>=1 and mes_romero<=12):
		repetir=False

print("El mes",mes_romero,"tiene",dias_romero[mes_romero-1],"días.")
