package helpdesk;

public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
    }

     public void LoadingIt(){ /*Método que contiene el codigo del loading-bar y splash inicial del programa*/
         Splash Pantalla = new Splash(); /*Aquí se crea el objeto de mi clase [Splash]*/ 
         Login sign = new Login(); /*Aquí se crea el objeto de mi clase[NewSignin]*/
            Pantalla.setVisible(true); /*El objeto de mi clase Splash fue la ventana, la cual hago visible*/
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(100);
                Pantalla.loadingnumber.setText(Integer.toString(row)+"%");
                Pantalla.loadingprogress.setValue(row);
                if (row == 100) {
                    
                    Pantalla.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (InterruptedException e) {
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingprogress = new javax.swing.JProgressBar();
        loadingnumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingprogress.setForeground(new java.awt.Color(169, 224, 49));
        loadingprogress.setBorderPainted(false);
        loadingprogress.setFocusable(false);
        loadingprogress.setRequestFocusEnabled(false);
        loadingprogress.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(loadingprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 620, 20));

        loadingnumber.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        loadingnumber.setText("99%");
        jPanel1.add(loadingnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Si Jala/Bg1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel loadingnumber;
    public javax.swing.JProgressBar loadingprogress;
    // End of variables declaration//GEN-END:variables
}
