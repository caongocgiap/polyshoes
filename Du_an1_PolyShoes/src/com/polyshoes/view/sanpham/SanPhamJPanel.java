package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.SanPhamDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.SanPham;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SanPhamJPanel extends javax.swing.JPanel {

        SanPhamDAO dao = new SanPhamDAO();
        int index = -1;
        int pageIndex = 0;

        public SanPhamJPanel() {
                initComponents();
                setOpaque(false);
                tblSanPham.fixTable(jScrollPane1);
                this.fillToTable(0, 5);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblSanPham = new com.polyshoes.swing.table.Table();
                lblTieuDe = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                button1 = new com.polyshoes.swing.Button();
                btnPrevious = new com.polyshoes.swing.Button();
                lblIndex = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                lblSize = new javax.swing.JLabel();
                btnNext = new com.polyshoes.swing.Button();
                button2 = new com.polyshoes.swing.Button();
                lblTieuDe1 = new javax.swing.JLabel();
                lblTieuDe2 = new javax.swing.JLabel();
                txtMa = new javax.swing.JTextField();
                lblTieuDe3 = new javax.swing.JLabel();
                txtTen = new javax.swing.JTextField();
                lblTieuDe4 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                txtMoTa = new javax.swing.JTextArea();
                pnlButton = new javax.swing.JPanel();
                btnThem = new javax.swing.JButton();
                btnSua = new javax.swing.JButton();
                btnXoa = new javax.swing.JButton();
                btnMoi = new javax.swing.JButton();

                setLayout(new java.awt.BorderLayout());

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                tblSanPham.setBackground(new java.awt.Color(255, 255, 255));
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
                if (tblSanPham.getColumnModel().getColumnCount() > 0) {
                        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(10);
                }

                lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe.setText("Thông tin sản phẩm");
                lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                jPanel2.add(button1);

                btnPrevious.setForeground(new java.awt.Color(76, 76, 76));
                btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                btnPrevious.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPreviousActionPerformed(evt);
                        }
                });
                jPanel2.add(btnPrevious);

                lblIndex.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblIndex.setForeground(new java.awt.Color(255, 0, 0));
                lblIndex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblIndex.setText("1");
                jPanel2.add(lblIndex);

                jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 0, 0));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("/");
                jPanel2.add(jLabel2);

                lblSize.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblSize.setForeground(new java.awt.Color(255, 0, 0));
                lblSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblSize.setText("3");
                jPanel2.add(lblSize);

                btnNext.setForeground(new java.awt.Color(76, 76, 76));
                btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                btnNext.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNextActionPerformed(evt);
                        }
                });
                jPanel2.add(btnNext);

                button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                jPanel2.add(button2);

                lblTieuDe1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe1.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe1.setText("Danh sách sản phẩm");
                lblTieuDe1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe2.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe2.setText("Mã sản phẩm");
                lblTieuDe2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                txtMa.setEnabled(false);

                lblTieuDe3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe3.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe3.setText("Tên sản phẩm");
                lblTieuDe3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe4.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe4.setText("Mô tả sản phẩm");
                lblTieuDe4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                txtMoTa.setColumns(20);
                txtMoTa.setRows(5);
                jScrollPane2.setViewportView(txtMoTa);

                pnlButton.setBackground(new java.awt.Color(255, 255, 255));
                pnlButton.setLayout(new java.awt.GridLayout(4, 1, 0, 15));

                btnThem.setText("Thêm");
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });
                pnlButton.add(btnThem);

                btnSua.setText("Sửa");
                btnSua.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSuaActionPerformed(evt);
                        }
                });
                pnlButton.add(btnSua);

                btnXoa.setText("Xóa");
                btnXoa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnXoaActionPerformed(evt);
                        }
                });
                pnlButton.add(btnXoa);

                btnMoi.setText("Mới");
                btnMoi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMoiActionPerformed(evt);
                        }
                });
                pnlButton.add(btnMoi);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lblTieuDe)
                                                        .addComponent(lblTieuDe1)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe3)
                                                                        .addComponent(lblTieuDe2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                                                        .addComponent(txtTen)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblTieuDe4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(173, 173, 173))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDe)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTieuDe2)
                                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTieuDe3)
                                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblTieuDe4)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblTieuDe1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                add(jPanel1, java.awt.BorderLayout.CENTER);
        }// </editor-fold>//GEN-END:initComponents

        private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
                if (evt.getClickCount() == 2) {
                        this.index = tblSanPham.rowAtPoint(evt.getPoint());
                        if (this.index >= 0) {
                                
                        }
                } else {
                        this.showDetail();
                }
        }//GEN-LAST:event_tblSanPhamMouseClicked

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                this.insert();
        }//GEN-LAST:event_btnThemActionPerformed

        private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
                this.clear();
        }//GEN-LAST:event_btnMoiActionPerformed

        private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
                this.update();
        }//GEN-LAST:event_btnSuaActionPerformed

        private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
                this.delete();
        }//GEN-LAST:event_btnXoaActionPerformed

        private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
                if (pageIndex >= 0) {
                        pageIndex--;
                        this.fillToTable(pageIndex, 5);
                        lblIndex.setText(String.valueOf(pageIndex + 1));
                } else {
                        pageIndex = 0;
                        this.fillToTable(pageIndex, 5);
                        lblIndex.setText(String.valueOf(pageIndex + 1));
                }
        }//GEN-LAST:event_btnPreviousActionPerformed

        private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
                pageIndex++;
                this.fillToTable(pageIndex, 5);
                lblIndex.setText(String.valueOf(pageIndex + 1));
        }//GEN-LAST:event_btnNextActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnMoi;
        private com.polyshoes.swing.Button btnNext;
        private com.polyshoes.swing.Button btnPrevious;
        private javax.swing.JButton btnSua;
        private javax.swing.JButton btnThem;
        private javax.swing.JButton btnXoa;
        private com.polyshoes.swing.Button button1;
        private com.polyshoes.swing.Button button2;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel lblIndex;
        private javax.swing.JLabel lblSize;
        private javax.swing.JLabel lblTieuDe;
        private javax.swing.JLabel lblTieuDe1;
        private javax.swing.JLabel lblTieuDe2;
        private javax.swing.JLabel lblTieuDe3;
        private javax.swing.JLabel lblTieuDe4;
        private javax.swing.JPanel pnlButton;
        private com.polyshoes.swing.table.Table tblSanPham;
        private javax.swing.JTextField txtMa;
        private javax.swing.JTextArea txtMoTa;
        private javax.swing.JTextField txtTen;
        // End of variables declaration//GEN-END:variables

        private void fillToTable(int page, int limit) {
                DefaultTableModel tblModel = (DefaultTableModel) tblSanPham.getModel();
                tblModel.setRowCount(0);
                List<SanPham> list = dao.paging(page, limit);
                int index = 0;
                for (SanPham x : list) {
                        index++;
                        Object[] rowData = new Object[]{
                                index, x.getMa(), x.getTen(), x.getMoTa(), x.isTrangThai() == true ? "Đang kinh doanh" : "Ngừng kinh doanh"
                        };
                        tblModel.addRow(rowData);
                }

        }

        private SanPham getForm() {
                SanPham model = new SanPham();
                model.setMa(txtMa.getText());
                model.setTen(txtTen.getText());
                model.setMoTa(txtMoTa.getText());
                return model;
        }

        private boolean checkData() {
                if (txtTen.getText().trim().isEmpty()) {
                        DialogHelper.alert(this, "Vui lòng nhập tên sản phẩm");
                        return false;
                }
                return true;
        }

        private void clear() {
                txtMa.setText("");
                txtTen.setText("");
                txtMoTa.setText("");
        }

        private void showDetail() {
                index = tblSanPham.getSelectedRow();
                String ma = (String) tblSanPham.getValueAt(index, 1);
                SanPham model = dao.findById(ma);
                txtMa.setText(model.getMa());
                txtTen.setText(model.getTen());
                txtMoTa.setText(model.getMoTa());
        }

        private void insert() {
                SanPhamDAO dao = new SanPhamDAO();
                if (this.checkData()) {
                        if (dao.insert(this.getForm()) > 0) {
                                DialogHelper.alert(this, "Thêm thành công !!");
                                this.fillToTable(0, 5);
                                this.clear();
                        }
                }
        }

        private void update() {

                try {
                        dao.update(this.getForm());
                        this.fillToTable(0, 5);
                        DialogHelper.alert(this, "Sửa thành công rồi nhé !!");
                } catch (Exception e) {
                        e.printStackTrace();
                        DialogHelper.alert(this, "Sửa thất bại rồi !!");
                }
        }

        private void delete() {
                int index = tblSanPham.getSelectedRow();
                String ma = (String) tblSanPham.getValueAt(index, 1);
                if (DialogHelper.confirm(this, "Bạn có chắc muốn xóa nó không ?")) {
                        try {
                                dao.delete(ma);
                                this.fillToTable(0, 5);
                                this.clear();
                                DialogHelper.alert(this, "Xóa thành công rồi nhé !!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa lỗi rồi bạn ơi !!");
                        }
                }
        }
}
