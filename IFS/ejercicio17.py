#CLOE ROMERO SALGUERO

#ENUNCIADO:Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis 
#caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
#Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
#Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número 
#incorrecto.”

resultado=int(input("Introduzca el resultado del lanzamiento del dado (1 al 6):"))

if (resultado==1):
    print("La cara opuesta es seis")
elif (resultado==2):
    print("La cara opuesta es cinco")
elif (resultado==3):
    print("La cara opuesta es cuatro")
elif (resultado==4):
    print("La cara opuesta es tres")
elif (resultado==5):
    print("La cara opuesta es dos")
elif (resultado==6):
    print("La cara opuesta es uno")
else:
    print("ERROR:número incorrecto. El resultado del dado debe estar entre 1 y 6.")
