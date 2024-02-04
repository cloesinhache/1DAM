#CLOE ROMERO SALGUERO

#ENUNCIADO:Escribir un algoritmo para calcular la nota final de un estudiante, 
#considerando que: por cada respuesta correcta 5 puntos, por una incorrecta -1 y 
#por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.

correcta=int(input("Introduzca el numero de respuestas correctas"))
incorrecta=int(input("Introduzca el numero de preguntas incorrectas"))
blanco=int(input("Introduzca el numero de respuestas en blanco"))
nota=correcta*5+incorrecta*(-1)+blanco
print("La nota obtenida es", nota)
