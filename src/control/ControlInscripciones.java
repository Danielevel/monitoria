/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Inscripciones;
import modelo.Profesor;

/**
 *
 * @author User
 */
public class ControlInscripciones {
    
    public static boolean InsertarInscripcion(LinkedList<Inscripciones> Lp) {
        boolean t= false;
        String sql="";
        sql="insert into inscripciones (periodoAcademico,codigoEFI,idcursoFI)  values (?,?,?);";
        Inscripciones objI= new Inscripciones();
        
        t = objI.insertarInscripcion(sql,objI);
        
        
        
        
        
        return t ;
    }
    
    public boolean insertarInscripcion(Inscripciones obj) {
        boolean t = false;
        String sql = "";
         sql="insert into (periodoAcademico,codigoEFI,idcursoFI) values (?,?,?);";
        Inscripciones objp2= new Inscripciones();
        t = objp2.insertarInscripcion(sql, obj);
        return t;
        
    }

    
    
}
