#CLOE ROMERO SALGUERO

#ENUNCIADO:Algoritmo que pida tres números y los muestre ordenados (de mayor a menor)

a=int(input("Introduzca un número:"))
b=int(input("Introduzca un número:"))
c=int(input("Introduzca un número:"))


if a>b and a>c and c<b:
    mayor=a
    menor=c
    medio=b
elif (a>b and a>c) and c>b:
    mayor=a
    menor=b
    medio=c
elif a<b and a<c and c>b:
    mayor=c
    menor=a
    medio=b
elif a<b and a<c and c<b: 
    mayor=c
    menor=b
    medio=c 
elif b>a and b>c and a<c:
    mayor=b
    menor=a
    medio=c
elif b>a and b>c and a>c:
    mayor=b
    menor=c
    medio=a

print("El orden es:" ,mayor,medio,menor)
        
