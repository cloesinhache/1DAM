#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 19/11/2023---------------------------

#ENUNCIADO:Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente 
#cuantas palabras tiene.

cadena_romero=str(input("Introduzca una frase:"))

#usamos la funcion split para dividir la frase en palabras
palabras_romero=cadena_romero.split()

#usamos len para contar las palabras
print("La frase tiene",len(palabras_romero),"palabras.")



 