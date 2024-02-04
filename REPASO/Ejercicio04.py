#Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un número negativo

lista=[]

while True:
    numero=int(input("Introduzca un numero:"))
    if numero>=0:
        lista.append(numero)
    else:
        break

print(lista)