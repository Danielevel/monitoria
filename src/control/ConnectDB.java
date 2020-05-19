/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dacastro
 */
public class ConnectDB {

    Connection conexion;
    Statement st;

    public ConnectDB() {
        //conexion
    }
    
     public Connection getConexion() {
        return conexion;
    }
      /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");                                    //user  //pass
            conexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/monitorias", "root", "root");
            st = conexion.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

}