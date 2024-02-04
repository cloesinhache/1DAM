/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cp8terminal;

/**
 *
 * @author cloer
 */
public class CP8Terminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instancio 4 terminales
        Terminal t1 = new Terminal("123456789");
        Terminal t2 = new Terminal("987654321");
        Terminal t3 = new Terminal("123459876");
        Terminal t4 = new Terminal("58441234");

        t1.mostrarEstado();
        t2.mostrarEstado();

        t1.llamada(t2, 320);
        t1.llamada(t3, 200);

        t1.mostrarEstado();
        t2.mostrarEstado();
        t3.mostrarEstado();
        t4.mostrarEstado();
    }

}
