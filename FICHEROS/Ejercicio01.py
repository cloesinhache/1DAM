#                                           CLOE ROMERO SALGUERO
#                                         ENTORNOS DE DESARROLLO
#                                                18/12/2023

#ENUNCIADO: Escribir una función que pida un número entero entre 1 y 10 y guarde en un fichero con el nombre primer apellido-n.txt 
#           la tabla de multiplicar de ese número, donde n es el número introducido.


#pedimos el numero al usuario
numero_romero=int(input("Introduzca un número del 1 y 10: "))

#creamos el fichero con el nombre correspondiente
fichero_romero=str("romero-"+ str(numero_romero) +".txt")

#abrimos la funcion con open()
f=open(fichero_romero,"w")

#rellenamos el fichero y cerramos
for i in range(1, 11):
    f.write(str(numero_romero) + "x" + str(i) + "=" + str(numero_romero * i) + "")
f.close()