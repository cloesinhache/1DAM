#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Queremos guardar la temperatura_romero mínima y máxima de 5 días. Realiza un programa que de la siguiente información:
#La temperatura_romero media de cada día
#Los días con menos temperatura_romero
#Se lee una temperatura_romero por teclado y se muestran los días cuya temperatura_romero máxima coincide con ella. si no existe ningún día se muestra un mensaje de 
#información.

#creamos una matriz
matriz_romero = []

for i in range(1,6):
	temperatura_romero = []
	temperatura_romero.append(int(input("Día",i,".Temperatura máxima:")))
	temperatura_romero.append(int(input("Día",i,".Temperatura mínima:")))
	matriz_romero.append(temperatura_romero)

#hago la media entre minima y maxima
i = 1
for temperatura_romero in matriz_romero:
	print("Día",i,"Temperatura media:" (sum(temperatura_romero)/len(temperatura_romero)))
	i += 1

#calculo la minima 
minima_romero = matriz_romero[0][1]
for temperatura_romero in matriz_romero:
	if (temperatura_romero[1] < minima_romero):
		minima_romero = temperatura_romero[1]

#miro que dia coincide con la minima
i = 1
for temperatura_romero in matriz_romero:
	if temperatura_romero[1] == minima_romero:
		print("Día", i)
	i +=1
	
#miro los dias wue coinciden con la maxima
existe_romero = False
print("Días con temperatura_romero máxima")
maxima_romero = int(input("Introduce una temperatura:"))
i = 1
for temperatura_romero in matriz_romero:
	if temperatura_romero[0] == maxima_romero:
		print("Día",i)
		existe_romero = True
	i +=1
if not existe_romero:
	print("No existe ningún día con latemperatura indicada")
