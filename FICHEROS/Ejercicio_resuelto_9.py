import json

#Abrirmos el fichero, cargamos la información en la variable diccionario e imprimimos los datos solicitados
with open("pedidos.json") as fichero:
	diccionario=json.load(fichero)
	for pedido in diccionario['ordenes']:
		if not(pedido['delivery']):
			print(pedido)