

package com.mycompany.ejerciciopersona;


public class EjercicioPersona {

    public static void main(String[] args) {
        
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona("Jerilyn","Usuay",28);
        
        per1.setCodigo(001);
        per1.setNombre("Jairo");
        per1.setApellido("Usuay");
        
        per2.setCodigo(13);
        per2.setNombre("Samy");
        per2.setApellido("Castillo");
        
                
        
        
        System.out.println("Codigo: "+per1.getCodigo());
        System.out.println("Nombres y Apellidos persona 1 : "+per1.getNombre()+" "+per1.getApellido());
        
        System.out.println("Codigo: "+per2.getCodigo());
        System.out.println("Nombres y Apellidos persona 2 : "+per2.getNombre()+" "+per2.getApellido());
        
         System.out.println("Codigo: "+per3.getCodigo());
        System.out.println("Nombres y Apellidos persona 3 : "+per3.getNombre()+" "+per3.getApellido());
        
    }
}
