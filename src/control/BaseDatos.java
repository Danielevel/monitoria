package control;

/**
 *
 * @author Alejo
 */
//import Controller.Imagen;
//import behind.Estudiante;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class BaseDatos {

    Connection conexion;
    Statement st;

    public BaseDatos() {
        //conexion
    }
    public Connection getConexion() {
        return conexion;
    }
    public Statement getSt() {
        return st;
    }
    /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean crearConexion() {
        boolean t=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");                                      //user  //pass
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/monitorias", "root", "root");
            jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull [root on Default schema]
            st = conexion.createStatement();
            t=true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            t= false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            t= false;
        }

        return t;
    }

 //------------------------------------[METODOS PARA MOSTRAR TABLAS]----------------------------------------
    public static Connection getConexionStatic(){
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/monitorias", "root", "root");
        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
        return cn;
    }
    
    public static ResultSet getTabla(String Consulta){
        Connection cn;
        cn = getConexionStatic();
        Statement st;
        ResultSet datos = null;
        try {
            st = cn.createStatement();
            datos=st.executeQuery(Consulta);
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return datos;
    }
//----------------------------------------------------------------------------------------------------------
    
    
    
/*
    /**
     *
     * Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
     *
     * @param sql Cadena que contiene la instrucción SQL a ejecutar
     * @return estado regresa el estado de la ejecución, true(éxito) o
     * false(error)
     *     

    public boolean ejecutarSQL(String sql) {
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    /**
     *
     * Método utilizado para realizar la instrucción SELECT
     *
     * @param sql Cadena que contiene la instrucción SQL a ejecutar
     * @return resultado regresa los registros generados por la consulta
     *     

    public String ejecutarSQLSelect(String sql) {
        ResultSet rs;
        int id;
        String nom = "";
        String tel = "";
        String dir = "";
        String concatenar = "";

        try {
            Statement sentencia = conexion.createStatement();
            rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt(1);
                nom = rs.getNString("nombreusuario");
                tel = rs.getNString("cedulausuario");
                dir = rs.getNString("celusuario");

                concatenar = id + " " + nom + " " + tel + " " + dir;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return concatenar;
    }
    
    public void storeProcedious() {
        CallableStatement statemen;
        try {
            statemen = conexion.prepareCall("{call INSERT_USUARIO(%,%,%)}");
            statemen.setString(1, "Gloria");
            statemen.setString(2, "3344");
            statemen.setString(3, "CAlle Medellin 7345");
            if (statemen.execute()) {
                System.out.println("si se realizó ");
            }

        } catch (Exception ex) {

        }
    }

    public void storeProcediousImage(String ruta) {
        CallableStatement statemen;
        FileInputStream fis = null;

        try {
            statemen = conexion.prepareCall("{call INSERT_USUARIO_PICTURE(?,?,?,?)}");
            File file = new File(ruta);
            System.out.println("ruta " + ruta);
            fis = new FileInputStream(file);
            statemen.setString(1, "Maria");
            statemen.setString(2, "555");
            statemen.setString(3, "Itagui");
            statemen.setBinaryStream(4, fis, (long) file.length());
            if (!statemen.execute()) {
                System.out.println("si se realizó ");
            }

        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean sqlInsertWithImage(String ruta, String insert) {
        // String insert = "insert into Imagenes(imagen,nombre) values(?,?)";
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            conexion.setAutoCommit(false);
            File file = new File(ruta);
            fis = new FileInputStream(file);
            ps = conexion.prepareStatement(insert);
            ps.setString(1, "1135");
            ps.setString(2, "David");
            ps.setString(3, "Benavides");
            ps.setString(4, "30156");
            ps.setBinaryStream(5, fis, (int) file.length());
            //ps.setString(2, nombre);
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public boolean sqlInsertWithImageEstudiante(String ruta, String insert, String idestudiantes, String codigoestudiante, String nombreestudiante, String apellidoestudiante, String telefonoestudiante, String direccionestudiante, String correoestudiante) {
        // String insert = "insert into Imagenes(imagen,nombre) values(?,?)";
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            conexion.setAutoCommit(false);
            File file = new File(ruta);
            fis = new FileInputStream(file);
            ps = conexion.prepareStatement(insert);
            ps.setString(1, idestudiantes);
            ps.setString(2, codigoestudiante);
            ps.setString(3, nombreestudiante);
            ps.setString(4, apellidoestudiante);
            ps.setString(5, telefonoestudiante);
            ps.setString(6, direccionestudiante);
            ps.setString(7, correoestudiante);
            ps.setBinaryStream(8, fis, (int) file.length());
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

*/
}
