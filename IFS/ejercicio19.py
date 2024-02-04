#CLOE ROMERO SALGUERO

#ENUNCIADO:Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
#mes correspondiente.

mes=int(input("Introduzca un número entero entre 1 y 12:"))

if (mes>=1 and mes>=12):
    diasmes=[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    dias=diasmes[mes-1]
    
    # Mostrar el resultado
    print(f"El mes {mes} tiene {numero_de_días} días.")
else:
    print("ERROR: Número fuera de rango. Debe ingresar un número del 1 al 12 para representar un mes.")