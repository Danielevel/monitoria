/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.logging.Logger;
import modelo.Profesor;

/**
 *
 * @author User
 */
public class ControlProfesor {
    
    public boolean insertProfesor(LinkedList<Profesor> LProfesor) {
        boolean t = false;
        // FileInputStream fis=null;
        Profesor objP = new Profesor();
        for (int i = 0; i < LProfesor.size(); i++) {
            t = objP.insertProfesor(LProfesor.get(i));
        }
        return t;
    }
    
}
