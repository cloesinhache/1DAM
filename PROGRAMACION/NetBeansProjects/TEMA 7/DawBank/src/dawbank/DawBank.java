/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawbank;

import java.util.Scanner;

/**
 *
 * @author cloer
 */
public class DawBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declaramos las variables
        String iban;
        String titular;
        boolean repetir = true;
        int opcion;
        int ingreso;
        int retirada;

        //declaramos el objeto lector Scanner
        Scanner lector = new Scanner(System.in);

        //pedimos los datos de la cuenta
        System.out.println("Introduzca el IBAN de la cuenta: ");
        iban = lector.nextLine();
        System.out.println("Introduzca el titular de la cuenta: ");
        titular = lector.nextLine();

        //instancio un objeto cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(iban, titular);

        while (repetir) {
            Menu();

            //pido la opción
            System.out.println("Introduzca la opción deseada (con el número: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("IBAN: " + cuenta1.getIBAN());
                    System.out.println("TITULAR: " + cuenta1.getTITULAR());
                    System.out.println("SALDO: " + cuenta1.getSaldo());
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta1.getIBAN());
                    break;

                case 3:
                    System.out.println("TITULAR: " + cuenta1.getTITULAR());
                    break;

                case 4:
                    System.out.println("SALDO: " + cuenta1.getSaldo());
                    break;

                case 5:
                    System.out.println("Introduzca la cantidad a ingresar: ");
                    ingreso = lector.nextInt();
                    cuenta1.ingreso(ingreso);

                    break;
                case 6:
                    System.out.println("Introduzca la cantidad a retirar: ");
                    retirada = lector.nextInt();
                    cuenta1.retirada(retirada);

                    break;
                case 7:
                    for (int i = 0; i < cuenta1.getMov(); i++) {
                        System.out.println("MOVIMIENTOS: " + cuenta1.getMov() + " ");
                    }
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    repetir = false;
                    break;

            }

        }//main
    }

    public static void Menu() {
        System.out.println("");//estetico
        System.out.println("--------------MENÚ--------------");
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
        System.out.println(""); //estetico

    }

}//class

