#CLOE ROMERO SALGUERO

#ENUNCIADO:Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un 
#triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
#Si se cumple Pitágoras entonces es triángulo rectángulo
#Si sólo dos lados del triángulo son iguales entonces es isósceles.
#Si los 3 lados son iguales entonces es equilátero.
#Si no se cumple ninguna de las condiciones anteriores, es escaleno.

a=int(input("Introduzca la hipotenusa (el lado mas largo):"))
b=int(input("Introduzca el primer cateto:"))
c=int(input("Introduzca el otro cateto:"))

if(a**2==b**2+c**2):
    print("El triangulo es rectángulo")
elif (a==b and a==c):
    print("El triángulo es equilátero")
elif (a==b or a==c or b==c):
    print("El triangulo es isósceles")
elif (a!=b and a!=c and c!=b):
    print("El triangulo es escaleno")