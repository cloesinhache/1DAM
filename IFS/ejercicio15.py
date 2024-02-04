#CLOE ROMERO SALGUERO

#ENUNCIADO:El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe 
#cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: 
#si son 100 alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, 
#de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar 
#el número de alumnos.Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
#pagar cada alumno por el viaje.

alumnos=int(input("Introduzca el numero de alumnos:"))
costo=0
total=0

if (alumnos>=100):
    costo=65
    total=65*alumnos
elif ( alumnos<100 and alumnos>=50):
    costo=70
    total=70*alumnos
elif (alumnos<=49 and alumnos>=30):
    costo=95
    total=95*alumnos
elif (alumnos<30):
    costo=4000/alumnos
    total=4000
print("Hay que pagarle a la compañia",total,"euros")
print("Cada alumno debe pagar",costo,"euros")



