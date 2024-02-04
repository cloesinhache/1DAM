#CLOE ROMERO SALGUERO

#ENUNCIADO:Escribe un programa que pida un nombre de usuario y una contraseña y si se ha introducido “pepe” 
#y “asdasd” se indica “Has entrado al sistema”, sino se da un error.

nombre=str(input("Introduzca el nombre de usuario:"))
contraseña=str(input("Introduzca la contraseña:"))

if(nombre=="pepe" and contraseña=="asdasd"):
    print("Has entrado al sistema")
else:
    print("Vuelva a introducir el usuario y la contraseña:")
    nombre=str(input("Introduzca el nombre de usuario:"))
    contraseña=str(input("Introduzca la contraseña:"))