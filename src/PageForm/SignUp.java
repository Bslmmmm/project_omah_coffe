package PageForm;

import koneksi.Koneksi;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import popup.popup_registerberhasil;
import popup.popup_registerkesalahan;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dagi
 */
public class SignUp extends javax.swing.JFrame {

    public void kodeSignup() {
        String rfid = txt_rfid.getText();
        String user = txt_user.getText();
        String email = txt_securityAnswer.getText();
        String password = new String(txt_password.getPassword());

        String securityQuestion = txt_securityQuestion.getText();
        String securityAnswer = txt_securityAnswer.getText();

        if (user.isEmpty() || email.isEmpty() || password.isEmpty() || securityQuestion.isEmpty() || securityAnswer.isEmpty()) {
            new popup_registerkesalahan().setVisible(true);
            return;
        }

        if (isValidEmail(email)) {
            try {
                String sql = "INSERT INTO pengguna(ID_RFID, user, email, password, securityQuestion, securityAnswer) VALUE (?, ?, ?, ?, ?, ?)";

                Connection c = Koneksi.getKoneksi();
                PreparedStatement statement = c.prepareStatement(sql);
                statement.setString(1, rfid);
                statement.setString(2, user);

                statement.setString(3, email);
                statement.setString(4, password);
                statement.setString(5, securityQuestion);
                statement.setString(6, securityAnswer);

                statement.execute();

                popup_registerberhasil popup = new popup_registerberhasil();

                popup.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        dispose();
                    }
                });

                popup.setVisible(true);

            } catch (Exception e) {

            }
        } else {
            new popup.popup_registeremailsalah().setVisible(true);
        }
    }

    public SignUp() {
        initComponents();
    }

    private boolean isValidEmail(String email) {
        return email.endsWith("@gmail.com")
                || email.endsWith("@yahoo.com")
                || email.endsWith("@outlook.com")
                || email.endsWith("@aol.com")
                || email.endsWith("@icloud.com")
                || email.endsWith("@mail.com")
                || email.endsWith("@protonmail.com")
                || email.endsWith("@polije.ac.id");
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
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_securityAnswer = new javax.swing.JTextField();
        button1 = new swing.Button();
        button2 = new swing.Button();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_rfid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_email1 = new javax.swing.JTextField();
        txt_securityQuestion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(89, 47, 37));
        jPanel2.setPreferredSize(new java.awt.Dimension(330, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icondashboard/omkop 1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 330, 630);

        jPanel3.setBackground(new java.awt.Color(140, 74, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(470, 500));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Sign Up");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 12, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("User");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txt_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        jPanel3.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 420, 41));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Email");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel3.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 420, 41));

        txt_securityAnswer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_securityAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_securityAnswerActionPerformed(evt);
            }
        });
        jPanel3.add(txt_securityAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 420, 41));

        button1.setBackground(new java.awt.Color(166, 104, 68));
        button1.setText("SignUp");
        button1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel3.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 108, 37));

        button2.setBackground(new java.awt.Color(166, 104, 68));
        button2.setText("Cancel");
        button2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel3.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 108, 37));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 403, -1, -1));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Security Question");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Answer");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        txt_rfid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_rfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rfidActionPerformed(evt);
            }
        });
        jPanel3.add(txt_rfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 420, 41));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Id");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txt_email1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email1ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 420, 41));

        txt_securityQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_securityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_securityQuestionActionPerformed(evt);
            }
        });
        jPanel3.add(txt_securityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 420, 41));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(330, 0, 470, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // samper
        close.setBackground(new Color(89, 47, 37));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // tinggal
        close.setBackground(new Color(89, 47, 37));
    }//GEN-LAST:event_closeMouseExited

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // tekan
        close.setBackground(new Color(89, 47, 37));
    }//GEN-LAST:event_closeMousePressed

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        // gaditeken
        close.setBackground(new Color(89, 47, 37));
    }//GEN-LAST:event_closeMouseReleased

    private void txt_securityAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_securityAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_securityAnswerActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        kodeSignup();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        Login loginframe = new Login();
        loginframe.setVisible(true);
        loginframe.pack();
        loginframe.setLocale(null);
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        kodeSignup();
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_rfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rfidActionPerformed

    private void txt_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email1ActionPerformed

    private void txt_securityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_securityQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_securityQuestionActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button2;
    private javax.swing.JPanel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_email1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_rfid;
    private javax.swing.JTextField txt_securityAnswer;
    private javax.swing.JTextField txt_securityQuestion;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
