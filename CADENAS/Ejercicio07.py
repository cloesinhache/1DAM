#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 19/11/2023---------------------------

#ENUNCIADO:Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en 
#la cadena por el segundo carácter.

#introducimos una cadena y ambos caracteres
cadena_romero=str(input("Introduzca una cadena:"))
car1_romero=str(input("Introduce el primer caracter:"))
car2_romero=str(input("Introduzca el segundo caracter:"))

#comprobamos que son caracteres como en el ejercicio 3
#comprobamos con len que solo es un caracter y con isdigit que no es un numero.
if (len(car1_romero)==1 and not car1_romero.isdigit()) and (len(car2_romero)==1 and not car2_romero.isdigit()):
    print("Es un caracter")
else:
    print("Caracter mal introducido")

#usamos la funcion replace
print(cadena_romero.replace(car1_romero, car2_romero))
