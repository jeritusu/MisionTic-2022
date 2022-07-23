/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplomascota;
import Clases.Mascota2;

/**
 *
 * @author jairo
 */
public class EjemploMascota {

    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.setCodigo("001");
        m1.setNombre("Firulais");
        m1.setAnnioNac(2000);
        m1.setRaza("Dalmata");
        m1.setColor("Blanco y Negro");
        
        Mascota m2 = new Mascota("002","Mateo",2005,"Pitbull","Marron");
        
        System.out.println("Nombre de la mascota "+m1.getCodigo()+" es, "+m1.getNombre());
        System.out.println("La raza de la mascota "+m2.getCodigo()+" es,"+m2.getRaza());
    }
}
