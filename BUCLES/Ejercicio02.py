#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. 
#A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
#además de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el 
#número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número 
#que había generado.

intentos_romero=0
min_romero=0
max_romero=100

print("Piense en un numero del 1 al 100")

#limitamos los intentos a 10
while (intentos_romero<=10 or respuesta_romero=="="):
    #pongo int para obligar a que sean numeros enteros, no decimales.Si no se haria enterno.
    numero_romero=int((max_romero+min_romero)/2)
    print(numero_romero)
    respuesta_romero=str(input("¿Es tu número? Escribe +,- o =:"))

    if respuesta_romero=="=":
        print("adiviné, !ole yo!")
        break
#si es mayor, el max se queda igual y el minimo es el numero anteriormente mostrado
    elif respuesta_romero=="+":
        min_romero=numero_romero
        numero_romero=int((max_romero+min_romero)/2)
        intentos_romero=intentos_romero+1
#si es menor, el max pasa a ser el numero mostrado y el minimo se queda igual
    elif respuesta_romero=="-":
        max_romero=numero_romero
        numero_romero=int((max_romero+min_romero)/2)
        intentos_romero=intentos_romero+1
#de esta manera vamos acotando hasta llegar al numero