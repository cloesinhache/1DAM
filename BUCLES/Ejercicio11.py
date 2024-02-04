#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que sólo es 
#divisible entre él mismo y la unidad. Nota: Es suficiente probar hasta la raíz cuadrada del número para ver si es divisible por 
#algún otro número.
import math 

num_romero=int(input("Introduzca un numero para saber si es primo:"))
primo_romero=False

if (num_romero==1):
    print("Es un caso especial")

#tengo que crear una variable limite porque el for no soporta float en sus condiciones
limite_romero=int(math.sqrt(num_romero)+1)
#empiezo en 2 porque en 1 ya sabemos que se puede dividir
for i in range (2,limite_romero):
    if (num_romero%i!=0):
       primo_romero=True
       
if (primo_romero):  
    print("Es primo")
else:
    print("No es primo")