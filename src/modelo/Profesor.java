/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import control.ConnectDB;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public Profesor(String codigoP, String nombreP1, String apellidoP1, String telefonoP1, String correoP, String contraseñaP, String direccionP) {
        this.codigoP = codigoP;
        this.nombreP1 = nombreP1;
        this.apellidoP1 = apellidoP1;
        this.telefonoP1 = telefonoP1;
        this.correoP = correoP;
        this.contraseñaP = contraseñaP;
        this.direccionP = direccionP;
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

    @Override
    public String toString() {
        return "Profesor{" + "codigoP=" + codigoP + ", nombreP1=" + nombreP1 + ", nombreP2=" + nombreP2 + ", apellidoP1=" + apellidoP1 + ", apellidoP2=" + apellidoP2 + ", telefonoP1=" + telefonoP1 + ", telefonoP2=" + telefonoP2 + ", correoP=" + correoP + ", contrase\u00f1aP=" + contraseñaP + ", direccionP=" + direccionP + '}';
    }

    public boolean insertProfesor(String sql, Profesor obE) {

        boolean t = false;
        PreparedStatement ps = null;
        ConnectDB objC = new ConnectDB();

        try {
            if (objC.crearConexion()) {
                objC.getConexion().setAutoCommit(false);

                ps = objC.getConexion().prepareStatement(sql);
                ps.setString(1, obE.getCodigoP());
                ps.setString(2, obE.getNombreP1());
                ps.setString(3, obE.getNombreP2());
                ps.setString(4, obE.getApellidoP1());
                ps.setString(5, obE.getApellidoP2());
                ps.setString(6, obE.getTelefonoP1());
                ps.setString(7, obE.getTelefonoP2());
                ps.setString(8, obE.getCorreoP());
                ps.setString(9, obE.getContraseñaP());
                ps.setString(10, obE.getDireccionP());

                ps.executeUpdate();
                objC.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;

    }

    public boolean insertProfesor(String sql, LinkedList<Profesor> lp) {

        boolean t = false;
        PreparedStatement ps = null;
        ConnectDB objC = new ConnectDB();
        for (int i = 0; i < lp.size(); i++) {
            try {
                if (objC.crearConexion()) {
                    objC.getConexion().setAutoCommit(false);

                    ps = objC.getConexion().prepareStatement(sql);
                    ps.setString(1, lp.get(i).codigoP);
                    ps.setString(2, lp.get(i).nombreP1);
                    ps.setString(3, lp.get(i).nombreP2);
                    ps.setString(4, lp.get(i).apellidoP1);
                    ps.setString(5, lp.get(i).apellidoP2);
                    ps.setString(6, lp.get(i).telefonoP1);
                    ps.setString(7, lp.get(i).telefonoP2);
                    ps.setString(8, lp.get(i).correoP);
                    ps.setString(9, lp.get(i).contraseñaP);
                    ps.setString(10, lp.get(i).direccionP);

                    ps.executeUpdate();
                    objC.getConexion().commit();
                    t = true;
                }
            } catch (Exception ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                t = false;
            } finally {
                try {
                    ps.close();

                } catch (Exception ex) {
                    System.out.println(" error " + ex.toString());
                    //Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return t;

    }

    
    // ATENCION!!! ejecutarSQLSelectProfesor ya no funciona, ahora es ListraProfesores
    public LinkedList<Profesor> ejecutarSQLSelectProfesor(String sql) {

        ResultSet rs;
        String codigoPx;
        String nombreP1x;
        String nombreP2x;
        String apellidoP1x;
        String apellidoP2x;
        String telefonoP1x;
        String telefonoP2x;
        String correoPx;
        String contraseñaPx;
        String direccionPx;

        ConnectDB objc = new ConnectDB();
        LinkedList<Profesor> ma = new LinkedList<>();
        try {
            if (objc.crearConexion()) {
                Statement sentencia = objc.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {

                    codigoPx = rs.getNString("codigoP");
                    nombreP1x = rs.getNString("nombreP1");
                    nombreP2x = rs.getNString("nombreP2");
                    apellidoP1x = rs.getNString("apellidoP1");
                    apellidoP2x = rs.getNString("apellidoP2");
                    telefonoP1x = rs.getNString("telefonoP1");
                    telefonoP2x = rs.getNString("telefonoP2");
                    correoPx = rs.getNString("correoP");
                    contraseñaPx = rs.getNString("contraseñaP");
                    direccionPx = rs.getNString("direccionP");

                    ma.add(new Profesor(codigoPx, nombreP1x, nombreP2x, apellidoP1x, apellidoP2x, telefonoP1x, telefonoP2x, correoPx, contraseñaPx, direccionPx));

                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return ma;

    }

    public HashMap<String, String> getProfesorCombo() {
        HashMap<String, String> map = new HashMap<String, String>();
        PreparedStatement ps = null;
        ConnectDB objC = new ConnectDB();
        ResultSet rs;
        try {
            if (objC.crearConexion()) {
                String sql = "SELECT codigo , nombreP1  FROM monitorias.profesores";

                ps = objC.getConexion().prepareStatement(sql);
                rs = ps.executeQuery(sql);
                Profesor profesor;

                while (rs.next()) {
                    profesor = new Profesor();
                    profesor.setCodigoP(rs.getString(1));
                    profesor.setNombreP1(rs.getNString(2));

                    map.put(profesor.getNombreP1(), profesor.getCodigoP());
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error cargando lista de profesor ");
        }
        return map;
    }

    public boolean insertProfesor(Profesor objP,String sql) {
          boolean t = false;
        PreparedStatement ps = null;
        ConnectDB objC = new ConnectDB();

        try {
            if (objC.crearConexion()) {
                objC.getConexion().setAutoCommit(false);

                ps = objC.getConexion().prepareStatement(sql);
                ps.setString(1, objP.getCodigoP());
                ps.setString(2, objP.getNombreP1());
                ps.setString(3, objP.getNombreP2());
                ps.setString(4, objP.getApellidoP1());
                ps.setString(5, objP.getApellidoP2());
                ps.setString(6, objP.getTelefonoP1());
                ps.setString(7, objP.getTelefonoP2());
                ps.setString(8, objP.getCorreoP());
                ps.setString(9, objP.getContraseñaP());
                ps.setString(10, objP.getDireccionP());

                ps.executeUpdate();
                objC.getConexion().commit();
                t = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
        
    }

    public LinkedList<Profesor> ListraProfesores(String sql)  {
        LinkedList<Profesor> lp = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        String codigoP0="";
        String nombreP10="";
        String nombreP20="";
        String apellidoP10="";
        String apellidoP20="";
        String telefonoP10="";
        String telefonoP20="";
        String correoP0="";
        String contraseñaP0="";
        String direccionP0="";
        
        ResultSet rs = null;
        if (objb.crearConexion()){
            try{
                rs = objb.getSt().executeQuery(sql);
                    while(rs.next()){
                        
                        codigoP0=rs.getString("codigoP");
                        nombreP10=rs.getString("nombreP1");
                        nombreP20=rs.getString("nombreP2");
                        apellidoP10=rs.getString("apellidoP1");
                        apellidoP20=rs.getString("apellidoP2");
                        telefonoP10=rs.getString("telefonoP1");
                        telefonoP20=rs.getString("telefonoP2");
                        correoP0=rs.getString("correoP");
                        contraseñaP0=rs.getString("contraseñaP");
                        direccionP0=rs.getString("direccionP");
                        
                        lp.add(new Profesor(codigoP0,nombreP10,nombreP20,apellidoP10,apellidoP20,telefonoP10,telefonoP20,correoP0,contraseñaP0,direccionP0));
                    }
            }catch (SQLException ex){
                    Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE,null, ex);
                    }
        }
        return lp;
    }
}
