#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.

#leo los limites
num1_romero=int(input("Introduzca desde que numero quiere empezar:"))
num2_romero=int(input("Introduzca hasta que numero quiere llegar:"))

#hago un bucle for para que recorra el rango entre esos dos numeros
#al numero final le sumo 1 para que lo incluya en la serie al imprimirla, sino no lo cuenta
for i in range(num1_romero,num2_romero+1):
    print(i)
