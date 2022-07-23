/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

import Clases.Mascota;

/**
 *
 * @author jairo
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mascota m1 = new Mascota();
        m1.setCodigo("001");
        m1.setNombre("Firulais");
        m1.setAnnioNac(2000);
        m1.setRaza("Labrador");
        m1.setColor("marron");
        
        Mascota m2 = new Mascota("002","Dover",2010,"pitbull","blanco");
        
        System.out.println("La mascota "+m1.getCodigo()+" se llama "+m1.getNombre());
        System.out.println("El color de la mascota "+m2.getCodigo()+" es, "+m2.getColor());
                
                
                
    }
    
}
