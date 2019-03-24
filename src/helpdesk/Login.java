package helpdesk;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;


public class Login extends javax.swing.JFrame {

    conectar cc = new conectar();
    Connection cn=cc.conexion();
    
    
    public Login() {
        initComponents();
    }
    
    public void ValidAccess()
    {
        int resultx=0;
        
        try{
            String Mtx=Matricula.getText();
            String Passw=String.valueOf(Pass.getPassword());
            
            String SQL = "SELECT * FROM Usuarios WHERE Matricula='"+Mtx+"' && Password='"+Passw+"'";
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            if(rs.next()){
                resultx=1;
                
                if(resultx==1)
                {
                    Estatus Screen1=new Estatus();
                    Screen1.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "The data isn't correct.");
                }
            }
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "The data isn't correct.");            
        }      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Matricula = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        Pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel_SoftZyd = new javax.swing.JLabel();
        jLabel_inven = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Matrícula");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, -1));

        jLabel20.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Password");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 90, -1));

        Matricula.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Matricula.setForeground(new java.awt.Color(255, 255, 255));
        Matricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Matricula.setFocusTraversalPolicyProvider(true);
        Matricula.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MatriculaMouseMoved(evt);
            }
        });
        Matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 260, 40));

        jButton7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Acceder1.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setIconTextGap(9);
        jButton7.setPreferredSize(new java.awt.Dimension(600, 100));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Acceder2.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 190, 40));

        Pass.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 260, 40));

        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("¿Eres administrador?");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 190, 30));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel21.setText("He olvidado la conraseña");
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 640));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Si Jala/icons8_Cancel_32px.png"))); // NOI18N
        jButton10.setToolTipText("Close");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setRequestFocusEnabled(false);
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Si Jala/icons8_Cancel_30px_3.png"))); // NOI18N
        jButton10.setVerifyInputWhenFocusTarget(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Si Jala/icons8_Minus_32px_1.png"))); // NOI18N
        jButton11.setToolTipText("Minimize");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusPainted(false);
        jButton11.setRequestFocusEnabled(false);
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Si Jala/icons8_Minus_30px_3.png"))); // NOI18N
        jButton11.setVerifyInputWhenFocusTarget(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        jLabel_SoftZyd.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel_SoftZyd.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_SoftZyd.setText("GAP Soft");
        jPanel3.add(jLabel_SoftZyd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 314, -1));

        jLabel_inven.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel_inven.setForeground(new java.awt.Color(169, 224, 49));
        jLabel_inven.setText("HelpDesk");
        jPanel3.add(jLabel_inven, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 380, 50));

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField18.setBackground(new java.awt.Color(31, 36, 42));
        jTextField18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jTextField18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField18MouseMoved(evt);
            }
        });
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 330, 40));

        jTextField21.setBackground(new java.awt.Color(31, 36, 42));
        jTextField21.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 255, 255));
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jTextField21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField21MouseMoved(evt);
            }
        });
        jPanel7.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 330, 40));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(169, 224, 49));
        jLabel18.setText("Password");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 314, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(169, 224, 49));
        jLabel16.setText("Email");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 314, -1));

        jButton16.setBackground(new java.awt.Color(169, 224, 49));
        jButton16.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(169, 224, 49));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Si Jala/icons8_Back_To_25px.png"))); // NOI18N
        jButton16.setText("Back");
        jButton16.setBorder(null);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton16.setRequestFocusEnabled(false);
        jButton16.setVerifyInputWhenFocusTarget(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 110, -1));

        jButton8.setBackground(new java.awt.Color(152, 201, 45));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(21, 25, 28));
        jButton8.setText("Sign up");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 330, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatriculaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatriculaMouseMoved

    }//GEN-LAST:event_MatriculaMouseMoved

    private void MatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatriculaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ValidAccess();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel_SoftZyd.setVisible(false);
        jLabel_inven.setVisible(false);
        jPanel7.setVisible(true);
        //       jLabel7.setVisible(false);
        //       jLabel8.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jPanel7.setVisible(false);
        jLabel_SoftZyd.setVisible(true);
        jLabel_inven.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField21MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21MouseMoved

    private void jTextField18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField18MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18MouseMoved

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Matricula;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel_SoftZyd;
    private javax.swing.JLabel jLabel_inven;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField21;
    // End of variables declaration//GEN-END:variables
}
