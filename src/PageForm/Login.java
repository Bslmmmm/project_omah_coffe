package PageForm;


import Menu_Utama.Menu_Utama;
import pages.Transaksi;
import koneksi.Koneksi;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import popup.popup_login_berhasil;
import popup.popup_loginsalah;
import pages.Transaksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dagi
 */
public class Login extends javax.swing.JFrame {

    
    
    public void kodeLogin(){
         String nama = null;
        try {
            String sql = "SELECT * FROM pengguna WHERE user='"+txt_user.getText()+"'AND password='"+txt_password.getText()+"'";
            java.sql.Connection conn=(Connection) Koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                nama =rs.getString("user");
             
                Menu_Utama menu = new Menu_Utama();
                menu.setVisible(true);
                dispose();
            }
                
           
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public Login() {
        initComponents();
        
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
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        btn_login = new swing.Button();
        jLabel5 = new javax.swing.JLabel();
        btn_signup1 = new javax.swing.JButton();
        close = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(140, 74, 50));
        Left.setMinimumSize(new java.awt.Dimension(470, 700));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Login");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 12, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("User");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 66, -1, -1));

        txt_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        Left.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 94, 417, 41));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Password");
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 153, -1, -1));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        Left.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 181, 417, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Belum punya akun?");
        Left.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 312, -1, -1));

        btn_signup.setBackground(new java.awt.Color(119, 107, 93));
        btn_signup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(22, 64, 214));
        btn_signup.setText("Sign Up");
        btn_signup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_signup.setContentAreaFilled(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        Left.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 311, -1, -1));

        btn_login.setBackground(new java.awt.Color(166, 104, 68));
        btn_login.setText("Login");
        btn_login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        Left.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 260, 181, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Lupa password?");
        Left.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 667, -1, -1));

        btn_signup1.setBackground(new java.awt.Color(119, 107, 93));
        btn_signup1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_signup1.setForeground(new java.awt.Color(22, 64, 214));
        btn_signup1.setText("ya");
        btn_signup1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_signup1.setContentAreaFilled(false);
        btn_signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signup1ActionPerformed(evt);
            }
        });
        Left.add(btn_signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 666, -1, -1));

        jPanel1.add(Left);
        Left.setBounds(330, 0, 470, 700);

        close.setBackground(new java.awt.Color(89, 47, 37));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icondashboard/close-button 1.png"))); // NOI18N

        javax.swing.GroupLayout closeLayout = new javax.swing.GroupLayout(close);
        close.setLayout(closeLayout);
        closeLayout.setHorizontalGroup(
            closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        closeLayout.setVerticalGroup(
            closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(close);
        close.setBounds(0, 0, 45, 50);

        jPanel2.setBackground(new java.awt.Color(89, 47, 37));
        jPanel2.setMinimumSize(new java.awt.Dimension(330, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(330, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Group 5.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icondashboard/omkop 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel6)
                .addContainerGap(337, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 330, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_txt_userActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        SignUp signupframe = new SignUp ();
        signupframe.setVisible(true);
        signupframe.pack();
        signupframe.setLocale(null);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        kodeLogin();
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // samper
        close.setBackground(new Color(89,47,37));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // tinggal
        close.setBackground(new Color(89,47,37));
    }//GEN-LAST:event_closeMouseExited

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // tekan
        close.setBackground(new Color(89,47,37));
    }//GEN-LAST:event_closeMousePressed

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        // gaditeken
        close.setBackground(new Color(89,47,37));
    }//GEN-LAST:event_closeMouseReleased

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        kodeLogin();
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signup1ActionPerformed
        // TODO add your handling code here:
        Forgotpass fg = new Forgotpass();
        fg.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_signup1ActionPerformed

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
                 try {
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
    ex.printStackTrace();
                }  
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
            }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private swing.Button btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JButton btn_signup1;
    private javax.swing.JPanel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
