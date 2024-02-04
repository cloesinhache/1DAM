#Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, pida valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.

lista1=[]
lista2=[]
lista3=[]

for i in range (0,5):
    numero=int(input("Introduzca un numero para la lista 1:"))
    lista1.append(numero)

for i in range (0,5):
    numero=int(input("Introduzca un numero para la lista 2:"))
    lista2.append(numero)

print(lista1)
print(lista2)

for i in range(0,5):
    lista3.append(lista1[i]+lista2[i])

print(lista3)
