#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
import time

hora_romero=0
min_romero=0
s_romero=0

#creo un bucle que no se va a parar nunca
while True: 
    s_romero=s_romero+1
    if (s_romero==60):
        s_romero=0
        min_romero=1
    else:
        if (min_romero==60):
            min_romero=0
            hora_romero=1
    print(hora_romero,":",min_romero,":",s_romero)
    time.sleep(1)
    #he sacado la libreria time y la funcion sleep de Google