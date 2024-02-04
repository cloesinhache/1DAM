#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. Realice un algoritmo para determinar 
#el sueldo semanal de N trabajadores y, además, calcule cuánto pagó la empresa por los N empleados.

#queremos sueldo semanal de todos y cuanto pago la empresa por todos
#necesiteremos pedir las variables numero de trabajadores y tarifa por hora
trabajadores_romero=int(input("Introduzca el numero de trabajadores:"))
tarifahora_romero=int(input("Introduzca la tarifa por hora:"))

#inicio la variable del coste a la empresa
coste_romero=0

#hago un bucle para introducir las horas semanales y calcular el sueldo por trabajador
for i in range (1,trabajadores_romero+1):
    horas_romero=int(input("introduzca las horas trabajadas semanalmente del trabajador:"))
    sueldo_romero=horas_romero*tarifahora_romero
    print("El sueldo es de",sueldo_romero)
    coste_romero=coste_romero+sueldo_romero

print("A la empresa le cuesta",coste_romero)