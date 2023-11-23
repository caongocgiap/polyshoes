package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.DanhMucDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.model.sanpham.DanhMuc;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ThuocTinhJPanel extends javax.swing.JPanel {
        
        ThuocTinhDAO dao = new ThuocTinhDAO();
        
        public ThuocTinhJPanel() {
                initComponents();
                tblThuocTinh.fixTable(jScrollPane4);
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                grpThuocTinh = new javax.swing.ButtonGroup();
                borderJPanel5 = new com.polyshoes.component.BorderJPanel();
                borderJPanel1 = new com.polyshoes.component.BorderJPanel();
                txtMa = new com.polyshoes.swing.TextField();
                txtTen = new com.polyshoes.swing.TextField();
                lblTieuDe = new javax.swing.JLabel();
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
                borderJPanel4 = new com.polyshoes.component.BorderJPanel();
                btnThem = new javax.swing.JButton();
                btnSua = new javax.swing.JButton();
                btnXoa = new javax.swing.JButton();
                btnMoi = new javax.swing.JButton();
                borderJPanel3 = new com.polyshoes.component.BorderJPanel();
                jScrollPane4 = new javax.swing.JScrollPane();
                tblThuocTinh = new com.polyshoes.swing.table.Table();
                lblTieuDe1 = new javax.swing.JLabel();
                pnlButton = new javax.swing.JPanel();
                btnFirst = new com.polyshoes.swing.Button();
                btnPrevious = new com.polyshoes.swing.Button();
                lblIndex = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                lblSize = new javax.swing.JLabel();
                btnNext = new com.polyshoes.swing.Button();
                btnEnd = new com.polyshoes.swing.Button();

                setBackground(new java.awt.Color(255, 255, 255));
                setLayout(new java.awt.BorderLayout());

                borderJPanel5.setBackground(new java.awt.Color(255, 255, 255));

                borderJPanel1.setBackground(new java.awt.Color(255, 255, 255));
                borderJPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                txtMa.setLabelText("Mã thuộc tính");

                txtTen.setLabelText("Tên thuộc tính");

                javax.swing.GroupLayout borderJPanel1Layout = new javax.swing.GroupLayout(borderJPanel1);
                borderJPanel1.setLayout(borderJPanel1Layout);
                borderJPanel1Layout.setHorizontalGroup(
                        borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
                );
                borderJPanel1Layout.setVerticalGroup(
                        borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe.setText("Thiết lập thuộc tính");
                lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                borderJPanel2.setBackground(new java.awt.Color(255, 255, 255));

                grpThuocTinh.add(rdoDanhMuc);
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                borderJPanel4.setBackground(new java.awt.Color(255, 255, 255));

                btnThem.setText("Thêm");
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });

                btnSua.setText("Sửa");

                btnXoa.setText("Xóa");

                btnMoi.setText("Mới");

                javax.swing.GroupLayout borderJPanel4Layout = new javax.swing.GroupLayout(borderJPanel4);
                borderJPanel4.setLayout(borderJPanel4Layout);
                borderJPanel4Layout.setHorizontalGroup(
                        borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel4Layout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addGroup(borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                );
                borderJPanel4Layout.setVerticalGroup(
                        borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnMoi)
                                .addContainerGap(20, Short.MAX_VALUE))
                );

                borderJPanel3.setBackground(new java.awt.Color(255, 255, 255));

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
                jScrollPane4.setViewportView(tblThuocTinh);
                if (tblThuocTinh.getColumnModel().getColumnCount() > 0) {
                        tblThuocTinh.getColumnModel().getColumn(0).setPreferredWidth(10);
                }

                javax.swing.GroupLayout borderJPanel3Layout = new javax.swing.GroupLayout(borderJPanel3);
                borderJPanel3.setLayout(borderJPanel3Layout);
                borderJPanel3Layout.setHorizontalGroup(
                        borderJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                                .addContainerGap())
                );
                borderJPanel3Layout.setVerticalGroup(
                        borderJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                lblTieuDe1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe1.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe1.setText("Danh sách thuộc tính");
                lblTieuDe1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

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

                javax.swing.GroupLayout borderJPanel5Layout = new javax.swing.GroupLayout(borderJPanel5);
                borderJPanel5.setLayout(borderJPanel5Layout);
                borderJPanel5Layout.setHorizontalGroup(
                        borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(borderJPanel5Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(borderJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel5Layout.createSequentialGroup()
                                                        .addGroup(borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(borderJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(borderJPanel5Layout.createSequentialGroup()
                                                                        .addGroup(borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblTieuDe)
                                                                                .addComponent(lblTieuDe1))
                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(borderJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(borderJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap()))
                );
                borderJPanel5Layout.setVerticalGroup(
                        borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel5Layout.createSequentialGroup()
                                .addContainerGap(468, Short.MAX_VALUE)
                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(borderJPanel5Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblTieuDe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(borderJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(borderJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(borderJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(borderJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTieuDe1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(borderJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(68, Short.MAX_VALUE)))
                );

                add(borderJPanel5, java.awt.BorderLayout.CENTER);
        }// </editor-fold>//GEN-END:initComponents

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                this.insert();
        }//GEN-LAST:event_btnThemActionPerformed

        private void rdoDanhMucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDanhMucItemStateChanged
                if(rdoDanhMuc.isSelected()) {
                        this.fillToTable("Danh_Muc");
                }
        }//GEN-LAST:event_rdoDanhMucItemStateChanged

        private void rdoXuatXuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoXuatXuItemStateChanged
                if(rdoXuatXu.isSelected()) {
                        this.fillToTable("Xuat_Xu");
                }
        }//GEN-LAST:event_rdoXuatXuItemStateChanged

        private void rdoNhaSanXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoNhaSanXuatItemStateChanged
                if(rdoNhaSanXuat.isSelected()) {
                        this.fillToTable("Nha_San_Xuat");
                }
        }//GEN-LAST:event_rdoNhaSanXuatItemStateChanged

        private void rdoMauSacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoMauSacItemStateChanged
                if(rdoMauSac.isSelected()) {
                        this.fillToTable("Mau_Sac");
                }
        }//GEN-LAST:event_rdoMauSacItemStateChanged

        private void rdoSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoSizeItemStateChanged
                if(rdoSize.isSelected()) {
//                        this.fillToTable("Size");
                }
        }//GEN-LAST:event_rdoSizeItemStateChanged

        private void rdoThuongHieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoThuongHieuItemStateChanged
                if(rdoThuongHieu.isSelected()) {
                        this.fillToTable("Thuong_Hieu");
                }
        }//GEN-LAST:event_rdoThuongHieuItemStateChanged

        private void rdoChatLieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoChatLieuItemStateChanged
                if(rdoChatLieu.isSelected()) {
                        this.fillToTable("Chat_lieu");
                }
        }//GEN-LAST:event_rdoChatLieuItemStateChanged

        private void rdoDeGiayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDeGiayItemStateChanged
                if(rdoDeGiay.isSelected()) {
                        this.fillToTable("De_Giay");
                }
        }//GEN-LAST:event_rdoDeGiayItemStateChanged

        private void rdoCoGiayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoCoGiayItemStateChanged
                if(rdoCoGiay.isSelected()) {
                        this.fillToTable("Co_Giay");
                }
        }//GEN-LAST:event_rdoCoGiayItemStateChanged


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.component.BorderJPanel borderJPanel1;
        private com.polyshoes.component.BorderJPanel borderJPanel2;
        private com.polyshoes.component.BorderJPanel borderJPanel3;
        private com.polyshoes.component.BorderJPanel borderJPanel4;
        private com.polyshoes.component.BorderJPanel borderJPanel5;
        private com.polyshoes.swing.Button btnEnd;
        private com.polyshoes.swing.Button btnFirst;
        private javax.swing.JButton btnMoi;
        private com.polyshoes.swing.Button btnNext;
        private com.polyshoes.swing.Button btnPrevious;
        private javax.swing.JButton btnSua;
        private javax.swing.JButton btnThem;
        private javax.swing.JButton btnXoa;
        private javax.swing.ButtonGroup grpThuocTinh;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JLabel lblIndex;
        private javax.swing.JLabel lblSize;
        private javax.swing.JLabel lblTieuDe;
        private javax.swing.JLabel lblTieuDe1;
        private javax.swing.JPanel pnlButton;
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
        private com.polyshoes.swing.TextField txtMa;
        private com.polyshoes.swing.TextField txtTen;
        // End of variables declaration//GEN-END:variables

        private void init() {
                
        }
        
        private void fillToTable(String tenBang) {
                int index = 0;
                DefaultTableModel tblModel = (DefaultTableModel) tblThuocTinh.getModel();
                tblModel.setRowCount(0);
                List<ThuocTinh> list = dao.select(tenBang);
                for (ThuocTinh x : list) {
                        index++;
                        Object[] rowData = new Object[] {index, x.getMa(), x.getTen()};
                        tblModel.addRow(rowData);
                }
        }

        private void insert() {
                String ma = txtMa.getText();
                String ten = txtTen.getText();
                if(rdoDanhMuc.isSelected()) {
                        DanhMucDAO dao = new DanhMucDAO();
                        DanhMuc dm = new DanhMuc(ma, ten);
                        dao.insert(dm);
                        this.fillToTable("Danh_Muc");
                }
        }
        
        
}
