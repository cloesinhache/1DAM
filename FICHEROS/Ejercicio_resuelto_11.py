import json

#Creamos el diccionario donde almacenar todos los ingredientes
ingredientes={}

#Creamos la lista donde almacenaremos todos los datos de los ingredientes en forma de diccioanrio
datos_ingredientes=[]

#Abrirmos el fichero, cargamos la información en la variable diccionario y filtramos la información
try:
	with open("gazpacho.json") as fichero:
		diccionario=json.load(fichero)
		for ingrediente in diccionario['ingredientes']:
			datos_ingredientes.append(ingrediente)
		ingredientes['Ingredientes Gazpacho']=datos_ingredientes
except FileNotFoundError:
	print("El fichero no se ha abierto correctamente")

#Creamos el fichero apellido_ingredientes.json para almacenar la información
try:
	with open("apellido_ingredientes.json", 'w') as archivo_nuevo:
		json.dump(ingredientes, archivo_nuevo, indent=4)
except IOError:
	print("Problemas al crear el fichero")