#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Realizar un algoritmo para determinar cuánto ahorrará una persona en un año, si al final de cada mes deposita cantidades 
#variables de dinero; además, se quiere saber cuánto lleva ahorrado cada mes.

#creo e inicio las variables
ahorro_romero=0

#creo un bucle for para que introduzca la cantidad depositada
for i in range (1,13):#13 porque le sumo 1 al limite siempre
    dinero_romero=int(input("Introduzca el dinero ahorrado en el mes:"))
    ahorro_romero=ahorro_romero+dinero_romero
    print("lleva acumulado",ahorro_romero)

print("Ha ahorrado en total", ahorro_romero)
