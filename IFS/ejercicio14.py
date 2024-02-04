#CLOE ROMERO SALGUERO

#ENUNCIADO:La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
#clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un solo tipo
#y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo 
#siguiente: si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de 
#tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
#Realice un algoritmo para determinar la ganancia obtenida.

kilos=int(input("Introduzca los kilos vendidos:"))
tamaño=int(input("Introduzca el tamaño (1 o 2):"))
tipo=str(input("Introduzca el tamaño (A o B):"))

precio=0
if (tipo=="A" and tamaño==1):
    precio=precio+20
elif (tipo=="A" and tamaño==2):
    precio=precio+30
elif (tipo=="B" and tamaño==1):
    precio=precio-30
elif (tipo=="B" and tamaño==2):
    precio=precio-50

ganancia=kilos*precio
print("La ganancia es",ganancia,"centimos")