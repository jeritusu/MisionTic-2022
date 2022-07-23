
package reto1;


public class Reto1 {

   
    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria(16,100,7);
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion());
    }
    
}
