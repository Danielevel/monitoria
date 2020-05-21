/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Pregunta;

/**
 *
 * @author User
 */
public class ControlPregunta {
    
    public boolean insertarPregunta(LinkedList<Pregunta>listaPregunta) {

        boolean t=false;
        Pregunta objc=new Pregunta();
        for (int i = 0;i< listaPregunta.size();i++){
            Pregunta get = listaPregunta.get(i);
            String sql = "insert into asignaturas(PreguntaP,codigoEFP,idTemaFP) value('"+get.getPreguntaP()+","+get.getCodigoEFP()+","+get.getIdTemaFP()+"')";
        
            t=objc.insertarPregunta(sql);
        }
        
        return t;
        
    }
    
    public boolean insertarPregunta(Pregunta objP) {

         
        boolean t = false;
        String sql = "";
        sql = "insert into asignaturas(PreguntaP,codigoEFP,idTemaFP) value(?,?,?)";
        Pregunta objPl = new Pregunta();
        t = objPl.insertarPregunta(sql, objPl);
        return t;
        
    }

  

   
    
    
    
}
