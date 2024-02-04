#CLOE ROMERO SALGUERO

#ENUNCIADO: Un alumno desea saber cual será su calificación final en la materia de 
#Algoritmos. 
#Dicha calificación se compone de los siguientes porcentajes:
#55% del promedio de sus tres calificaciones parciales.
#30% de la calificación del examen final.
#15% de la calificación de un trabajo final.

par1=float(input("Introduzca la nota del primer parcial "))
par2=float(input("Introduzca la nota del segundo parcial "))
par3=float(input("Introduzca la nota del tercer parcial "))
final=float(input("Introduzca la nota del examen final "))
trabajo=float(input("Introduzca la nota del trabajo final "))
mediapar=((par1+par2+par3)/3)
nota=mediapar*0.55+final*0.30+trabajo*0.15
print("La nota final es ", nota)
