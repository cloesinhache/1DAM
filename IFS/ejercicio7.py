#CLOE ROMERO SALGUERO

#ENUNCIADO: Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. 
#Pueden ocurrir tres cosas:
#El exponente sea positivo, sólo tienes que imprimir la potencia.
#El exponente sea 0, el resultado es 1.
#El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

base=float(input("Introduzca la base de la potencia:"))
exp=float(input("Introduzca el exponente de la potencia:"))

if(exp>0):
    print("La potencia es", (base**exp))
elif (exp==0):
    print("La potencia es 1")
elif (exp<0):
    print("La potencia es ", 1/(base**abs(exp)))