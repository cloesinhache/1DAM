/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopractico2.bombilla;

/**
 *
 * @author cloer
 */
public class CasoPractico2Bombilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instancio dos objetos bombillas
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();

        System.out.println("Muestro el estado de las bombillas");
        b1.mostrar();
        b2.mostrar();

        System.out.println("Enciendo la primera");
        b1.encender();

        System.out.println("Vuelvo a mostrar el estado");
        b1.mostrar();
        b2.mostrar();

        System.out.println("Apago la primera y enciendo la segunda");
        b1.apagar();
        b2.encender();

        System.out.println("Vuelvo a mostrar el estado");
        b1.mostrar();
        b2.mostrar();

        System.out.println("Apago la corriente general");
        Bombilla.general = false;

        System.out.println("Vuelvo a mostrar el estado");
        b1.mostrar();
        b2.mostrar();
        
        System.out.println("Enciendo la corriente general");
        Bombilla.general = true;

        System.out.println("Vuelvo a mostrar el estado");
        b1.mostrar();
        b2.mostrar();

    }

}
