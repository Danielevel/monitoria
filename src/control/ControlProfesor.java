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

    public static boolean InsertarProfesor(LinkedList<Profesor> Lp) {
        boolean t= false;
        String sql="";
        sql="insert into profesores  values (?,?,?,?,?,?,?,?,?,?);";
        Profesor objP= new Profesor();
        
        t = objP.insertProfesor(sql, objP);
        
        
        
        
        
        return t ;
    }
    
    public boolean insertarProfesor(Profesor objP) {
        boolean t = false;
        String sql = "";
         sql="insert into profesores  values (?,?,?,?,?,?,?,?,?,?);";
        Profesor objp2 = new Profesor();
        t = objp2.insertProfesor(sql, objP);
        return t;
        
    }

    public LinkedList<Profesor> consultarProfesor() {

        LinkedList<Profesor> ma = new LinkedList<>();
        //String sql = "select codigoP,nombreP1,nombreP2,apellidoP1,apellidoP2,telefonoP1,telefonoP2,correoP,contraseñaP,dirrecionP";
        String sql = "select * from profesores";
        Profesor obja = new Profesor();
        //ma = obja.ListraProfesores(sql);
        ma = obja.ListraProfesores(sql);

        return ma;

    }

   

}
