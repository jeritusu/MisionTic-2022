/*
Programa que lea dos variables enteras N y m y le quite a N sus m últimas
cifras.
Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.
 */

package com.mycompany.quitadoscifras;

import java.util.Scanner;


public class QuitaDosCifras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numero = sc.nextInt();
        System.out.println("El numero ingresado sin dos cifras es: "+quitarCifras(numero));
        
        
    }
    public static int quitarCifras(int numero){
        
        int resultado = (int)(Math.floor(resultado = numero/100));
    return resultado;
    }
}
