/*
Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
 */

package com.mycompany.calculaventamasiva;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class CalculaVentaMasIVA {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese precio del producto");
        float precio = sc.nextInt();
        System.out.println("Ingrese cantidad: ");
        float cantidad = sc.nextInt();
        System.out.println("Ingrese porcentaje de IVA: ");
        float iva = sc.nextInt();
        
        System.out.println("El total de ventas + IVA es:"+calculaTotalIva(precio,cantidad,iva));
    }
    public static float calculaTotalIva(float precio,float cantidad,float iva){      
            
        float totalIva = (precio*cantidad)*((iva/100)+1);
        return totalIva;
        }
}