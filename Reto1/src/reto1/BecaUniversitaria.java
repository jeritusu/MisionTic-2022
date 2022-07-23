
package reto1;


public class BecaUniversitaria {
    private int tiempo;
    private double monto;
    private double interes;

    public BecaUniversitaria() {
    }

    public BecaUniversitaria(int tiempo, double monto, double interes) {
        this.tiempo = tiempo;
        this.monto = monto;
        this.interes = interes;
               
        
    }
    
    public double calcularInteresSimple( ){
        double interesSimple = monto*(interes/100)*tiempo;
        return Math.round(interesSimple);
    }
        
    
    public double calcularInteresCompuesto(){
        double interesCompuesto = monto*(Math.pow(1+interes/100,tiempo)-1);
        return Math.round(interesCompuesto);
    }
        
            
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
        double diferencia = calcularInteresCompuesto()-calcularInteresSimple( );
        if (diferencia!=0){
            return "La diferencia entre la proyecci�n de inter�s compuesto e inter�s simple es:$" + diferencia;
        }else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los par�metros de entrada.";
        }
        
        }
    public String compararInversion ( ){
        double diferencia = calcularInteresCompuesto()-calcularInteresSimple( );
        if (diferencia!=0){
            return "La diferencia entre la proyecci�n de inter�s compuesto e inter�s simple es:$" + diferencia;
        }else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los par�metros de entrada.";
        }
    }   

}
