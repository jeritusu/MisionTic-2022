/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicionumerodesuerte;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class EjercicioNumerodeSuerte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--CONOZCA SU NUMERO DE LA SUERTE--");
        System.out.println("Digite el dia de nacimiento: ");
        int dia = sc.nextInt();
        System.out.println("Digite el mes de nacimiento:");
        int mes = sc.nextInt();
        System.out.println("Digite el año de nacimiento: ");
        int año = sc.nextInt();
        System.out.println("Su numero de la suerte es: "+numeroSuerte(dia,mes,año));
        System.out.println("Su numero de la suerte con el segundo metodo es: "+numeroSuerte2(dia,mes,año));
        
        
    }
    public static int numeroSuerte(int dia, int mes, int año){
        int suma = dia+mes+año;
        int cifra1,cifra2,cifra3,cifra4,nSuerte;
        
        cifra1=suma/1000;
        cifra2=suma/100%10;
        cifra3=suma/10%10;
        cifra4=suma%10;
        nSuerte=cifra1+cifra2+cifra3+cifra4;
        
        return nSuerte;
    }
    
    public static int numeroSuerte2(int dia, int mes, int año){
        //segunda forma de hacerlo
        int suma = dia+mes+año;
        //convertir a strig
        String vString = String.valueOf(suma);
        
        int sumaF=0;
        for (int i=0; i < vString.length(); i++){
            //System.out.println(vString.charAt(i));
            //convertir a entero(int)
            int n = Integer.parseInt(vString.charAt(i)+"");
            sumaF+=n;
            
            
        }
        return sumaF;
    }
}
