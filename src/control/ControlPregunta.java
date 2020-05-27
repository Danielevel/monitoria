/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pregunta;
import modelo.Profesor;

/**
 *
 * @author User
 */
public class ControlPregunta {

//    public boolean insertarPregunta(LinkedList<Pregunta> listaPregunta) {
//
//        boolean t = false;
//        Pregunta objc = new Pregunta();
//        for (int i = 0; i < listaPregunta.size(); i++) {
//            Pregunta get = listaPregunta.get(i);
//            String sql = "insert into preguntas(PreguntaP,codigoEFP,idTemaFP) values(?,?,?)";
//
//            t = objc.insertarPregunta(sql);
//        }
//
//        return t;
//
//    }

    public boolean insertarPregunta(Pregunta objP) {

        boolean t = false;
        String sql = "insert into preguntas(PreguntaP,codigoEFP,idTemaFP) values (?,?,?)";
        Pregunta objPl = new Pregunta();
        t = objPl.insertarPregunta(sql, objP);
        return t;

    }

//  public LinkedList<Pregunta> consultarPregunta() {
//
//        LinkedList<Profesor> ma = new LinkedList<>();
//        //String sql = "select codigoP,nombreP1,nombreP2,apellidoP1,apellidoP2,telefonoP1,telefonoP2,correoP,contraseñaP,dirrecionP";
//        String sql = "select * from pregunta";
//        Pregunta obja = new Pregunta();
//        ma = obja.ListraProfesores(sql);
////        try {
////            
////            ma = obja.ListraProfesores(sql);
////            
////        } catch (SQLException ex) {
////            Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
////        }
////
//        return ma;
//
//   
//    
//    
//    
//}
}
