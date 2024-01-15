package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.helper.ZXingHelper;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class SanPhamChiTietJFrame extends javax.swing.JFrame {

        SanPhamCTDAO dao = new SanPhamCTDAO();
        ThuocTinhDAO thuocTinhDao = new ThuocTinhDAO();
        public static String maSPCT;

        public SanPhamChiTietJFrame() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                cboTenSP = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe2 = new javax.swing.JLabel();
                cboThuongHieu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe3 = new javax.swing.JLabel();
                lblTieuDe4 = new javax.swing.JLabel();
                cboXuatXu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe5 = new javax.swing.JLabel();
                cboDanhMuc = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboNSX = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe6 = new javax.swing.JLabel();
                lblTieuDe7 = new javax.swing.JLabel();
                cboCoGiay = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe8 = new javax.swing.JLabel();
                lblTieuDe9 = new javax.swing.JLabel();
                lblTieuDe10 = new javax.swing.JLabel();
                cboDeGiay = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboChatLieu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboMauSac = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboSize = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe11 = new javax.swing.JLabel();
                qrCole = new javax.swing.JPanel();
                lblQRCode = new javax.swing.JLabel();
                txtGia = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                lblTieuDe12 = new javax.swing.JLabel();
                txtSoLuong = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                lblTieuDe13 = new javax.swing.JLabel();
                lblTieuDe14 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                btnCapNhat = new com.polyshoes.swing.Button();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Polyshoes");
                setBackground(new java.awt.Color(255, 255, 255));
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowOpened(java.awt.event.WindowEvent evt) {
                                formWindowOpened(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                cboTenSP.setEditable(false);

                lblTieuDe2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe2.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe2.setText("Tên sản phẩm");
                lblTieuDe2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                cboThuongHieu.setEditable(false);

                lblTieuDe3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe3.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe3.setText("Thương hiệu");
                lblTieuDe3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe4.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe4.setText("Xuất xứ");
                lblTieuDe4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                cboXuatXu.setEditable(false);

                lblTieuDe5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe5.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe5.setText("Danh mục");
                lblTieuDe5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                cboDanhMuc.setEditable(false);

                cboNSX.setEditable(false);

                lblTieuDe6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe6.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe6.setText("Nhà sản xuất");
                lblTieuDe6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe7.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe7.setText("Chất liệu");
                lblTieuDe7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                cboCoGiay.setEditable(false);

                lblTieuDe8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe8.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe8.setText("Cổ giày");
                lblTieuDe8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe9.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe9.setText("Đế giày");
                lblTieuDe9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe10.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe10.setText("Màu sắc");
                lblTieuDe10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                cboDeGiay.setEditable(false);

                cboChatLieu.setEditable(false);

                cboMauSac.setEditable(false);

                cboSize.setEditable(false);

                lblTieuDe11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe11.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe11.setText("Size");
                lblTieuDe11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                qrCole.setBackground(new java.awt.Color(255, 255, 255));
                qrCole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                lblQRCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblQRCode.setText("Mã QR");

                javax.swing.GroupLayout qrColeLayout = new javax.swing.GroupLayout(qrCole);
                qrCole.setLayout(qrColeLayout);
                qrColeLayout.setHorizontalGroup(
                        qrColeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 212, Short.MAX_VALUE)
                        .addGroup(qrColeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(qrColeLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                );
                qrColeLayout.setVerticalGroup(
                        qrColeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 212, Short.MAX_VALUE)
                        .addGroup(qrColeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(qrColeLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                );

                lblTieuDe12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe12.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe12.setText("Giá");
                lblTieuDe12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe13.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe13.setText("Số lượng");
                lblTieuDe13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe14.setBackground(new java.awt.Color(0, 0, 255));
                lblTieuDe14.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe14.setForeground(new java.awt.Color(0, 0, 255));
                lblTieuDe14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe14.setText("Thông tin sản phẩm chi tiết");
                lblTieuDe14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

                btnCapNhat.setBackground(new java.awt.Color(153, 255, 255));
                btnCapNhat.setForeground(new java.awt.Color(51, 51, 255));
                btnCapNhat.setText("Cập nhật");
                btnCapNhat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCapNhatActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTieuDe2)
                                        .addComponent(lblTieuDe7)
                                        .addComponent(lblTieuDe6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(qrCole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblTieuDe11)
                                                                .addGap(212, 212, 212)
                                                                .addComponent(lblTieuDe12))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe5)
                                                                        .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblTieuDe9)
                                                                        .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(48, 48, 48)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe3)
                                                                        .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cboCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblTieuDe8)))
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(48, 48, 48)
                                                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 48, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTieuDe4)
                                        .addComponent(lblTieuDe13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cboXuatXu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(lblTieuDe10, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboMauSac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(398, 398, 398)
                                .addComponent(lblTieuDe14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(lblTieuDe14)
                                                                .addGap(22, 22, 22)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblTieuDe2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(lblTieuDe7)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblTieuDe3)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(lblTieuDe8)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cboCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblTieuDe5)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(lblTieuDe9)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblTieuDe4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lblTieuDe10)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblTieuDe12)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(lblTieuDe6)
                                                                        .addComponent(lblTieuDe11))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cboNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTieuDe13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(qrCole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24))
                                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                if (maSPCT != null) {
                        byte[] result = ZXingHelper.getQRCodeImage(maSPCT, 200, 200);
                        lblQRCode.setIcon(new ImageIcon(result));
                        this.showDetail();
                }
        }//GEN-LAST:event_formWindowOpened

        private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
                if(DialogHelper.confirm(this, "Bạn có chắc muốn cập nhật không?")) {
                        update();
                }
        }//GEN-LAST:event_btnCapNhatActionPerformed

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
                        java.util.logging.Logger.getLogger(SanPhamChiTietJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(SanPhamChiTietJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(SanPhamChiTietJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(SanPhamChiTietJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new SanPhamChiTietJFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnCapNhat;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboChatLieu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboCoGiay;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboDanhMuc;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboDeGiay;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboMauSac;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboNSX;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboSize;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboTenSP;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboThuongHieu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboXuatXu;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JLabel lblQRCode;
        private javax.swing.JLabel lblTieuDe10;
        private javax.swing.JLabel lblTieuDe11;
        private javax.swing.JLabel lblTieuDe12;
        private javax.swing.JLabel lblTieuDe13;
        private javax.swing.JLabel lblTieuDe14;
        private javax.swing.JLabel lblTieuDe2;
        private javax.swing.JLabel lblTieuDe3;
        private javax.swing.JLabel lblTieuDe4;
        private javax.swing.JLabel lblTieuDe5;
        private javax.swing.JLabel lblTieuDe6;
        private javax.swing.JLabel lblTieuDe7;
        private javax.swing.JLabel lblTieuDe8;
        private javax.swing.JLabel lblTieuDe9;
        private javax.swing.JPanel qrCole;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtGia;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtSoLuong;
        // End of variables declaration//GEN-END:variables

        private void init() {
                fillComboBox(cboDanhMuc, "Danh_Muc");
                fillComboBox(cboTenSP, "San_Pham");
                fillComboBox(cboChatLieu, "Chat_Lieu");
                fillComboBox(cboSize, "Size");
                fillComboBox(cboDeGiay, "De_Giay");
                fillComboBox(cboMauSac, "Mau_Sac");
                fillComboBox(cboThuongHieu, "Thuong_Hieu");
                fillComboBox(cboCoGiay, "Co_Giay");
                fillComboBox(cboXuatXu, "Xuat_Xu");
                fillComboBox(cboNSX, "Nha_San_Xuat");
                cboTenSP.setEnabled(false);

        }

        private void fillComboBox(JComboBox cbo, String tenBang) {
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cbo.getModel();
                cboModel.removeAllElements();
                ThuocTinhDAO dao = new ThuocTinhDAO();
                List<ThuocTinh> list = dao.select(tenBang);
                for (ThuocTinh x : list) {
                        cboModel.addElement(x);
                }
                cbo.setSelectedIndex(-1);
        }

        private void showDetail() {
                SanPhamChiTiet model = dao.getByMa(maSPCT);
                setSelectedIndex(cboTenSP, model.getTen());
                setSelectedIndex(cboChatLieu, model.getChatLieu());
                setSelectedIndex(cboDanhMuc, model.getDanhMuc());
                setSelectedIndex(cboThuongHieu, model.getThuongHieu());
                setSelectedIndex(cboXuatXu, model.getXuatXu());
                setSelectedIndex(cboDeGiay, model.getDeGiay());
                setSelectedIndex(cboCoGiay, model.getCoGiay());
                setSelectedIndex(cboMauSac, model.getMauSac());
                setSelectedIndex(cboNSX, model.getNSX());
                setSelectedIndex(cboSize, String.valueOf(model.getSize()));
                txtGia.setText(String.valueOf(model.getGia()));
                txtSoLuong.setText(String.valueOf(model.getSoLuongTon()));
        }

        private void setSelectedIndex(JComboBox cbo, String value) {
                for (int i = 0; i < cbo.getItemCount(); i++) {
                        if(cbo.getItemAt(i).toString().equals(value)) {
                                cbo.setSelectedIndex(i);
                                return;
                        }
                }
        }
        
        private void update() {
                int idDanhMuc = thuocTinhDao.getByName("Danh_Muc", cboDanhMuc.getSelectedItem().toString()).getId();
                int idXuatXu = thuocTinhDao.getByName("Xuat_Xu", cboXuatXu.getSelectedItem().toString()).getId();
                int idNSX = thuocTinhDao.getByName("Nha_San_Xuat", cboNSX.getSelectedItem().toString()).getId();
                int idMauSac = thuocTinhDao.getByName("Mau_Sac", cboMauSac.getSelectedItem().toString()).getId();
                int idSize = thuocTinhDao.getByName("Size", cboSize.getSelectedItem().toString()).getId();
                int idSP = thuocTinhDao.getByName("San_Pham", cboTenSP.getSelectedItem().toString()).getId();
                int idThuongHieu = thuocTinhDao.getByName("Thuong_Hieu", cboThuongHieu.getSelectedItem().toString()).getId();
                int idChatLieu = thuocTinhDao.getByName("Chat_Lieu", cboChatLieu.getSelectedItem().toString()).getId();
                int idDeGiay = thuocTinhDao.getByName("De_Giay", cboDeGiay.getSelectedItem().toString()).getId();
                int idCoGiay = thuocTinhDao.getByName("Co_Giay", cboCoGiay.getSelectedItem().toString()).getId();
                double gia = Double.parseDouble(txtGia.getText());
                int soLuong = Integer.parseInt(txtSoLuong.getText());
                try {
                        dao.update(idDanhMuc, idXuatXu, idNSX, idMauSac, idSize, idSP, idThuongHieu, 
                                idChatLieu, idDeGiay, idCoGiay, gia, soLuong, this.maSPCT);
                        DialogHelper.alert(this, "Cập nhật thành công!");
                } catch (Exception e) {
                        e.printStackTrace();
                        DialogHelper.alert(this, "Cập nhật thất bại!");
                }
        }
}
