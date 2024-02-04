#Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.

notas=[]
suma=0
max=0
min=10

for i in range (0,5):
    while True: 
        cal=int(input("Introduzca una nota:"))
        if (cal>=0 and cal<=10):
            notas.append(cal)
            suma=suma+cal
            if cal>max:
                max=cal
            if cal<min:
                min=cal
            break
        else:
            print("Nota mal introducida.Vuelva a introducirla")

print(notas)
print("La media es",(suma/len(notas)))
print ("La nota maxima es",max)
print("La nota minima es",min)