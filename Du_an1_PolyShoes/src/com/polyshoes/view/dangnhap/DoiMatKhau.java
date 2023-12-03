/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.polyshoes.view.dangnhap;

import com.polyshoes.dao.NhanVien.NhanVienDao;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Vu Hieu
 */
public class DoiMatKhau extends javax.swing.JDialog {

    /**
     * Creates new form
     */
    public DoiMatKhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);


    }
    NhanVienDao dao = new NhanVienDao();

    private void doiMatKhau() {
        if (Auth.isLogin()) {

            String matKhau = new String(txtMKCu.getPassword());
            String matKhauMoi = new String(txtMKMoi.getPassword());
            String matKhauMoi2 = new String(txtNhapLaiMKMoi.getPassword());

            if (!matKhau.equals(Auth.user.getMatKhau())) {
                JOptionPane.showMessageDialog(this, "sai mật khẩu");
            } else if (!matKhauMoi2.equals(matKhauMoi)) {

                JOptionPane.showMessageDialog(this, "Xac nhan mat khat khong dung");
            } else {
                Auth.user.setMatKhau(matKhauMoi);
                dao.updateMK(Auth.user);
                JOptionPane.showMessageDialog(this, "Doi mat khau thanh cong");
            }
        }
    }

    boolean vaLiDate() {
        if (txtemail.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email để gửi mật khẩu mới");

            txtemail.requestFocus();
            return false;
        } else {
            if (!txtemail.getText().matches("[^@]{2,64}@[^.]{2,253}\\.[0-9a-z-.]{2,63}")) {
                JOptionPane.showMessageDialog(this, "Email không đúng đinh dạng");
                txtemail.requestFocus();
                return false;
            }
        }
        if (txtMKCu.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu cũ");

            txtMKCu.requestFocus();
            return false;
        }
        if (txtMKMoi.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp mật khẩu mới");

            txtMKMoi.requestFocus();
            return false;
        }
        if (txtNhapLaiMKMoi.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập xác nhận mật khẩu mới");

            txtNhapLaiMKMoi.requestFocus();
            return false;
        }
        if (txtMaXacMinh.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã xác minh");

            txtMaXacMinh.requestFocus();
            return false;
        }
        if (!txtMaXacMinh.getText().equalsIgnoreCase(lblMaXacMinh.getText())) {
            JOptionPane.showMessageDialog(this, "Mã Xác minh không đúng");

            txtNhapLaiMKMoi.requestFocus();
            return false;

        }

        return true;
    }

    private String generateRandomCode(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            code.append(randomChar);
        }

        return code.toString();
    }

    void sendEmail() {
        if (Auth.isLogin()) {
            char[] passwordChars = txtMKMoi.getPassword();
            String password2 = new String(passwordChars);

            final String username = "bheos72@gmail.com";
            final String password = "wpyw xlbb jaiv cvlc";

            Properties prop = new Properties();
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true"); //TLS

            Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try {
                // Tạo đối tượng MimeMessage
                Message mimeMessage = new MimeMessage(session);
                mimeMessage.setFrom(new InternetAddress("bheos72@gmail.com"));
                mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(txtemail.getText()));
                mimeMessage.setSubject("Đổi mật khẩu thành công");
                mimeMessage.setText("Đây là tên mật khẩu mới của bạn: " + Auth.user.getTennv()
                        + "\n"
                        + "\n"
                        + "Tài Khoản: "
                        + Auth.user.getManv()
                        + "Mật khẩu mới là: " + password2
                );

                // Gửi email
                Transport.send(mimeMessage);

            } catch (MessagingException ex) {
                JOptionPane.showMessageDialog(this, "Failed to send email: " + ex.getMessage());
            }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMKCu = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        txtMKMoi = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNhapLaiMKMoi = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtMaXacMinh = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblMaXacMinh = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        disable1 = new javax.swing.JLabel();
        disable2 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        disable3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        show1 = new javax.swing.JLabel();
        show3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đổi mật khẩu ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Đổi mật khẩu ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setText("Nhập email: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/iconmail.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        txtemail.setBorder(null);
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 99, 250, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 250, 10));

        jLabel4.setText("Nhập mã xác minh:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel6.setText("Nhập mật khẩu cũ:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("Nhập mật khẩu mới:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtMKCu.setBorder(null);
        jPanel1.add(txtMKCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 169, 230, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 10));

        txtMKMoi.setBorder(null);
        jPanel1.add(txtMKMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 229, 230, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 230, 10));

        txtNhapLaiMKMoi.setBorder(null);
        jPanel1.add(txtNhapLaiMKMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 309, 230, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 10));

        jLabel7.setText("Nhập lại mật khẩu mới:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtMaXacMinh.setBorder(null);
        jPanel1.add(txtMaXacMinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 379, 160, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 10));

        lblMaXacMinh.setBackground(new java.awt.Color(102, 204, 255));
        lblMaXacMinh.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblMaXacMinh.setForeground(new java.awt.Color(0, 153, 255));
        lblMaXacMinh.setText("A56B7C");
        jPanel1.add(lblMaXacMinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 70, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/reset2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 30, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Đổi mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        disable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/matmo.png"))); // NOI18N
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });
        jPanel1.add(disable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        disable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/matmo.png"))); // NOI18N
        disable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable2MouseClicked(evt);
            }
        });
        jPanel1.add(disable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/matdong.png"))); // NOI18N
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show2MouseClicked(evt);
            }
        });
        jPanel1.add(show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        disable3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/matmo.png"))); // NOI18N
        disable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable3MouseClicked(evt);
            }
        });
        jPanel1.add(disable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setText("Hủy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 90, -1));

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/matdong.png"))); // NOI18N
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel1.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        show3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/matdong.png"))); // NOI18N
        show3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show3MouseClicked(evt);
            }
        });
        jPanel1.add(show3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        String code = generateRandomCode(6);
        lblMaXacMinh.setText(code);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.vaLiDate()) {
            this.sendEmail();
            this.doiMatKhau();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
        txtMKCu.setEchoChar((char) 0);
        disable1.setVisible(false);
        disable1.setEnabled(false);
        show1.setEnabled(true);
        show1.setEnabled(true);
     
    }//GEN-LAST:event_disable1MouseClicked

    private void disable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable2MouseClicked
        txtMKMoi.setEchoChar((char) 0);
        disable2.setVisible(false);
        disable2.setEnabled(false);
        show2.setEnabled(true);
        show2.setEnabled(true);
    }//GEN-LAST:event_disable2MouseClicked

    private void show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MouseClicked
        txtMKMoi.setEchoChar((char) 8226);
        disable2.setVisible(true);
        disable2.setEnabled(true);
        show2.setEnabled(false);
        show2.setEnabled(false);
    }//GEN-LAST:event_show2MouseClicked

    private void disable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable3MouseClicked
        txtNhapLaiMKMoi.setEchoChar((char) 0);
        disable3.setVisible(false);
        disable3.setEnabled(false);
        show3.setEnabled(true);
        show3.setEnabled(true);
        
    }//GEN-LAST:event_disable3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        txtMKCu.setEchoChar((char) 8226);
        disable1.setVisible(true);
        disable1.setEnabled(true);
        show1.setEnabled(false);
        show1.setEnabled(false);


        
    }//GEN-LAST:event_show1MouseClicked

    private void show3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show3MouseClicked
        txtNhapLaiMKMoi.setEchoChar((char) 8226);
        disable3.setVisible(true);
        disable3.setEnabled(true);
        show3.setEnabled(false);
        show3.setEnabled(false);
    }//GEN-LAST:event_show3MouseClicked

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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhau dialog = new DoiMatKhau(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disable1;
    private javax.swing.JLabel disable2;
    private javax.swing.JLabel disable3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblMaXacMinh;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show2;
    private javax.swing.JLabel show3;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JTextField txtMaXacMinh;
    private javax.swing.JPasswordField txtNhapLaiMKMoi;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
