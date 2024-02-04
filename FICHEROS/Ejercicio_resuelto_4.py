import csv
#Cremos una lista para almacenar los alumnos de forma ordenada
ordenados=[]
#Abrimos el fichero csv
try:
    with open('calificaciones.csv') as file:
        csv_reader = csv.reader(file , delimiter=',')
        #Nos saltamos la primera línea para sacarla de la ordenación
        next(csv_reader)
        #Ordenamos la lista de diccionarios recibida por Apellidos que es la primera columna
        ordenados = sorted(csv_reader,key=lambda x:x[0])
        #Imprimimos la cabezeras
        print('[Apellidos,','Nombre,','Asistencia,','Parcial1,','Parcial2,','Ordinario1,','Ordinario2,','Practicas,','OrdinarioPracticas]')
        #Imprimidos toda la lista de diccionarios ordenadas
        for row in ordenados:
            print(row)
except FileNotFoundError:
    print('No existe el fichero en la ruta especificada')