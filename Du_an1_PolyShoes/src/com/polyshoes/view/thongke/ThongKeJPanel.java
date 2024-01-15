/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.ThongKe;

import com.polyshoes.dao.ThongKe.ThongKeDAO;
import com.polyshoes.model.ThongKe.QuanLyThongKe;
import com.polyshoes.model.ThongKe.ThongKe;
import com.polyshoes.model.trangchu.Card;
import com.polyshoes.model.trangchu.CardThongKe;
import com.polyshoes.swing.icon.GoogleMaterialDesignIcons;
import com.polyshoes.swing.icon.IconFontSwing;
import com.polyshoes.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
public class ThongKeJPanel extends javax.swing.JPanel {

    ThongKeDAO dao = new ThongKeDAO();

    public ThongKeJPanel() {
        initComponents();
        showData();
        fillTable();
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        tbl_ThongKe.fixTable(jScrollPane2);
        QuanLyThongKe controller = new QuanLyThongKe();
        controller.setDateToChart(ThongKePanel);
     
    }

    void fillDL(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String TuSo = df.format(jdateDen.getDate());
        String DenSo = df.format(jdateTu.getDate());
        DefaultTableModel model = (DefaultTableModel) tbl_ThongKe.getModel();
        model.setRowCount(0);
        int indexRow = 0;
        try {
            List<ThongKe> list = dao.selectThoiGian(TuSo, DenSo);
            indexRow++;
            for (ThongKe tk : list) {
                Object[] row = {
                    indexRow,
                    tk.getMaHoaDon(),
                    tk.getNgayTao(),
                    tk.getTongTien()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void showData() {
        try {
            List<ThongKe> model = dao.selectAll();
            for (ThongKe x : model) {
                lblDoanhThu.setText(String.valueOf(x.getDoanhThu()));
                lblSoHoaDon.setText(String.valueOf(x.getSoHoaDon()));
                lblSoHoaDonHuy.setText(String.valueOf(x.getSoHoaDOnHuy()));
                lblSoKhachHang.setText(String.valueOf(x.getSoKhachHang()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_ThongKe.getModel();
        model.setRowCount(0);
        int indexRow = 0;
        try {
            List<ThongKe> list = dao.selectAll();
            indexRow++;
            for (ThongKe tk : list) {
                Object[] row = {
                    indexRow,
                    tk.getMaHoaDon(),
                    tk.getNgayTao(),
                    tk.getTongTien()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel2 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                lblSoHoaDon = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                lblSoHoaDonHuy = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                lblSoKhachHang = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jPanel9 = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                jdateTu = new com.toedter.calendar.JDateChooser();
                jLabel10 = new javax.swing.JLabel();
                jdateDen = new com.toedter.calendar.JDateChooser();
                jButton3 = new javax.swing.JButton();
                jTabbedPane1 = new javax.swing.JTabbedPane();
                jPanel10 = new javax.swing.JPanel();
                ThongKePanel = new javax.swing.JPanel();
                jPanel11 = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                tbl_ThongKe = new com.polyshoes.swing.table.Table();
                jLabel11 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                lblDoanhThu = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));

                jPanel2.setBackground(new java.awt.Color(101, 255, 167));
                jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel3.setText("Số Hóa Đơn");

                lblSoHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                lblSoHoaDon.setText("X");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(lblSoHoaDon))
                                .addContainerGap(142, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblSoHoaDon)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel3.setBackground(new java.awt.Color(255, 244, 153));
                jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel5.setText("Số Hóa Đơn Hủy");

                lblSoHoaDonHuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                lblSoHoaDonHuy.setText("X");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(lblSoHoaDonHuy))
                                .addContainerGap(102, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblSoHoaDonHuy)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel6.setBackground(new java.awt.Color(155, 255, 153));
                jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel6.setText("Số Khách Hàng");

                lblSoKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                lblSoKhachHang.setText("X");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(lblSoKhachHang))
                                .addContainerGap(114, Short.MAX_VALUE))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(lblSoKhachHang)
                                .addContainerGap(59, Short.MAX_VALUE))
                );

                jPanel7.setBackground(new java.awt.Color(255, 255, 255));
                jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc Theo Năm"));

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "2020", "2019", "2018" }));

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBox1, 0, 179, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel9.setBackground(new java.awt.Color(255, 255, 255));
                jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc Theo Khoảng Thời Gian"));

                jLabel9.setText("Từ");

                jdateTu.setBackground(new java.awt.Color(255, 255, 255));

                jLabel10.setText("Đến");

                jdateDen.setBackground(new java.awt.Color(255, 255, 255));

                jButton3.setText("Tìm");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdateTu, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdateDen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addContainerGap())
                );
                jPanel9Layout.setVerticalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jdateDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jdateTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9)))
                                .addContainerGap(9, Short.MAX_VALUE))
                );

                jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

                jPanel10.setBackground(new java.awt.Color(255, 255, 255));

                ThongKePanel.setBackground(new java.awt.Color(255, 255, 255));
                ThongKePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

                javax.swing.GroupLayout ThongKePanelLayout = new javax.swing.GroupLayout(ThongKePanel);
                ThongKePanel.setLayout(ThongKePanelLayout);
                ThongKePanelLayout.setHorizontalGroup(
                        ThongKePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1113, Short.MAX_VALUE)
                );
                ThongKePanelLayout.setVerticalGroup(
                        ThongKePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 355, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(ThongKePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel10Layout.setVerticalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ThongKePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jTabbedPane1.addTab("Biểu Đồ", jPanel10);

                jPanel11.setBackground(new java.awt.Color(255, 255, 255));

                tbl_ThongKe.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "STT", "Mã Hóa Đơn", "Ngày Tạo Hóa Đơn", "Tổng Tiền Hóa Đơn"
                        }
                ));
                tbl_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tbl_ThongKeMouseClicked(evt);
                        }
                });
                jScrollPane2.setViewportView(tbl_ThongKe);

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jTabbedPane1.addTab("Doanh Thu Theo Thời Gian", jPanel11);

                jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel11.setText("Thống Kê");

                jPanel1.setBackground(new java.awt.Color(68, 171, 246));
                jPanel1.setToolTipText("");

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setText("Doanh Thu");

                lblDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                lblDoanhThu.setText("X");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(lblDoanhThu))
                                .addContainerGap(180, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblDoanhThu)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTabbedPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(434, 434, 434)
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane1))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void tbl_ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThongKeMouseClicked

    }//GEN-LAST:event_tbl_ThongKeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.fillDL();
    }//GEN-LAST:event_jButton3ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel ThongKePanel;
        private javax.swing.JButton jButton3;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTabbedPane jTabbedPane1;
        private com.toedter.calendar.JDateChooser jdateDen;
        private com.toedter.calendar.JDateChooser jdateTu;
        private javax.swing.JLabel lblDoanhThu;
        private javax.swing.JLabel lblSoHoaDon;
        private javax.swing.JLabel lblSoHoaDonHuy;
        private javax.swing.JLabel lblSoKhachHang;
        private com.polyshoes.swing.table.Table tbl_ThongKe;
        // End of variables declaration//GEN-END:variables
}
