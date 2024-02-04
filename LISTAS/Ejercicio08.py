#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un programa que introduzca el nombre y la edad de cada alumno. 
#El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos:
#Todos lo alumnos mayores de edad.
#Los alumnos mayores (los que tienen más edad)

#creo las listas vacias
nombres_romero=[]
edades_romero=[]

#creo un bucle que las rellena hasta que se introduzca un asterisco
while True:	
	nom_romero = str(input("Introduzca el nombre del alumno:"))
	if (nom_romero == "*"):
		break
	else:
		nombres_romero.append(nom_romero)
		edades_romero.append(int(input("Introduzca la edad edad:")))	


#mayores de edad
print("Los alumnos mayores de edad son:")
for nombre,edad in zip(nombres_romero,edades_romero):
	if edad >= 18:
		print(nombre)
	
#edad máxima
maxima_romero = max(edades_romero)
print("Los alumnos con la edad maxima son:")
for nombre,edad in zip(nombres_romero,edades_romero):
	if edad == maxima_romero:
		print(nombre)
