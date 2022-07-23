/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite un numero entero: ");
        int numero = sc.nextInt();
        System.out.println("El numero "+ numero + " tiene "+ numeroDigitos(numero)+ " cifras");
        

    }
    public static int numeroDigitos(int numero){
        int cifras = 0;
        while (numero!=0){
            numero/=10;
            cifras++;
        }
        return cifras;
         
        
             
    }
}
