/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Digite un numero entero:");
        int numero = sc.nextInt();
        System.out.println("El doble del numero es: "+dobleNumero(numero));
        System.out.println("El triple del numero es: "+tripleNumero(numero));
        
        
    }
    public static int dobleNumero(int numero){
        
        //int numero = 0;
        numero*=2;
        return numero;
            
        }
    public static int tripleNumero(int numero){
        
        //int numero = 0;
        numero*=3;
        return numero;
            
        }
}
