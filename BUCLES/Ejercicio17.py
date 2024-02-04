#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. Para esto, se registran los días 
#que trabajó y las horas de cada día. Realice un algoritmo para determinar el sueldo semanal de N trabajadores y además calcule 
#cuánto pagó la empresa por los N empleados.

#es igual que el anterior, solo que añadimos las horas diarias y las multiplicamos por los dias trabajados

trabajadores_romero=int(input("Introduzca el numero de trabajadores:"))
tarifahora_romero=int(input("Introduzca la tarifa por hora:"))

#inicio la variable para el coste a la empresa
coste_romero=0

#hago un bucle para introducir las horas diarias,dias trabajados y calcular horas 
#semanales y el sueldo por trabajador
for i in range (1,trabajadores_romero+1):
    horas_romero=int(input("Introduzca las horas trabajadas diariamente del trabajador:"))
    dias_romero=int(input("¿Cuantos dias trabajó?:"))
    semanal_romero=horas_romero*dias_romero
    sueldo_romero=semanal_romero*tarifahora_romero
    print("El sueldo es de",sueldo_romero)
    coste_romero=coste_romero+sueldo_romero

print("A la empresa le cuesta",coste_romero)