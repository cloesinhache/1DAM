#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 4/12/2023---------------------------

#ENUNCIADO:Codifica un programa en python que nos permita guardar los nombres de los alumnos de una clase y las notas que han obtenido. 
#Cada alumno puede tener distinta cantidad de notas. Guarda la información en un diccionario cuya claves serán los nombres de los alumnos y 
#los valores serán listas con las notas de cada alumno.
#El programa pedirá el número de alumnos que vamos a introducir, pedirá su nombre e irá pidiendo sus notas hasta que introduzcamos un número negativo. 
#Al final el programa nos mostrará la lista de alumnos y la nota media obtenida por cada uno de ellos. Nota: si se introduce el nombre de un alumno que 
#ya existe el programa nos dará un error.

#creamos un diccionario vacio
dict1_romero={}

#introducimos el numero de alummos
num_romero=int(input("Introduzca el numero de alumnos que va a introducir:"))

#introducimos el nombre y las notas
for i in range (0,num_romero):
    repetir2=True
    while (repetir2):
        alumno_romero=str(input("Introduzca el nombre del alumno:")) 
        if (alumno_romero in dict1_romero):
                print("ERROR. El alumno ya ha existe")
        else:
                repetir2=False 

    #creamos la lista de notas y pedimos las notas
    listanotas_romero=[]
    repetir=True
    while (repetir): 
        nota_romero=int(input("Introduzca las notas. Negativo para salir:"))
        if (nota_romero<0):
             repetir=False
        else:
            listanotas_romero.append(nota_romero)

    dict1_romero[alumno_romero] = listanotas_romero.copy()
       
     
for alumno_romero,listanotas_romero in dict1_romero.items():
    print (alumno_romero,"->", listanotas_romero)
    print("La nota media de",alumno_romero,"es",sum(listanotas_romero)/len(listanotas_romero))


