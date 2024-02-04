#Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de la siguiente información:
#La temperatura media de cada día
#Los días con menos temperatura
#Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima coincide con ella. si no existe ningún día 
#se muestra un mensaje de información.

#lo primer creo las listas
maximas=[]
minimas=[]
medias=[]

#las rellenamos pidiendole al usuario las maximas y minimas con un for
for i in range (1,6):
    print("Introduzca la temperatura maxima del dia",i,":")
    maxima=int(input())
    maximas.append(maxima)
    print("Introduzca la temperatura minima del dia",i,":")
    minima=int(input())
    minimas.append(minima)
    #vamos acumulando la media con el mismo for y metiendola en la lista medias
    media=(maxima+minima)/len(maximas)
    medias.append(media)

print("El dia con menos temperatura es",min(minimas), "grados, el dia",i)



