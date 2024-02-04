#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 4/12/2023---------------------------

#ENUNCIADO:Vamos a crear un programa en python donde vamos a declarar un diccionario para guardar los precios de las distintas frutas. 
#El programa pedirá el nombre de la fruta y la cantidad que se ha vendido y nos mostrará el precio final de la fruta a partir de los datos guardados 
#en el diccionario. Si la fruta no existe nos dará un error. Tras cada consulta el programa nos preguntará si queremos hacer otra consulta.

#creamos un diccionario donde aparezcan las frutas con sus precios
precios_romero = {"uva": 3, "manzana": 2, "pera": 1.5, "platano": 2.5}

#pedimos la fruta y la cantidad vendida
repetir=True
while (repetir):
    fruta_romero = str(input("Introduzca el nombre de la fruta: "))
    if fruta_romero not in precios_romero:
        print("ERROR.La fruta no consta")
    else:
        cantidad_romero = int(input("Introduzca la cantidad vendida: "))
        print("El precio final es" ,(cantidad_romero*precios_romero[fruta_romero]))

    #le damos la opcion al usuario de repetir
    pregunta_romero= int(input("¿Desea hacer otra consulta? 0-NO 1-SI: "))
    if (pregunta_romero==0):
        repetir=False
    else:
        repetir=True

    

