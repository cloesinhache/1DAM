#CLOE ROMERO SALGUERO

#ENUNCIADO: Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
#Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa en el peso del paquete y la
#zona a la que va dirigido. Lo anterior se muestra en la tabla:

#Zona	Ubicación	Costo/gramo
#1	América del Norte	24.00 euros
#2	América Central	20.00 euros
#3	América del Sur	21.00 euros
#4	Europa	10.00 euros
#5	Asia	18.00 euros
#Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones 
#de logística y de seguridad.
#Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

peso=float(input("Introduzca el peso del paquete en gramos:"))
zona= int(input("Introduzca la zona de destino:"))

if zona==1:
    costo=24.00
elif zona==2:
    costo=20.00
elif zona==3:
    costo=21.00
elif zona==4:
    costo=10.00
elif zona==5:
    costo=18.00

if peso>5000:
    print("El paquete no puede ser transportado")
else:
    entrega=peso*costo
    print("El costo de la entrega es",entrega,"euros")