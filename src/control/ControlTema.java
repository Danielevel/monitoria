/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Asignaturas;
import modelo.Inscripciones;
import modelo.Temas;

/**
 *
 * @author HEWLETT PACKARD
 */
public class ControlTema {

    public LinkedList<Temas> consultarTemas() {

        LinkedList<Temas> la = new LinkedList<>();
        String sql = "select * from temas";
        
        Temas obja = new Temas();
        la = obja.consultarTemas(sql);

        return la;

    }

    /* public boolean insertarTemas(LinkedList<Temas> listaTemas) {

        boolean t=false;
        Temas objc=new Temas();
        for (int i = 0;i< listaTemas.size();i++){
            Temas get = listaTemas.get(i);
            String sql = "insert into temas(nombreTema) value('"+get.getNombreTema()+"')";
        
            t=objc.insertarTemas(sql);
        }
        
        return t;
        
*/

     public boolean insertarTemas(Temas obj) {
        boolean t = false;
        String sql = "";
         sql="insert into Temas(nombreTema,idAsigFT) values (?,?);";
        Temas objp2= new Temas();
        t = objp2.insertarTemas(sql, obj);
        return t;
        
    }
}
