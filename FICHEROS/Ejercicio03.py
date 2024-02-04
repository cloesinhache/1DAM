#                                           CLOE ROMERO SALGUERO
#                                         ENTORNOS DE DESARROLLO
#                                                18/12/2023

#ENUNCIADO:Escribir una función que pida dos números n y m entre 1 y 10, lea el fichero primerapellido-n.txt 
#           con la tabla de multiplicar de ese número, y muestre por pantalla la línea m del fichero. Si el fichero 
#           no existe debe mostrar un mensaje por pantalla informando de ello.

#pedimos ambos numeros
numero_romero=int(input("Introduce un número entero entre 1 y 10: "))
m_romero=int(input("Introduzca el numero de línea: "))

#creamos el fichero convirtiendo todo el nombre a cadena
fichero_romero = str("romero-"+ str(numero_romero)+".txt")

f=open(fichero_romero, "r")
linea_romero = f.readlines()
print(linea_romero[m_romero - 1])

