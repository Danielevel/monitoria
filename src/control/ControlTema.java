/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Temas;

/**
 *
 * @author HEWLETT PACKARD
 */
public class ControlTema{

    public boolean insertarTemas(LinkedList<Temas> listadeTemas) {

        boolean t=false;
        Temas objc=new Temas();
        for (int i = 0;i< listadeTemas.size();i++){
            Temas get = listadeTemas.get(i);
            String sql = "insert into asignaturas(nombreTema) value('"+get.getnombreTema()+"')";
        
            t=objc.insertarTemas(sql);
        }
        
        return t;
        
    }

    public LinkedList<Temas> consultarTema() {

        LinkedList<Temas> la= new LinkedList<>();
        String sql="select * from asignaturas";
        Temas obja = new Temas();
        la=obja.getNombreTema();
        
        return la;
    }

    
}