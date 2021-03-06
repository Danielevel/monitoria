/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import control.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Inscripciones {

    private int idIns;
    private String periodoAcademico;
    private String codigoEFI;
    private int idcursoFI;

    public Inscripciones() {
    }

    public Inscripciones(String periodoAcademico, String codigoEFI, int idcursoFI) {
        this.periodoAcademico = periodoAcademico;
        this.codigoEFI = codigoEFI;
        this.idcursoFI = idcursoFI;
    }

    public Inscripciones(int idIns, String periodoAcademico, String codigoEFI, int idcursoFI) {
        this.idIns = idIns;
        this.periodoAcademico = periodoAcademico;
        this.codigoEFI = codigoEFI;
        this.idcursoFI = idcursoFI;
    }

    public int getIdIns() {
        return idIns;
    }

    public void setIdIns(int idIns) {
        this.idIns = idIns;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public String getCodigoEFI() {
        return codigoEFI;
    }

    public void setCodigoEFI(String codigoEFI) {
        this.codigoEFI = codigoEFI;
    }

    public int getIdcursoFI() {
        return idcursoFI;
    }

    public void setIdcursoFI(int idcursoFI) {
        this.idcursoFI = idcursoFI;
    }

    @Override
    public String toString() {
        return "Inscripciones{" + "idIns=" + idIns + ", periodoAcademico=" + periodoAcademico + ", codigoEFI=" + codigoEFI + ", idcursoFI=" + idcursoFI + '}';
    }

    public boolean insertarInscripcion(String sql, Inscripciones obE) {
        boolean t = false;
        PreparedStatement ps = null;
        ConnectDB objC = new ConnectDB();try {
            if (objC.crearConexion()) {
                objC.getConexion().setAutoCommit(false);

                ps = objC.getConexion().prepareStatement(sql);
                ps.setString(1, obE.getPeriodoAcademico());
                ps.setString(2, obE.getCodigoEFI());
                ps.setString(3, Integer.toString(obE.getIdcursoFI()));
                
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

//    public boolean insertarInscripcion(String sql, Inscripciones objP) {
//        boolean t = false;
//        BaseDatos objCon = new BaseDatos();
//        if (objCon.crearConexion()) {
//            try {
//                Statement sentencia = objCon.getConexion().createStatement();
//                sentencia.executeUpdate(sql);
//                t = true;
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                t = false;
//            }
//        }
//        return t;
//
//    }
}
