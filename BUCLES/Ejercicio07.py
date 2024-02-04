#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por teclado.

#leo el numero del que queremos la tabla
num_romero=int(input("Introduzca el numero del que quiere obtener la tabla:"))

#creo una variable para las multiplicaciones y la inicio a 1
tabla_romero=1

#creo un bucle for para que multiplique el numero introducido por los numeros del 1 al 10
#pongo en el final 11 para que incluya el 10 en las multipliaciones.
for i in range (1,11):
    tabla_romero=num_romero*i
    print(tabla_romero)