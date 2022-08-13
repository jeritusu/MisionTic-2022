
package com.mycompany.reto5.controlador;
//importacion de la pruebas de conexion de las lineas 11 y 12
//import com.mycompany.reto5.modelo.DAO.Conexion;

import com.mycompany.reto5.vista.frmPrincipal;

//import java.sql.Connection;


public class ControladorMain {
    public static void main(String[] args) {
        //las siguientes dos lineas son de prueba
        //Conexion cc = new Conexion();
        //Connection cn = cc.conectar();
        
        new frmPrincipal().setVisible(true);
    }
    
}
