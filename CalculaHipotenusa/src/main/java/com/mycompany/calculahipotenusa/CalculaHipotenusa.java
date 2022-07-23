/*
Programa que lea la longitud de los catetos de un triángulo rectángulo y
calcule la longitud de la hipotenusa solo con dos decimales, según el teorema de Pitágoras.
 */

package com.mycompany.calculahipotenusa;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class CalculaHipotenusa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer cateto: ");
        double pcateto = sc.nextDouble();
        System.out.println("Ingese segundo cateto: ");
        double scateto = sc.nextDouble();
        
        System.out.println("La hipotenusa es: "+valorHipotenusa(pcateto,scateto));
    }
    public static double valorHipotenusa(double cateto1, double cateto2){
        double hip = sqrt((Math.pow(cateto1,2) + Math.pow(cateto2,2)));
        double res = Math.round(hip*100.0)/100.0;
        return res;
    }
    
}
