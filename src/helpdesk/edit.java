/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Xóchitl Garza
 */
public class edit extends javax.swing.JFrame {

    /**
     * Creates new form help
     */
     String ID;
       String Fecha;
       String Correo;
       String Nombre;
       String Cuatrimestre;
       String Carrera;
       String Departamento;
       String Asignado;
       String Tema;
       String Problema;
          Abierto obj=new Abierto();
       String id=obj.Dato;
    public edit() {
        Calendar cal=Calendar.getInstance(); 
String date=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        initComponents();
       fecha.setText(date);

       
      
       
    }
     void mostrardatos(String valor){
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM abierto WHERE ID= '"+id+"'";
    }
    else{
        sql="SELECT * FROM productos WHERE codigo='"+valor+"'";
    }
 String almacenamiento;
        try {
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ID=rs.getString(1);
                Fecha=rs.getString(2);
                Correo=rs.getString(3);
                Nombre = rs.getString(4);
                Cuatrimestre=rs.getString(5);
                Carrera=rs.getString(6);
                Departamento=rs.getString(7);
               Asignado = rs.getString(8);
              Tema = rs.getString(9); 
               Problema = rs.getString(10);

            }
            
         
        } catch (SQLException ex) {
            Logger.getLogger(Abierto.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        problema = new javax.swing.JTextField();
        carrera = new javax.swing.JComboBox<>();
        cuatrimestre = new javax.swing.JComboBox<>();
        departamento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tema = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        asigna = new javax.swing.JComboBox<>();
        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel9.setText("Tema:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel10.setText("Problema:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 432, -1, -1));

        correo.setBackground(new java.awt.Color(204, 191, 148));
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 247, 330, -1));

        nombres.setBackground(new java.awt.Color(204, 191, 148));
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 273, 330, -1));

        problema.setBackground(new java.awt.Color(204, 191, 148));
        jPanel1.add(problema, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 455, 497, 138));

        carrera.setBackground(new java.awt.Color(204, 191, 148));
        carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria en Software", "Ingeniera Financiera", "Gestion Empresarial", "Ingenieria en Biotecnologia", "Ingeniería Biomedica", "Fisioterapia" }));
        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });
        jPanel1.add(carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 302, 330, -1));

        cuatrimestre.setBackground(new java.awt.Color(204, 191, 148));
        cuatrimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Cuatrimestre", "Segundo Cuatrimestre", "Tercer Cuatrimestre", "Quinto Cuatrimestre", "Sexto Cuatrimestre", "Septimo Cuatrimestre", "Octavo Cuatrimestre", "Noveno Cuatrimestre" }));
        jPanel1.add(cuatrimestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 328, 331, -1));

        departamento.setBackground(new java.awt.Color(204, 191, 148));
        departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagina Web", "Aula 1", "Aula 2", "Aula 3", "Aula 4", "Aula 5", "Aula 6", "Aula 7", "Aula 8", "Aula 9", "Aula 10", "Aula 11", "Aula 12", "Aula 13", "Aula 14", "Laboratorio de Biotecnologia", "Laboratorio de Biomedica", "Laboratorio de Robotica", "Laboratorio de Software", "Sala de Computacion" }));
        jPanel1.add(departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 354, 331, -1));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 99, 25));
        jLabel1.setText("Actualizar TICKET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel3.setText("Correo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 247, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 273, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel6.setText("Carrera:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 299, -1, 22));

        jLabel7.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel7.setText("Cuatrimestre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 328, -1, -1));

        tema.setBackground(new java.awt.Color(204, 191, 148));
        tema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daño", "Problemas tecnicos", "Informacion", "Otros" }));
        jPanel1.add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 380, 331, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel8.setText("Departamento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 354, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Helpshit.png"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(379, 327));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 29, 490, 194));

        jButton1.setBackground(new java.awt.Color(204, 191, 148));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar-Boton1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar-Boton2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 611, 140, 41));

        jButton2.setBackground(new java.awt.Color(204, 191, 148));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Limpiar-Boton1.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Limpiar-Boton2.png"))); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 611, -1, -1));

        fecha.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        fecha.setText("Fecha");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 229, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        jLabel12.setText("Asignado a:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 406, -1, -1));

        asigna.setBackground(new java.awt.Color(204, 191, 148));
        asigna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biotecnologia", "Software", "Fisioterapia", "Biomedica", "Direccion", "Web", "Sistemas" }));
        jPanel1.add(asigna, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 406, 331, -1));

        regresar.setBackground(new java.awt.Color(204, 191, 148));
        regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regresar-Boton1.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setContentAreaFilled(false);
        regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regresar-Boton2.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 611, 119, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 560, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 570, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carreraActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
Calendar cal=Calendar.getInstance(); 
String date=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
         try {
        PreparedStatement pst = cn.prepareStatement("update abiertos set Fecha= ?,correo= ?,Nombres= ?,Carrera= ?,Cuatrimestre= ?, Departamento= ?, Asignado= ?, Tema= ?, Problema= ? where ID='"+id+"'");
        pst.setString(1, date);
        if(correo.getText().equals(""))
        {
           pst.setString(2, Correo); 
        }
       if(!"".equals(correo.getText()))
        {
            pst.setString(2, correo.getText()); 
        }     if(nombres.getText().equals(""))
        {
           pst.setString(3, Nombre); 
        }
         if(!"".equals(nombres.getText()))
        {
            pst.setString(3, nombres.getText()); 
        }
            if(carrera.getSelectedItem().equals(""))
        {
           pst.setString(4, Carrera); 
        }
         if(!"".equals(carrera.getSelectedItem()))
        {
             pst.setString(4, (String) carrera.getSelectedItem());
        }
              if(cuatrimestre.getSelectedItem().equals(""))
        {
           pst.setString(5, Cuatrimestre); 
        }
      if(!"".equals(cuatrimestre.getSelectedItem()))
        {
             pst.setString(5, (String) cuatrimestre.getSelectedItem());
        }
         if(departamento.getSelectedItem().equals(""))
        {
           pst.setString(6, Departamento); 
        }
         if(!"".equals(departamento.getSelectedItem()))
        {
             pst.setString(6, (String) departamento.getSelectedItem());
        }
       if(asigna.getSelectedItem().equals(""))
        {
           pst.setString(7, Asignado); 
        }
        if(!"".equals(asigna.getSelectedItem()))
        {
             pst.setString(7, (String) asigna.getSelectedItem());
        }
     if(tema.getSelectedItem().equals(""))
        {
           pst.setString(8, Tema); 
        }
      if(!"".equals(tema.getSelectedItem()))
        {
             pst.setString(8, (String) tema.getSelectedItem());
        }
       if(problema.getText().equals(""))
        {
           pst.setString(9, Problema); 
        }
        if(!"".equals(problema.getText()))
        {
             pst.setString(9, (String) problema.getText());
        }
        pst.executeUpdate();
    } catch (Exception e) {
        System.out.print(e.getMessage());
    }
         JOptionPane.showMessageDialog(null, "Ticket Actualizado de manera Correcta", 
"Listo...", JOptionPane.INFORMATION_MESSAGE);
           Abierto objeto = new Abierto();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Login tipo= new Login();
        String regreso=tipo.dato;
        if (regreso.equals("admin"))
        {
            Abierto objeto = new Abierto();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
        this.setVisible(false); 
        }
         if (regreso.equals("usuario"))
        {
            AbiertoUser objeto = new AbiertoUser();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
        this.setVisible(false); 
        }
       
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit().setVisible(true);
            }
        });
    }
 conectar cc= new conectar();
    Connection cn= cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asigna;
    private javax.swing.JComboBox<String> carrera;
    private javax.swing.JTextField correo;
    private javax.swing.JComboBox<String> cuatrimestre;
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField problema;
    private javax.swing.JButton regresar;
    private javax.swing.JComboBox<String> tema;
    // End of variables declaration//GEN-END:variables
}
