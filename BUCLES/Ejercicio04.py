#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
#El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

#Necesito una variable para indicar cuantos numeros quiero introducir
cantidad_romero=int(input("Introduzca cuantos numeros quiere introducir:"))
#contador para acumular los numeros introducidos
contador_romero=0
#contadores para saber cuantos numeros son mayores,menores o iguales a 0
mayor0_romero=0
menor0_romero=0
igual0_romero=0

while (contador_romero<cantidad_romero):
    x_romero=int(input("Introduzca un numero:"))

    #acumulo 1 en mayores,menores,iguales y el contador de los numeros
    if(x_romero>0):
        mayor0_romero=mayor0_romero+1
        contador_romero=contador_romero+1
    elif(x_romero<0):
        menor0_romero=menor0_romero+1
        contador_romero=contador_romero+1
    elif (x_romero==0):
        igual0_romero=igual0_romero+1
        contador_romero=contador_romero+1

print("Hay",mayor0_romero, "numeros mayores que 0")
print("Hay",menor0_romero, "numeros menores que 0")
print("Hay",igual0_romero, "numeros iguales que 0")

