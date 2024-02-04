import json

#Abrirmos el fichero, cargamos la información en la variable diccionario y comparamos precios
try:
	with open("libreria.json") as fichero:
		diccionario=json.load(fichero)
except FileNotFoundError:
	print("Error al abrir el fichero")
	
print("El número total de libros es", len(diccionario["bookstore"]["book"]))