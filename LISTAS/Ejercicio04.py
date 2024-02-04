#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#ENUNCIADO:Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un número negativo. 
#Entonces se debe imprimir el vector (sólo los elementos introducidos).

lista_romero=[]

#obligo con un bucle while a que sea mayor que 0
repetir=True
while(repetir):
    num_romero=int(input("Introduzca un numero.Negativo para terminar:"))   
    if (num_romero>0):
        lista_romero.append(num_romero)  
    elif (num_romero<0):
        repetir=False
   

print(lista_romero)

