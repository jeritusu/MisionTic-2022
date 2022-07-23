/*
Programa que lea un carácter por teclado y compruebe si es
una letra mayúscula.
 */

package com.mycompany.comprobarcaracter;

import java.util.Scanner;


public class ComprobarCaracter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un solo caracter: ");
        char letra = sc.nextLine().charAt(0);
        System.out.println(confirmaLetra(letra));
        System.out.println(confirmaLetra2(letra)); 
        
        
        
        
    }
    public static String confirmaLetra(char letra){
        String mostrar;
        if(Character.isUpperCase(letra)){         
           mostrar ="La letra es mayuscula.";             
            }
            else{                  
                mostrar = "La letra es minuscula.";   
                }
        return mostrar;
        }
    public static String confirmaLetra2(char letra){
        return Character.isUpperCase(letra)?"Esta letra es Mayuscula.":"Esta letra es Minuscula.";
    }
}
