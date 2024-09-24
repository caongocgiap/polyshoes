package com.polyshoes.view.khachhang;

import com.polyshoes.dao.khachhang.KhachHangDao;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.khachhang.KhachHang;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ChonKhachHangJFrame extends javax.swing.JFrame {

        KhachHangDao khdao = new KhachHangDao();
        DefaultTableModel mol = new DefaultTableModel();

        public ChonKhachHangJFrame() {
                initComponents();
                tblKH.fixTable(jScrollPane1);
                this.fillTBKH(khdao.select2());
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                grpGioiTinh = new javax.swing.ButtonGroup();
                panel = new javax.swing.JPanel();
                tabTong = new com.polyshoes.swing.tabbed.MaterialTabbed();
                tab1 = new com.polyshoes.swing.tabbed.PanelRound();
                txtFind = new com.polyshoes.swing.TextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblKH = new com.polyshoes.swing.table.Table();
                btnChon = new com.polyshoes.swing.Button();
                tab2 = new com.polyshoes.swing.tabbed.PanelRound();
                txtTenKH = new com.polyshoes.swing.TextField();
                txtSDT = new com.polyshoes.swing.TextField();
                jLabel3 = new javax.swing.JLabel();
                rdoNam = new com.polyshoes.swing.RadioButtonCustom();
                rdoNu = new com.polyshoes.swing.RadioButtonCustom();
                jLabel4 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                txtDiaChi = new javax.swing.JTextArea();
                btnThem = new com.polyshoes.swing.Button();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                panel.setBackground(new java.awt.Color(255, 255, 255));

                tab1.setBackground(new java.awt.Color(255, 255, 255));

                txtFind.setBackground(new java.awt.Color(255, 255, 255));
                txtFind.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                txtFind.setLabelText("Tìm kiếm");
                txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtFindKeyReleased(evt);
                        }
                });

                jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
                jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

                tblKH.setBackground(new java.awt.Color(255, 255, 255));
                tblKH.setForeground(new java.awt.Color(255, 255, 255));
                tblKH.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "#", "Mã KH", "Tên KH", "Số điện thoại", "Giới tính", "Địa chỉ"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblKH.setSelectionBackground(new java.awt.Color(255, 255, 255));
                tblKH.setSelectionForeground(new java.awt.Color(255, 255, 255));
                jScrollPane1.setViewportView(tblKH);
                if (tblKH.getColumnModel().getColumnCount() > 0) {
                        tblKH.getColumnModel().getColumn(0).setPreferredWidth(10);
                }

                btnChon.setBackground(new java.awt.Color(204, 255, 255));
                btnChon.setForeground(new java.awt.Color(0, 0, 255));
                btnChon.setText("Chọn");
                btnChon.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnChon.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnChonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
                tab1.setLayout(tab1Layout);
                tab1Layout.setHorizontalGroup(
                        tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                tab1Layout.setVerticalGroup(
                        tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                tabTong.addTab("Danh sách khách hàng", tab1);

                tab2.setBackground(new java.awt.Color(255, 255, 255));

                txtTenKH.setBackground(new java.awt.Color(255, 255, 255));
                txtTenKH.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                txtTenKH.setLabelText("Tên khách hàng");

                txtSDT.setBackground(new java.awt.Color(255, 255, 255));
                txtSDT.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                txtSDT.setLabelText("Số điện thoại");

                jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                jLabel3.setText("Giới tính");

                grpGioiTinh.add(rdoNam);
                rdoNam.setSelected(true);
                rdoNam.setText("Nam");

                rdoNu.setBackground(new java.awt.Color(255, 0, 204));
                grpGioiTinh.add(rdoNu);
                rdoNu.setText("Nữ");

                jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                jLabel4.setText("Địa chỉ");

                txtDiaChi.setBackground(new java.awt.Color(255, 255, 255));
                txtDiaChi.setColumns(20);
                txtDiaChi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                txtDiaChi.setRows(5);
                txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                jScrollPane2.setViewportView(txtDiaChi);

                btnThem.setBackground(new java.awt.Color(204, 255, 255));
                btnThem.setForeground(new java.awt.Color(0, 0, 255));
                btnThem.setText("Thêm");
                btnThem.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
                tab2.setLayout(tab2Layout);
                tab2Layout.setHorizontalGroup(
                        tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                        .addGroup(tab2Layout.createSequentialGroup()
                                                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(tab2Layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane2))
                                .addContainerGap())
                        .addGroup(tab2Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                tab2Layout.setVerticalGroup(
                        tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                tabTong.addTab("Thiết lập thông tin khách hàng", tab2);

                javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
                panel.setLayout(panelLayout);
                panelLayout.setHorizontalGroup(
                        panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panelLayout.setVerticalGroup(
                        panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void txtFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyReleased
                String key = txtFind.getText();
                List<KhachHang> list = khdao.findAll(key);
                mol = (DefaultTableModel) tblKH.getModel();
                mol.setRowCount(0);
                for (KhachHang x : list) {
                        Object[] row = {x.getMaKH(), x.getHoTen(), x.getSDT(), x.isGioitinh() == true ? "Nam" : "Nữ", x.getDiaChi()};
                        mol.addRow(row);
                }
        }//GEN-LAST:event_txtFindKeyReleased

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                if (DialogHelper.confirm(this, "Bạn có chắc muốn thêm khách hàng này không?")) {
                        try {
                                khdao.insert(getModel());
                                this.fillTBKH(khdao.select2());
                                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                                tabTong.setSelectedIndex(0);
                        } catch (HeadlessException e) {
                                System.out.println(e);
                                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                        }
                }
        }//GEN-LAST:event_btnThemActionPerformed

        private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
                this.dispose();
        }//GEN-LAST:event_btnChonActionPerformed

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
                        java.util.logging.Logger.getLogger(ChonKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ChonKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ChonKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ChonKhachHangJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ChonKhachHangJFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnChon;
        private com.polyshoes.swing.Button btnThem;
        private javax.swing.ButtonGroup grpGioiTinh;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JPanel panel;
        private com.polyshoes.swing.RadioButtonCustom rdoNam;
        private com.polyshoes.swing.RadioButtonCustom rdoNu;
        private com.polyshoes.swing.tabbed.PanelRound tab1;
        private com.polyshoes.swing.tabbed.PanelRound tab2;
        private com.polyshoes.swing.tabbed.MaterialTabbed tabTong;
        private com.polyshoes.swing.table.Table tblKH;
        private javax.swing.JTextArea txtDiaChi;
        private com.polyshoes.swing.TextField txtFind;
        private com.polyshoes.swing.TextField txtSDT;
        private com.polyshoes.swing.TextField txtTenKH;
        // End of variables declaration//GEN-END:variables

        void fillTBKH(List<KhachHang> kh) {
                mol = (DefaultTableModel) tblKH.getModel();
                mol.setRowCount(0);
                int index = 0;
                for (KhachHang x : kh) {
                        index++;
                        Object[] row = {index, x.getMaKH(), x.getHoTen(), x.getSDT(), x.isGioitinh() == true ? "Nam" : "Nữ", x.getDiaChi()};
                        mol.addRow(row);
                }
        }

        public KhachHang chon() {
                int row = tblKH.getSelectedRow();
                if (row >= 0) {
                        String ma = (String) tblKH.getValueAt(row, 1);
                        KhachHang kh = khdao.findByMaKH(ma);
                        return kh;
                }
                return null;
        }

        KhachHang getModel() {
                KhachHang model = new KhachHang();
                model.setHoTen(txtTenKH.getText());
                model.setMaKH(model.generateCode());
                model.setSDT(txtSDT.getText());
                model.setGioitinh(rdoNam.isSelected());
                model.setDiaChi(txtDiaChi.getText());
                return model;
        }

}
