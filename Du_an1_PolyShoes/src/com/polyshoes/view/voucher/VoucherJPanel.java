package com.polyshoes.view.voucher;

import com.polyshoes.dao.voucher.VoucherDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.voucher.Voucher;
import com.polyshoes.view.dangnhap.Auth;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VoucherJPanel extends javax.swing.JPanel {

        VoucherDAO dao = new VoucherDAO();

        public VoucherJPanel() {
                initComponents();
                init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                dateBD = new com.polyshoes.swing.datechooser.DateChooser();
                dateKT = new com.polyshoes.swing.datechooser.DateChooser();
                jPanel1 = new javax.swing.JPanel();
                txtTenKM = new com.polyshoes.swing.TextField();
                txtSoLuong = new com.polyshoes.swing.TextField();
                txtHDToiThieu = new com.polyshoes.swing.TextField();
                txtSoTienToiDa = new com.polyshoes.swing.TextField();
                txtNgayBD = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                txtNgayKT = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                lblMoTaSP2 = new javax.swing.JLabel();
                lblMoTaSP3 = new javax.swing.JLabel();
                lblTitle = new javax.swing.JLabel();
                btnThem = new com.polyshoes.swing.Button();
                btnHuy = new com.polyshoes.swing.Button();
                btnMoi = new com.polyshoes.swing.Button();
                txtTimKiem = new com.polyshoes.swing.TextField();
                lblMoTaSP5 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblVoucher = new com.polyshoes.swing.table.Table();
                txtMaKM = new com.polyshoes.swing.TextField();
                cboTrangThai = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboPhanTramGiam = new com.polyshoes.component.Combobox();

                dateBD.setForeground(new java.awt.Color(91, 134, 229));
                dateBD.setTextRefernce(txtNgayBD);

                dateKT.setForeground(new java.awt.Color(91, 134, 229));
                dateKT.setTextRefernce(txtNgayKT);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                txtTenKM.setBackground(new java.awt.Color(255, 255, 255));
                txtTenKM.setLabelText("Tên khuyến mãi");

                txtSoLuong.setBackground(new java.awt.Color(255, 255, 255));
                txtSoLuong.setLabelText("Số lượng");

                txtHDToiThieu.setBackground(new java.awt.Color(255, 255, 255));
                txtHDToiThieu.setLabelText("Hóa đơn tối thiểu");

                txtSoTienToiDa.setBackground(new java.awt.Color(255, 255, 255));
                txtSoTienToiDa.setLabelText("Số tiền giảm tối đa");

                lblMoTaSP2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP2.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP2.setText("Ngày bắt đầu");
                lblMoTaSP2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP3.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP3.setText("Ngày kết thúc");
                lblMoTaSP3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblTitle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblTitle.setForeground(new java.awt.Color(91, 134, 229));
                lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblTitle.setText("Phiếu giảm giá");

                btnThem.setBackground(new java.awt.Color(204, 255, 255));
                btnThem.setForeground(new java.awt.Color(51, 51, 255));
                btnThem.setText("Thêm");
                btnThem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });

                btnHuy.setBackground(new java.awt.Color(204, 255, 255));
                btnHuy.setForeground(new java.awt.Color(51, 51, 255));
                btnHuy.setText("Hủy");
                btnHuy.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnHuy.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnHuyActionPerformed(evt);
                        }
                });

                btnMoi.setBackground(new java.awt.Color(204, 255, 255));
                btnMoi.setForeground(new java.awt.Color(51, 51, 255));
                btnMoi.setText("Làm mới");
                btnMoi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnMoi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMoiActionPerformed(evt);
                        }
                });

                txtTimKiem.setBackground(new java.awt.Color(255, 255, 255));
                txtTimKiem.setLabelText("Tìm kiếm theo tên");
                txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtTimKiemKeyReleased(evt);
                        }
                });

                lblMoTaSP5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP5.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP5.setText("Trạng thái");
                lblMoTaSP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
                jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

                tblVoucher.setBackground(new java.awt.Color(255, 255, 255));
                tblVoucher.setForeground(new java.awt.Color(255, 255, 255));
                tblVoucher.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "#", "Mã", "Tên", "Ngày BD", "Ngày KT", "Số lượng", "HD tối thiểu", "Số % giảm", "Giảm tối đa", "Ngày tạo", "Người tạo", "Trạng thái"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblVoucher.setSelectionBackground(new java.awt.Color(255, 255, 255));
                tblVoucher.setSelectionForeground(new java.awt.Color(255, 255, 255));
                tblVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblVoucherMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tblVoucher);
                if (tblVoucher.getColumnModel().getColumnCount() > 0) {
                        tblVoucher.getColumnModel().getColumn(0).setPreferredWidth(15);
                }

                txtMaKM.setEditable(false);
                txtMaKM.setBackground(new java.awt.Color(255, 255, 255));
                txtMaKM.setText("###");
                txtMaKM.setLabelText("Mã khuyến mãi");

                cboTrangThai.setEditable(false);
                cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Sắp diễn ra", "Đang diễn ra", "Đã kết thúc" }));
                cboTrangThai.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                cboTrangThai.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboTrangThaiItemStateChanged(evt);
                        }
                });

                cboPhanTramGiam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90" }));
                cboPhanTramGiam.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
                cboPhanTramGiam.setLabeText("Phần trăm giảm");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(352, 352, 352))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblMoTaSP5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblMoTaSP2)
                                                        .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtHDToiThieu, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblMoTaSP3)
                                                        .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtSoTienToiDa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboPhanTramGiam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboPhanTramGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHDToiThieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSoTienToiDa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblMoTaSP2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblMoTaSP3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblMoTaSP5)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                if (DialogHelper.confirm(this, "Bạn có chắc muốn thêm không?")) {
                        insert();
                }
        }//GEN-LAST:event_btnThemActionPerformed

        private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
                huyVoucher();
        }//GEN-LAST:event_btnHuyActionPerformed

        private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
                clear();
        }//GEN-LAST:event_btnMoiActionPerformed

        private void cboTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiItemStateChanged
                switch (cboTrangThai.getSelectedIndex()) {
                        case 0:
                                fillAllTable();
                                break;
                        case 1:
                                fillByTrangThai(0);
                                break;
                        case 2:
                                fillByTrangThai(1);
                                break;
                        case 3:
                                fillByTrangThai(2);
                                break;
                        default:
                                fillAllTable();
                                throw new AssertionError();
                }
        }//GEN-LAST:event_cboTrangThaiItemStateChanged

        private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
                fillByTen(txtTimKiem.getText());
        }//GEN-LAST:event_txtTimKiemKeyReleased

        private void tblVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVoucherMouseClicked
                showDetail();
        }//GEN-LAST:event_tblVoucherMouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnHuy;
        private com.polyshoes.swing.Button btnMoi;
        private com.polyshoes.swing.Button btnThem;
        private com.polyshoes.component.Combobox cboPhanTramGiam;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboTrangThai;
        private com.polyshoes.swing.datechooser.DateChooser dateBD;
        private com.polyshoes.swing.datechooser.DateChooser dateKT;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblMoTaSP2;
        private javax.swing.JLabel lblMoTaSP3;
        private javax.swing.JLabel lblMoTaSP5;
        private javax.swing.JLabel lblTitle;
        private com.polyshoes.swing.table.Table tblVoucher;
        private com.polyshoes.swing.TextField txtHDToiThieu;
        private com.polyshoes.swing.TextField txtMaKM;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtNgayBD;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtNgayKT;
        private com.polyshoes.swing.TextField txtSoLuong;
        private com.polyshoes.swing.TextField txtSoTienToiDa;
        private com.polyshoes.swing.TextField txtTenKM;
        private com.polyshoes.swing.TextField txtTimKiem;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblVoucher.fixTable(jScrollPane1);
                checkTrangThai();
                fillAllTable();
                clear();
        }

        private void checkTrangThai() {
                List<Voucher> list = dao.selectAll();
                Date now = new Date();
                for (Voucher x : list) {
                        int soSanhBD = now.compareTo(x.getNgayBD());
                        int soSanhKT = now.compareTo(x.getNgayKT());
                        if (soSanhBD >= 0 && soSanhKT <= 0) {
                                dao.updateTrangThai(1, x.getMa());
                        } else if (soSanhBD < 0) {
                                dao.updateTrangThai(0, x.getMa());
                        } else {
                                dao.updateTrangThai(2, x.getMa());
                        }
                }
        }

        private void fillAllTable() {
                DefaultTableModel tblModel = (DefaultTableModel) tblVoucher.getModel();
                tblModel.setRowCount(0);
                List<Voucher> list = dao.selectAll();
                for (Voucher x : list) {
                        tblModel.addRow(x.toDataRow());
                }
        }

        private void fillByTrangThai(int trangThai) {
                DefaultTableModel tblModel = (DefaultTableModel) tblVoucher.getModel();
                tblModel.setRowCount(0);
                List<Voucher> list = dao.selectByTrangThai(trangThai);
                for (Voucher x : list) {
                        tblModel.addRow(x.toDataRow());
                }
        }

        private void fillByTen(String tenKM) {
                DefaultTableModel tblModel = (DefaultTableModel) tblVoucher.getModel();
                tblModel.setRowCount(0);
                List<Voucher> list = dao.selectByTen("%" + tenKM + "%");
                for (Voucher x : list) {
                        tblModel.addRow(x.toDataRow());
                }
        }

        private void showDetail() {
                String ten = tblVoucher.getValueAt(tblVoucher.getSelectedRow(), 2).toString();
                Voucher model = (Voucher) dao.selectByTen(ten).get(0);
                DecimalFormat df = new DecimalFormat("#,##0 VND");
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                txtMaKM.setText(model.getMa());
                txtTenKM.setText(model.getTen());
                txtSoLuong.setText(String.valueOf(model.getSoLuong()));
                txtHDToiThieu.setText(df.format(model.getGiaTriMin()));
                txtSoTienToiDa.setText(df.format(model.getGiamToiDa()));
                cboPhanTramGiam.setSelectedItem(String.valueOf(model.getPhanTramGiam()));
                txtNgayBD.setText(sdf.format(model.getNgayBD()));
                txtNgayKT.setText(sdf.format(model.getNgayKT()));
        }

        private Voucher readForm() {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date ngayBD;
                Date ngayKT;
                try {
                        ngayBD = dateFormat.parse(txtNgayBD.getText());
                        ngayKT = dateFormat.parse(txtNgayKT.getText());
                } catch (ParseException e) {
                        DialogHelper.alert(this, "Sai định dạng ngày!");
                        return null;
                }
                Voucher model = new Voucher();
                model.setMa(model.generateCode());
                model.setTen(txtTenKM.getText());
                model.setNgayBD(ngayBD);
                model.setNgayKT(ngayKT);
                model.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
                model.setGiaTriMin(Integer.parseInt(txtHDToiThieu.getText()));
                model.setPhanTramGiam(Integer.parseInt(cboPhanTramGiam.getSelectedItem().toString()));
                model.setGiamToiDa(Double.parseDouble(txtSoTienToiDa.getText()));
                model.setNguoiTao(Auth.user.getId());
                return model;
        }

        private void insert() {
                if (checkData()) {
                        if (dao.insert(readForm()) > 0) {
                                DialogHelper.alert(this, "Thêm thành công!");
                                clear();
                                fillAllTable();
                        } else {
                                DialogHelper.alert(this, "Thêm thất bại!");
                        }
                }
        }

        private void clear() {
                txtMaKM.setText("");
                txtTenKM.setText("");
                txtSoLuong.setText("");
                txtHDToiThieu.setText("");
                cboPhanTramGiam.setSelectedIndex(-1);
                txtSoTienToiDa.setText("");
                txtNgayBD.setText("");
                txtNgayKT.setText("");
                txtTimKiem.setText("");
                cboTrangThai.setSelectedIndex(0);
        }

        private boolean checkData() {
                int soLuong;
                int phanTramGiam;
                double hdMin;
                double giamMax;
                try {
                        String ngayBD = txtNgayBD.getText();
                        String ngayKT = txtNgayKT.getText();
                        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        
                        Date dateBD = dateFormat.parse(ngayBD);
                        Date dateKT = dateFormat.parse(ngayKT);
                        
                        LocalDate localDateBD = dateBD.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
                        LocalDate localDateKT = dateKT.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
                        
                        if(localDateBD.isAfter(localDateKT)) {
                                DialogHelper.alert(null, "Ngày bắt đầu không được sau ngày kết thúc!");
                                return false;
                        }

                } catch (Exception e) {
                }

                if (txtTenKM.getText().isEmpty()) {
                        DialogHelper.alert(this, "Tên khuyến mại trống!");
                        return false;
                } else {
                        try {
                                soLuong = Integer.parseInt(txtSoLuong.getText());
                                phanTramGiam = Integer.parseInt(cboPhanTramGiam.getSelectedItem().toString());
                                hdMin = Double.parseDouble(txtHDToiThieu.getText());
                                giamMax = Double.parseDouble(txtSoTienToiDa.getText());
                        } catch (NumberFormatException e) {
                                DialogHelper.alert(this, "Nhập sai định dạng");
                        }
                }
                return true;
        }

        private void huyVoucher() {
                if (DialogHelper.confirm(this, "Bạn có chắc muốn hủy đợt giảm giá này không?")) {
                        if (dao.updateTrangThai(3, tblVoucher.getValueAt(tblVoucher.getSelectedRow(), 1).toString()) > 0) {
                                DialogHelper.alert(this, "Hủy thành công!");
                                fillAllTable();
                        } else {
                                DialogHelper.alert(this, "Hủy thất bại!");
                        }

                }
        }

}
