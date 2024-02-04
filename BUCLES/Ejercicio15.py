#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 13/11/2023---------------------------

#ENUNCIADO:Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y 
#así sucesivamente. Realizar un algoritmo para determinar cuánto debe pagar mensualmente y el total de lo que pagó después de los 20 meses.

#queremos los pagos mensuales y el total pagado despues de 20 meses
#sabemos que cada mes paga el doble que el anterior empezando por 10
#creamos las variables
mes_romero=10
total_romero=0
#imprimimos el pago del primer mes
print(mes_romero)

#creamos un bucle que vaya contando los meses (del 1 al 20)
for i in range (1,20):
    #vamos incrementando el dinero,el total y lo imprimimos
    mes_romero=mes_romero*2
    total_romero=total_romero+mes_romero
    print(mes_romero)

#imprimimos el total fuera del bucle
print("El total despues de 20 meses es",total_romero)

