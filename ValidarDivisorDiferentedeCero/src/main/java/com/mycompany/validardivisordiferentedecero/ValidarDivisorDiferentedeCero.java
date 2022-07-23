/*
Programa que lea dos números por teclado y muestre el
resultado de la división del primer número por el segundo. Se
debe comprobar que el divisor no puede ser cero.
 */

package com.mycompany.validardivisordiferentedecero;

import java.util.Scanner;


 
public class ValidarDivisorDiferentedeCero {

    public static void main(String[] args) {
        double denominador;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese numerador: ");
            double numerador = sc.nextDouble();
        
            System.out.println("Ingrese denominador: ");
            denominador = sc.nextDouble();
        
            System.out.println("La division es: "+dividir(numerador,denominador));
            
            }
        while (denominador!=0);
        System.out.println("***Error:Denominador no puede ser cero***");
        
    }
    public static double dividir(double numerador,double denominador){
        double res =numerador/denominador;
        return res;
        }
}
