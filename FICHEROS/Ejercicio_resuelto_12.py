import json

#Creamos el diccionario donde almacenar todos las películas
peliculas={}

#Creamos la lista donde almacenaremos todos los datos de las películas en forma de diccionario
datos_peliculas=[]

#Abrirmos el fichero, cargamos la información en la variable lista y filtramos
try:
	with open("movies.json",encoding='utf-8') as fichero:
		lista=json.load(fichero)
		for pelicula in lista:
			if (pelicula['year']=='1994'):
				datos_peliculas.append(pelicula['title'])
		peliculas['Peliculas 994']=datos_peliculas
except FileNotFoundError:
	print("El fichero no se ha abierto correctamente")

#Creamos el fichero apellidos_peliculas1994.json para almacenar la información
try:
	with open("apellidos_peliculas1994.json", 'w', encoding='utf-8') as archivo_nuevo:
		json.dump(peliculas, archivo_nuevo, indent=4)
except IOError:
	print("Problemas al crear el fichero")