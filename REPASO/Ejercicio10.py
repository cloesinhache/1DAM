#Diseñar el algoritmo correspondiente a un programa, que:
#Crea una tabla (lista con dos dimensiones) de 5x5 enteros.
#Carga la tabla con valores numéricos enteros.
#Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla.

#creo la tabla
tabla=[]

for i in range (0,5):
    fila=[]
    for j in range (0,5):
        print("Introduzca un numero para la fila: ",j)
        fila.append(numero)
    tabla.append(fila)

i=1
for fila in tabla:
    print("La suma de la fila",i,"es",sum(fila))
    i+=1

for j in range(1,6):
    suma=0
    for fila in tabla:
        suma=suma+fila[j-1]
        print("La suma de la columna",j,"es",suma)
