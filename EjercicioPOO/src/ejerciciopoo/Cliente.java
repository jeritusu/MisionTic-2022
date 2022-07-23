
package ejerciciopoo;

import java.util.Date;


public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente() {
    }

    public Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * @param vip the vip to set
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * @return the contadorCliente
     */
    public static int getContadorCliente() {
        return contadorCliente;
    }

    @Override
    public String toString() {
        return "************DATOS CLIENTE************\n"+"Nombre del cliente: "+super.getNombre()+" \nNumero consecutivo: " + idCliente + " \nFecha de registro: " + fechaRegistro + " \nvip: " + vip + "\n-------------------------------------";
    }
    
    
}
