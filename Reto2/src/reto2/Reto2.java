
package reto2;


public class Reto2 {

    
    public static void main(String[] args) {
       
        
        Computadores computadores[] = new Computadores[6]; 
        computadores[0] = new Computadores(150.0, 70, 'A'); 
        System.out.println(computadores[0].calcularPrecio());
        computadores[1] = new ComputadoresMesa(70.0, 40); 
        System.out.println(computadores[1].calcularPrecio());
        computadores[2] = new ComputadoresPortatiles(600.0, 70, 'D', 50, false); 
        System.out.println(computadores[2].calcularPrecio());
        computadores[3] = new Computadores(); 
        //System.out.println(computadores[3].calcularPrecio());
        computadores[4] = new Computadores(500.0, 60, 'A'); 
        computadores[5] = new Computadores(700.0, 50, 'D'); 
        PrecioTotal solucion1 = new PrecioTotal(computadores); 
        solucion1.mostrarTotales(); 
        System.out.println();
    }
    
    
}
