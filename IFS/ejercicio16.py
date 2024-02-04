#CLOE ROMERO SALGUERO

#ENUNCIADO:La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el 
#tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos,
#los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos.
#Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de 
#tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una 
#llamada.

duracion=int(input("Introduzca la duracion de la llamada:"))
dia=str(input("Introduzca el dia de la semana:"))
turno=int(input("Introduzca el turno (1-mañana o 2-tarde):"))
coste=0

if (duracion<=5):
    coste=1
elif (duracion<=8):
    coste=1+0.8*(duracion-5)
elif (duracion<=10):
    coste=1+0.8*3+0.7*(duracion-8)
else:
    coste=1+0.8*3+0.7*2+0.5*(duracion-10)

impuesto=0
if (dia=="domingo"):
    impuesto = 0.03
elif (turno==1):
    impuesto = 0.15
else:
    impuesto = 0.10

total=coste+(coste*impuesto)

print("El coste de la llamada es",coste,"euros")
print("El impuesto aplicado es ", impuesto*100, "%")
print("El coste total de la llamada es ",total," euros")
