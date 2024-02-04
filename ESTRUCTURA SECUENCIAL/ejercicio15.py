#CLOE ROMERO SALGUERO

#ENUNCIADO: Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide 
#realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen
#al final las dos variables.

A=int(input("Introduzca el valor de A"))
B=int(input("Introduzca el valor de B"))
#Creamos A1 para almacenar el valor de la primera A que hemos introducido
A1=A
A=B
B=A1
print("Las variables invertidas son A=",A,"y B=", B)


