#Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un programa que introduzca el nombre y la edad de cada alumno. 
#El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos:
#Todos lo alumnos mayores de edad.
#Los alumnos mayores (los que tienen más edad)

nombres_romero=[]
edades_romero=[]
max=0

while True:
    nombre=str(input("Introduzca el nombre del alumno: "))
    if (nombre!= "*"):
        nombres_romero.append(nombre)
        edad=int(input("Introduzca la edad de dicho alumno: "))
        edades_romero.append(edad)
        if edad>max:
            max=edad
    else:
        if nombre=="*":
            break

print(nombres_romero)
print(edades_romero)

print("Los alumnos mayores de edad son:")
for nombre,edad in zip(nombres_romero,edades_romero):
    if edad>=18:
        print(nombre)

print( "Los alumnos mas mayores son: ")
for nombre,edad in zip(nombres_romero,edades_romero):
    if edad==max:
        print(nombre) 

