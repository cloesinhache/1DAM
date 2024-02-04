#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación 
#debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.

#creo la lista notas
notas_romero=[]

#le voy añadiendo las calificaciones
for i in range (0,5):
    #obligo con un bucle while a que sea mayor que 0 y menor que 10 
    
    repetir=True
    while(repetir):
        cal_romero=int(input("Introduzca la calificacion:"))  
        repetir=False
        
        if(cal_romero<0 or cal_romero>10):
            print("Error.Nota mal introducida")

    notas_romero.append(cal_romero)

print(notas_romero)
print("La nota mas alta es",max(notas_romero))
print("La nota mas baja es",min(notas_romero))
print("La nota media es",(sum(notas_romero))/(len(notas_romero)))
        
    

        