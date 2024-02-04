
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Idoia Muñoz y Cloe Romero
 */
public class Videojuego {

    public static void main(String[] args) {

        //declaro las variables
        int nivel = 1, s1, s2, sumatorio = 0, respuesta, p1, p2, factorial = 1, N, clave, M, S, factorial2 = 1, suma = 0, P, correcta;
        boolean atomarviento = true, primo =true;

        //declaro el objeto Scanner lector
        Scanner lector = new Scanner(System.in);

        //intro
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke\n"
                + "Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n"
                + "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n"
                + "está construyendo para destruirla. (Presiona Intro para continuar)");

        lector.nextLine();

        System.out.println("Comenzamos con el nivel 1...");

        do {
            switch (nivel) {
                        //Entramos en el NIVEL 1
                case 1:
                    System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n"
                            + "sistema S1 en el sector S2, pero el sistema de navegación está estropeado y el\n"
                            + "computador tiene problemas para calcular parte de las coordenadas de salto.\n"
                            + "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
                            + "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n"
                            + "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n"
                            + "¿Qué debe introducir?");

                    //Genero el sistema y el sector con numeros aleatorios
                    s1 = (int) (Math.random() * 11);
                    s2 = (int) (20 + Math.random() * 11);

                    //Muestro ambos valores y calculo el sumatorio de los numeros entre ellos
                    System.out.println("Sistema S1= " + s1 + "\n"
                            + "Sector s2 = " + s2);
                    for (int i = s1; i <= s2; i++) {
                        sumatorio += i;
                    }
                    //Le pido al usuario que introduzca el sumatorio
                    //Si acierta pasa al nivel dos, y si no pierde y vuelve a empezar 
                    System.out.println("Introduzca el sumatorio entre " + s1 + " y " + s2);
                    System.out.println("BORRAR: SUMATORIO = " + sumatorio);
                    respuesta = lector.nextInt();
                    if (respuesta == sumatorio) {
                        System.out.println("Correcto, pasamos al nivel 2...");
                        nivel = 2;

                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                                + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        atomarviento = false;
                    }
                    break;
                    //Entramos en el NIVEL 2
                case 2:
                    System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n"
                            + "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n"
                            + "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n"
                            + "agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados\n"
                            + "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n"
                            + "“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso\n"
                            + "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n"
                            + "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n"
                            + "manual del piloto que estaba en la guantera y da con la página correcta. El código\n"
                            + "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                            + "¿Cuál es el código?");

                    //Generamos el numero de agente y el numero de nave con Math.random
                    p1 = (int) (1 + Math.random() * 8);
                    p2 = (int) (8 + Math.random() * 6);

                    //Muestro los resultados
                    System.out.println("Nº AGENTE = " + p1 + "\n"
                            + "Nº NAVE = " + p2);

                    //Calculo el factorial
                    for (int i = p1; i <= p2; i++) {
                        factorial = factorial * i;
                    }

                    //Pido al usuario la respuesta
                    System.out.println("Introduzca el factorial entre " + p1 + " y " + p2);
                    System.out.println("BORRAR: FACTORIAL = " + factorial);
                    respuesta = lector.nextInt();
                    if (respuesta == factorial) {
                        System.out.println("Correcto, pasamos al nivel 3...");
                        nivel = 3;

                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                                + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        atomarviento = false;
                    }

                    break;
                    // Entramos en el NIVEL 3
                case 3:
                    System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n"
                            + "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n"
                            + "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N existentes se\n"
                            + "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n"
                            + "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n"
                            + "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n"
                            + "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n"
                            + "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
                            + "¿Cual es el nivel correcto?");
                    //Genramos el numero aleatorio de N
                    N = (int) (50 + Math.random() * 51);
                    clave = (int) (N / 10);
                    System.out.println(clave);
                    factorial = 1;
                    //Calculamos el factorial
                    for (int i = 1; i <= clave; i++) {
                        factorial = factorial * i;
                    }
                  // Generamos la respuesta en el caso de que acierte o de que falle

                    System.out.println("Introduzca su respuesta, siendo N = " + N);

                    System.out.println("BORRAR: FACTORIAL = " + factorial);

                    respuesta = lector.nextInt();

                    if (respuesta == factorial) {
                        System.out.println("Correcto, pasamos al nivel 4...");
                        nivel = 4;
                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                                + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        atomarviento = false;
                    }

                    break;
                    //Entramos en el NIVEL 4
                case 4:
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n"
                            + "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n"
                            + "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n"
                            + "verificar si el número P es primo o no. Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0");
                    //Generamos el numero aleatorio de P
                    P = (int) (10 + Math.random() * 91);
                    //Generamos el for para determinar si es primo o no
                    for (int i = 2; i < P; i++) {
                        if (P % i == 0) {
                            primo = false;
                        }
                    }

                    //Generamos la respuesta de si es primo o no es primo
                    if (primo) {
                        System.out.println("Es primo");
                    } else {
                        System.out.println("No es primo");

                    }

                    if (primo) {
                        correcta = 1;
                    } else {
                        correcta = 0;
                    }

                    System.out.println("¿Es " + P + " "  + "un número primo?(1 si es primo, 0 en caso contrario)");
                    respuesta = lector.nextInt();

                    if (respuesta == correcta) {
                        System.out.println("Correcto, pasamos al nivel 5");
                        nivel = 5;
                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                                + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        atomarviento = false;
                    }

                    break;
                    //Entramos en el NIVEL 5
                case 5:
                    System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
                            + "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n"
                            + "explote en exactamente M minutos y S segundos, el tiempo suficiente para escapar\n"
                            + "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n"
                            + "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n"
                            + "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n"
                            + "el factorial de M y el factorial de S. ¿Qué valor debe introducir?");
                    //Generamos los numeros aleatorios para los factoriales de M y S
                    M = (int) (5 + Math.random() * 6);
                    S = (int) (5 + Math.random() * 6);
                    factorial = 1;
                    //Calculamos el factorial de M
                    for (int i = 1; i <= M; i++) {
                        factorial = factorial * i;
                    }
                    //Calculamos el factorial de S
                    for (int i = 1; i <= S; i++) {
                        factorial2 = factorial2 * i;
                    }
                    
                    System.out.println(factorial);
                    System.out.println(factorial2);
                    
                    
                    suma = factorial + factorial2;
                    
                    // Generamos la respuesta para el NIVEL 5
                    System.out.println("Introduzca su respuesta, siendo M  = " + M + " y " + " S = " + S);

                    System.out.println("BORRAR: SUMA = " + suma);

                    respuesta = lector.nextInt();

                    if (respuesta == suma) {
                        System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n"
                                + "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n"
                                + "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n"
                                + "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n"
                                + "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n"
                                + "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n"
                                + "imperio.\n"
                                + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");

                        atomarviento = false;

                    } else {
                        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                                + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
                        atomarviento = false;
                    }
                    break;
            }

        } while (atomarviento);
    }

}
