#CLOE ROMERO SALGUERO

#ENUNCIADO: Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después 
#de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).

mon2=int(input("Introduzca cuantas monedas de 2 euros tiene"))
mon1=int(input("Introduzca cuantas monedas de 1 euro tiene"))
mon50=int(input("Introduzca cuantas monedas de 50 cent tiene"))
mon20=int(input("Introduzca cuantas monedas de 20 cent tiene"))
mon10=int(input("Introduzca cuantas monedas de 10 cent tiene"))
euros=mon2*2+mon1*1+mon50*0.5+mon20*0.20+mon10*0.10
print("Tiene", euros)