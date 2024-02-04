/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico2.bombilla;

/**
 *
 * @author cloer
 */
public class Bombilla {

    //atributos de clase
    public static boolean general = true;

    //atributos de instancia
    private boolean interruptor = false;

    //funciones
    public void encender() {
        interruptor = true;
    }

    public void apagar() {
        interruptor = false;
    }

    public void mostrar() {
        if (estado()) {
            System.out.println("La bombilla está encendida");
        } else {
            System.out.println("La bombilla está apagada");
        }
    }

    public boolean estado() {
        return (general && interruptor);
    }
}
