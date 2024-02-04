#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------
#ENUNCIADO:Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado 
#de la potencia. No se puede utilizar el operador de potencia.

#creo e inicializo una variable para la potencia
potencia_romero=1

#leo la base y el exponente
base_romero=int(input("Introduzca la base de la potencia:"))
exp_romero=int(input("Introduzca el exponente:"))

#hay 3 posibles casos:
if (exp_romero<0):
    print("El exponente debe ser positivo")
elif (exp_romero==0):
    print("La potencia es 1")
else:
    for i in range (exp_romero):
        potencia_romero=potencia_romero*base_romero
        exp_romero=exp_romero-1
    print("La potencia es",potencia_romero)





