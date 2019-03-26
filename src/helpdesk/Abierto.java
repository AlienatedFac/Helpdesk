/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk;
import static helpdesk.Window.To;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class Abierto extends javax.swing.JFrame {

    /**
     * Creates new form Abierto
     */
    public static String kk;
    public Abierto() {
        initComponents();
        Login objeto=new Login();
        
      kk= objeto.asignado;
        mostrardatos(kk);
    }
public static String Dato="";
    void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("Fecha");
    modelo.addColumn("Correo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Carrera");
    modelo.addColumn("Cuatrimestre");
    modelo.addColumn("Departamento");
    modelo.addColumn("Asignado a");
    modelo.addColumn("Tema");
    modelo.addColumn("Problema");
    tbproductos.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM abierto";
    }
    else{
        sql="SELECT * FROM abierto WHERE Asignado='"+valor+"'";
    }
 
    String []datos = new String [13];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]= rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                modelo.addRow(datos);
            }
            tbproductos.setModel(modelo);
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
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cerrados = new javax.swing.JButton();
        asigna = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        estatus = new javax.swing.JTextField();
        ver = new javax.swing.JButton();
        close1 = new javax.swing.JButton();
        editar = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uni.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 68)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 99, 25));
        jLabel1.setText("Abiertos");
        jLabel1.setToolTipText("");

        cerrados.setBackground(new java.awt.Color(204, 191, 148));
        cerrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sistema_Locked_35452.png"))); // NOI18N
        cerrados.setText("Cerrados");
        cerrados.setBorder(null);
        cerrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerradosActionPerformed(evt);
            }
        });

        asigna.setForeground(new java.awt.Color(204, 194, 151));
        asigna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Biotecnologia", "Software", "Fisioterapia", "Biomedica", "Direccion", "Web", "Sistemas" }));
        asigna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        asigna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setBackground(new java.awt.Color(204, 191, 148));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Historical_icon-icons.com_54175.png"))); // NOI18N
        jButton2.setText("Expirados");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        abrir.setBackground(new java.awt.Color(204, 191, 148));
        abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/62917openfilefolder_109270.png"))); // NOI18N
        abrir.setText("Abrir Nuevo");
        abrir.setBorder(null);
        abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        estatus.setText("ID");
        estatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 191, 148)));
        estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatusActionPerformed(evt);
            }
        });

        ver.setBackground(new java.awt.Color(204, 191, 148));
        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1485476008-artboard-1_78539.png"))); // NOI18N
        ver.setText("Ver Status");
        ver.setBorder(null);
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        close1.setBackground(new java.awt.Color(255, 255, 255));
        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xmag_search_find_export_locate_5984 (1).png"))); // NOI18N
        close1.setText("BUSCAR");
        close1.setBorderPainted(false);
        close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });

        editar.setText("ID");
        editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 191, 148)));

        edit.setBackground(new java.awt.Color(204, 191, 148));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_icon-icons.com_52382.png"))); // NOI18N
        edit.setText("Editar");
        edit.setBorder(null);
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        tbproductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbproductos.setForeground(new java.awt.Color(153, 111, 39));
        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbproductos.setGridColor(new java.awt.Color(153, 102, 0));
        tbproductos.setSelectionBackground(new java.awt.Color(204, 195, 151));
        tbproductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbproductos);

        jToggleButton1.setBackground(new java.awt.Color(204, 191, 148));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conversation_chat_message_icon-icons.com_51099.png"))); // NOI18N
        jToggleButton1.setText("CHAT");
        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(asigna, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cerrados, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ver)
                        .addGap(34, 34, 34)
                        .addComponent(editar)
                        .addGap(18, 18, 18)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrados, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(close1)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(asigna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerradosActionPerformed
        // TODO add your handling code here:
        cerrados objeto = new cerrados();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_cerradosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           expirados objeto = new expirados();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
            this.setVisible(false);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
           editar objeto = new editar();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_editActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
         help objeto = new help();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_abrirActionPerformed

    private void estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_estatusActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
        
 Dato = estatus.getText();
 if(Dato!="")
 {
     if(Dato!="ID")
     {
             Estatus objeto = new Estatus();
        objeto.setLocationRelativeTo(objeto);
        objeto.setVisible(true);
         this.setVisible(false); 
     }
     
 }
 else{
     JOptionPane.showMessageDialog(this, "La opcion seleccionada no es correcta");
 }
    
    }//GEN-LAST:event_verActionPerformed

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
        // TODO add your handling code here:
        String dato =(String) asigna.getSelectedItem();
         mostrardatos(dato);
         
    }//GEN-LAST:event_close1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abierto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Abierto().setVisible(true);
            }
        });
    }
    conectar cc= new conectar();
    Connection cn= cc.conexion();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir;
    private javax.swing.JComboBox<String> asigna;
    private javax.swing.JButton cerrados;
    private javax.swing.JButton close1;
    private javax.swing.JButton edit;
    private javax.swing.JTextField editar;
    private javax.swing.JTextField estatus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tbproductos;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
