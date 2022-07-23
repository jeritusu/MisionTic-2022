/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero entero:");
        int numero = sc.nextInt();
        System.out.println("El numero "+numero+" es "+parImpar(numero));
                
    }
    public static String parImpar(int numero){
        return (numero%2==0)?"par":"impar";
    }
}
