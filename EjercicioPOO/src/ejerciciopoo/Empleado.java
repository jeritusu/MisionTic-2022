
package ejerciciopoo;


public class Empleado extends Persona{
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado() {
    }

    public Empleado(double sueldo) {
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

   
    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the contadorEmpleado
     */
    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
