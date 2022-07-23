
package array;

import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de filas: "); 
        int filas = sc.nextInt();
        System.out.println("Por favor ingrese la cantidad de columnas: ");
        int columnas = sc.nextInt();
        
        int [][] matriz = new int[filas][columnas]; 
        int contar=0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Por favor digite el numero: "+(++contar));
                int numero = sc.nextInt();
                matriz[i][j] = numero;
            }
            
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+"     ");                
            }
            System.out.println("");
            
        }
        System.out.println("Mostar el indice y el valor");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("El indice "+i+","+j+" esta el valor: "+matriz[i][j]);
                
            }
            
        }
    }
    
}
