/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasestring;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class ClaseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"ISO-8859-1");
        System.out.println("Digite su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Digite su apellido: ");
        String apellido = sc.nextLine();
        
        String nombreApellido = nombre +" "+ apellido;
        
        System.out.println("Sus nombres y apellidos son: "+nombreApellido);
        System.out.println("La longuitud de la cadena es: "+nombreApellido.length());
        System.out.println("La primera posicion de la letra o es: "+nombreApellido.indexOf("o"));
        System.out.println("La ultima posicion de la letra o es "+nombreApellido.lastIndexOf("o"));
        System.out.println("El caracter que esta en la posicion 7 es: "+nombreApellido.charAt(7));
        System.out.println("El subString usu es : "+nombreApellido.substring(6,9));


        
        
    }
}
