import csv
#Abrimos el fichero csv
try:
    with open('cotizaciones.csv') as file:
        csv_reader = csv.DictReader(file , delimiter=',')
        #creamos una lista para asignar los datos de las columnas
        final=[]
        maximo=[]
        minimo=[]
        volumen=[]
        efectivo=[]
        #Imprimimos la cabecera del fichero csv 
        print("Nombre, final, Máximo, Mínimo, Volumen, Efectivo")
        #Recorremos el fichero csv desde la segunda fila, la vamos imprimiendo y vamos recopilando la información en las listas
        for row in csv_reader:
            print(row['Nombre'], row['Final'], row['Máximo'], 
                row['Mínimo'], row['Volumen'], row['Efectivo'])
            final.append(float(row['Final']))
            maximo.append(float(row['Máximo']))
            minimo.append(float(row['Mínimo']))
            volumen.append(float(row['Volumen']))
            efectivo.append(float(row['Efectivo']))
except FileNotFoundError:
    print("No se ha abierto correctamento el archivo")
#Creamos el diccionario que vamos a utilizar parar almacenarlo en el archivo final
datos=[
    {
        'Dato': 'Final',
        'máximo': max(final),
        'mínimo': min(final),
        'media': sum(final)/len(final)
    },
    {
        'Dato': 'Máximo',
        'máximo': max(maximo),
        'mínimo': min(maximo),
        'media': sum(maximo)/len(maximo)
    },
    {
        'Dato': 'Mínimo',
        'máximo': max(minimo),
        'mínimo': min(minimo),
        'media': sum(minimo)/len(minimo)
    },
    {
        'Dato': 'Máximo',
        'máximo': max(maximo),
        'mínimo': min(maximo),
        'media': sum(maximo)/len(maximo)
    },
    {
        'Dato': 'Volumen',
        'máximo': max(volumen),
        'mínimo': min(volumen),
        'media': sum(volumen)/len(volumen)
    },
    {
        'Dato': 'Efectivo',
        'máximo': max(efectivo),
        'mínimo': min(efectivo),
        'media': sum(efectivo)/len(efectivo)
    },
]

#Preparamos la cabecera del fichero csv final
columns = ['Dato', 'máximo', 'mínimo', 'media']

#Creamos el fichero final y guardamos el diccionario
try:
    with open('ejercicio7_apellido.csv', mode='w') as file:
        writer = csv.DictWriter(file, delimiter=',', fieldnames=columns )
        writer.writeheader()

        for dict in datos:
            writer.writerow(dict)
        print("Se creado el archivo y guardado la información correctamente")
except IOError:
    print("No se ha creado el archivo correctamente")
    