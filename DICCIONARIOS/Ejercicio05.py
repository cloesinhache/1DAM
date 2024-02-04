#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 4/12/2023---------------------------

#ENUNCIADO:Escribir un programa que implemente una agenda. En la agenda se podrán guardar nombres y números de teléfono. El programa nos dará el siguiente menú:
#Añadir/modificar: Nos pide un nombre. Si el nombre se encuentra en la agenda, debe mostrar el teléfono y, eleccionalmente, permitir modificarlo si no es correcto. 
#Si el nombre no se encuentra, debe permitir ingresar el teléfono correspondiente.
#Buscar: Nos pide una cadena de caracteres, y nos muestras todos los contactos cuyos nombres comiencen por dicha cadena.
#Borrar: Nos pide un nombre y si existe nos preguntará si queremos borrarlo de la agenda.
#Listar: Nos muestra todos los contactos de la agenda.
#Implementar el programa con un diccionario.

#lo primero creamos un diccionario vacio
agenda_romero = {}

#despues mostramos el menu de elecciones
repetir=True
while (repetir):
    print("")
    print("1.Añadir/modificar")
    print("2.Buscar")
    print("3.Borrar")
    print("4.Listar")
    print("5.Salir")

    #elegimos la opcion
    eleccion_romero= int(input("Introduzca una opción con el numero:"))

    if (eleccion_romero==1):
        nombre_romero=str(input("Introduzca el nombre del contacto:"))  
        if nombre_romero in agenda_romero:
            print("ERROR. Ese nombre ya existe") 
            continuar_romero=int(input("Si quiere modificarlo pulse 1.Si no, pulse ENTER:"))
            if (continuar_romero==1):
                numero_romero= int(input("Introduzca el nuevo número:"))
                agenda_romero[nombre_romero]=numero_romero
        else:
            numero_romero = input("Introduzca el numero de telefono:")
            agenda_romero[nombre_romero]=numero_romero


    elif (eleccion_romero==2):
            nombre_romero=str(input("Introduzca el nombre del contacto para buscarlo:"))  
            for nombre_romero, numero_romero in agenda_romero.items():
                print("El número de teléfono es ",agenda_romero[nombre_romero])


    elif (eleccion_romero==3):
            nombre_romero = input("Introduzca el nombre que quiere borrar:")    
            if nombre_romero in agenda_romero:
                    del agenda_romero[nombre_romero]
            else:
                print("No se encontró")

    elif eleccion_romero == 4:
        for nombre, numero in agenda_romero.items():
            print(nombre,"->",numero)

    elif eleccion_romero == 5:
        repetir=False
    else:
            print("Opción incorrecta")
