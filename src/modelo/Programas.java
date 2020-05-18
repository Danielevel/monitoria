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
public class Programas {
    
    private String idPrograma;
    private String nombrePrograma;

    public Programas() {
    }

//    public Programas(int idPrograma, String nombrePrograma) {
//        this.idPrograma = idPrograma;
//        this.nombrePrograma = nombrePrograma;
//    }

    public Programas(String idPrograma, String nombrePrograma) {
     this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;  
    }

    public Programas(String nombrePrograma) {
         this.nombrePrograma = nombrePrograma;  
    }
    

    /**
     * Get the value of nombrePrograma
     *
     * @return the value of nombrePrograma
     */
    public String getNombrePrograma() {
        return nombrePrograma;
    }

    /**
     * Set the value of nombrePrograma
     *
     * @param nombrePrograma new value of nombrePrograma
     */
    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }


    /**
     * Get the value of idPrograma
     *
     * @return the value of idPrograma
     */
    public String getIdPrograma() {
        return idPrograma;
    }

    /**
     * Set the value of idPrograma
     *
     * @param idPrograma new value of idPrograma
     */
    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }

    @Override
    public String toString() {
        return "Programas{" + "idPrograma=" + idPrograma + ", nombrePrograma=" + nombrePrograma + '}';
    }

    public boolean insertProgramas(String sql, LinkedList<Programas> le) {
          boolean t = false;
        BaseDatos objb  = new BaseDatos();
        PreparedStatement ps = null;
        for (int i = 0; i < le.size(); i++){
            
        
        try {
            if (objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, le.get(i).getNombrePrograma());
               // ps.setString(2, le.get(i).getNombrePrograma());
              
                objb.getConexion().commit();
                t = true;
            }
            
           
        }catch (Exception ex){
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }finally {
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

    public boolean insertProgramas(String sql) {
        boolean t=false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t= false;
            }
        }
        
        return t;
    }

    public LinkedList<Programas> consultarProgramas(String sql) {
       LinkedList<Programas> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();

        String codigoprograma = "";
        String programa = "";
        

        ResultSet rs = null;
        if (objb.crearConexion()) {

            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    codigoprograma = rs.getString("idPrograma");
                    programa = rs.getString("nombrePrograma");
                

                    lc.add(new Programas(codigoprograma, programa));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Programas.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        return lc;
    }
    }


