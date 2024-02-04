#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 4/12/2023---------------------------

#ENUNCIADO:Escribe un programa que lea una cadena y devuelva un diccionario con la cantidad de apariciones de cada carácter en la cadena.

#creo un diccionario vacio
dict1_romero = {}

#leo la cadena
cadena_romero = str(input("Introduzca una cadena:"))

#hago un for para ver cuantas veces aparece cada letra o espacio
for caracter in cadena_romero:
	if caracter in dict1_romero:
		dict1_romero[caracter]+=1	

#imprimo las claves y los valores
for clave,valor in dict1_romero.items():
	print (clave,"->",valor)


