/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp8terminal;

/**
 *
 * @author cloer
 */
public class Terminal {

    //constante de instancia
    private final String numero;

    //variable de instancia
    private static int tiempo;

    //constructor para asignarle un numero
    public Terminal(String numero) {
        this.numero = numero;
    }

    //getters y setters
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNumero() {
        return numero;
    }

    //metodos
    public void llamada(Terminal numero, int tiempoLlamada) {
        tiempo += tiempoLlamada;
        Terminal.tiempo+=tiempoLlamada;

    }

    public void mostrarEstado() {
        System.out.println(numero + " , " + tiempo);
    }

}
