package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ThuocTinhJPanel extends javax.swing.JPanel {

        ThuocTinhDAO dao = new ThuocTinhDAO();
        int index = -1;

        public ThuocTinhJPanel() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                grpThuocTinh = new javax.swing.ButtonGroup();
                lblTieuDe6 = new javax.swing.JLabel();
                lblTieuDe7 = new javax.swing.JLabel();
                jScrollPaneThuocTinh = new javax.swing.JScrollPane();
                tblThuocTinh = new com.polyshoes.swing.table.Table();
                borderJPanel3 = new com.polyshoes.component.BorderJPanel();
                borderJPanel4 = new com.polyshoes.component.BorderJPanel();
                btnThemTHuocTinh = new javax.swing.JButton();
                btnSuaThuocTinh = new javax.swing.JButton();
                btnXoaThuocTinh = new javax.swing.JButton();
                btnMoiThuocTinh = new javax.swing.JButton();
                borderJPanel2 = new com.polyshoes.component.BorderJPanel();
                rdoDanhMuc = new javax.swing.JRadioButton();
                rdoXuatXu = new javax.swing.JRadioButton();
                rdoNhaSanXuat = new javax.swing.JRadioButton();
                rdoMauSac = new javax.swing.JRadioButton();
                rdoSize = new javax.swing.JRadioButton();
                rdoThuongHieu = new javax.swing.JRadioButton();
                rdoChatLieu = new javax.swing.JRadioButton();
                rdoDeGiay = new javax.swing.JRadioButton();
                rdoCoGiay = new javax.swing.JRadioButton();
                borderJPanel1 = new com.polyshoes.component.BorderJPanel();
                txtMaThuocTinh = new com.polyshoes.swing.TextField();
                txtTenThuocTinh = new com.polyshoes.swing.TextField();

                setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe6.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe6.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe6.setText("Danh sách thuộc tính");
                lblTieuDe6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe7.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe7.setForeground(new java.awt.Color(0, 0, 255));
                lblTieuDe7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe7.setText("Thiết lập thuộc tính");
                lblTieuDe7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                jScrollPaneThuocTinh.setBackground(new java.awt.Color(255, 255, 255));

                tblThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
                tblThuocTinh.setForeground(new java.awt.Color(255, 255, 255));
                tblThuocTinh.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "STT", "Mã thuộc tính", "Tên thuộc tính"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblThuocTinh.setOpaque(false);
                tblThuocTinh.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblThuocTinhMouseClicked(evt);
                        }
                });
                jScrollPaneThuocTinh.setViewportView(tblThuocTinh);

                borderJPanel3.setBackground(new java.awt.Color(255, 255, 255));

                borderJPanel4.setBackground(new java.awt.Color(255, 255, 255));

                btnThemTHuocTinh.setText("Thêm");
                btnThemTHuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemTHuocTinhActionPerformed(evt);
                        }
                });

                btnSuaThuocTinh.setText("Sửa");
                btnSuaThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSuaThuocTinhActionPerformed(evt);
                        }
                });

                btnXoaThuocTinh.setText("Xóa");
                btnXoaThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnXoaThuocTinhActionPerformed(evt);
                        }
                });

                btnMoiThuocTinh.setText("Mới");
                btnMoiThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMoiThuocTinhActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout borderJPanel4Layout = new javax.swing.GroupLayout(borderJPanel4);
                borderJPanel4.setLayout(borderJPanel4Layout);
                borderJPanel4Layout.setHorizontalGroup(
                        borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel4Layout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addGroup(borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMoiThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoaThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSuaThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThemTHuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                );
                borderJPanel4Layout.setVerticalGroup(
                        borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnThemTHuocTinh)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaThuocTinh)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaThuocTinh)
                                .addGap(18, 18, 18)
                                .addComponent(btnMoiThuocTinh)
                                .addContainerGap(20, Short.MAX_VALUE))
                );

                borderJPanel2.setBackground(new java.awt.Color(255, 255, 255));

                grpThuocTinh.add(rdoDanhMuc);
                rdoDanhMuc.setSelected(true);
                rdoDanhMuc.setText("Danh mục");
                rdoDanhMuc.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoDanhMucItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoXuatXu);
                rdoXuatXu.setText("Xuất xứ");
                rdoXuatXu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoXuatXuItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoNhaSanXuat);
                rdoNhaSanXuat.setText("Nhà sản xuất");
                rdoNhaSanXuat.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoNhaSanXuatItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoMauSac);
                rdoMauSac.setText("Màu sắc");
                rdoMauSac.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoMauSacItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoSize);
                rdoSize.setText("Size");
                rdoSize.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoSizeItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoThuongHieu);
                rdoThuongHieu.setText("Thương hiệu");
                rdoThuongHieu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoThuongHieuItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoChatLieu);
                rdoChatLieu.setText("Chất liệu");
                rdoChatLieu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoChatLieuItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoDeGiay);
                rdoDeGiay.setText("Đế giày");
                rdoDeGiay.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoDeGiayItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoCoGiay);
                rdoCoGiay.setText("Cổ giày");
                rdoCoGiay.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoCoGiayItemStateChanged(evt);
                        }
                });

                javax.swing.GroupLayout borderJPanel2Layout = new javax.swing.GroupLayout(borderJPanel2);
                borderJPanel2.setLayout(borderJPanel2Layout);
                borderJPanel2Layout.setHorizontalGroup(
                        borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoDanhMuc)
                                        .addComponent(rdoXuatXu)
                                        .addComponent(rdoNhaSanXuat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoMauSac)
                                        .addComponent(rdoSize)
                                        .addComponent(rdoThuongHieu))
                                .addGap(30, 30, 30)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoCoGiay)
                                        .addComponent(rdoDeGiay)
                                        .addComponent(rdoChatLieu))
                                .addGap(30, 30, 30))
                );
                borderJPanel2Layout.setVerticalGroup(
                        borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(rdoDanhMuc)
                                                .addComponent(rdoChatLieu))
                                        .addComponent(rdoMauSac))
                                .addGap(18, 18, 18)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoSize)
                                        .addGroup(borderJPanel2Layout.createSequentialGroup()
                                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rdoXuatXu)
                                                        .addComponent(rdoDeGiay))
                                                .addGap(18, 18, 18)
                                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(rdoNhaSanXuat)
                                                        .addComponent(rdoThuongHieu)
                                                        .addComponent(rdoCoGiay))))
                                .addContainerGap(43, Short.MAX_VALUE))
                );

                borderJPanel1.setBackground(new java.awt.Color(255, 255, 255));
                borderJPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                txtMaThuocTinh.setEditable(false);
                txtMaThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
                txtMaThuocTinh.setText("###");
                txtMaThuocTinh.setLabelText("Mã thuộc tính");

                txtTenThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
                txtTenThuocTinh.setLabelText("Tên thuộc tính");

                javax.swing.GroupLayout borderJPanel1Layout = new javax.swing.GroupLayout(borderJPanel1);
                borderJPanel1.setLayout(borderJPanel1Layout);
                borderJPanel1Layout.setHorizontalGroup(
                        borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
                );
                borderJPanel1Layout.setVerticalGroup(
                        borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txtMaThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtTenThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout borderJPanel3Layout = new javax.swing.GroupLayout(borderJPanel3);
                borderJPanel3.setLayout(borderJPanel3Layout);
                borderJPanel3Layout.setHorizontalGroup(
                        borderJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel3Layout.createSequentialGroup()
                                .addComponent(borderJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(borderJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(borderJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                borderJPanel3Layout.setVerticalGroup(
                        borderJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(borderJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borderJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borderJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(borderJPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPaneThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblTieuDe6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(446, 446, 446)
                                .addComponent(lblTieuDe7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTieuDe7)
                                .addGap(12, 12, 12)
                                .addComponent(borderJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(lblTieuDe6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        private void tblThuocTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThuocTinhMouseClicked
                this.showDetailThuocTinh();
        }//GEN-LAST:event_tblThuocTinhMouseClicked

        private void rdoDanhMucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDanhMucItemStateChanged
                if (rdoDanhMuc.isSelected()) {
                        this.fillToTable("Danh_Muc");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoDanhMucItemStateChanged

        private void rdoXuatXuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoXuatXuItemStateChanged
                if (rdoXuatXu.isSelected()) {
                        this.fillToTable("Xuat_Xu");
                }
        }//GEN-LAST:event_rdoXuatXuItemStateChanged

        private void rdoNhaSanXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoNhaSanXuatItemStateChanged
                if (rdoNhaSanXuat.isSelected()) {
                        this.fillToTable("Nha_San_Xuat");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoNhaSanXuatItemStateChanged

        private void rdoMauSacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoMauSacItemStateChanged
                if (rdoMauSac.isSelected()) {
                        this.fillToTable("Mau_Sac");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoMauSacItemStateChanged

        private void rdoSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoSizeItemStateChanged
                if (rdoSize.isSelected()) {
                        this.fillToTable("Size");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoSizeItemStateChanged

        private void rdoThuongHieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoThuongHieuItemStateChanged
                if (rdoThuongHieu.isSelected()) {
                        this.fillToTable("Thuong_Hieu");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoThuongHieuItemStateChanged

        private void rdoChatLieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoChatLieuItemStateChanged
                if (rdoChatLieu.isSelected()) {
                        this.fillToTable("Chat_lieu");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoChatLieuItemStateChanged

        private void rdoDeGiayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDeGiayItemStateChanged
                if (rdoDeGiay.isSelected()) {
                        this.fillToTable("De_Giay");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoDeGiayItemStateChanged

        private void rdoCoGiayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoCoGiayItemStateChanged
                if (rdoCoGiay.isSelected()) {
                        this.fillToTable("Co_Giay");
                } else {
                        this.clear();
                        index = -1;
                }
        }//GEN-LAST:event_rdoCoGiayItemStateChanged

        private void btnThemTHuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTHuocTinhActionPerformed
                this.insert();
                this.clear();
        }//GEN-LAST:event_btnThemTHuocTinhActionPerformed

        private void btnSuaThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThuocTinhActionPerformed
                if (index >= 0) {
                        this.update();
                        this.clear();
                } else {
                        DialogHelper.alert(this, "Vui lòng chọn thuộc tính cần sửa!");
                }
        }//GEN-LAST:event_btnSuaThuocTinhActionPerformed

        private void btnXoaThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThuocTinhActionPerformed
                if (index >= 0) {
                        this.delete();
                        this.clear();
                } else {
                        DialogHelper.alert(this, "Vui lòng chọn thuộc tính cần xóa!");
                }
        }//GEN-LAST:event_btnXoaThuocTinhActionPerformed

        private void btnMoiThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiThuocTinhActionPerformed
                this.clear();
        }//GEN-LAST:event_btnMoiThuocTinhActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.component.BorderJPanel borderJPanel1;
        private com.polyshoes.component.BorderJPanel borderJPanel2;
        private com.polyshoes.component.BorderJPanel borderJPanel3;
        private com.polyshoes.component.BorderJPanel borderJPanel4;
        private javax.swing.JButton btnMoiThuocTinh;
        private javax.swing.JButton btnSuaThuocTinh;
        private javax.swing.JButton btnThemTHuocTinh;
        private javax.swing.JButton btnXoaThuocTinh;
        private javax.swing.ButtonGroup grpThuocTinh;
        private javax.swing.JScrollPane jScrollPaneThuocTinh;
        private javax.swing.JLabel lblTieuDe6;
        private javax.swing.JLabel lblTieuDe7;
        private javax.swing.JRadioButton rdoChatLieu;
        private javax.swing.JRadioButton rdoCoGiay;
        private javax.swing.JRadioButton rdoDanhMuc;
        private javax.swing.JRadioButton rdoDeGiay;
        private javax.swing.JRadioButton rdoMauSac;
        private javax.swing.JRadioButton rdoNhaSanXuat;
        private javax.swing.JRadioButton rdoSize;
        private javax.swing.JRadioButton rdoThuongHieu;
        private javax.swing.JRadioButton rdoXuatXu;
        private com.polyshoes.swing.table.Table tblThuocTinh;
        private com.polyshoes.swing.TextField txtMaThuocTinh;
        private com.polyshoes.swing.TextField txtTenThuocTinh;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblThuocTinh.fixTable(jScrollPaneThuocTinh);
                this.fillToTable("Danh_Muc");
        }

        private void fillToTable(String tenBang) {
                int stt = 0;
                DefaultTableModel tblModel = (DefaultTableModel) tblThuocTinh.getModel();
                tblModel.setRowCount(0);
                List<ThuocTinh> list = dao.select(tenBang);
                for (ThuocTinh x : list) {
                        stt++;
                        Object[] rowData = new Object[]{stt, x.getMa(), x.getTen()};
                        tblModel.addRow(rowData);
                }
        }

        private ThuocTinh getThuocTinhByTen(String tenBang, String ten) {
                return dao.getByName(tenBang, ten);
        }

        private void clear() {
                txtMaThuocTinh.setText("###");
                txtTenThuocTinh.setText("");
                index = -1;
        }

        private void showDetailThuocTinh() {
                index = tblThuocTinh.getSelectedRow();
                String ten = (String) tblThuocTinh.getValueAt(index, 2);
                ThuocTinh model = null;
                if (rdoDanhMuc.isSelected()) {
                        model = this.getThuocTinhByTen("Danh_Muc", ten);
                }
                if (rdoChatLieu.isSelected()) {
                        model = this.getThuocTinhByTen("Chat_Lieu", ten);
                }
                if (rdoXuatXu.isSelected()) {
                        model = this.getThuocTinhByTen("Xuat_Xu", ten);
                }
                if (rdoNhaSanXuat.isSelected()) {
                        model = this.getThuocTinhByTen("Nha_San_Xuat", ten);
                }
                if (rdoMauSac.isSelected()) {
                        model = this.getThuocTinhByTen("Mau_Sac", ten);
                        System.out.println(ten);
                }
                if (rdoSize.isSelected()) {
                        System.out.println(ten);
                        model = this.getThuocTinhByTen("Size", ten);
                }
                if (rdoThuongHieu.isSelected()) {
                        model = this.getThuocTinhByTen("Thuong_Hieu", ten);
                }
                if (rdoDeGiay.isSelected()) {
                        model = this.getThuocTinhByTen("De_giay", ten);
                }
                if (rdoCoGiay.isSelected()) {
                        model = this.getThuocTinhByTen("Co_Giay", ten);
                }
                if (model != null) {
                        txtMaThuocTinh.setText(model.getMa());
                        txtTenThuocTinh.setText(model.getTen());
                }
        }

        private List<ThuocTinh> getListThuocTinh(String tenBang, String ma) {
                List<ThuocTinh> list = dao.select(tenBang);
                for (ThuocTinh x : list) {
                        if (ma.equals(x.getMa())) {
                                DialogHelper.alert(this, "Mã đã tồn tại");
                                return null;
                        }
                }
                return list;
        }

        private boolean checkDataThuocTinh() {
                String ma = txtMaThuocTinh.getText();
                String ten = txtTenThuocTinh.getText();
                if (ten.trim().isEmpty()) {
                        DialogHelper.alert(this, "Chưa nhập tên !!");
                        return false;
                }
                if (rdoDanhMuc.isSelected()) {
                        if (getListThuocTinh("Danh_Muc", ma) == null) {
                                return false;
                        }
                }
                if (rdoChatLieu.isSelected()) {
                        if (getListThuocTinh("Chat_Lieu", ma) == null) {
                                return false;
                        }
                }
                if (rdoXuatXu.isSelected()) {
                        if (getListThuocTinh("Xuat_Xu", ma) == null) {
                                return false;
                        }
                }
                if (rdoNhaSanXuat.isSelected()) {
                        if (getListThuocTinh("Nha_San_Xuat", ma) == null) {
                                return false;
                        }
                }
                if (rdoMauSac.isSelected()) {
                        if (getListThuocTinh("Mau_Sac", ma) == null) {
                                return false;
                        }
                }
                if (rdoSize.isSelected()) {
                        if (getListThuocTinh("Size", ma) == null) {
                                return false;
                        }
                }
                if (rdoThuongHieu.isSelected()) {
                        if (getListThuocTinh("Thuong_Hieu", ma) == null) {
                                return false;
                        }
                }
                if (rdoDeGiay.isSelected()) {
                        if (getListThuocTinh("De_Giay", ma) == null) {
                                return false;
                        }
                }
                if (rdoCoGiay.isSelected()) {
                        if (getListThuocTinh("Co_Giay", ma) == null) {
                                return false;
                        }
                }
                return true;
        }

        private void insertDanhMucCon(String tenBang, ThuocTinh model) {
                try {
                        dao.insert(tenBang, model);
                        DialogHelper.alert(this, "Thêm thành công!");
                } catch (Exception e) {
                        DialogHelper.alert(this, "Thêm thất bại!");
                }
                this.fillToTable(tenBang);
        }

        private void insert() {
                String ma = txtMaThuocTinh.getText();
                String ten = txtTenThuocTinh.getText();
                ThuocTinh model = new ThuocTinh(ma, ten);
                if (this.checkDataThuocTinh()) {
                        if (rdoDanhMuc.isSelected()) {
                                this.insertDanhMucCon("Danh_Muc", model);
                        }
                        if (rdoChatLieu.isSelected()) {
                                this.insertDanhMucCon("Chat_Lieu", model);
                        }
                        if (rdoXuatXu.isSelected()) {
                                this.insertDanhMucCon("Xuat_Xu", model);
                        }
                        if (rdoNhaSanXuat.isSelected()) {
                                this.insertDanhMucCon("Nha_San_Xuat", model);
                        }
                        if (rdoMauSac.isSelected()) {
                                this.insertDanhMucCon("Mau_Sac", model);
                        }
                        if (rdoSize.isSelected()) {
                                this.insertDanhMucCon("Size", model);
                        }
                        if (rdoThuongHieu.isSelected()) {
                                this.insertDanhMucCon("Thuong_Hieu", model);
                        }
                        if (rdoDeGiay.isSelected()) {
                                this.insertDanhMucCon("De_Giay", model);
                        }
                        if (rdoCoGiay.isSelected()) {
                                this.insertDanhMucCon("Co_Giay", model);
                        }
                }
        }

        private void updateThuocTinhCon(String tenBang) {
                ThuocTinh model = new ThuocTinh(txtMaThuocTinh.getText(), txtTenThuocTinh.getText());
                index = tblThuocTinh.getSelectedRow();
                String ten = (String) tblThuocTinh.getValueAt(index, 2);
                try {
                        dao.update(tenBang, dao.getByName(tenBang, ten).getId(), model);
                        DialogHelper.alert(this, "Cập nhật thành công!");
                } catch (Exception e) {
                        DialogHelper.alert(this, "Cập nhật thất bại!");
                }
                this.fillToTable(tenBang);
        }

        private void update() {
                if (rdoDanhMuc.isSelected()) {
                        this.updateThuocTinhCon("Danh_Muc");
                }
                if (rdoChatLieu.isSelected()) {
                        this.updateThuocTinhCon("Chat_Lieu");
                }
                if (rdoXuatXu.isSelected()) {
                        this.updateThuocTinhCon("Xuat_Xu");
                }
                if (rdoNhaSanXuat.isSelected()) {
                        this.updateThuocTinhCon("Nha_San_Xuat");
                }
                if (rdoMauSac.isSelected()) {
                        this.updateThuocTinhCon("Mau_Sac");
                }
                if (rdoSize.isSelected()) {
                        this.updateThuocTinhCon("Size");
                }
                if (rdoThuongHieu.isSelected()) {
                        this.updateThuocTinhCon("Thuong_Hieu");
                }
                if (rdoDeGiay.isSelected()) {
                        this.updateThuocTinhCon("De_Giay");
                }
                if (rdoCoGiay.isSelected()) {
                        this.updateThuocTinhCon("Co_Giay");
                }
                index = -1;
                this.clear();
        }

        private void deleteThuocTinhCon(String tenBang) {
                String ten = (String) tblThuocTinh.getValueAt(tblThuocTinh.getSelectedRow(), 2);
                try {
                        dao.delete(tenBang, dao.getByName(tenBang, ten).getId(), 1);
                        DialogHelper.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                        DialogHelper.alert(this, "Xóa thất bại!");
                }
                this.fillToTable(tenBang);
        }

        private void delete() {
                if (rdoDanhMuc.isSelected()) {
                        this.deleteThuocTinhCon("Danh_Muc");
                }
                if (rdoChatLieu.isSelected()) {
                        this.deleteThuocTinhCon("Chat_lieu");
                }
                if (rdoXuatXu.isSelected()) {
                        this.deleteThuocTinhCon("Xuat_Xu");
                }
                if (rdoNhaSanXuat.isSelected()) {
                        this.deleteThuocTinhCon("Nha_San_Xuat");
                }
                if (rdoMauSac.isSelected()) {
                        this.deleteThuocTinhCon("Mau_Sac");
                }
                if (rdoSize.isSelected()) {
                        this.deleteThuocTinhCon("Size");
                }
                if (rdoThuongHieu.isSelected()) {
                        this.deleteThuocTinhCon("Thuong_Hieu");
                }
                if (rdoDeGiay.isSelected()) {
                        this.deleteThuocTinhCon("De_Giay");
                }
                if (rdoCoGiay.isSelected()) {
                        this.deleteThuocTinhCon("Co_Giay");
                }
                index = -1;
                this.clear();
        }
}
