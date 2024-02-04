#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la semana (seis días) 
#y requiere determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas.

#introducimos las horas trabajadas y cuanto se cobra por hora. 
tarifahora_romero=int(input("Introduzca la tarifa por hora:"))
intentos_romero=0
totalhoras_romero=0

#creo un bucle while para que introduzca las horas trabajadas por dia 6 veces
while(intentos_romero<6):
    horasdiarias_romero=int(input("Introduzca el numero de horas trabajadas en el dia:"))
    intentos_romero=intentos_romero+1
    totalhoras_romero=totalhoras_romero+horasdiarias_romero
#ya fuera del bucle, multiplico el total de horas por la tarifa para averiguar el sueldo. 

sueldo_romero=totalhoras_romero*tarifahora_romero

print("El total de horas trabajadas asciende a",totalhoras_romero)
print("El sueldo del empleado es",sueldo_romero)