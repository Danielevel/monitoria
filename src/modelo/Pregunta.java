/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import control.ConnectDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Pregunta {

    private int idPregunta;
    private String PreguntaP;
    private Timestamp FechayHoraP;
    private String codigoEFP;
    private int idTemaFP;

    public Pregunta() {
    }

    public Pregunta(String PreguntaP, String codigoEFP, int idTemaFP) {
        this.PreguntaP = PreguntaP;
        this.codigoEFP = codigoEFP;
        this.idTemaFP = idTemaFP;
    }

    public Pregunta(int idPregunta, String PreguntaP, Timestamp FechayHoraP, int idTemaFP) {
        this.idPregunta = idPregunta;
        this.PreguntaP = PreguntaP;
        this.FechayHoraP = FechayHoraP;
        this.idTemaFP = idTemaFP;
    }

    public Pregunta(int idPregunta, String PreguntaP) {
        this.idPregunta = idPregunta;
        this.PreguntaP = PreguntaP;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPreguntaP() {
        return PreguntaP;
    }

    public void setPreguntaP(String PreguntaP) {
        this.PreguntaP = PreguntaP;
    }

    public Timestamp getFechayHoraP() {
        return FechayHoraP;
    }

    public void setFechayHoraP(Timestamp FechayHoraP) {
        this.FechayHoraP = FechayHoraP;
    }

    public String getCodigoEFP() {
        return codigoEFP;
    }

    public void setCodigoEFP(String codigoEFP) {
        this.codigoEFP = codigoEFP;
    }

    public int getIdTemaFP() {
        return idTemaFP;
    }

    public void setIdTemaFP(int idTemaFP) {
        this.idTemaFP = idTemaFP;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "idPregunta=" + idPregunta + ", PreguntaP=" + PreguntaP + ", FechayHoraP=" + FechayHoraP + ", codigoEFP=" + codigoEFP + ", idTemaFP=" + idTemaFP + '}';
    }

    public boolean insertarPregunta(String sql, Pregunta obE) {
       boolean t = false;
        PreparedStatement ps = null;
        ConnectDB objC = new ConnectDB();try {
            if (objC.crearConexion()) {
                objC.getConexion().setAutoCommit(false);

                ps = objC.getConexion().prepareStatement(sql);
                ps.setString(1, obE.getPreguntaP());
                ps.setString(2, obE.getCodigoEFP());
                ps.setString(3, Integer.toString(obE.getIdTemaFP()));
                
                ps.executeUpdate();
                objC.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
        
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
    }

    public LinkedList<Pregunta> getrPreguntaCombo(String sql) throws SQLException {
        LinkedList<Pregunta> lpre = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idPre1 = 0;

        String preguntaPl = "";
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    idPre1 = rs.getInt("idPregunta");
                    preguntaPl = rs.getString("preguntaP");

                    lpre.add(new Pregunta(idPre1, preguntaPl));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Pregunta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lpre;
    }

//    public boolean insertarPregunta(String sql, Pregunta objP) {
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
//    }
}
