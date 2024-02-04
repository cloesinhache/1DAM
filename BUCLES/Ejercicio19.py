#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que seleccionamos la opción de “Salir”.
 #menú
print("Menú:")
print("1.Configuracion:")
print("2.Crear nueva partida:")
print("3.Salir")
opcion_romero=int(input("Seleccione una opción(1,2 o 3):"))

if (opcion_romero==1):
    print("dirigiendose a configuración")
elif opcion_romero==2:
    print("creando...")
elif opcion_romero==3:
    print("saliendo...")
else:
    print("Opción no válida")

