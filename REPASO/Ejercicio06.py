#Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar listas. Para simplificarlo vamos a suponer que febrero tiene 28 días.

dias=[31,28,31,20,31,30,31,31,30,31,30,31]
meses=["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]

mes=int(input("Introduzca un mes:"))

print("El mes",mes,"es",meses[mes-1],"y tiene",dias[mes-1],"dias")

