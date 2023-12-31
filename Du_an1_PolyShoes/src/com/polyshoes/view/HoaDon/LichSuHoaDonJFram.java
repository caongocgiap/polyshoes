/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.HoaDon;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.polyshoes.dao.HoaDon.HoaDonDao;
import com.polyshoes.dao.HoaDon.LichSuHoaDonDao;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import com.polyshoes.model.HoaDon.LichSuHoaDon;
import java.awt.Color;

public class LichSuHoaDonJFram extends javax.swing.JPanel {
    
    int index = -1;
    HoaDonDao dao = new HoaDonDao();
    LichSuHoaDonDao lsdao = new LichSuHoaDonDao();
    
    public LichSuHoaDonJFram() {
        initComponents();
        load1();
        setBackground(Color.white);
    }
    
    void load1() {
        DefaultTableModel model = (DefaultTableModel) tblLichSu.getModel();
        model.setRowCount(0);
        int stt = 0;
        try {
            List<LichSuHoaDon> list = lsdao.select();
            for (LichSuHoaDon ls : list) {
                stt++;
                Object[] row = {
                    stt,
                    ls.getTenNV(),
                    ls.getMaNV(),
                    ls.getTenKH(),
                    ls.getTongTien(),
                    ls.getNgayTao(),
                    ls.getNgayTT(),
                    ls.getTrangThai()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
            e.printStackTrace();
        }
    }
    
    void load4() {
        DefaultTableModel model = (DefaultTableModel) tblLichSu.getModel();
        model.setRowCount(0);
        int stt = 0;
        try {
            String keyword = txtTimkiem2.getText();
            List<LichSuHoaDon> list = lsdao.selectByKeyword(keyword);
            for (LichSuHoaDon ls : list) {
                stt++;
                Object[] row = {
                    stt,
                    ls.getTenNV(),
                    ls.getMaNV(),
                    ls.getTenKH(),
                    ls.getTongTien(),
                    ls.getNgayTao(),
                    ls.getNgayTT(),
                    ls.getTrangThai()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
            e.printStackTrace();
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

        jLabel3 = new javax.swing.JLabel();
        txtTimkiem2 = new javax.swing.JTextField();
        btnTimkiem2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLichSu = new com.polyshoes.swing.table.Table();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tìm kiếm hóa đơn");

        btnTimkiem2.setText("Tìm kiếm");
        btnTimkiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem2ActionPerformed(evt);
            }
        });

        tblLichSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên nhân viên", "Mã nhân viên", "Tên khách hàng", "Tổng tiền", "Ngày tạo", "Người thanh toán", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLichSu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimkiem2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimkiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem2ActionPerformed
        load4();        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimkiem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimkiem2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.polyshoes.swing.table.Table tblLichSu;
    private javax.swing.JTextField txtTimkiem2;
    // End of variables declaration//GEN-END:variables
}
