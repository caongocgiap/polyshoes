package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class SanPhamCTJFrame extends javax.swing.JFrame {

        public SanPhamCTJFrame() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane2 = new javax.swing.JScrollPane();
                tblSanPham1 = new com.polyshoes.swing.table.Table();
                jPanel2 = new javax.swing.JPanel();
                button1 = new com.polyshoes.swing.Button();
                btnPrevious = new com.polyshoes.swing.Button();
                lblIndex = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                lblSize = new javax.swing.JLabel();
                btnNext = new com.polyshoes.swing.Button();
                button2 = new com.polyshoes.swing.Button();
                lblTieuDe = new javax.swing.JLabel();
                textField1 = new com.polyshoes.swing.TextField();
                cboThuongHieu = new com.polyshoes.component.Combobox();
                cboChatLieu = new com.polyshoes.component.Combobox();
                cboDeGiay = new com.polyshoes.component.Combobox();
                cboGia = new com.polyshoes.component.Combobox();
                cboDanhMuc = new com.polyshoes.component.Combobox();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Sản phẩm chi tiết");
                setBackground(new java.awt.Color(255, 255, 255));
                setForeground(java.awt.Color.white);
                setResizable(false);

                tblSanPham1.setBackground(new java.awt.Color(255, 255, 255));
                tblSanPham1.setForeground(new java.awt.Color(255, 255, 255));
                tblSanPham1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "STT", "Mã SP", "Danh mục", "Xuất xứ", "NSX", "Màu sắc", "Size", "Thương hiệu", "Chất liệu", "Đế giày", "Cổ giày", "Khối lượng", "Giá", "SL tồn", "Trạng thái", "Hành động"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblSanPham1.setGridColor(new java.awt.Color(255, 255, 255));
                jScrollPane2.setViewportView(tblSanPham1);
                if (tblSanPham1.getColumnModel().getColumnCount() > 0) {
                        tblSanPham1.getColumnModel().getColumn(0).setPreferredWidth(25);
                        tblSanPham1.getColumnModel().getColumn(6).setPreferredWidth(30);
                        tblSanPham1.getColumnModel().getColumn(13).setPreferredWidth(40);
                }

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                jPanel2.add(button1);

                btnPrevious.setForeground(new java.awt.Color(76, 76, 76));
                btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
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
                jPanel2.add(btnNext);

                button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                jPanel2.add(button2);

                lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe.setText("Thông tin sản phẩm chi tiết");
                lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                textField1.setLabelText("Tìm kiếm");

                cboThuongHieu.setLabeText("Thương hiệu");

                cboChatLieu.setLabeText("Chất liệu");

                cboDeGiay.setLabeText("Đế giày");

                cboGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cao đến thấp", "Thấp đến cao" }));
                cboGia.setLabeText("Giá");

                cboDanhMuc.setLabeText("Danh mục");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTieuDe)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cboGia, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

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
                        java.util.logging.Logger.getLogger(SanPhamCTJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(SanPhamCTJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(SanPhamCTJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(SanPhamCTJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new SanPhamCTJFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnNext;
        private com.polyshoes.swing.Button btnPrevious;
        private com.polyshoes.swing.Button button1;
        private com.polyshoes.swing.Button button2;
        private com.polyshoes.component.Combobox cboChatLieu;
        private com.polyshoes.component.Combobox cboDanhMuc;
        private com.polyshoes.component.Combobox cboDeGiay;
        private com.polyshoes.component.Combobox cboGia;
        private com.polyshoes.component.Combobox cboThuongHieu;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel lblIndex;
        private javax.swing.JLabel lblSize;
        private javax.swing.JLabel lblTieuDe;
        private com.polyshoes.swing.table.Table tblSanPham1;
        private com.polyshoes.swing.TextField textField1;
        // End of variables declaration//GEN-END:variables

        private void init() {
                this.fillToTable();
                this.fillCombobox("Thuong_Hieu", cboThuongHieu);
                this.fillCombobox("Chat_Lieu", cboChatLieu);
                this.fillCombobox("Danh_Muc", cboDanhMuc);
                this.fillCombobox("De_Giay", cboDeGiay);
                cboGia.setSelectedIndex(-1);
        }

        private void fillToTable() {
                SanPhamCTDAO dao = new SanPhamCTDAO();
                DefaultTableModel tblModel = (DefaultTableModel) tblSanPham1.getModel();
                int index = 0;
                List<SanPhamChiTiet> list = dao.select();
                tblModel.setRowCount(0);
                for (SanPhamChiTiet x : list) {
                        index++;
                        Object[] rowData = new Object[]{
                                index, x.getMa(), x.getDanhMuc(), x.getXuatXu(), x.getNSX(), x.getMauSac(), x.getSize(), x.getThuongHieu(),
                                x.getChatLieu(), x.getDeGiay(), x.getCoGiay(), x.getKhoiLuong(), x.getGia(), x.getSoLuongTon(), x.getTrangThai().equalsIgnoreCase("0") ? "Còn hàng" : "Hết hàng"
                        };
                        tblModel.addRow(rowData);
                }
        }
        
        private void fillCombobox(String tenBang, JComboBox com) {
                ThuocTinhDAO dao = new ThuocTinhDAO();
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) com.getModel();
                cboModel.removeAllElements();
                List<ThuocTinh> list = dao.select(tenBang);
                for (ThuocTinh x : list) {
                        cboModel.addElement(x);
                }
                com.setSelectedIndex(-1);
        }

}
