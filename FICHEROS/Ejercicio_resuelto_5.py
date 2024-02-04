import csv
#Creamos una lista para almacenar todos los alumnos de forma ordenada
ordenados=[]
#Abrimos el fichero csv
try:
    with open('calificaciones.csv') as file:
        csv_reader= csv.reader(file , delimiter=',')
        #Nos saltamos la primera línea para sacarla del calculo
        next(csv_reader)
        #Imprimimos la cabezeras
        print("[Apellidos,','Nombre,','Asistencia,','Parcial1,','Parcial2,','Ordinario1,','Ordinario2,','Practicas,','OrdinarioPracticas', 'Nota final']")
        #Calculamos la nota final, la añadimos a la lista ordenados e imprimimos en la terminal
        for row in csv_reader:
            #Consideraremos que si el alumno se ha presentado al ordinario, tomaremos esa nota como referencia
            if(row[5]):
                parcial1=row[5]
            elif (row[3]):
                parcial1=row[3]
            else:
                parcial1=0
            if(row[6]):
                parcial2=row[6]
            elif (row[4]):
                parcial2=row[4]
            else:
                parcial2=0
            if(row[8]):
                practicas=row[8]
            elif (row[7]):
                practicas=row[7]
            else:
                practicas=0
            nota=0.3*float(parcial1)+0.3*float(parcial2)+0.4*float(practicas)
            #Añadimos las finales a los alumnos
            row.append(round(nota,2))
            #Añadimos la lista a la lista para ordenarlos
            ordenados.append(row)
        #Ordenamos la lista de diccionarios recibida por Apellidos que es la primera columna
        ordenados = sorted(ordenados,key=lambda x:x[0])
        #Imprimidos toda la lista de diccionarios ordenadas con la nota final
        for row in ordenados:
            print(row)
except FileNotFoundError:
    print("No se ha podido abrir el fichero")
#Creamos la cabezera para guardar la información
headers = ['Apellidos','Nombre','Asistencia','Parcial1','Parcial2','Ordinario1','Ordinario2','Practicas','OrdinarioPracticas','Nota Final']

#Creamos el fichero
try:
    with open('calificacionfinal.csv', mode='w', newline='') as file:
        writer = csv.writer(file)
        writer.writerow( headers) # Asignamos las columnas

        for alumno in ordenados: # Vamos guardando cada alumno
            writer.writerow(alumno)
except OSError:
    print("No se ha podido crear el fichero")