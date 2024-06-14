//Orden.java Jose Mayorga
package ar.com.system2024.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadora[]; //Arreglo objetos
    private static int contadorOrdenadores;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora; 
    
    //constructor vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenadores;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //mETODO PARA AGREGAR UNA NUEVA COMPUTADORA AL ARREGLO
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else{
            System.out.println("Has superado el limite; "+Orden.MAX_COMPUTADORAS);
        }
    }
    //Mostrar orden
    public void mostrarOrden(){
        System.out.println("orden #: " + this.idOrden);
        System.out.println("Computadora de la orden #: " +this.idOrden);
        for(int i = 0; i < this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
            
        }
    }
}
