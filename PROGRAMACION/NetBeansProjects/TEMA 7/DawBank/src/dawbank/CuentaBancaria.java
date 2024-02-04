/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dawbank;

/**
 *
 * @author cloer
 */
public class CuentaBancaria {
    //constantes de clase

    private static final int MAX_MOV = 100;
    private static final int NEGATIVO = -50;
    private static final int HACIENDA = 3000;

    //constantes de objeto
    private final String IBAN;
    private final String TITULAR;

    //atributos de objeto
    private double saldo = 0.0;
    private double[] movimientos = new double[MAX_MOV];
    private int mov = 0;

    //contructor
    public CuentaBancaria(String IBAN, String TITULAR) {
        this.IBAN = IBAN;
        this.TITULAR = TITULAR;

    }//c

    public static int getMAX_MOV() {
        return MAX_MOV;
    }

    public static int getNEGATIVO() {
        return NEGATIVO;
    }

    public static int getHACIENDA() {
        return HACIENDA;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTITULAR() {
        return TITULAR;
    }

    public double getSaldo() {
        return saldo;
    }

    public double[] getMovimientos() {
        return movimientos;
    }

    public int getMov() {
        return mov;
    }

    //funciones
    //los ingresos solo pueden ser de numeros enteros, por lo que trabajo con int
    public void ingreso(int ingreso) {

        if (ingreso > 0) {
            saldo += ingreso;
            mov += 1;
            for (int i = 0; i< mov; i++) {
                movimientos[i] = ingreso;
            }
            if (ingreso > HACIENDA) {
                System.out.println("AVISO: Se va a notificar a Hacienda");
            }
        } else {
            System.out.println("Cantidad mal introducida");
        }

    }//ingreso

    //las retiradas tambien deben ser de numeros enteros. 
    public void retirada(int retirada) {

        if (retirada > 0 && saldo - retirada >= NEGATIVO) {
            saldo -= retirada;
            mov += 1;
            for (int i = 0; i < mov; i++) {
                movimientos[mov] = retirada;
            }
            if (saldo < 0) {
                System.out.println("AVISO: Saldo negativo");
            }
        } else {
            System.out.println("Cantidad mal introducida");
        }

    }//retirada

}
