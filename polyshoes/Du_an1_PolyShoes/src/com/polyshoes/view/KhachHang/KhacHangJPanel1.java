/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.KhachHang;

import com.polyshoes.view.KhachHang.KhacHangJPanel1;
import com.polyshoes.model.KhachHang.KhachHang;
import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.dao.KhachHang.KhachHangDao;
import com.polyshoes.swing.table.EventAction;
import com.polyshoes.swing.table.TableActionCellEditor;
import com.polyshoes.swing.table.TableActionCellRender;
import com.polyshoes.swing.table.TableActionEvent;
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
public class KhacHangJPanel1 extends javax.swing.JPanel {

    KhachHangDao daokh = new KhachHangDao();
    int index = -1 ;
      int pageIndex = 0;

    /**
     * Creates new form KhacHangJPanel
     */
    public KhacHangJPanel1() {
        initComponents();
        this.load();
        DiaChi1 dc = new DiaChi1();
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("row" + row);
                  index = lblBang.getSelectedRow();
                DiaChi1.MaKH = (String) lblBang.getValueAt(index, 1);
                  dc.setVisible(true);
                  
            }
        };
        lblBang.getColumnModel().getColumn(9).setCellRenderer(new TableActionCellRender());
        lblBang.getColumnModel().getColumn(9).setCellEditor(new TableActionCellEditor(event));
        String MaKH = (String) lblBang.getValueAt(0, 1);
        System.out.print(MaKH);

//        this.filltable(0, 5);
        mochu(txtFindDiaChi);
        mochu(txtTen);
        mochu(txtSDT);
        mochu(txtDiaChi);
        mochu(txtFindDiaChi1);
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
                    x.getTinh(),
                    x.getQuan(),
                    x.getXa(),
                    x.isGioitinh() ? "Nam" : "Nu",};
                tblModel.addRow(row);
                stt++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

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
                    x.getTinh(),
                    x.getQuan(),
                    x.getXa(),
                    x.getDiaChi(),
                    x.isGioitinh() ? "Nam" : "Nữ",};
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

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
                    x.getTinh(),
                    x.getQuan(),
                    x.getXa(),
                    x.isGioitinh() ? "Nam" : "Nu",};
                tblModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(this, "AAA");
        }
    }

    void timAllLS() {
        DefaultTableModel tblModel = (DefaultTableModel) lblBang1.getModel();
        tblModel.setRowCount(0);
        int stt = 0;
        try {

            String keyword = txtFindDiaChi1.getText();
            List<KhachHang> lstNV = daokh.selectByALLLS(keyword, keyword, keyword, keyword);
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

            JOptionPane.showMessageDialog(this, "AAA");
        }
    }

    boolean check() {
        if (txtSDT.getText().isEmpty() || txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "dien vo cho trong");
            return false;
        }
//        if (txtMa.getText().equals(daokh.select().get(index).getMaKH())) {
//            JOptionPane.showMessageDialog(this, " ma trung");
//            return false;
//        }

        return true;
    }

    KhachHang getModel() {
        KhachHang model = new KhachHang();
        model.setHoTen(txtTen.getText());
        model.setMaKH(model.generateCode());
        model.setSDT(txtSDT.getText());
        model.setDiaChi((txtDiaChi.getText()));
        model.setTinh(String.valueOf(cboTinh.getSelectedItem()));
        model.setQuan(String.valueOf(cboQuan.getSelectedItem()));
        model.setXa(String.valueOf(cboXa.getSelectedItem()));
        model.setGioitinh(rdoNam.isSelected());

        return model;
    }

    KhachHang getModel1() {
        KhachHang model = new KhachHang();
        model.setHoTen(txtTen.getText());
        model.setMaKH(txtMa.getText());
        model.setSDT(txtSDT.getText());
        model.setTinh(String.valueOf(cboTinh.getSelectedItem()));
        model.setQuan(String.valueOf(cboQuan.getSelectedItem()));
        model.setXa(String.valueOf(cboXa.getSelectedItem()));
        model.setGioitinh(rdoNam.isSelected());

        return model;
    }

    KhachHang getModelDiaChi() {
        KhachHang model = new KhachHang();
        model.setHoTen(txtTen.getText());
        model.setMaKH(txtMa.getText());
        model.setSDT(txtSDT.getText());
        model.setGioitinh(rdoNam.isSelected());
        model.setTinh(String.valueOf(cboTinh.getSelectedItem()));
        model.setQuan(String.valueOf(cboQuan.getSelectedItem()));
        model.setXa(String.valueOf(cboXa.getSelectedItem()));
        return model;
    }

    void setModel(KhachHang model) {
        txtMa.setText(model.getMaKH());
        txtTen.setText(model.getHoTen());
        txtSDT.setText(model.getSDT());
        txtDiaChi.setText(String.valueOf(model.getDiaChi()));
        cboTinh.setSelectedItem(String.valueOf(model.getTinh()));
        cboQuan.setSelectedItem(String.valueOf(model.getQuan()));
        cboXa.setSelectedItem(String.valueOf(model.getXa()));
        rdoNu.setSelected(!model.isGioitinh());
        rdoNam.setSelected(model.isGioitinh());
    }

    public void showdata(int index) {
        txtMa.setText(daokh.select().get(index).getMaKH());
        txtTen.setText(daokh.select().get(index).getHoTen());
        txtSDT.setText(daokh.select().get(index).getSDT());
        txtDiaChi.setText(String.valueOf(daokh.select().get(index).getDiaChi()));
        cboTinh.setSelectedItem(String.valueOf(daokh.select().get(index).getTinh()));
        cboQuan.setSelectedItem(String.valueOf(daokh.select().get(index).getQuan()));
        cboXa.setSelectedItem(String.valueOf(daokh.select().get(index).getXa()));
        rdoNam.setSelected(daokh.select().get(index).isGioitinh());
        rdoNu.setSelected(!daokh.select().get(index).isGioitinh());

    }

    void setStatus(boolean inserttable) {
        txtMa.setEditable(inserttable);
        btnThem.setEnabled(inserttable);
        btnSua.setEnabled(!inserttable);
        btnXoa.setEnabled(!inserttable);

    }

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
        jPanel1 = new javax.swing.JPanel();
        cboXa = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
        jLabel32 = new javax.swing.JLabel();
        cboQuan = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
        jLabel31 = new javax.swing.JLabel();
        cboTinh = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
        jLabel30 = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1070, 761));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Thiết lập thông tin khách hàng"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Mã KH");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 27, -1, -1));

        jLabel26.setText("SDT");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        jLabel27.setText("Họ và tên");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 81, -1, -1));

        jLabel28.setText("Giới tính");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 131, -1, -1));

        jLabel29.setText("Địa chỉ ");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));

        txtMa.setEnabled(false);
        jPanel6.add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 24, 293, -1));

        txtTen.setText("Nhâp Tên");
        txtTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenFocusLost(evt);
            }
        });
        jPanel6.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 78, 293, -1));

        txtSDT.setText("Nhập SĐT");
        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        jPanel6.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 322, -1));

        txtDiaChi.setEnabled(false);
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
        jPanel6.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 322, -1));

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });
        jPanel6.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 129, -1, -1));

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        jPanel6.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 129, -1, -1));

        btnThem.setBackground(new java.awt.Color(51, 255, 255));
        btnThem.setIcon(null);
        btnThem.setText("thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel6.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 83, -1));

        btnSua.setBackground(new java.awt.Color(51, 255, 255));
        btnSua.setIcon(null);
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel6.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 82, -1));

        btnXoa.setBackground(new java.awt.Color(51, 255, 255));
        btnXoa.setIcon(null);
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 82, -1));

        btnReset.setBackground(new java.awt.Color(51, 255, 255));
        btnReset.setIcon(null);
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel6.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 170, 97, -1));

        cboXa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cống Vi", " Điện Biên", " Đội Cấn", " Giảng Võ", " Kim Mã", " Liễu Giai", " Ngọc Hà", " Ngọc Khánh", " Nguyễn Trung Trực", " Phúc Xá", " Quán Thánh", " Thành Công", " Trúc Bạch", "  Vĩnh Phúc", "Chương Dương Độ", " Cửa Đông", " Cửa Nam", "Đồng Xuân", " Hàng Bạc", " Hàng Bài", " Hàng Bồ", " Hàng Bông", " Hàng Buồm", " Hàng Đào", " Hàng Gai", " Hàng Mã", " Hàng Trống", " Lý Thái Tổ", " Phan Chu Trinh", " Phúc Tân", " Trần Hưng Đạo", "Tràng Tiền Bưởi", "Thụy Khuê", " Yên Ph,", " Tứ Liên", " Nhật Tân", " Quảng An", " Xuân La", "  Phú Thượng" }));
        cboXa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboXaActionPerformed(evt);
            }
        });

        jLabel32.setText("Xã");

        cboQuan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hoàn Kiếm", "Tây Hồ", "Long Biên", "Cầu Giấy", "Đống Đa", "Hai Bà Trưng", "Hoàng Mai", "Thanh Xuân", "Hà Đông", "Bắc Từ Liêm", "Nam Từ Liêm", "Sơn Tây", "Ba Vì", "Chương Mỹ", "Đan Phượng", "Đông Anh", "Gia Lâm", "Hoài Đức", "Mê Linh", "Mỹ Đức", "Phú Xuyên", "Phúc Thọ", "Quốc Oai", "Sóc Sơn", "Thạch Thất", "Thanh Oai ", "Thanh Trì", "Thường Tín", " " }));

        jLabel31.setText("Quận");

        cboTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bà rịa Vũng Tàu", "Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lạng Sơn", "Lào Cai", "Lâm Đồng", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
        cboTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTinhActionPerformed(evt);
            }
        });

        jLabel30.setText("Tỉnh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(148, 148, 148)
                .addComponent(jLabel31)
                .addGap(149, 149, 149)
                .addComponent(jLabel32)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cboTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(cboQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboXa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboXa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, 70));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 1300, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab2.setPreferredSize(new java.awt.Dimension(1004, 202));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(51, 255, 255));
        btnBack.setIcon(null);
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 82, -1));

        BtnNext.setBackground(new java.awt.Color(51, 255, 255));
        BtnNext.setIcon(null);
        BtnNext.setText(">>");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });
        jPanel3.add(BtnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 260, 82, -1));

        lblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "stt", "MaKH", "Họ và tên", "SDT", "Địa chỉ  ", "Tỉnh ", "Quận", "Xã ", "Giới tính", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1356, 168));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "tim theo ma,ten,dia chi,sdt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

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

        btnFindAll.setBackground(new java.awt.Color(51, 255, 255));
        btnFindAll.setIcon(null);
        btnFindAll.setText("Tìm");
        btnFindAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtFindDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblPad.setText("1");
        jPanel3.add(lblPad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 20, 20));

        tab2.addTab("Thông tin khách hàng", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1367, 350));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "tim theo ma,ten,dia chi,sdt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtFindDiaChi1.setText("tim ma-ten-sdt-dia chi");
        txtFindDiaChi1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFindDiaChi1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFindDiaChi1FocusLost(evt);
            }
        });

        btnFindAll1.setBackground(new java.awt.Color(51, 255, 255));
        btnFindAll1.setIcon(null);
        btnFindAll1.setText("Tìm");
        btnFindAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAll1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtFindDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnFindAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindAll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab2.addTab("Lịch sử giao dịch", jPanel4);

        jPanel2.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 37, 1290, 348));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 318, 1310, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Quản Lý Khách Hàng");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 18, 203, -1));
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
                    daokh.updateDiaChi(model);
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
        // TODO add your handling code here:
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
        // TODO add your handling code here:
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

    private void btnFindAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAll1ActionPerformed
        // TODO add your handling code here:
        this.timAllLS();
    }//GEN-LAST:event_btnFindAll1ActionPerformed

    private void txtFindDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindDiaChiActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void cboTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTinhActionPerformed

    private void cboXaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboXaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboXaActionPerformed


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
    private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboQuan;
    private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboTinh;
    private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboXa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
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
