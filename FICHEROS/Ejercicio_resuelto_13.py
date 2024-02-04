import json

#Creamos el diccionario donde almacenar todos las películas
peliculas={}

#Creamos la lista donde almacenaremos todos los datos de las películas en forma de diccionario
datos_peliculas=[]

#Abrimos el fichero, cargamos la información en la variable lista y filtramos
try:
	with open("movies.json",encoding='utf-8') as fichero:
		lista=json.load(fichero)
		for pelicula in lista:
			if 'Adventure' in pelicula.get("genres"):
				datos_peliculas.append(pelicula['title'])
		peliculas['Peliculas de aventuras']=datos_peliculas
except FileNotFoundError:
	print("Error al abrir el fichero")
			
#Creamos el fichero apellidos_peliculas1994.json para almacenar la información
try:
	with open("apellidos_peliculasaventuras.json", 'w', encoding='utf-8') as archivo_nuevo:
		json.dump(peliculas, archivo_nuevo, indent=4)
except IOError:
	print("Error al crear el fichero")