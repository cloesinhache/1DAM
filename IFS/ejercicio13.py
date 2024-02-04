#CLOE ROMERO SALGUERO

#ENUNCIADO:Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta.

dia=int(input("Introduzca el dia:"))
mes=int(input("Introduzca el mes (en numeros):"))
año=int(input("Introduzca el año:"))

if (dia<1 or mes<1):
    print("Ha introducido una fecha errónea")
elif (año<0):
    print("Ha introducido una fecha errónea")
elif (dia>31 and (mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12)):
    print("Ha introducido una fecha errónea")
elif (dia>30 and (mes==4 or mes==6 or mes==9 or mes==11)):
    print("Ha introducido una fecha errónea")
elif (mes==2 and dia>28):
    print("Ha introducido una fecha errónea")
elif (año%4==0 and año%100!=0) and (dia>29 and mes==2):
    print("La fecha es incorrecta")
elif (año%400==0) and (dia>29 and mes==2):
    print("La fecha es incorrecta")
else:
    print("La fecha es correcta")