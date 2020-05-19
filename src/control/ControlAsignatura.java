/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Asignaturas;

/**
 *
 * @author HEWLETT PACKARD
 */
public class ControlAsignatura {

    public boolean insertarCiudades(LinkedList<Asignaturas> listaAsignaturas) {

        boolean t=false;
        Asignaturas objc=new Asignaturas();
        for (int i = 0;i< listaAsignaturas.size();i++){
            Asignaturas get = listaAsignaturas.get(i);
            String sql = "insert into asignaturas(nombreAsig) value('"+get.getNombreAsig()+"')";
        
            t=objc.insertarAsignaturas(sql);
        }
        
        return t;
        
    }

    public LinkedList<Asignaturas> consultarAsignaturas() throws SQLException {

        LinkedList<Asignaturas> la= new LinkedList<>();
        String sql="select * from asignaturas";
        Asignaturas obja = new Asignaturas();
        la=obja.getrAsignaturasCombo(sql);
        
        return la;
    }
    
}
