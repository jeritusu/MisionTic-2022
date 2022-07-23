/*
Programa que pase una velocidad en Km/h a m/s con dos decimales.
La velocidad se lee por teclado.
 */

package com.mycompany.convertirunidaddevelocidad;

import java.util.Scanner;


public class ConvertirUnidaddeVelocidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese velocidad en Km/h: ");
        int velocidad = sc.nextInt();
        System.out.println("El valor es, "+calculaMetSeg(velocidad)+" m/s");
    }
    public static double calculaMetSeg(float velocidad){
        float res = (velocidad*5)/18;
        //System.out.println("cccc "+res);
        //double prueba = Math.round(res*100.0);
        //System.out.println("ddd "+prueba);
        double res2 = Math.round(res*100.0)/100.0;
        return res2;
    }
}
