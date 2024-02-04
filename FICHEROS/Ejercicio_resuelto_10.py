import json

#Creamos el diccionario donde almacenar todos los clientes
clientes={}

#Creamos la lista donde almacenaremos todos los datos de los clientes en forma de diccioanrio
datos_clientes=[]

#Abrirmos el fichero, cargamos la información en la variable diccionario y filtramos
try:
	with open("pedidos.json") as fichero:
		diccionario=json.load(fichero)
		for pedido in diccionario['ordenes']:
			datos_clientes.append(pedido['cliente'])
		clientes['Clientes']=datos_clientes
except FileNotFoundError:
	print("Error al abrir el fichero")
#Creamos el fichero apellido_clientes.json para almacenar la información
try:
	with open("apellido_clientes.json", 'w') as archivo_nuevo:
		json.dump(clientes, archivo_nuevo, indent=4)
except IOError:
	print("No se ha podido crear el fichero")