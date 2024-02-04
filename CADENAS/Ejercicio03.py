#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 19/11/2023---------------------------

#ENUNCIADO:Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el 
#carácter en la cadena.

#introdcucimos cadena y caracter por teclado
cadena_romero=str(input("Introduzca una cadena:"))
caracter_romero=str(input("Introduzca un caracter:"))

#comprobamos con len que solo es un caracter y con isdigit que no es un numero.
if (len(caracter_romero)==1 and not caracter_romero.isdigit()):
    print("Es un caracter")
else:
    print("Caracter mal introducido")

#usamos la funcion count para contar cuantos caracteres hay en la cadena
print(cadena_romero.count(caracter_romero))

