package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.awt.Color;

public class ThuocTinhJFrame extends javax.swing.JFrame {

        ThuocTinhDAO dao = new ThuocTinhDAO();
        public static String tenBang;
        
        public ThuocTinhJFrame() {
                initComponents();
                setBackground(Color.white);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                txtTen = new com.polyshoes.swing.TextField();
                btnThem = new javax.swing.JButton();
                txtMa = new com.polyshoes.swing.TextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));
                setResizable(false);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                txtTen.setBackground(new java.awt.Color(255, 255, 255));
                txtTen.setLabelText("Tên thuộc tính");

                btnThem.setText("Thêm");
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });

                txtMa.setEditable(false);
                txtMa.setBackground(new java.awt.Color(255, 255, 255));
                txtMa.setText("###");
                txtMa.setLabelText("Mã thuộc tính");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(btnThem)))
                                .addContainerGap(20, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem)
                                .addContainerGap(20, Short.MAX_VALUE))
                );

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

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                if(DialogHelper.confirm(this, "Bạn có chắc muốn thêm không?")) {
                        insert();
                }
        }//GEN-LAST:event_btnThemActionPerformed

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
                        java.util.logging.Logger.getLogger(ThuocTinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ThuocTinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ThuocTinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ThuocTinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ThuocTinhJFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnThem;
        private javax.swing.JPanel jPanel1;
        private com.polyshoes.swing.TextField txtMa;
        private com.polyshoes.swing.TextField txtTen;
        // End of variables declaration//GEN-END:variables

        private void insert() {
                String ma = txtMa.getText();
                String ten = txtTen.getText();
                ThuocTinh model = new ThuocTinh(ma, ten);
                try {
                        dao.insert(tenBang, model);
                        DialogHelper.alert(this, "Thêm thành công!");
                        dispose();
                } catch (Exception e) {
                        DialogHelper.alert(this, "Thêm thất bại!");
                }
        }
}
