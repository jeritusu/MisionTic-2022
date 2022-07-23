/*
El programa lee por teclado tres números enteros y calcula y
muestra el mayor de los tres.
 */

package com.mycompany.numeromayor;

import java.util.Scanner;


public class NumeroMayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero 1 entero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese numero 2 entero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese numero 3 entero: ");
        int num3 = sc.nextInt();
        System.out.println("El numero mayor es: "+mostrarNumMayor(num1,num2,num3));
    }
    public static int mostrarNumMayor(int num1,int num2,int num3){
        int mayor;
        if (num1>num2 && num1>num3){
            mayor = num1;
            }else if (num2>num1 && num2>num3){
                mayor = num2;
                }
            else {
                mayor = num3;
            }
        return mayor;
        }
}
