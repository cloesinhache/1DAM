#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos.

#el contador lo usamos para hacer la media despues
suma_romero=0
contador_romero=0
x_romero=1
 
while (x_romero!=0):
    x_romero=int(input("Introduzca un numero o un 0 para terminar:"))
    contador_romero=contador_romero+1
    suma_romero=suma_romero+x_romero
    
#hacemos la media restandole 1 al contador para que no cuente el 0. La suma no la tocamos porque el  0 no suma nada       
media_romero=suma_romero/(contador_romero-1)

print("La suma de todos los numeros es",suma_romero)
print("La media es",media_romero)
