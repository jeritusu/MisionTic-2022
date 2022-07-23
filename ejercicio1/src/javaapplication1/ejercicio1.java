/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println(saludo(nombre));
 
    
        
    }
    public static String saludo (String nombre){
    return "Hola "+ nombre +", Bienvenidos, Dios los bendiga....!!";
        
    }
}
