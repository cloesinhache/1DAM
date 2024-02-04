/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedidospizza;

/**
 *
 * @author cloer
 */
public class PedidosPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //instancio tres pizzas
        Pizza p1 = new Pizza("familiar", "funghi");
        Pizza p2 = new Pizza("mediana", "cuatro quesos");
        Pizza p3=new Pizza("mediana","margarita");

        
        //muestro 
        p1.mostrarEstado();
        p2.servir();
        p2.mostrarEstado();
        p3.mostrarEstado();
        p2.servir();
        System.out.println("TOTAL PEDIDAS = "+ Pizza.getPedidas());
        System.out.println("TOTAL SERVIDAS = "+ Pizza.getServidas());
        
    }

}
