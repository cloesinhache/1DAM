#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Una persona se encuentra en el kilómetro 70 de una carretera, otra se encuentra en el km 150, los coches tienen 
#sentido opuesto y tienen la misma velocidad. Realizar un programa para determinar en qué kilómetro de esa carretera se encontrarán.

#creo las variables para determinar en que kilometro empezamos a contar por persona
km1_romero=70
km2_romero=150

#calculo la distancia inicial entre ellos. Uso el valor absoluto parsa quitar el signo
distancia_romero=abs(km1_romero-km2_romero)

#uso la formula de la distancia
if (km1_romero<km2_romero):
    encuentro_romero= km1_romero+(distancia_romero/2)
else:
    encuentro_romero= km2_romero+(distancia_romero/2)

print("Se encuentran en el km",encuentro_romero)