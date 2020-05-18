/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Profesor;

/**
 *
 * @author User
 */
public class ControlProfesor {

    public boolean insertProfesor(LinkedList<Profesor> LProfesores)  {
        boolean t = false;
        // FileInputStream fis=null;
        Profesor objP = new Profesor();
        for (int i = 0; i < LProfesores.size(); i++) {
            try {
                t = objP.insertProfesor(LProfesores.get(i));
            } catch (SQLException ex) {
                Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return t;
    }

    public LinkedList<Profesor> consultarProfesor() {

        LinkedList<Profesor> ma = new LinkedList<>();
        String sql = "select codigoP,nombreP1,nombreP2,apellidoP1,apellidoP2,telefonoP1,telefonoP2,correoP,contraseñaP,dirrecionP";
        Profesor obja = new Profesor();
        ma = obja.ejecutarSQLSelectProfesor(sql);

        return ma;

    }

    public boolean insertProfesor(String string, LinkedList<Profesor> listaP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
