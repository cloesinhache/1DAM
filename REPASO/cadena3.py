#Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el carácter en la cadena.

contador=0

cadena=str(input("Introduzca una cadena: "))
caracter=str(input("Introduzca un  caracter: "))

if len(caracter)==1:
    for caracter in cadena:
        if(cadena.find(caracter)):
            contador+=1

print("El caracter aparece",contador, "veces")