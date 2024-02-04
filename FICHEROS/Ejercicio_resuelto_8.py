import json


#Abrirmos el fichero, cargamos la información en la variable diccionario e imprimimos los datos solicitados
try:
	with open("colores.json") as fichero:
		diccionario=json.load(fichero)
		for color in diccionario['colors']:
			print(color['color'],color['code'])
except FileNotFoundError:
	print("Problemas al abrir el fichero")