/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Programas;

/**
 *
 * @author jairo
 */
public class ControlProgramas {

    public static boolean insertProgramas(LinkedList<Programas> le) {
       boolean t=false;
        Programas objciudad=new Programas();
        for (int i = 0; i < le.size(); i++) {
            Programas getobjeto = le.get(i);
            String sql="insert into programas(nombrePrograma) value('"+getobjeto.getNombrePrograma()+"');";
            t=objciudad.insertProgramas(sql);
        }
        
        
        return t;
    }
    
}
