package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.MauSacDAO;
import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.dao.sanpham.SanPhamDAO;
import com.polyshoes.dao.sanpham.SizeDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.MauSac;
import com.polyshoes.model.sanpham.SanPham;
import com.polyshoes.model.sanpham.Size;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class QLSPJPanel extends javax.swing.JPanel {

        SanPhamDAO dao = new SanPhamDAO();
        ThuocTinhDAO thuocTinhDao = new ThuocTinhDAO();
        int index = -1;

        public QLSPJPanel() {
                initComponents();
                setBackground(Color.white);
                setOpaque(false);
                tblSanPham.fixTable(jScrollPane1);
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                lblTieuDe = new javax.swing.JLabel();
                pnlCRUD = new javax.swing.JPanel();
                btnThem = new com.polyshoes.swing.Button();
                btnUpdate = new com.polyshoes.swing.Button();
                btnXoa = new com.polyshoes.swing.Button();
                btnReset = new com.polyshoes.swing.Button();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblSanPham = new com.polyshoes.swing.table.Table();
                jPanel2 = new javax.swing.JPanel();
                pnlMaSP = new javax.swing.JPanel();
                cboMaSP = new com.polyshoes.component.Combobox();
                btnMaSP = new com.polyshoes.swing.Button();
                pnlChatLieu = new javax.swing.JPanel();
                cboChatLieu = new com.polyshoes.component.Combobox();
                btnChatLieu = new com.polyshoes.swing.Button();
                pnlKhuyenMai = new javax.swing.JPanel();
                cboKhuyenMai = new com.polyshoes.component.Combobox();
                btnKhuyenMai = new com.polyshoes.swing.Button();
                pnlDanhMuc = new javax.swing.JPanel();
                cboDanhMuc = new com.polyshoes.component.Combobox();
                btnDanhMuc = new com.polyshoes.swing.Button();
                pnlDeGiay = new javax.swing.JPanel();
                cboDeGiay = new com.polyshoes.component.Combobox();
                btnDeGiay = new com.polyshoes.swing.Button();
                pnlTrangThai = new javax.swing.JPanel();
                cboTrangThai = new com.polyshoes.component.Combobox();
                pnlThuongHieu = new javax.swing.JPanel();
                cboThuongHieu = new com.polyshoes.component.Combobox();
                btnThuongHieu = new com.polyshoes.swing.Button();
                pnlCoGiay = new javax.swing.JPanel();
                cboCoGiay = new com.polyshoes.component.Combobox();
                btnCoGiay = new com.polyshoes.swing.Button();
                txtGia = new com.polyshoes.swing.TextField();
                pnlXuatXu = new javax.swing.JPanel();
                cboXuatXu = new com.polyshoes.component.Combobox();
                btnXuatXu = new com.polyshoes.swing.Button();
                pnlMauSac = new javax.swing.JPanel();
                cboMauSac = new com.polyshoes.component.Combobox();
                btnMauSac = new com.polyshoes.swing.Button();
                txtSoLuongTon = new com.polyshoes.swing.TextField();
                pnlNsx = new javax.swing.JPanel();
                cboNhaSanXuat = new com.polyshoes.component.Combobox();
                btnNhaSanXuat = new com.polyshoes.swing.Button();
                pnlSize = new javax.swing.JPanel();
                cboSize = new com.polyshoes.component.Combobox();
                btnSize = new com.polyshoes.swing.Button();
                txtKhoiLuong = new com.polyshoes.swing.TextField();
                pnlButton = new javax.swing.JPanel();
                btnFirst = new com.polyshoes.swing.Button();
                btnPrevious = new com.polyshoes.swing.Button();
                lblIndex = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                lblSize = new javax.swing.JLabel();
                btnNext = new com.polyshoes.swing.Button();
                btnEnd = new com.polyshoes.swing.Button();

                setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setForeground(new java.awt.Color(255, 255, 255));
                jPanel1.setOpaque(false);

                lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe.setText("Thông tin chung");
                lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                pnlCRUD.setBackground(new java.awt.Color(255, 255, 255));
                pnlCRUD.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

                btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });
                pnlCRUD.add(btnThem);

                btnUpdate.setForeground(new java.awt.Color(76, 76, 76));
                btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/edit.png"))); // NOI18N
                btnUpdate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnUpdateActionPerformed(evt);
                        }
                });
                pnlCRUD.add(btnUpdate);

                btnXoa.setForeground(new java.awt.Color(76, 76, 76));
                btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/delete.png"))); // NOI18N
                btnXoa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnXoaActionPerformed(evt);
                        }
                });
                pnlCRUD.add(btnXoa);

                btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/reset.png"))); // NOI18N
                btnReset.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnResetActionPerformed(evt);
                        }
                });
                pnlCRUD.add(btnReset);

                tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "STT", "Mã sản phẩm", "Tên sản phẩm", "Mô tả", "Trạng thái"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblSanPhamMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tblSanPham);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTieuDe)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(pnlCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTieuDe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setForeground(new java.awt.Color(255, 255, 255));
                jPanel2.setOpaque(false);
                jPanel2.setLayout(new java.awt.GridLayout(5, 3, 100, 25));

                pnlMaSP.setOpaque(false);
                pnlMaSP.setLayout(new javax.swing.BoxLayout(pnlMaSP, javax.swing.BoxLayout.LINE_AXIS));

                cboMaSP.setLabeText("Mã sản phẩm");
                pnlMaSP.add(cboMaSP);

                btnMaSP.setForeground(new java.awt.Color(255, 255, 255));
                btnMaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnMaSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMaSPActionPerformed(evt);
                        }
                });
                pnlMaSP.add(btnMaSP);

                jPanel2.add(pnlMaSP);

                pnlChatLieu.setOpaque(false);
                pnlChatLieu.setLayout(new javax.swing.BoxLayout(pnlChatLieu, javax.swing.BoxLayout.LINE_AXIS));

                cboChatLieu.setLabeText("Chất liệu");
                pnlChatLieu.add(cboChatLieu);

                btnChatLieu.setForeground(new java.awt.Color(255, 255, 255));
                btnChatLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlChatLieu.add(btnChatLieu);

                jPanel2.add(pnlChatLieu);

                pnlKhuyenMai.setOpaque(false);
                pnlKhuyenMai.setLayout(new javax.swing.BoxLayout(pnlKhuyenMai, javax.swing.BoxLayout.LINE_AXIS));

                cboKhuyenMai.setLabeText("Khuyến mãi");
                pnlKhuyenMai.add(cboKhuyenMai);

                btnKhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
                btnKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlKhuyenMai.add(btnKhuyenMai);

                jPanel2.add(pnlKhuyenMai);

                pnlDanhMuc.setOpaque(false);
                pnlDanhMuc.setLayout(new javax.swing.BoxLayout(pnlDanhMuc, javax.swing.BoxLayout.LINE_AXIS));

                cboDanhMuc.setLabeText("Danh mục");
                pnlDanhMuc.add(cboDanhMuc);

                btnDanhMuc.setForeground(new java.awt.Color(255, 255, 255));
                btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlDanhMuc.add(btnDanhMuc);

                jPanel2.add(pnlDanhMuc);

                pnlDeGiay.setOpaque(false);
                pnlDeGiay.setLayout(new javax.swing.BoxLayout(pnlDeGiay, javax.swing.BoxLayout.LINE_AXIS));

                cboDeGiay.setLabeText("Đế giày");
                pnlDeGiay.add(cboDeGiay);

                btnDeGiay.setForeground(new java.awt.Color(255, 255, 255));
                btnDeGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlDeGiay.add(btnDeGiay);

                jPanel2.add(pnlDeGiay);

                pnlTrangThai.setOpaque(false);
                pnlTrangThai.setLayout(new javax.swing.BoxLayout(pnlTrangThai, javax.swing.BoxLayout.LINE_AXIS));

                cboTrangThai.setLabeText("Trạng thái");
                pnlTrangThai.add(cboTrangThai);

                jPanel2.add(pnlTrangThai);

                pnlThuongHieu.setOpaque(false);
                pnlThuongHieu.setLayout(new javax.swing.BoxLayout(pnlThuongHieu, javax.swing.BoxLayout.LINE_AXIS));

                cboThuongHieu.setLabeText("Thương hiệu");
                pnlThuongHieu.add(cboThuongHieu);

                btnThuongHieu.setForeground(new java.awt.Color(255, 255, 255));
                btnThuongHieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlThuongHieu.add(btnThuongHieu);

                jPanel2.add(pnlThuongHieu);

                pnlCoGiay.setOpaque(false);
                pnlCoGiay.setLayout(new javax.swing.BoxLayout(pnlCoGiay, javax.swing.BoxLayout.LINE_AXIS));

                cboCoGiay.setLabeText("Cổ giày");
                pnlCoGiay.add(cboCoGiay);

                btnCoGiay.setForeground(new java.awt.Color(255, 255, 255));
                btnCoGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlCoGiay.add(btnCoGiay);

                jPanel2.add(pnlCoGiay);

                txtGia.setToolTipText("");
                jPanel2.add(txtGia);

                pnlXuatXu.setOpaque(false);
                pnlXuatXu.setLayout(new javax.swing.BoxLayout(pnlXuatXu, javax.swing.BoxLayout.LINE_AXIS));

                cboXuatXu.setLabeText("Xuất xứ");
                pnlXuatXu.add(cboXuatXu);

                btnXuatXu.setForeground(new java.awt.Color(255, 255, 255));
                btnXuatXu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlXuatXu.add(btnXuatXu);

                jPanel2.add(pnlXuatXu);

                pnlMauSac.setOpaque(false);
                pnlMauSac.setLayout(new javax.swing.BoxLayout(pnlMauSac, javax.swing.BoxLayout.LINE_AXIS));

                cboMauSac.setLabeText("Màu sắc");
                pnlMauSac.add(cboMauSac);

                btnMauSac.setForeground(new java.awt.Color(255, 255, 255));
                btnMauSac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlMauSac.add(btnMauSac);

                jPanel2.add(pnlMauSac);
                jPanel2.add(txtSoLuongTon);

                pnlNsx.setOpaque(false);
                pnlNsx.setLayout(new javax.swing.BoxLayout(pnlNsx, javax.swing.BoxLayout.LINE_AXIS));

                cboNhaSanXuat.setLabeText("Nhà sản xuất");
                pnlNsx.add(cboNhaSanXuat);

                btnNhaSanXuat.setForeground(new java.awt.Color(255, 255, 255));
                btnNhaSanXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlNsx.add(btnNhaSanXuat);

                jPanel2.add(pnlNsx);

                pnlSize.setOpaque(false);
                pnlSize.setLayout(new javax.swing.BoxLayout(pnlSize, javax.swing.BoxLayout.LINE_AXIS));

                cboSize.setLabeText("Size");
                pnlSize.add(cboSize);

                btnSize.setForeground(new java.awt.Color(255, 255, 255));
                btnSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                pnlSize.add(btnSize);

                jPanel2.add(pnlSize);
                jPanel2.add(txtKhoiLuong);

                pnlButton.setBackground(new java.awt.Color(255, 255, 255));

                btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                pnlButton.add(btnFirst);

                btnPrevious.setForeground(new java.awt.Color(76, 76, 76));
                btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                pnlButton.add(btnPrevious);

                lblIndex.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblIndex.setForeground(new java.awt.Color(255, 0, 0));
                lblIndex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblIndex.setText("1");
                pnlButton.add(lblIndex);

                jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 0, 0));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("/");
                pnlButton.add(jLabel2);

                lblSize.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblSize.setForeground(new java.awt.Color(255, 0, 0));
                lblSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblSize.setText("3");
                pnlButton.add(lblSize);

                btnNext.setForeground(new java.awt.Color(76, 76, 76));
                btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                pnlButton.add(btnNext);

                btnEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                pnlButton.add(btnEnd);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                this.insert();
        }//GEN-LAST:event_btnThemActionPerformed

        private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                
        }//GEN-LAST:event_btnUpdateActionPerformed

        private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnXoaActionPerformed

        private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnResetActionPerformed

        private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
                if (evt.getClickCount() == 2) {
                        this.index = tblSanPham.rowAtPoint(evt.getPoint());
                        if (this.index >= 0) {
//                                new SanPhamCTJFrame().setVisible(true);
                        }
                }
        }//GEN-LAST:event_tblSanPhamMouseClicked

        private void btnMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaSPActionPerformed
                new ThuocTinhJFrame().setVisible(true);
        }//GEN-LAST:event_btnMaSPActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnChatLieu;
        private com.polyshoes.swing.Button btnCoGiay;
        private com.polyshoes.swing.Button btnDanhMuc;
        private com.polyshoes.swing.Button btnDeGiay;
        private com.polyshoes.swing.Button btnEnd;
        private com.polyshoes.swing.Button btnFirst;
        private com.polyshoes.swing.Button btnKhuyenMai;
        private com.polyshoes.swing.Button btnMaSP;
        private com.polyshoes.swing.Button btnMauSac;
        private com.polyshoes.swing.Button btnNext;
        private com.polyshoes.swing.Button btnNhaSanXuat;
        private com.polyshoes.swing.Button btnPrevious;
        private com.polyshoes.swing.Button btnReset;
        private com.polyshoes.swing.Button btnSize;
        private com.polyshoes.swing.Button btnThem;
        private com.polyshoes.swing.Button btnThuongHieu;
        private com.polyshoes.swing.Button btnUpdate;
        private com.polyshoes.swing.Button btnXoa;
        private com.polyshoes.swing.Button btnXuatXu;
        private com.polyshoes.component.Combobox cboChatLieu;
        private com.polyshoes.component.Combobox cboCoGiay;
        private com.polyshoes.component.Combobox cboDanhMuc;
        private com.polyshoes.component.Combobox cboDeGiay;
        private com.polyshoes.component.Combobox cboKhuyenMai;
        private com.polyshoes.component.Combobox cboMaSP;
        private com.polyshoes.component.Combobox cboMauSac;
        private com.polyshoes.component.Combobox cboNhaSanXuat;
        private com.polyshoes.component.Combobox cboSize;
        private com.polyshoes.component.Combobox cboThuongHieu;
        private com.polyshoes.component.Combobox cboTrangThai;
        private com.polyshoes.component.Combobox cboXuatXu;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblIndex;
        private javax.swing.JLabel lblSize;
        private javax.swing.JLabel lblTieuDe;
        private javax.swing.JPanel pnlButton;
        private javax.swing.JPanel pnlCRUD;
        private javax.swing.JPanel pnlChatLieu;
        private javax.swing.JPanel pnlCoGiay;
        private javax.swing.JPanel pnlDanhMuc;
        private javax.swing.JPanel pnlDeGiay;
        private javax.swing.JPanel pnlKhuyenMai;
        private javax.swing.JPanel pnlMaSP;
        private javax.swing.JPanel pnlMauSac;
        private javax.swing.JPanel pnlNsx;
        private javax.swing.JPanel pnlSize;
        private javax.swing.JPanel pnlThuongHieu;
        private javax.swing.JPanel pnlTrangThai;
        private javax.swing.JPanel pnlXuatXu;
        private com.polyshoes.swing.table.Table tblSanPham;
        private com.polyshoes.swing.TextField txtGia;
        private com.polyshoes.swing.TextField txtKhoiLuong;
        private com.polyshoes.swing.TextField txtSoLuongTon;
        // End of variables declaration//GEN-END:variables

        private void init() {
                txtGia.setLabelText("Giá");
                txtSoLuongTon.setLabelText("Số lượng tồn");
                txtKhoiLuong.setLabelText("Khối lượng");
                this.fillToTable();
                this.fillCboSize();
                this.fillCboMaSP();
                this.fillCboMauSac();
                this.fillCboTrangThai();
                this.fillComoboBox(cboDanhMuc, "Danh_Muc");
                this.fillComoboBox(cboThuongHieu, "Thuong_Hieu");
                this.fillComoboBox(cboXuatXu, "Xuat_Xu");
                this.fillComoboBox(cboNhaSanXuat, "Nha_San_Xuat");
                this.fillComoboBox(cboChatLieu, "Chat_Lieu");
                this.fillComoboBox(cboDeGiay, "De_Giay");
                this.fillComoboBox(cboCoGiay, "Co_Giay");
        }

        private void fillToTable() {
                DefaultTableModel tblModel = (DefaultTableModel) tblSanPham.getModel();
                int index = 0;
                List<SanPham> list = dao.selectAll();
                tblModel.setRowCount(0);
                for (SanPham x : list) {
                        index++;
                        Object[] rowData = new Object[] {index, x.getMa(), x.getTen(), x.getMoTa(), x.isTrangThai() == true ? "Đang kinh doanh" : "Ngừng kinh doanh"};
                        tblModel.addRow(rowData);
                }
        }

        private void fillComoboBox(JComboBox<Object> com, String tenBang) {
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) com.getModel();
                cboModel.removeAllElements();
                List<ThuocTinh> list = thuocTinhDao.select(tenBang);
                for (ThuocTinh x : list) {
                        cboModel.addElement(x);
                }
                com.setSelectedIndex(-1);
        }

        private void fillCboSize() {
                SizeDAO dao = new SizeDAO();
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboSize.getModel();
                cboModel.removeAllElements();
                List<Size> list = dao.select();
                for (Size x : list) {
                        cboModel.addElement(x);
                }
                cboSize.setSelectedIndex(-1);
        }

        private void fillCboMauSac() {
                MauSacDAO dao = new MauSacDAO();
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboMauSac.getModel();
                cboModel.removeAllElements();
                List<MauSac> list = dao.select();
                for (MauSac x : list) {
                        cboModel.addElement(x);
                }
                cboMauSac.setSelectedIndex(-1);
        }

        private void fillCboMaSP() {
                SanPhamDAO dao = new SanPhamDAO();
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboMaSP.getModel();
                cboModel.removeAllElements();
                List<SanPham> list = dao.selectAll();
                for (SanPham x : list) {
                        cboModel.addElement(x);
                }
                cboMaSP.setSelectedIndex(-1);
        }

        private void fillCboTrangThai() {
                cboTrangThai.addItem("Còn Hàng");
                cboTrangThai.addItem("Hết hàng");
                cboTrangThai.setSelectedIndex(-1);
        }
        
        private void insert() {
                SanPhamCTDAO dao = new SanPhamCTDAO();
                SanPham sp = (SanPham) cboMaSP.getSelectedItem();
                ThuocTinh dm = (ThuocTinh) cboDanhMuc.getSelectedItem();
                ThuocTinh thuongHieu = (ThuocTinh) cboThuongHieu.getSelectedItem();
                ThuocTinh xuatXu = (ThuocTinh) cboXuatXu.getSelectedItem();
                ThuocTinh nsx = (ThuocTinh) cboNhaSanXuat.getSelectedItem();
                ThuocTinh chatLieu = (ThuocTinh) cboChatLieu.getSelectedItem();
                ThuocTinh deGiay = (ThuocTinh) cboDeGiay.getSelectedItem();
                ThuocTinh coGiay = (ThuocTinh) cboCoGiay.getSelectedItem();
                MauSac mauSac = (MauSac) cboMauSac.getSelectedItem();
                int idSanPham = thuocTinhDao.getByName("San_Pham", sp.getTen()).getId();
                int idDanhMuc = thuocTinhDao.getByName("Danh_Muc", dm.getTen()).getId();
                int idThuongHieu = thuocTinhDao.getByName("Thuong_Hieu", thuongHieu.getTen()).getId();
                int idXuatXu = thuocTinhDao.getByName("Xuat_Xu", xuatXu.getTen()).getId();
                int idNSX = thuocTinhDao.getByName("Nha_San_Xuat", nsx.getTen()).getId();
                int idChatLieu = thuocTinhDao.getByName("Chat_Lieu", chatLieu.getTen()).getId();
                int idDeGiay = thuocTinhDao.getByName("De_Giay", deGiay.getTen()).getId();
                int idCoGiay = thuocTinhDao.getByName("Co_Giay", coGiay.getTen()).getId();
                int idMauSac = thuocTinhDao.getByName("Mau_Sac", mauSac.getTen()).getId();
                SizeDAO sizeDao = new SizeDAO();
                Size size = (Size) cboSize.getSelectedItem();
                int idSize = sizeDao.getId(size.getTen());
//                int idKhuyenMai = spctDao.getId("Khuyen_Mai", (String) cboKhuyenMai.getSelectedItem());
                int trangThai = (int) cboTrangThai.getSelectedIndex();
                double gia = Double.parseDouble(txtGia.getText());
                int SoLuongTon = Integer.parseInt(txtSoLuongTon.getText());
                double khoiLuong = Double.parseDouble(txtKhoiLuong.getText());
                if (this.checkData()) {
                        if (dao.insert(idDanhMuc, idXuatXu, idNSX, idMauSac, idSize, idSanPham,
                                idThuongHieu, idChatLieu, idDeGiay, idCoGiay, khoiLuong, gia, SoLuongTon, trangThai) > 0) {
                                DialogHelper.alert(this, "Thêm thành công");
                        } else {
                                DialogHelper.alert(this, "Thêm thất bại");
                        }
                }
        }

        private boolean checkData() {
                return true;
        }
        

}
