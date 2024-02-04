#CLOE ROMERO SALGUERO

#ENUNCIADO: Realiza un programa que reciba una cantidad de minutos y muestre por 
#pantalla a cuantas horas y minutos corresponde.

minutos=int(input("Dame una cantidad de minutos"))
horas=int(minutos//60)
minutos2=horas%60
print(minutos,"minutos son",horas, "horas y " , minutos2 ,"minutos")