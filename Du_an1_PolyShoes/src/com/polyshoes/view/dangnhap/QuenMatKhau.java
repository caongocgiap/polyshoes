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
public class QuenMatKhau extends javax.swing.JDialog {

    /**
     * Creates new form DoiMatKhau2
     */
    NhanVienDao dao = new NhanVienDao();
    String code = generateRandomNumber();

    public QuenMatKhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    void sendEmailMaXacMinh() {

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
            mimeMessage.setSubject("Mã xác minh đổi mật khẩu");
            mimeMessage.setText("Mã: " + code
            );

            // Gửi email
            Transport.send(mimeMessage);

        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(this, "Failed to send email: " + ex.getMessage());
        }

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

    public boolean vaLiDate() {

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
        if (!txtMaXacMinh.getText().equalsIgnoreCase(code)) {
            JOptionPane.showMessageDialog(this, "Mã Xác minh không đúng");

            txtNhapLaiMKMoi.requestFocus();
            return false;

        }
        return true;
    }

    public boolean vaLiDateEmail() {
        if (txtemail.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email để gửi mã xác minh");

            txtemail.requestFocus();
            return false;
        } else {
            if (!txtemail.getText().matches("[^@]{2,64}@[^.]{2,253}\\.[0-9a-z-.]{2,63}")) {
                JOptionPane.showMessageDialog(this, "Email không đúng đinh dạng");
                txtemail.requestFocus();
                return false;
            }
        }
        return true;
    }

    public static String generateRandomNumber() {
        Random random = new Random();

        int firstDigit = 1 + random.nextInt(9); // Tạo chữ số đầu tiên từ 1 đến 9

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstDigit);

        for (int i = 0; i < 5; i++) {
            int digit = random.nextInt(10); // Tạo các chữ số tiếp theo từ 0 đến 9
            stringBuilder.append(digit);
        }

        return stringBuilder.toString();
    }

    private void doiMatKhau() {

        String matKhauMoi = new String(txtMKMoi.getPassword());
        String matKhauMoi2 = new String(txtNhapLaiMKMoi.getPassword());

        try {
            Auth.user.setMatKhau(matKhauMoi);
            dao.updateMK(Auth.user);
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu mới thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu mới thất bại");
            return;
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaXacMinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JButton();
        txtMKMoi = new javax.swing.JPasswordField();
        txtNhapLaiMKMoi = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtemail = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        sendMA = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        disable1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Quên mật khẩu");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(25, 148, 211));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quên mật khẩu ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 226, 255));
        jLabel3.setText("Email: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 47, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 226, 255));
        jLabel4.setText("Mã xác minh:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Mật khẩu mới:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 226, 255));
        jLabel6.setText("Nhập lại Mật khẩu mới: ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        txtMaXacMinh.setBackground(new java.awt.Color(25, 148, 211));
        txtMaXacMinh.setForeground(new java.awt.Color(255, 255, 255));
        txtMaXacMinh.setBorder(null);
        jPanel3.add(txtMaXacMinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 151, 190, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 226, 255));
        jLabel7.setText("Đăng nhập?");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 320, -1, 20));

        btnDoiMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        btnDoiMatKhau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(25, 118, 211));
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseClicked(evt);
            }
        });
        jPanel3.add(btnDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 350, 160, 40));

        txtMKMoi.setBackground(new java.awt.Color(25, 148, 211));
        txtMKMoi.setForeground(new java.awt.Color(255, 255, 255));
        txtMKMoi.setBorder(null);
        jPanel3.add(txtMKMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 222, 290, 25));

        txtNhapLaiMKMoi.setBackground(new java.awt.Color(25, 148, 211));
        txtNhapLaiMKMoi.setForeground(new java.awt.Color(255, 255, 255));
        txtNhapLaiMKMoi.setBorder(null);
        jPanel3.add(txtNhapLaiMKMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 282, 290, 25));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 307, 290, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 177, 190, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 247, 290, 10));

        txtemail.setBackground(new java.awt.Color(25, 148, 211));
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setBorder(null);
        jPanel3.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 83, 250, 25));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 250, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/iconmail.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 30, 40));

        sendMA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sendMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/rsz_207161 (1).png"))); // NOI18N
        sendMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMAMouseClicked(evt);
            }
        });
        jPanel3.add(sendMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 40, 40));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel3.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, 40));

        disable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });
        jPanel3.add(disable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, 40));

        show1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/icons8_eye_20px_1.png"))); // NOI18N
        show1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel3.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/rsz_1hìnhlogo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        new login1().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void sendMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMAMouseClicked
        if (this.vaLiDateEmail()) {

            this.sendEmailMaXacMinh();
        }
    }//GEN-LAST:event_sendMAMouseClicked

    private void btnDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseClicked
        if (this.vaLiDate()) {
            this.doiMatKhau();
            this.sendEmail();
        }
    }//GEN-LAST:event_btnDoiMatKhauMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtMKMoi.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtMKMoi.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
        txtNhapLaiMKMoi.setEchoChar((char) 0);
        disable1.setVisible(false);
        disable1.setEnabled(false);
        show1.setEnabled(true);
        show1.setEnabled(true);
    }//GEN-LAST:event_disable1MouseClicked

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        txtNhapLaiMKMoi.setEchoChar((char) 8226);
        disable1.setVisible(true);
        disable1.setEnabled(true);
        show1.setEnabled(false);
        show1.setEnabled(false);
    }//GEN-LAST:event_show1MouseClicked

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
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuenMatKhau dialog = new QuenMatKhau(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel disable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel sendMA;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show1;
    private javax.swing.JPasswordField txtMKMoi;
    private javax.swing.JTextField txtMaXacMinh;
    private javax.swing.JPasswordField txtNhapLaiMKMoi;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
