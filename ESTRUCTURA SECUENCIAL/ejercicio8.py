#CLOE ROMERO SALGUERO

#ENUNCIADO:Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, 
#el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres 
#ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta 
#su sueldo base y comisiones.

base=float(input("Introduzca su sueldo base"))
venta1=float(input("Introduzca la cantidad de una venta"))
venta2=float(input("Introduzca la cantidad de una venta"))
venta3=float(input("Introduzca la cantidad de una venta"))
total=base+venta1*0.1+venta2*0.1+venta3*0.1
print("Su sueldo total es de", total, "euros")