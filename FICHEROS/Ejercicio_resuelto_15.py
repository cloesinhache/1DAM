import json

#Solicitamos el precio máximo y mínimo
precio_max=float(input("Precio máximo:"))
precio_min=float(input("Precio mínimo:"))

#Declaramos una lista donde almacenar los libros solicitados
libros=[]

#Abrirmos el fichero, cargamos la información en la variable diccionario y comparamos precios
try:
	with open("libreria.json") as fichero:
		diccionario=json.load(fichero)
		for libro in diccionario["bookstore"]["book"]:
			precio=float(libro["price"])
			if precio<=precio_max and precio>=precio_min:
				libros.append(libro["title"]["__text"])
except FileNotFoundError:
	print("Error al abrir el fichero")
print(libros)