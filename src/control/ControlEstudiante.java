/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Estudiante;
import modelo.Programas;

/**
 *
 * @author jairo
 */
public class ControlEstudiante {

    public static boolean insertEstudante(LinkedList<Estudiante> le) {
        boolean t= false;
        String sql="";
        sql="insert into estudiantes  values (?,?,?,?,?,?,?,?,?,?);";
        Estudiante obje= new Estudiante();
        
        t = obje.insertEstudiante(sql,le); 
        
        
        
        
        
        return t ;
    }

    

    public boolean insertarEstudiante(Estudiante objt) {
        boolean t = false;
        String sql = "";
         sql="insert into estudiantes  values (?,?,?,?,?,?,?,?,?,?,?);";
        Estudiante objp2 = new Estudiante();
        t = objp2.insertarEstudiante(objt, sql);
        return t;
        
    }

    public LinkedList<Programas> consultarPrograma() {
        LinkedList<Programas> lef = new LinkedList<>();
        Programas objef = new Programas();
        String sql = "select * from programas ";
        lef = objef.consultarProgramas(sql);
        return lef;
       
    }

      
    
    
    
    
}
