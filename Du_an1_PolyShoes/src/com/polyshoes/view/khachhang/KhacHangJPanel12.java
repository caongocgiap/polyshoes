/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.khachhang;


import com.polyshoes.dao.khachhang.KhachHangDao123;
import com.polyshoes.dao.khachhang.KhachHangDao13;


import com.polyshoes.model.khachhang.KhachHang;
import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.helper.DialogHelper;

import com.polyshoes.swing.table.EventAction;

import com.polyshoes.view.trangchu.MainJPanel;
import java.awt.Color;
import java.awt.Font;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class KhacHangJPanel12 extends javax.swing.JPanel {

    KhachHangDao123 daokh = new KhachHangDao123();
    int index = -1 ;
      int pageIndex = 0;

    /**
     * Creates new form KhacHangJPanel
     */
    public KhacHangJPanel12() {
        initComponents();
        this.load();

//        DiaChi1 dc = new DiaChi1();
//        TableActionEvent event = new TableActionEvent() {
//            @Override
//            public void onEdit(int row) {
//                System.out.println("row" + row);
//                  index = lblBang.getSelectedRow();
//                DiaChi1.MaKH = (String) lblBang.getValueAt(index, 1);
//                  dc.setVisible(true);
//            }
//        };
//        lblBang.getColumnModel().getColumn(9).setCellRenderer(new TableActionCellRender());
//        lblBang.getColumnModel().getColumn(9).setCellEditor(new TableActionCellEditor(event));
        String MaKH = (String) lblBang.getValueAt(0, 1);
        System.out.print(MaKH);

//        this.filltable(0, 5);
//        mochu(txtFindDiaChi);
//        mochu(txtTen);
//        mochu(txtSDT);
//        mochu(txtDiaChi);
//        mochu(txtFindDiaChi1);
    }

    public void mochu(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }

    public void xoamochu(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }

    void load() {
        DefaultTableModel tblModel = (DefaultTableModel) lblBang.getModel();
        tblModel.setRowCount(0);
        int stt = 1;
        try {
            List<KhachHang> lstNV = daokh.select();
            for (KhachHang x : lstNV) {
                Object[] row = {
                    stt,
                    x.getMaKH(),
                    x.getHoTen(),
                    x.getSDT(),
                    x.getDiaChi(),
                    x.isGioitinh() ? "Nam" : "Nu",};
                tblModel.addRow(row);
                stt++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
//
    void loadLichSu() {
        DefaultTableModel tblModel = (DefaultTableModel) lblBang1.getModel();
        tblModel.setRowCount(0);
        int stt = 1;
        try {
            String MaKH = (String) lblBang.getValueAt(lblBang.getSelectedRow(), 1);
            List<KhachHang> lstNV = daokh.selectHoaDon1(MaKH);
            for (KhachHang x : lstNV) {
                Object[] row = {
                    stt,
                    x.getMaKH(),
                    x.getMaHD(),
                    x.getHoTen(),
                    x.getSDT(),
                    x.getDiaChi(),
                    x.getNgayGiaoDich(),
                    x.getTongTien(),
                    x.getTrangThai1() == 1 ? "Đã thanh toán" : "Chưa thanh toán",};
                stt++;
                tblModel.addRow(row);

            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
//
    void filltable(int page, int limit) {
        DefaultTableModel tblModel = (DefaultTableModel) lblBang.getModel();
        tblModel.setRowCount(0);
        try {
            List<KhachHang> lstNV = daokh.paging(page, limit);
            int stt = 0;
            for (KhachHang x : lstNV) {
                Object[] row = {
                    stt++,
                    x.getMaKH(),
                    x.getHoTen(),
                    x.getSDT(),
                    x.getDiaChi(),
                    x.isGioitinh() ? "Nam" : "Nữ",};
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
//
    void timAll() {
        DefaultTableModel tblModel = (DefaultTableModel) lblBang.getModel();
        tblModel.setRowCount(0);
        int stt = 0;
        try {

            String keyword = txtFindDiaChi.getText();
            List<KhachHang> lstNV = daokh.selectByALL(keyword, keyword, keyword);
            for (KhachHang x : lstNV) {
                stt++;
                Object[] row = {
                    stt,
                    x.getMaKH(),
                    x.getHoTen(),
                    x.getSDT(),
                    x.getDiaChi(),
                   
                    x.isGioitinh() ? "Nam" : "Nữ",};
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(this, "Tìm Thất bại");
        }
    }
//
    void timAllLS() {
        DefaultTableModel tblModel = (DefaultTableModel) lblBang1.getModel();
        tblModel.setRowCount(0);
        int stt = 0;
        try {

            String keyword = txtFindDiaChi1.getText();
            List<KhachHang> lstNV = daokh.selectByALLLS(keyword, keyword, keyword);
            for (KhachHang x : lstNV) {
                stt++;
                Object[] row = {
                    stt,
                    x.getMaKH(),
                    x.getMaHD(),
                    x.getHoTen(),
                    x.getSDT(),
                    x.getDiaChi(),
                    x.getNgayGiaoDich(),
                    x.getTongTien(),
                    x.getTrangThai1() == 1 ? "da thanh toan" : "chua thanh toan",};
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
//
            JOptionPane.showMessageDialog(this, "AAA");
        }
    }
//
//    boolean check() {
//        if (txtSDT.getText().isEmpty() || txtTen.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "dien vo cho trong");
//            return false;
//        }
////        if (txtMa.getText().equals(daokh.select().get(index).getMaKH())) {
////            JOptionPane.showMessageDialog(this, " ma trung");
////            return false;
////        }
//
//        return true;
//    }
//
    KhachHang getModel() {
        KhachHang model = new KhachHang();
        model.setHoTen(txtTen.getText());
        model.setMaKH(model.generateCode());
        model.setSDT(txtSDT.getText());
        model.setDiaChi((txtDiaChi.getText()));
        model.setDiaChi(txtDiaChi.getText());
        model.setGioitinh(rdoNam.isSelected());

        return model;
    }
//
    KhachHang getModel1() {
        KhachHang model = new KhachHang();
        model.setHoTen(txtTen.getText());
        model.setMaKH(txtMa.getText());
        model.setSDT(txtSDT.getText());
      model.setDiaChi(txtDiaChi.getText());
        model.setGioitinh(rdoNam.isSelected());

        return model;
    }

//    KhachHang getModelDiaChi() {
//        KhachHang model = new KhachHang();
//        model.setHoTen(txtTen.getText());
//        model.setMaKH(txtMa.getText());
//        model.setSDT(txtSDT.getText());
//        model.setGioitinh(rdoNam.isSelected());
//        model.setTinh(String.valueOf(cboTinh.getSelectedItem()));
//        model.setQuan(String.valueOf(cboQuan.getSelectedItem()));
//        model.setXa(String.valueOf(cboXa.getSelectedItem()));
//        return model;
//    }
//
    void setModel(KhachHang model) {
        txtMa.setText(model.getMaKH());
        txtTen.setText(model.getHoTen());
        txtSDT.setText(model.getSDT());
        txtDiaChi.setText(String.valueOf(model.getDiaChi()));
      
        rdoNu.setSelected(!model.isGioitinh());
        rdoNam.setSelected(model.isGioitinh());
    }
//
    public void showdata(int index) {
        txtMa.setText(daokh.select().get(index).getMaKH());
        txtTen.setText(daokh.select().get(index).getHoTen());
        txtSDT.setText(daokh.select().get(index).getSDT());
        txtDiaChi.setText(String.valueOf(daokh.select().get(index).getDiaChi()));
        rdoNam.setSelected(daokh.select().get(index).isGioitinh());
        rdoNu.setSelected(!daokh.select().get(index).isGioitinh());

    }
//
//    void setStatus(boolean inserttable) {
//        txtMa.setEditable(inserttable);
//        btnThem.setEnabled(inserttable);
//        btnSua.setEnabled(!inserttable);
//        btnXoa.setEnabled(!inserttable);
//
//    }
//
    void clear() {
        this.setModel(new KhachHang());

    }

//    void edit() {
//        try {
//            String MaKH = (String) lblBang.getValueAt(this.index, 0);
//            KhachHang model = daokh.findById(MaKH);
//            if (model != null) {
//                this.setModel(model);
////                this.setStatus(false);
//            }
//        } catch (Exception e) {
//           e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "loi truy van");
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnThem = new com.polyshoes.swing.Button();
        btnSua = new com.polyshoes.swing.Button();
        btnXoa = new com.polyshoes.swing.Button();
        btnReset = new com.polyshoes.swing.Button();
        jPanel2 = new javax.swing.JPanel();
        tab2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new com.polyshoes.swing.Button();
        BtnNext = new com.polyshoes.swing.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        lblBang = new com.polyshoes.swing.table.Table();
        jPanel5 = new javax.swing.JPanel();
        txtFindDiaChi = new javax.swing.JTextField();
        btnFindAll = new com.polyshoes.swing.Button();
        lblPad = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtFindDiaChi1 = new javax.swing.JTextField();
        btnFindAll1 = new com.polyshoes.swing.Button();
        jScrollPane5 = new javax.swing.JScrollPane();
        lblBang1 = new com.polyshoes.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1058, 741));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết lập thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Mã KH");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("SDT");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 30, 30));

        jLabel27.setText("Họ và tên");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jLabel28.setText("Giới tính");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 40));

        jLabel29.setText("Địa chỉ ");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, 30));

        txtMa.setEnabled(false);
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });
        jPanel6.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 293, 33));

        txtTen.setText("nhap ten");
        txtTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenFocusLost(evt);
            }
        });
        jPanel6.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 293, 33));

        txtSDT.setText("nhap sdt");
        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        jPanel6.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 322, 40));

        txtDiaChi.setText("nhap dia chi");
        txtDiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusLost(evt);
            }
        });
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });
        jPanel6.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 322, 30));

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });
        jPanel6.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        jPanel6.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        btnThem.setBackground(new java.awt.Color(51, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/them.png"))); // NOI18N
        btnThem.setText("thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel6.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 196, 83, 40));

        btnSua.setBackground(new java.awt.Color(51, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/sua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel6.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 196, 82, 40));

        btnXoa.setBackground(new java.awt.Color(51, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/thungrac.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 196, 82, 40));

        btnReset.setBackground(new java.awt.Color(51, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/xoa.png"))); // NOI18N
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel6.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 196, 90, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N

        tab2.setPreferredSize(new java.awt.Dimension(1004, 202));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(51, 255, 255));
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 82, 30));

        BtnNext.setBackground(new java.awt.Color(51, 255, 255));
        BtnNext.setText(">>");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });
        jPanel3.add(BtnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 82, 30));

        lblBang.setForeground(new java.awt.Color(255, 255, 255));
        lblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "stt", "MaKH", "Họ và tên", "SDT", "Địa chỉ  ", "Giới tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lblBang);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1060, 200));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "tim theo ma,ten,dia chi,sdt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFindDiaChi.setText("tim ma-ten-sdt-dia chi");
        txtFindDiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFindDiaChiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFindDiaChiFocusLost(evt);
            }
        });
        txtFindDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindDiaChiActionPerformed(evt);
            }
        });
        jPanel5.add(txtFindDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 26, 267, 26));

        btnFindAll.setBackground(new java.awt.Color(51, 255, 255));
        btnFindAll.setText("Tìm");
        btnFindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAllActionPerformed(evt);
            }
        });
        jPanel5.add(btnFindAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 26, 82, 26));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 70));

        lblPad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPad.setText("1");
        jPanel3.add(lblPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 20, 20));

        tab2.addTab("Thông tin khách hàng", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1367, 350));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "tim theo ma,ten,dia chi,sdt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFindDiaChi1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFindDiaChi1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFindDiaChi1FocusLost(evt);
            }
        });
        jPanel7.add(txtFindDiaChi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 28, 267, 23));

        btnFindAll1.setBackground(new java.awt.Color(51, 255, 255));
        btnFindAll1.setText("Tìm");
        btnFindAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAll1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnFindAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 28, 82, 26));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, 70));
        jPanel7.getAccessibleContext().setAccessibleName("Nhập MaxKH, TênKH, Địa chỉ, SĐT");

        lblBang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "stt", "MaKH", "MaHD", "TenKH", "SDT", "Dia Chi", "Ngay Giao Dich", "Tong Tien", "Trang Thai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lblBang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBang1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(lblBang1);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 220));

        tab2.addTab("Lịch sử giao dịch", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBang1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBang1MouseClicked

    private void btnFindAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAllActionPerformed
        // TODO add your handling code here:
        this.timAll();
    }//GEN-LAST:event_btnFindAllActionPerformed

    private void txtFindDiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFindDiaChiFocusLost
        // TODO add your handling code here:
        if (txtFindDiaChi.getText().length() == 0) {
            mochu(txtFindDiaChi);
            txtFindDiaChi.setText("tim ma-ten-sdt-dia chi");
        }
    }//GEN-LAST:event_txtFindDiaChiFocusLost

    private void txtFindDiaChiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFindDiaChiFocusGained
        // TODO add your handling code here:
        if (txtFindDiaChi.getText().equals("tim ma-ten-sdt-dia chi")) {
            txtFindDiaChi.setText(null);
            txtFindDiaChi.requestFocus();
            xoamochu(txtFindDiaChi);
        }
    }//GEN-LAST:event_txtFindDiaChiFocusGained

    private void lblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBangMouseClicked
        if (evt.getClickCount() == 2) {
            this.index = lblBang.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.loadLichSu();
            }
        } else {
            index = lblBang.getSelectedRow();
            this.showdata(index);
            //                        this.index = tblThongTin.rowAtPoint(evt.getPoint());
            //                        this.showDetail(index);
        }
    }//GEN-LAST:event_lblBangMouseClicked

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
     
        if (pageIndex >= 0) {
            pageIndex++;
            this.filltable(pageIndex, 5);
            lblPad.setText(String.valueOf(pageIndex + 1));
        } else {
            pageIndex = 0;
            this.filltable(pageIndex, 5);
            lblPad.setText(String.valueOf(pageIndex + 1));
        }
    }//GEN-LAST:event_BtnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
        if (pageIndex >= 0) {
            pageIndex--;
            this.filltable(pageIndex, 5);
            lblPad.setText(String.valueOf(pageIndex + 1));
        } else {
            pageIndex = 0;
            this.filltable(pageIndex, 5);
            lblPad.setText(String.valueOf(pageIndex + 1));
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        this.setModel(new KhachHang());
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "ban co chac chan ko", "thong bao", JOptionPane.YES_NO_CANCEL_OPTION, 3);
        if (confirm == JOptionPane.YES_OPTION) {
            String makh = txtMa.getText();
            try {

                daokh.delete(makh);
                
                this.clear();
                this.load();
                DialogHelper.alert(this, "xoa thanh cong");
            } catch (Exception e) {
                e.printStackTrace();
                DialogHelper.alert(this, "xoa that bai");
            }
        }
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "ban co chac chan ko", "thong bao", JOptionPane.YES_NO_CANCEL_OPTION, 3);
        if (confirm == JOptionPane.YES_OPTION) {
            KhachHang model = getModel1();
            String ma = txtMa.getText();
            try {
                if (txtMa.getText().equals(ma)) {
                    daokh.update(model);
                    daokh.update(model);
                    this.load();
                    DialogHelper.alert(this, "cap nhap  thanh cong");
                }
            } catch (Exception e) {
                e.printStackTrace();
                DialogHelper.alert(this, "cap nhap  that bai");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "ban co chac chan ko", "thong bao", JOptionPane.YES_NO_CANCEL_OPTION, 3);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                daokh.insert(getModel());
                this.load();
                JOptionPane.showMessageDialog(this, "them thanh cong");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "them that bai");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtDiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusLost
        // TODO add your handling code here:
        if (txtDiaChi.getText().length() == 0) {
            mochu(txtDiaChi);
            txtDiaChi.setText("nhap dia chi");
        }
    }//GEN-LAST:event_txtDiaChiFocusLost

    private void txtDiaChiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusGained
        // TODO add your handling code here:
        if (txtDiaChi.getText().equals("nhap dia chi")) {
            txtDiaChi.setText(null);
            txtDiaChi.requestFocus();
            xoamochu(txtDiaChi);
        }
    }//GEN-LAST:event_txtDiaChiFocusGained

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        // TODO add your handling code here:
        if (txtTen.getText().length() == 0) {
            mochu(txtTen);
            txtTen.setText("nhap sdt");
        }
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
//        // TODO add your handling code here:
        if (txtSDT.getText().equals("nhap sdt")) {
            txtSDT.setText(null);
            txtSDT.requestFocus();
            xoamochu(txtSDT);
        }
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusLost
        // TODO add your handling code here:
        if (txtTen.getText().length() == 0) {
            mochu(txtTen);
            txtTen.setText("nhap ten");
        }
    }//GEN-LAST:event_txtTenFocusLost

    private void txtTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusGained
        // TODO add your handling code here:
        if (txtTen.getText().equals("nhap ten")) {
            txtTen.setText(null);
            txtTen.requestFocus();
            xoamochu(txtTen);
        }
    }//GEN-LAST:event_txtTenFocusGained

    private void txtFindDiaChi1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFindDiaChi1FocusGained
//        // TODO add your handling code here:
        if (txtFindDiaChi1.getText().equals("tim ma-ten-sdt-dia chi")) {
            txtFindDiaChi1.setText(null);
            txtFindDiaChi1.requestFocus();
            xoamochu(txtFindDiaChi1);
        }
    }//GEN-LAST:event_txtFindDiaChi1FocusGained

    private void txtFindDiaChi1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFindDiaChi1FocusLost
        // TODO add your handling code here:
        if (txtFindDiaChi1.getText().length() == 0) {
            mochu(txtFindDiaChi1);
            txtTen.setText("tim ma-ten-sdt-dia chi");
        }
    }//GEN-LAST:event_txtFindDiaChi1FocusLost

    private void txtFindDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindDiaChiActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void btnFindAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAll1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "tim thanh cong");
        this.timAllLS();
    }//GEN-LAST:event_btnFindAll1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.polyshoes.swing.Button BtnNext;
    private com.polyshoes.swing.Button btnBack;
    private com.polyshoes.swing.Button btnFindAll;
    private com.polyshoes.swing.Button btnFindAll1;
    private com.polyshoes.swing.Button btnReset;
    private com.polyshoes.swing.Button btnSua;
    private com.polyshoes.swing.Button btnThem;
    private com.polyshoes.swing.Button btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private com.polyshoes.swing.table.Table lblBang;
    private com.polyshoes.swing.table.Table lblBang1;
    private javax.swing.JLabel lblPad;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tab2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtFindDiaChi;
    private javax.swing.JTextField txtFindDiaChi1;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
