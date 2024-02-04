import csv
#Cremos una lista para almacenar los alumnos de forma ordenada
aprobados=[]
suspensos=[]
#Abrimos el fichero csv
try:
    with open('calificacionfinal.csv') as file:
        csv_reader= csv.reader(file , delimiter=',')
        #Nos saltamos la primera línea para sacarla del calculo
        next(csv_reader)
        for alumno in csv_reader:
            #Analizamos la condición de aprobados y suspensos
            aprobado=True
            #Eliminamos de la asistencia el útlimo caracter %
            asistencia=alumno[2][:-1]
            if(int(asistencia))<75:
                aprobado=False
            elif(float(alumno[9])<5):
                aprobado=False
            #introducimos al alumno en la lista de aprobados o suspensos
            if(aprobado):
                aprobados.append(alumno)
            else:
                suspensos.append(alumno)
        print("Se han realizado los cálculos, a continuación se guardará la información solicitada")
except FileNotFoundError:
    print("Error al abrir el fichero")

#Creamos la cabezera para guardar la información de los aprobados y suspensos
headers = ['Apellidos','Nombre','Asistencia','Parcial1','Parcial2','Ordinario1','Ordinario2','Practicas','OrdinarioPracticas','Nota Final']

#Creamos el fichero de los aprobados
try:
    with open('aprobados.csv', mode='w', newline='') as file:
        writer = csv.writer(file)
        writer.writerow( headers) # Asignamos las columnas

        for alumno in aprobados: # Vamos guardando cada alumno
            writer.writerow(alumno)
        print("Se ha creado el fichero de aprobados con éxito")
except OSError:
    print("No se pudo crear el fichero")

#Creamos el fichero de los suspensos
try: 
    with open('suspensos.csv', mode='w', newline='') as file:
        writer = csv.writer(file)
        writer.writerow( headers) # Asignamos las columnas

        for alumno in suspensos: # Vamos guardando cada alumno
            writer.writerow(alumno)
        print("Se ha creado el fichero de suspensos con éxito")
except OSError:
    print("No se pudo crear el fichero")