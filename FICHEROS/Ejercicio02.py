#                                           CLOE ROMERO SALGUERO
#                                         ENTORNOS DE DESARROLLO
#                                                18/12/2023

#ENUNCIADO: Escribir una función que pida un número entero entre 1 y 10, lea el fichero primerapellido-n.txt 
#           con la tabla de multiplicar de ese número, done n es el número introducido, y la muestre por pantalla. 
#           Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.

#pedimos el numero al usuario
numero_romero = int(input("Introduzca un número del 1 y 10: "))

#creamos el fichero
fichero_romero = str("romero-"+ str(numero_romero)+".txt")

#lo mostramos si existe, si no mensaje de error
f = open(fichero_romero, "r")

if(FileNotFoundError):
    print("Fichero no encontrado")
else:
    print(f.read())
    f.close()