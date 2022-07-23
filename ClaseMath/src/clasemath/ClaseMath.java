/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasemath;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la base: ");
        int base =sc.nextInt();
        System.out.println("Digite el exponente");
        int exponente =sc.nextInt();
        System.out.println("La potencia es "+potencia(base,exponente));       
        
        System.out.println("El valor del numero Euler es:"+Math.E);

        double pi=Math.PI;
        System.out.println("El numero PI es: "+pi);
        double rPi=Math.round(pi);
        double rdPi=Math.round(pi*100.0)/100.0;
        System.out.println("El numero PI redondeado con round es: "+rPi);
        System.out.println("El numero PI redondeado a dos decimales es:"+rdPi);
        
        System.out.println("Redondear a PI al entero mayor: "+Math.ceil(pi));
        System.out.println("Redondear a PI al entero menor: "+Math.floor(pi));
        
    }
    public static double potencia (int base, int exponente){
        double rpotencia = Math.pow(base, exponente);
        return rpotencia;
    }
}
