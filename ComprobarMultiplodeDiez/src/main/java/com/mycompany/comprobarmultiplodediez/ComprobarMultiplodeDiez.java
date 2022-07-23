/*
Programa que lea un número entero y muestre si el número es
múltiplo de 10.
 */

package com.mycompany.comprobarmultiplodediez;

import java.util.Scanner;


public class ComprobarMultiplodeDiez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        System.out.println("el numero "+comprobar1(numero)+" de 10.");
        System.out.println("el numero "+numero+" "+comprobar2(numero)+" de 10.");
        
    }
    //Primera forma usando operador ternario.
    public static String comprobar1(int numero){
        String resultado = numero%10==0?"si es multiplo":"no es multiplo";       
        return resultado;
    }
    //Segunda forma usando operador ternario.

    public static String comprobar2(int numero){                  
        return numero%10==0?"es multiplo":"no es multiplo";
    }
    
}
