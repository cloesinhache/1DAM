#                                              ------------ENTORNOS DE DESAROLLO------------
#                                       --------------------CLOE ROMERO SALGUERO-----------------
#                                   -------------------------FECHA: 28/11/2023---------------------------

#Crear un programa que lea los precios de 5 artículos y las cant vendidas por una empresa en sus 4 sucursales. Informar:
#Las cant totales de cada articulo.
#La cantidad de artículos en la sucursal 2.
#La cantidad del articulo 3 en la sucursal 1.
#La recaudación total de cada sucursal.
#La recaudación total de la empresa.
#La sucursal de mayor recaudación.


precio_romero = []
cant_romero = []
articulos_romero = 3
sucursales_romero = 2


for i in range(0, articulos_romero):
   precio_romero.append(float(input("Ingrese el precio del articulo",i,":")))

for j in range(0, sucursales_romero):
    cant_art_romero = []
    for i in range(0, articulos_romero):
        cant_art_romero.append(int(input("Ingrese cantidad del articulo", i+1,"en sucursal",j+1,":")))
    cant_romero.append(cant_art_romero)
   
#sumar cantidadd por articulos
print("Cantidades por artículos:")
for i in range(0, articulos_romero):
    suma = 0
    for cantsucursal_romero in cant_romero:
        suma = suma + cantsucursal_romero[i]
    print("Total articulo:" ,suma)

#artículos sucursal 2
print("Total Sucursal 2:",sum(cant_romero[1]))

#articulo 3 sucursal 1
print("Sucursal 1, Articulo 3:",cant_romero[0][2])

# Guardo en una lista las recaudaciones de cada sucursal
totalsucursal_romero = []
for cantsucursal_romero in cant_romero:
    total=0
    for precio,cantidad in zip(precio_romero,cantsucursal_romero):
        total=total+precio*cantidad
    totalsucursal_romero.append(total)

#máximo vendido
maximo_romero = max(totalsucursal_romero)   
j = 1
for j in range(0, sucursales_romero):
    print("Recaudaciones Sucursal",j,":",totalsucursal_romero[j])
    j += 1

# Calculo la sucursal con mayor recaudación
j = 1
for cantsucursal_romero in totalsucursal_romero:
    if cantsucursal_romero == maximo_romero: 
        break
    j += 1

print("Recaudación total de la empresa:",sum(totalsucursal_romero))
print("Sucursal con mayor recaudación:", j)

