#CLOE ROMERO SALGUERO

#ENUNCIADO:Crea un programa que pida al usuario dos números y muestre su división si el segundo no es 
#cero, o un mensaje de aviso en caso contrario.

x=int(input("Introduzca un número:"))
y=int(input("Introduzca un número:"))

if (y==0):
    print("No se puede dividir por 0")
else:
    division=(x/y)
    print("La división es", division)