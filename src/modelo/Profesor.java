/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.ConnectDB;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Profesor {
    
    String codigoP;
    String nombreP1;
    String nombreP2;
    String apellidoP1;
    String apellidoP2;
    String telefonoP1;
    String telefonoP2;
    String correoP;
    String contraseñaP;
    String direccionP;

    public Profesor() {
    }

    public Profesor(String codigoP, String nombreP1, String nombreP2, String apellidoP1, String apellidoP2, String telefonoP1, String telefonoP2, String correoP, String contraseñaP, String direccionP) {
        this.codigoP = codigoP;
        this.nombreP1 = nombreP1;
        this.nombreP2 = nombreP2;
        this.apellidoP1 = apellidoP1;
        this.apellidoP2 = apellidoP2;
        this.telefonoP1 = telefonoP1;
        this.telefonoP2 = telefonoP2;
        this.correoP = correoP;
        this.contraseñaP = contraseñaP;
        this.direccionP = direccionP;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombreP1() {
        return nombreP1;
    }

    public void setNombreP1(String nombreP1) {
        this.nombreP1 = nombreP1;
    }

    public String getNombreP2() {
        return nombreP2;
    }

    public void setNombreP2(String nombreP2) {
        this.nombreP2 = nombreP2;
    }

    public String getApellidoP1() {
        return apellidoP1;
    }

    public void setApellidoP1(String apellidoP1) {
        this.apellidoP1 = apellidoP1;
    }

    public String getApellidoP2() {
        return apellidoP2;
    }

    public void setApellidoP2(String apellidoP2) {
        this.apellidoP2 = apellidoP2;
    }

    public String getTelefonoP1() {
        return telefonoP1;
    }

    public void setTelefonoP1(String telefonoP1) {
        this.telefonoP1 = telefonoP1;
    }

    public String getTelefonoP2() {
        return telefonoP2;
    }

    public void setTelefonoP2(String telefonoP2) {
        this.telefonoP2 = telefonoP2;
    }

    public String getCorreoP() {
        return correoP;
    }

    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }

    public String getContraseñaP() {
        return contraseñaP;
    }

    public void setContraseñaP(String contraseñaP) {
        this.contraseñaP = contraseñaP;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }
    
    public boolean insertEstudiante(Profesor obE, FileInputStream fis, File f) throws SQLException {

        boolean t = false;
        PreparedStatement ps = null;
        ConnectDB objC = new ConnectDB();
        String sql = "insert into Estudiantes values(?,?,?,?,?,?,?,?,?,?)";
        try {
            if (objC.crearConexion()) {
                objC.getConexion().setAutoCommit(false);

                ps = objC.getConexion().prepareStatement(sql);
                ps.setString(1, obE.getCodigoP());
                ps.setString(2, obE.getNombreP1());
                ps.setString(3, obE.getNombreP2());
                ps.setString(4, obE.getApellidoP1());
                ps.setString(5, obE.getTelefonoP1());
                ps.setString(6, obE.getTelefonoP2());
                ps.setString(7, obE.getCorreoP());
                ps.setString(8, obE.getContraseñaP());
                ps.setString(9, obE.getDireccionP());
              
                ps.executeUpdate();
                objC.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            t = false;
            System.out.println("Error " + ex.toString());
        } finally {
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {

                System.out.println("Error " + ex.toString());
            }
        }

        return t;

    }
    
}
