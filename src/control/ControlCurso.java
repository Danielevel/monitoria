/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Curso;
import modelo.Temas;

/**
 *
 * @author HEWLETT PACKARD
 */
public class ControlCurso {

    public LinkedList<Curso> consultarCurso;

    //public LinkedList<Curso> consultarCurso;

   /*
    public boolean insertarCurso(LinkedList<Curso> listaCurso) {

        boolean t=false;
        Curso objcur=new Curso();
        for (int i = 0;i< listaCurso.size();i++){
            Curso get = listaCurso.get(i);
           // String sql = "insert into curso(nombreCur) value('"+get.getNombreCur()+"')";
            String sql = "insert into curso(nombreCur,idAsigFCU,codigoPFCU) VALUES('"+get.getNombreCur()+","+get.getIdAsigFCU()+","+get.getCodigoPFCU()+"')";
        
            t=objcur.insertarCurso(sql);
        }
        
        return t;
        
    }
*/

    public boolean insertarCurso(Curso objCurso) {
            boolean t = false;
            Curso objC2 = new Curso();
            String sql="";
            sql = "INSERT INTO cursos (nombreCur,idAsigFCU,codigoPFCU) VALUES(?,?,?)";
            t = objC2.insertarCurso(objCurso,sql);
            return t;
    }
    
    
        public LinkedList<Curso> consultarCurso() {

        LinkedList<Curso> la = new LinkedList<>();
        String sql = "select * from monitorias.cursos";
        Curso obja = new Curso();
        la = obja.consultarCursos(sql);

        return la;

    }

}
