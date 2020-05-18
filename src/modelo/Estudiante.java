/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairo
 */
public class Estudiante {

    private String codigoE;
    private String nombreE1;
    private String nombreE2;
    private String apellidoE1;
    private String apellidoE2;
    private String telefonoE1;
    private String telefonoE2;
    private String correoE;
    private String contraseñaE;
    private String direccionE;
    private String idProgramaF;
   
    public Estudiante() {
    }

    public Estudiante(String codigoE, String nombreE1, String nombreE2, String apellidoE1, String apellidoE2, String telefonoE1, String telefonoE2, String correoE, String contraseñaE, String direccionE, String idProgramaF) {
        this.codigoE = codigoE;
        this.nombreE1 = nombreE1;
        this.nombreE2 = nombreE2;
        this.apellidoE1 = apellidoE1;
        this.apellidoE2 = apellidoE2;
        this.telefonoE1 = telefonoE1;
        this.telefonoE2 = telefonoE2;
        this.correoE = correoE;
        this.contraseñaE = contraseñaE;
        this.direccionE = direccionE;
        this.idProgramaF = idProgramaF;
    }

    public String getIdProgramaF() {
        return idProgramaF;
    }

    public void setIdProgramaF(String idProgramaF) {
        this.idProgramaF = idProgramaF;
    }

    public String getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    public String getNombreE1() {
        return nombreE1;
    }

    public void setNombreE1(String nombreE1) {
        this.nombreE1 = nombreE1;
    }

    public String getNombreE2() {
        return nombreE2;
    }

    public void setNombreE2(String nombreE2) {
        this.nombreE2 = nombreE2;
    }

    public String getApellidoE1() {
        return apellidoE1;
    }

    public void setApellidoE1(String apellidoE1) {
        this.apellidoE1 = apellidoE1;
    }

    public String getApellidoE2() {
        return apellidoE2;
    }

    public void setApellidoE2(String apellidoE2) {
        this.apellidoE2 = apellidoE2;
    }

    public String getTelefonoE1() {
        return telefonoE1;
    }

    public void setTelefonoE1(String telefonoE1) {
        this.telefonoE1 = telefonoE1;
    }

    public String getTelefonoE2() {
        return telefonoE2;
    }

    public void setTelefonoE2(String telefonoE2) {
        this.telefonoE2 = telefonoE2;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getContraseñaE() {
        return contraseñaE;
    }

    public void setContraseñaE(String contraseñaE) {
        this.contraseñaE = contraseñaE;
    }

    public String getDireccionE() {
        return direccionE;
    }

    public void setDireccionE(String direccionE) {
        this.direccionE = direccionE;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigoE=" + codigoE + ", nombreE1=" + nombreE1 + ", nombreE2=" + nombreE2 + ", apellidoE1=" + apellidoE1 + ", apellidoE2=" + apellidoE2 + ", telefonoE1=" + telefonoE1 + ", telefonoE2=" + telefonoE2 + ", correoE=" + correoE + ", contrase\u00f1aE=" + contraseñaE + ", direccionE=" + direccionE + ", idProgramaF=" + idProgramaF + '}';
    }

    public boolean insertEstudiante(String sql, LinkedList<Estudiante> le) {

        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        for (int i = 0; i < le.size(); i++) {

            try {
                if (objb.crearConexion()) {
                    objb.getConexion().setAutoCommit(false);

                    ps = objb.getConexion().prepareStatement(sql);
                    ps.setString(1, le.get(i).getCodigoE());
                    ps.setString(2, le.get(i).getNombreE1());
                    ps.setString(3, le.get(i).getNombreE2());
                    ps.setString(4, le.get(i).getApellidoE1());
                    ps.setString(5, le.get(i).getApellidoE2());
                    ps.setString(6, le.get(i).getTelefonoE1());
                    ps.setString(7, le.get(i).getTelefonoE2());
                    ps.setString(8, le.get(i).getCorreoE());
                    ps.setString(9, le.get(i).getContraseñaE());
                    ps.setString(10, le.get(i).getDireccionE());
                    ps.executeUpdate();
                    objb.getConexion().commit();
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

    public boolean insertarEstudiante(Estudiante objt, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;

        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);

                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objt.getCodigoE());
                ps.setString(2, objt.getNombreE1());
                ps.setString(3, objt.getNombreE2());
                ps.setString(4, objt.getApellidoE1());
                ps.setString(5, objt.getApellidoE2());
                ps.setString(6, objt.getTelefonoE1());
                ps.setString(7, objt.getTelefonoE2());
                ps.setString(8, objt.getCorreoE());
                ps.setString(9, objt.getContraseñaE());
                ps.setString(10, objt.getDireccionE());
                ps.setString(11, objt.getIdProgramaF());
                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }

        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;

    }

}
