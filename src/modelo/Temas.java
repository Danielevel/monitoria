/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import control.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Temas {
    
    private int idTema;
    private String nombreTema;
    private int idAsigFT;

    public Temas() {
    }

    public Temas(int idTema, String nombreTema, int idAsigFT) {
        this.idTema = idTema;
        this.nombreTema = nombreTema;
        this.idAsigFT = idAsigFT;
    }

    public Temas(String nombreTema) {
        this.nombreTema = nombreTema;
        
    }

    public Temas(String nombreTema, int idAsigFT) {
        this.nombreTema = nombreTema;
        this.idAsigFT = idAsigFT;
    }

 
    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public int getIdAsigFT() {
        return idAsigFT;
    }

    public void setIdAsigFT(int idAsigFT) {
        this.idAsigFT = idAsigFT;
    }

    @Override
    public String toString() {
        return "Temas{" + "idTema=" + idTema + ", nombreTema=" + nombreTema + ", idAsigFT=" + idAsigFT + '}';
    }

    
    
public boolean insertarTemas(String sql) {
        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        if(objCon.crearConexion()){
            try{
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            }catch (SQLException ex){
                t=false;
            }
        }
        return t;
        
        
    }
    public LinkedList<Temas> consultarTemas(String sql) {
        LinkedList<Temas> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idTema1=0;
        String nombreTemas1="";
        int idAsigna= 0;
        ResultSet rs = null;
        if (objb.crearConexion()){
            try{
                rs = objb.getSt().executeQuery(sql);
                    while(rs.next()){
                        idTema1 = rs.getInt("idTema");
                        nombreTemas1 = rs.getString("nombreTema");  
                      lc.add(new Temas(idTema1,nombreTemas1,idAsigna));
                       
                                }
            }catch (SQLException ex){
                    Logger.getLogger(Temas.class.getName()).log(Level.SEVERE,null, ex);
                    }
        }
        return lc;
    }

    public boolean insertarTemas(String sql, Temas obj) {
     boolean t = false;
        BaseDatos objCon = new BaseDatos();
        if(objCon.crearConexion()){
            try{
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            }catch (SQLException ex){
                t=false;
            }
        }
        return t;
        
    }
    

    
   

}
