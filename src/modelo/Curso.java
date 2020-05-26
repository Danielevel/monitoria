/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HEWLETT PACKARD
 */
public class Curso {
    
    private int idcurso;
    private String nombreCur;
    private int idAsigFCU;
    private String codigoPFCU;

    public Curso() {
    }

    public Curso(int idcurso, String nombreCur, int idAsigFCU, String codigoPFCU) {
        this.idcurso = idcurso;
        this.nombreCur = nombreCur;
        this.idAsigFCU = idAsigFCU;
        this.codigoPFCU = codigoPFCU;
    }

    public Curso(String nombreCur, int idAsigFCU, String codigoPFCU) {
        this.nombreCur = nombreCur;
        this.idAsigFCU = idAsigFCU;
        this.codigoPFCU = codigoPFCU;
    }
    
    

    /**
     * Get the value of codigoPFCU
     *
     * @return the value of codigoPFCU
     */
    public String getCodigoPFCU() {
        return codigoPFCU;
    }

    /**
     * Set the value of codigoPFCU
     *
     * @param codigoPFCU new value of codigoPFCU
     */
    public void setCodigoPFCU(String codigoPFCU) {
        this.codigoPFCU = codigoPFCU;
    }


    /**
     * Get the value of idAsigFCU
     *
     * @return the value of idAsigFCU
     */
    public int getIdAsigFCU() {
        return idAsigFCU;
    }

    /**
     * Set the value of idAsigFCU
     *
     * @param idAsigFCU new value of idAsigFCU
     */
    public void setIdAsigFCU(int idAsigFCU) {
        this.idAsigFCU = idAsigFCU;
    }

    
    

    /**
     * Get the value of nombreCur
     *
     * @return the value of nombreCur
     */
    public String getNombreCur() {
        return nombreCur;
    }

    /**
     * Set the value of nombreCur
     *
     * @param nombreCur new value of nombreCur
     */
    public void setNombreCur(String nombreCur) {
        this.nombreCur = nombreCur;
    }


    /**
     * Get the value of idcurso
     *
     * @return the value of idcurso
     */
    public int getIdcurso() {
        return idcurso;
    }

    /**
     * Set the value of idcurso
     *
     * @param idcurso new value of idcurso
     */
    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }
    
    public boolean insertarCurso(Curso objCurso, String sql) {
        boolean t = false;
       /*
        BaseDatos objCon = new BaseDatos();
        if(objCon.crearConexion()){
            try{
                Statement sentencia;
                sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            }catch (SQLException ex){
                t=false;
            }
        }*/
       BaseDatos objb = new BaseDatos();
       //FileInputStream fis = null;
       PreparedStatement ps = null;
       try{
           if(objb.crearConexion()){
               objb.getConexion().setAutoCommit(false);
               ps=objb.getConexion().prepareCall(sql);
               ps.setString(1, objCurso.getNombreCur());
               ps.setInt(2, objCurso.getIdAsigFCU());
               ps.setString(3, objCurso.getCodigoPFCU());
               
               ps.executeUpdate();
               objb.getConexion().commit();
               t=true;
           }
       } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            t=false;
        }
       
        return t;
    }
    
    public LinkedList<Curso> consultarCursos(String sql) {
        LinkedList<Curso> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idCurso=0;
        String nombreCurso="";
        int idAsigna= 0;
        String codigoP = "";
        ResultSet rs = null;
        if (objb.crearConexion()){
            try{
                rs = objb.getSt().executeQuery(sql);
                    while(rs.next()){
                        idCurso = rs.getInt("idcurso");
                        nombreCurso = rs.getString("nombreCur");
                        idAsigna =rs.getInt("idAsigFCU");
                        codigoP = rs.getString("codigoPFCU");
                        
                      lc.add(new Curso(idCurso, nombreCurso, idAsigna, codigoP));
                       
                                }
            }catch (SQLException ex){
                    Logger.getLogger(Temas.class.getName()).log(Level.SEVERE,null, ex);
                    }
        }
        return lc;
    }

}
