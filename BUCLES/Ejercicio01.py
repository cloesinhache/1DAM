#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Crea una aplicación que pida un número y calcule su factorial (El factorial de un número es el producto de 
#todos los enteros entre 1 y el propio número y se representa por el número seguido de un signo de exclamación. Por 
#ejemplo 5! = 1x2x3x4x5=120).

x_romero=int(input("Introduzca un número:"))

factorial_romero=1
for i in range(1,x_romero+1):
    factorial_romero=factorial_romero*i
#le sumo 1 al final para que incluya el numero introducido.
print("El factorial de",x_romero,"es",factorial_romero)

     
