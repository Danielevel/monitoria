/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlAsignatura;
import control.ControlCurso;
import control.ControlProfesor;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Asignaturas;
import modelo.Curso;
import modelo.Profesor;
//--------------------------------------------
import control.BaseDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
//-----------------------------------------------
/**
 *
 * @author HEWLETT PACKARD
 */
public class VistaCurso extends javax.swing.JFrame {

    
    
    LinkedList<Asignaturas> listaAsignaturas;
    LinkedList<Profesor> listaProfesor;
    
    LinkedList<Curso> listaCurso;
   
    /**
     * Creates new form VistaCurso
     */
    public VistaCurso() {
        initComponents();
        listaAsignaturas = new LinkedList<>();
        listaProfesor = new LinkedList<>();
        listaCurso = new LinkedList<>();
        Mostrar();
    }
    
    private void Mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        //ResultSet rs = BaseDatos.getTabla("SELECT idcurso,nombreCur,idAsigFCU, codigoPFCU FROM monitorias.cursos");
        ResultSet rs = BaseDatos.getTabla("SELECT cursos.idcurso, cursos.nombreCur, asignaturas.nombreAsig, profesores.nombreP1 FROM monitorias.cursos,monitorias.asignaturas,monitorias.profesores WHERE asignaturas.idAsig = cursos.idAsigFCU and profesores.codigoP=cursos.codigoPFCU ORDER by cursos.idcurso");           
        modelo.setColumnIdentifiers(new Object[]{"ID","Curso","Asignatura","Profesor"});
        try {
            while (rs.next()){
                //modelo.addRow(new Object[]{rs.getInt("idcurso"),rs.getString("nombreCur"),rs.getString("idAsigFCU"),rs.getString("codigoPFCU")});
                modelo.addRow(new Object[]{rs.getInt("idcurso"),rs.getString("nombreCur"),rs.getString("nombreAsig"),rs.getString("nombreP1")});

            }
            jTable1.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cursos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Registro seleccionado:");

        jLabel2.setText("Asignatura del curso");

        jLabel6.setText("Ninguno");

        jLabel3.setText("Profesor del curso");

        jComboBox2.setMaximumRowCount(99);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del Curso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Insertar Modificar Cursos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(22, 22, 22)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
//---------------------------[MOSTRAR ASIGNATURAS]---------------------------------
            ControlAsignatura objca = new ControlAsignatura();
        try {
            listaAsignaturas = objca.consultarAsignaturas();
        } catch (SQLException ex) {
            Logger.getLogger(VistaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
            for (int i = 0; i < listaAsignaturas.size(); i++) {
            Asignaturas objetoAsignatura = listaAsignaturas.get(i);
            jComboBox1.addItem(objetoAsignatura.getNombreAsig());
        }
//---------------------------[MOSTRAR PROFESORES]---------------------------------
            ControlProfesor objcp = new ControlProfesor();
            listaProfesor = objcp.consultarProfesor();
            
            
            for (int j = 0; j < listaProfesor.size(); j++) {
                Profesor objetoProfesor = listaProfesor.get(j);
                jComboBox2.addItem(objetoProfesor.getNombreP1());
            }
            
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombreC = jTextField1.getText();//agarrar el nombre del textfield 1
        int ida=0;//-----------------[id de la asignatura]
        String idp="";//-------------[id del profesor]
        String nombreAsignatura = jComboBox1.getSelectedItem().toString();//---selecciona el item el JComboBox1
        
        
        for (int i = 0; i < listaAsignaturas.size(); i++) {
            Asignaturas asignatura=listaAsignaturas.get(i);
            if(nombreAsignatura.equals(asignatura.getNombreAsig())){
                ida=asignatura.getIdAsig();
                System.out.println("ida "+ ida);
                
            }
        }
        
       String NombreProfesor = jComboBox2.getSelectedItem().toString();//----selecciona el item el JComboBox2
       for (int j = 0; j < listaProfesor.size(); j++) {
           Profesor profe = listaProfesor.get(j);
           if(NombreProfesor.equals(profe.getNombreP1())){
               idp = profe.getCodigoP();
               //System.out.println("idp "+ idp);
           }
       }
       
      // listaCurso.add(new Curso(nombreC, ida, idp));
       Curso objCurso = new Curso(nombreC, ida, idp);
       ControlCurso objcurs = new ControlCurso();
       boolean t=objcurs.insertarCurso(objCurso);
       if(t==true){
           JOptionPane.showMessageDialog(rootPane,"Insertado con Exito");
       }else{
           JOptionPane.showMessageDialog(rootPane,"no Insertado");
       }
                //objCurso = new Curso(nombreC,ida,idp);
                
                Mostrar();// REFRESCAR/ACTUALIZAR LA LISTA
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        ResultSet rs;
        PreparedStatement ps;
        jComboBox1.setSelectedIndex(-1);
        jComboBox2.setSelectedIndex(-1);
        
        int Fila = jTable1.getSelectedRow();
        String codigo = jTable1.getValueAt(Fila, 0).toString();
        String sql ="SELECT idcurso,nombreCur,idAsigFCU, codigoPFCU FROM monitorias.cursos WHERE idcurso = ? ";

        //String sql ="SELECT idcurso,nombreCur,idAsigFCU, codigoPFCU,nombreP FROM monitorias.cursos,monitorias.profesores WHERE codigoP = idcurso = ? ";

        //String sql ="SELECT idAsig,nombreAsig FROM monitorias.asignaturas WHERE idAsig = ?" ;
        
        
        
        try {
            
            
            ps = BaseDatos.getConexionStatic().prepareStatement(sql);
            ps.setString(1,codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                jLabel6.setText(rs.getString("idcurso"));
                
                jTextField1.setText(rs.getString("nombreCur"));
                
               //jComboBox1.setSelectedIndex((rs.getInt("idAsigFCU"))-1);
                //jComboBox2.setSelectedIndex((rs.getInt("codigoPFCU")));
               // jComboBox2.setSelectedIndex(rs.getInt("codigoPFCU"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaAsignatura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String modificacion = jTextField1.getText();//  los campos que voy a modificar
//--------------------------------------------------------------------------------------------------
         int ida=0;//-----------------[id de la asignatura]
        String idp="";//-------------[id del profesor]
        String nombreAsignatura = jComboBox1.getSelectedItem().toString();//---selecciona el item el JComboBox1
        String NombreProfesor = jComboBox2.getSelectedItem().toString();//----selecciona el item el JComboBox2
        
        
        for (int i = 0; i < listaAsignaturas.size(); i++) {
            Asignaturas asignatura=listaAsignaturas.get(i);
            if(nombreAsignatura.equals(asignatura.getNombreAsig())){
                ida=asignatura.getIdAsig();
                System.out.println("ida "+ ida);
                
            }
        }
       for (int j = 0; j < listaProfesor.size(); j++) {
           Profesor profe = listaProfesor.get(j);
           if(NombreProfesor.equals(profe.getNombreP1())){
               idp = profe.getCodigoP();
               //System.out.println("idp "+ idp);
           }
       }
         
//--------------------------------------------------------------------------------------------------
      
        String Objetivo = jLabel6.getText();        //  el ID el campo que voy a modificar
        
        String sqlModify2 = "UPDATE monitorias.cursos SET nombreCur = '"+ modificacion +"', idAsigFCU = '"+ ida +"',codigoPFCU = '"+idp+"' WHERE idcurso = '"+ Objetivo +"'"; 
        //sentencia sql
        
        try {
            Statement sentencia = BaseDatos.getConexionStatic().createStatement(); // conectarse a la base de datos y enviar una sentencia
            sentencia.execute(sqlModify2); // ejecutar la sentencia
            
        } catch (SQLException ex) {
            Logger.getLogger(VistaAsignatura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Mostrar();// refrescar/re-cargar la lista
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
