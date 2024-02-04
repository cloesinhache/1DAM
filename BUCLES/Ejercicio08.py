#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------
#ENUNCIADO:Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
#A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
#La suma de los números que están dentro del intervalo (intervalo abierto).
#Cuantos números están fuera del intervalo.
#He informa si hemos introducido algún número igual a los límites del intervalo.

#incio la variables para que no den problemas
num3_romero=1
suma_romero=0
fuera_romero=0
igual_romero=0

#empiezo introduciendo los limites
num1_romero=int(input("Introduzca desde que numero quiere empezar:"))
num2_romero=int(input("Introduzca hasta que numero quiere llegar:"))
if (num1_romero>=num2_romero):
    num1_romero=int(input("Error. Vuelva a introducir el limite inferior:"))

while (num3_romero!=0):
        num3_romero=int(input("Introduzca un numero. Escriba 0 para terminar:"))
        suma_romero=suma_romero+num3_romero
        if ((num3_romero<num1_romero or num3_romero>num2_romero)and num3_romero!=0):
            fuera_romero=fuera_romero+1
        elif (num3_romero==num1_romero or num3_romero==num2_romero):
            igual_romero=igual_romero+1

print("La suma de todos los numeros introducidos es",suma_romero)
print("Ha introducido",fuera_romero,"numeros fuera del itervalo")
print("Ha introducido",igual_romero,"iguales a los limites")


