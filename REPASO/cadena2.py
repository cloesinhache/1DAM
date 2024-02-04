#Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.
import string

cadena=str(input("Introduzca una cadena: "))
subcadena=str(input("Introduzca la subcadena: "))

if (cadena.startswith(subcadena)):
    print("Si comienza")
else:
    print("No comienza")