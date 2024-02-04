#CLOE ROMERO SALGUERO

#Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
#El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
#Escribir un algoritmo que determine la hora de llegada a la ciudad B.

HH=int(input("Introduzca la hora a la que salió de la ciudad A"))
MM=int(input("Introduzca los minutos"))
SS=int(input("Introduzca los segundos"))
tiempo=int(input("Introduzca los segundos que tarda en llegar a la ciudad B"))

partida=HH*3600+MM*60+SS
llegada=partida+ tiempo
HH2=llegada//3600
MM2=(llegada%3600)//60
SS2= llegada%60
print("Hora de llegada a la ciudad B:", HH2, ":",MM2,":",SS2)
