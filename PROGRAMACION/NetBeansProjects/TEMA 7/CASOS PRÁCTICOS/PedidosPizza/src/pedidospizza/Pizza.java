/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidospizza;

/**
 *
 * @author cloer
 */
public class Pizza {

    //constantes de instancia, porque le asigno un valor y no varian
    private final String tamaño;
    private final String tipo;
    
    //atributos de instancia, van variando.
    private boolean estado=false;
    private static int pedidas=0;
    private static int servidas=0;
    
    //constructor
    public Pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        pedidas++;
    }
    
    //getters y setters
    public static int getPedidas() {
        return pedidas;
    }

    public static int getServidas() {
        return servidas;
    }

    //metodos
    public void mostrarEstado(){
        System.out.println("pizza "+tipo+" "+tamaño+" "+", "+estado(estado) );
    }
    public void servir(){
        if(estado==false){
            estado=true;    
            servidas++;
        }else{
           System.out.println("La pizza ya está servida");
        }
    
    }
    
    private String estado(boolean estado){
        String resultado;
        
        if (estado){
          resultado="PEDIDA";
        }else{
            resultado="SERVIDA";
        }
         return resultado;
    }
}
