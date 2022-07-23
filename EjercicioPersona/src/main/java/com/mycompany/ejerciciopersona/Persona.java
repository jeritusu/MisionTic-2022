
package com.mycompany.ejerciciopersona;


public class Persona {
    
    //Atributos
    private String nombre;
    private String apellido;
    private Integer codigo;
    
    //Constructor vacio
    public Persona() {
    }

    //Constructor con argumentos
    public Persona(String nombre, String apellido, Integer codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
}
