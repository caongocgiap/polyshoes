package com.polyshoes.view.banhang;

import com.polyshoes.dao.HoaDon.HoaDonChiTietDao;
import com.polyshoes.dao.HoaDon.HoaDonDao;
import com.polyshoes.dao.banhang.BanHangDAO;
import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.qrcode.QR_Code;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class BanHangJPanel2 extends javax.swing.JPanel {

        BanHangDAO dao = new BanHangDAO();
        HoaDonDao hdDao = new HoaDonDao();
        int index = -1;
        int trangThai = 1; // 1: chờ thanh toán - 0: đã thanh toán
        String maHD = "%";
        public static String maSPChiTiet;
        
        public BanHangJPanel2() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lblTitle = new javax.swing.JLabel();
                pnlDonHang = new com.polyshoes.component.BorderJPanel();
                tabTong = new com.polyshoes.swing.tabbed.MaterialTabbed();
                tab1 = new com.polyshoes.swing.tabbed.PanelRound();
                jPanel1 = new javax.swing.JPanel();
                txtMaKH = new com.polyshoes.swing.TextField();
                txtTenKH = new com.polyshoes.swing.TextField();
                btnChonKH = new com.polyshoes.swing.Button();
                lblMoTaSP5 = new javax.swing.JLabel();
                lblMoTaSP6 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                lblMoTaSP7 = new javax.swing.JLabel();
                lblMoTaSP8 = new javax.swing.JLabel();
                lblMoTaSP9 = new javax.swing.JLabel();
                lblMoTaSP10 = new javax.swing.JLabel();
                lblMoTaSP11 = new javax.swing.JLabel();
                lblMoTaSP12 = new javax.swing.JLabel();
                lblMoTaSP13 = new javax.swing.JLabel();
                lblMoTaSP15 = new javax.swing.JLabel();
                lblMaHD = new javax.swing.JLabel();
                lblNgayTao = new javax.swing.JLabel();
                lblNgayThanhToan = new javax.swing.JLabel();
                lblMaNV = new javax.swing.JLabel();
                lblTenKH = new javax.swing.JLabel();
                lblTongTien = new javax.swing.JLabel();
                lblGiamGiaKM = new javax.swing.JLabel();
                lblTongTo = new javax.swing.JLabel();
                lblTitle1 = new javax.swing.JLabel();
                btnThanhToan = new com.polyshoes.swing.Button();
                lblMoTaSP14 = new javax.swing.JLabel();
                txtTienKhachDua = new javax.swing.JTextField();
                lblMoTaSP16 = new javax.swing.JLabel();
                lblMoTaSP17 = new javax.swing.JLabel();
                lblTienKhachCK = new javax.swing.JLabel();
                lblTienThua = new javax.swing.JLabel();
                cboHTTT = new javax.swing.JComboBox<>();
                tab2 = new com.polyshoes.swing.tabbed.PanelRound();
                lblMoTaSP = new javax.swing.JLabel();
                pnlHoaDon = new javax.swing.JPanel();
                cboHinhThucHD = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboTrangThaiHD = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                jScrollPaneHoaDon = new javax.swing.JScrollPane();
                tblHoaDon = new com.polyshoes.swing.table.Table();
                button2 = new com.polyshoes.swing.Button();
                btnTaoHD = new com.polyshoes.swing.Button();
                lblMoTaSP2 = new javax.swing.JLabel();
                pnlGioHang = new javax.swing.JPanel();
                jScrollPaneGioHang = new javax.swing.JScrollPane();
                tblGioHang = new com.polyshoes.swing.table.Table();
                btnXoaGioHang = new com.polyshoes.swing.Button();
                lblMoTaSP3 = new javax.swing.JLabel();
                lblMoTaSP4 = new javax.swing.JLabel();
                pnlDSSP = new javax.swing.JPanel();
                jScrollPaneDSSP = new javax.swing.JScrollPane();
                tblDSSP = new com.polyshoes.swing.table.Table();
                cboSize = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboMauSac = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                txtFindSP = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                btnPreviousSP = new com.polyshoes.swing.Button();
                btnNextSP = new com.polyshoes.swing.Button();

                setBackground(new java.awt.Color(255, 255, 255));

                lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                lblTitle.setText("QUẢN LÝ BÁN HÀNG ");

                pnlDonHang.setBackground(new java.awt.Color(255, 255, 255));
                pnlDonHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                tab1.setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                txtMaKH.setLabelText("Mã KH");

                txtTenKH.setLabelText("Tên KH");

                btnChonKH.setBackground(new java.awt.Color(204, 255, 255));
                btnChonKH.setForeground(new java.awt.Color(0, 0, 255));
                btnChonKH.setText("Chọn");
                btnChonKH.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChonKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnChonKH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                lblMoTaSP5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP5.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP5.setText("Thông tin khách hàng");
                lblMoTaSP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP6.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP6.setText("Thông tin hóa đơn");
                lblMoTaSP6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                lblMoTaSP7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP7.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP7.setText("Mã hóa đơn");
                lblMoTaSP7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP8.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP8.setText("Ngày tạo");
                lblMoTaSP8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP9.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP9.setText("Ngày thanh toán");
                lblMoTaSP9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP10.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP10.setText("Mã nhân viên");
                lblMoTaSP10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP11.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP11.setText("Tên khách hàng");
                lblMoTaSP11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP12.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP12.setText("Tổng tiền");
                lblMoTaSP12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP13.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP13.setText("Giảm giá KM");
                lblMoTaSP13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP15.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP15.setText("HT thanh toán");
                lblMoTaSP15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMaHD.setText("_____________________________________");

                lblNgayTao.setText("_____________________________________");

                lblNgayThanhToan.setText("_____________________________________");

                lblMaNV.setText("_____________________________________");

                lblTenKH.setText("_____________________________________");

                lblTongTien.setText("_____________________________________");

                lblGiamGiaKM.setText("_____________________________________");

                lblTongTo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                lblTongTo.setForeground(new java.awt.Color(255, 0, 0));
                lblTongTo.setText("0 VND");

                lblTitle1.setBackground(new java.awt.Color(255, 0, 0));
                lblTitle1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                lblTitle1.setForeground(new java.awt.Color(255, 0, 0));
                lblTitle1.setText("Tổng:");

                btnThanhToan.setBackground(new java.awt.Color(204, 255, 255));
                btnThanhToan.setForeground(new java.awt.Color(0, 0, 255));
                btnThanhToan.setText("Thanh toán");
                btnThanhToan.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThanhToanActionPerformed(evt);
                        }
                });

                lblMoTaSP14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP14.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP14.setText("Tiền khách đưa");
                lblMoTaSP14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP16.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP16.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP16.setText("Tiền khách CK");
                lblMoTaSP16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP17.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP17.setText("Tiền thừa");
                lblMoTaSP17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblTienKhachCK.setText("_____________________________________");

                lblTienThua.setText("_____________________________________");

                cboHTTT.setBackground(new java.awt.Color(255, 255, 255));
                cboHTTT.setForeground(new java.awt.Color(255, 255, 255));
                cboHTTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản", "Kết hợp" }));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lblMoTaSP9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(lblMoTaSP15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(2, 2, 2)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap())
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lblGiamGiaKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lblNgayThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                                                        .addComponent(cboHTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(lblMoTaSP17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(lblTitle1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblTongTo)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(62, 62, 62)
                                                                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(lblTienKhachCK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblTienThua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(7, 7, 7)
                                                                .addComponent(txtTienKhachDua)))
                                                .addContainerGap())))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP7)
                                        .addComponent(lblMaHD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP8)
                                        .addComponent(lblNgayTao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP9)
                                        .addComponent(lblNgayThanhToan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP10)
                                        .addComponent(lblMaNV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP11)
                                        .addComponent(lblTenKH))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP12)
                                        .addComponent(lblTongTien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP13)
                                        .addComponent(lblGiamGiaKM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP15)
                                        .addComponent(cboHTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP14)
                                        .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP16)
                                        .addComponent(lblTienKhachCK))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP17)
                                        .addComponent(lblTienThua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTitle1)
                                        .addComponent(lblTongTo))
                                .addContainerGap())
                );

                javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
                tab1.setLayout(tab1Layout);
                tab1Layout.setHorizontalGroup(
                        tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(tab1Layout.createSequentialGroup()
                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblMoTaSP5)
                                                        .addComponent(lblMoTaSP6))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                tab1Layout.setVerticalGroup(
                        tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMoTaSP5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMoTaSP6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                tabTong.addTab("Tại quầy", tab1);

                tab2.setBackground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
                tab2.setLayout(tab2Layout);
                tab2Layout.setHorizontalGroup(
                        tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 333, Short.MAX_VALUE)
                );
                tab2Layout.setVerticalGroup(
                        tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 609, Short.MAX_VALUE)
                );

                tabTong.addTab("Đặt hàng", tab2);

                javax.swing.GroupLayout pnlDonHangLayout = new javax.swing.GroupLayout(pnlDonHang);
                pnlDonHang.setLayout(pnlDonHangLayout);
                pnlDonHangLayout.setHorizontalGroup(
                        pnlDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                pnlDonHangLayout.setVerticalGroup(
                        pnlDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabTong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                lblMoTaSP.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP.setText("Đơn hàng");
                lblMoTaSP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                pnlHoaDon.setBackground(new java.awt.Color(255, 255, 255));
                pnlHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                cboHinhThucHD.setEditable(false);
                cboHinhThucHD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tại quầy", "Gửi ship" }));

                cboTrangThaiHD.setEditable(false);
                cboTrangThaiHD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chờ thanh toán", "Đã thanh toán" }));
                cboTrangThaiHD.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboTrangThaiHDItemStateChanged(evt);
                        }
                });
                cboTrangThaiHD.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cboTrangThaiHDActionPerformed(evt);
                        }
                });

                tblHoaDon.setBackground(new java.awt.Color(255, 255, 255));
                tblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
                tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "#", "Mã hóa đơn", "Ngày tạo", "Nhân viên", "Hình thức", "Trạng thái"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblHoaDon.setMinimumSize(new java.awt.Dimension(40, 0));
                tblHoaDon.setRowHeight(25);
                tblHoaDon.setSelectionForeground(new java.awt.Color(255, 255, 255));
                tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblHoaDonMouseClicked(evt);
                        }
                });
                jScrollPaneHoaDon.setViewportView(tblHoaDon);
                if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
                        tblHoaDon.getColumnModel().getColumn(0).setPreferredWidth(10);
                }

                button2.setBackground(new java.awt.Color(204, 255, 255));
                button2.setForeground(new java.awt.Color(51, 51, 255));
                button2.setText("Quét mã SP");
                button2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                button2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button2ActionPerformed(evt);
                        }
                });

                btnTaoHD.setBackground(new java.awt.Color(204, 255, 255));
                btnTaoHD.setForeground(new java.awt.Color(51, 51, 255));
                btnTaoHD.setText("Tạo hóa đơn");
                btnTaoHD.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnTaoHD.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTaoHDActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
                pnlHoaDon.setLayout(pnlHoaDonLayout);
                pnlHoaDonLayout.setHorizontalGroup(
                        pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPaneHoaDon)
                                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(btnTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cboTrangThaiHD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboHinhThucHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                pnlHoaDonLayout.setVerticalGroup(
                        pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cboHinhThucHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboTrangThaiHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(btnTaoHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                lblMoTaSP2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP2.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP2.setText("Hóa đơn");
                lblMoTaSP2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                pnlGioHang.setBackground(new java.awt.Color(255, 255, 255));
                pnlGioHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                tblGioHang.setBackground(new java.awt.Color(255, 255, 255));
                tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "#", "Mã SP", "Tên SP", "Đơn giá", "Số lượng", "Giá bán", "Giảm giá", "Thành tiền", "Chọn"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, true, false, false, false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblGioHang.setMinimumSize(new java.awt.Dimension(40, 0));
                tblGioHang.setRowHeight(25);
                tblGioHang.setSelectionBackground(new java.awt.Color(255, 255, 255));
                tblGioHang.setSelectionForeground(new java.awt.Color(255, 255, 255));
                tblGioHang.setShowGrid(false);
                jScrollPaneGioHang.setViewportView(tblGioHang);
                if (tblGioHang.getColumnModel().getColumnCount() > 0) {
                        tblGioHang.getColumnModel().getColumn(0).setPreferredWidth(10);
                }

                btnXoaGioHang.setBackground(new java.awt.Color(204, 255, 255));
                btnXoaGioHang.setForeground(new java.awt.Color(51, 51, 255));
                btnXoaGioHang.setText("Xóa");
                btnXoaGioHang.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

                javax.swing.GroupLayout pnlGioHangLayout = new javax.swing.GroupLayout(pnlGioHang);
                pnlGioHang.setLayout(pnlGioHangLayout);
                pnlGioHangLayout.setHorizontalGroup(
                        pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlGioHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneGioHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoaGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                pnlGioHangLayout.setVerticalGroup(
                        pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlGioHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPaneGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGioHangLayout.createSequentialGroup()
                                                .addGap(0, 49, Short.MAX_VALUE)
                                                .addComponent(btnXoaGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)))
                                .addContainerGap())
                );

                lblMoTaSP3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP3.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP3.setText("Giỏ hàng");
                lblMoTaSP3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP4.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP4.setText("Danh sách sản phẩm");
                lblMoTaSP4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                pnlDSSP.setBackground(new java.awt.Color(255, 255, 255));
                pnlDSSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                tblDSSP.setBackground(new java.awt.Color(255, 255, 255));
                tblDSSP.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "#", "Mã SPCT", "Tên SP", "Màu sắc", "Size", "Thương hiệu", "SL tồn", "Đơn giá"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblDSSP.setMinimumSize(new java.awt.Dimension(40, 0));
                tblDSSP.setRowHeight(25);
                tblDSSP.setSelectionForeground(new java.awt.Color(255, 255, 255));
                tblDSSP.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblDSSPMouseClicked(evt);
                        }
                });
                jScrollPaneDSSP.setViewportView(tblDSSP);
                if (tblDSSP.getColumnModel().getColumnCount() > 0) {
                        tblDSSP.getColumnModel().getColumn(0).setPreferredWidth(10);
                }

                btnPreviousSP.setForeground(new java.awt.Color(51, 51, 255));
                btnPreviousSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                btnPreviousSP.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

                btnNextSP.setForeground(new java.awt.Color(51, 51, 255));
                btnNextSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                btnNextSP.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

                javax.swing.GroupLayout pnlDSSPLayout = new javax.swing.GroupLayout(pnlDSSP);
                pnlDSSP.setLayout(pnlDSSPLayout);
                pnlDSSPLayout.setHorizontalGroup(
                        pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlDSSPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPaneDSSP)
                                        .addGroup(pnlDSSPLayout.createSequentialGroup()
                                                .addComponent(txtFindSP, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(btnPreviousSP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNextSP, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                pnlDSSPLayout.setVerticalGroup(
                        pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSSPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtFindSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnPreviousSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNextSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneDSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(437, 437, 437)
                                .addComponent(lblTitle)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(pnlDSSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblMoTaSP3)
                                                                                .addComponent(lblMoTaSP4))
                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                        .addGap(5, 5, 5))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(pnlGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMoTaSP2)
                                                .addGap(689, 689, 689)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMoTaSP)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(pnlDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP2)
                                        .addComponent(lblMoTaSP))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblMoTaSP3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pnlGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblMoTaSP4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pnlDSSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(pnlDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void tblDSSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSPMouseClicked
                if(evt.getClickCount() == 2) {
                        int soLuongMua = Integer.parseInt(DialogHelper.prompt(this, "Nhập số lượng muốn mua:"));
                        String maSPCT = (String) tblDSSP.getValueAt(tblDSSP.getSelectedRow(), 1);
                        if(index >= 0) {
                                maHD = (String) tblHoaDon.getValueAt(index, 1);
                                this.createHD(maSPCT, soLuongMua, hdDao.getHD_ByMa(maHD, trangThai).get(0).getID());
                        } else {
                                DialogHelper.alert(this, "Vui lòng tạo hóa đơn trước khi thêm vào giỏ hàng!");
                        }
                }
        }//GEN-LAST:event_tblDSSPMouseClicked

        private void btnTaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHDActionPerformed
                dao.taoHD(2, 1);
                DialogHelper.alert(this, "Tạo hóa đơn thành công!");
                index = 0;
                fillTableHoaDon();
        }//GEN-LAST:event_btnTaoHDActionPerformed

        private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
                fillTableGioHang();
                fillFormHD(trangThai);
        }//GEN-LAST:event_tblHoaDonMouseClicked

        private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
                thanhToan();
        }//GEN-LAST:event_btnThanhToanActionPerformed

        private void cboTrangThaiHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrangThaiHDActionPerformed
                if(cboTrangThaiHD.getSelectedIndex() == 0) {
                        
                }
        }//GEN-LAST:event_cboTrangThaiHDActionPerformed

        private void cboTrangThaiHDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiHDItemStateChanged
                if(cboTrangThaiHD.getSelectedIndex() == 0) {
                        this.trangThai = 1;
                        fillTableHoaDon();
                        clearFormHD();
                        DefaultTableModel tblModel = (DefaultTableModel) tblGioHang.getModel();
                        tblModel.setRowCount(0);
                } 
                if(cboTrangThaiHD.getSelectedIndex() == 1) {
                        this.trangThai = 0;
                        fillTableHoaDon();
                        clearFormHD();
                }
        }//GEN-LAST:event_cboTrangThaiHDItemStateChanged

        private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
                new QR_Code().setVisible(true);
        }//GEN-LAST:event_button2ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnChonKH;
        private com.polyshoes.swing.Button btnNextSP;
        private com.polyshoes.swing.Button btnPreviousSP;
        private com.polyshoes.swing.Button btnTaoHD;
        private com.polyshoes.swing.Button btnThanhToan;
        private com.polyshoes.swing.Button btnXoaGioHang;
        private com.polyshoes.swing.Button button2;
        private javax.swing.JComboBox<String> cboHTTT;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboHinhThucHD;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboMauSac;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboSize;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboTrangThaiHD;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPaneDSSP;
        private javax.swing.JScrollPane jScrollPaneGioHang;
        private javax.swing.JScrollPane jScrollPaneHoaDon;
        private javax.swing.JLabel lblGiamGiaKM;
        private javax.swing.JLabel lblMaHD;
        private javax.swing.JLabel lblMaNV;
        private javax.swing.JLabel lblMoTaSP;
        private javax.swing.JLabel lblMoTaSP10;
        private javax.swing.JLabel lblMoTaSP11;
        private javax.swing.JLabel lblMoTaSP12;
        private javax.swing.JLabel lblMoTaSP13;
        private javax.swing.JLabel lblMoTaSP14;
        private javax.swing.JLabel lblMoTaSP15;
        private javax.swing.JLabel lblMoTaSP16;
        private javax.swing.JLabel lblMoTaSP17;
        private javax.swing.JLabel lblMoTaSP2;
        private javax.swing.JLabel lblMoTaSP3;
        private javax.swing.JLabel lblMoTaSP4;
        private javax.swing.JLabel lblMoTaSP5;
        private javax.swing.JLabel lblMoTaSP6;
        private javax.swing.JLabel lblMoTaSP7;
        private javax.swing.JLabel lblMoTaSP8;
        private javax.swing.JLabel lblMoTaSP9;
        private javax.swing.JLabel lblNgayTao;
        private javax.swing.JLabel lblNgayThanhToan;
        private javax.swing.JLabel lblTenKH;
        private javax.swing.JLabel lblTienKhachCK;
        private javax.swing.JLabel lblTienThua;
        private javax.swing.JLabel lblTitle;
        private javax.swing.JLabel lblTitle1;
        private javax.swing.JLabel lblTongTien;
        private javax.swing.JLabel lblTongTo;
        private javax.swing.JPanel pnlDSSP;
        private com.polyshoes.component.BorderJPanel pnlDonHang;
        private javax.swing.JPanel pnlGioHang;
        private javax.swing.JPanel pnlHoaDon;
        private com.polyshoes.swing.tabbed.PanelRound tab1;
        private com.polyshoes.swing.tabbed.PanelRound tab2;
        private com.polyshoes.swing.tabbed.MaterialTabbed tabTong;
        private com.polyshoes.swing.table.Table tblDSSP;
        private com.polyshoes.swing.table.Table tblGioHang;
        private com.polyshoes.swing.table.Table tblHoaDon;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtFindSP;
        private com.polyshoes.swing.TextField txtMaKH;
        private com.polyshoes.swing.TextField txtTenKH;
        private javax.swing.JTextField txtTienKhachDua;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblHoaDon.fixTable(jScrollPaneHoaDon);
                tblGioHang.fixTable(jScrollPaneGioHang);
                tblDSSP.fixTable(jScrollPaneDSSP);
                this.fillToTableSP();
                fillTableHoaDon();
        }
        
        private void fillToTableSP() {
                SanPhamCTDAO dao = new SanPhamCTDAO();
                DefaultTableModel tblModel = (DefaultTableModel) tblDSSP.getModel();
                tblModel.setRowCount(0);
                List<SanPhamChiTiet> list = dao.selectAll(0, 5);
                for (SanPhamChiTiet x : list) {
                        Object[] rowData = new Object[] {
                                x.getStt(), x.getMa(), x.getTen(), x.getMauSac(), x.getSize(), x.getThuongHieu(), x.getSoLuongTon(), x.getGia()
                        };
                        tblModel.addRow(rowData);
                }
        }

        private void fillTableHoaDon() {
                DefaultTableModel tblModel = (DefaultTableModel) tblHoaDon.getModel();
                tblModel.setRowCount(0);
                HoaDonDao dao = new HoaDonDao();
                List<HoaDon> listHD = dao.getHD_ByMa("%", trangThai);
                int stt = 0;
                for (HoaDon x : listHD) {
                        stt++;
                        Object[] rowData = new Object[]{
                                stt, x.getMaHD(), x.getNgayTao(), x.getMaNV(), "Tiền mặt", x.getTrangThai() == 1 ? "Chờ thanh toán" : "Đã thanh toán"
                        };
                        tblModel.addRow(rowData);
                };
        }
        
        private void fillTableGioHang() {
                DefaultTableModel tblModel = (DefaultTableModel) tblGioHang.getModel();
                tblModel.setRowCount(0);
                HoaDonChiTietDao dao = new HoaDonChiTietDao();
                index = tblHoaDon.getSelectedRow();
                List<HoaDonChiTiet> listHD = dao.selectHDBanHang(maHD);
                int stt = 0;
                for (HoaDonChiTiet x : listHD) {
                        stt++;
                        Object[] rowData = new Object[]{
                                stt, x.getMaSPCT(), x.getTenSp(), x.getDonGia(),x.getSoLuong(), x.getDonGia(), 0, x.getTongTien()
                        };
                        tblModel.addRow(rowData);
                }
        }
        
        private void fillFormHD(int trangThai) {
                index = tblHoaDon.getSelectedRow();
                maHD = (String) tblHoaDon.getValueAt(index, 1);
                HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                if (model != null) {
                        lblMaHD.setText(model.getMaHD());
                        lblNgayTao.setText(model.getNgayTaoString());
                        lblNgayThanhToan.setText(model.getNgayTTAsString());
                        lblMaNV.setText(model.getMaNV());
                        lblTenKH.setText(model.getTenKH());
                        lblTongTien.setText(String.valueOf(model.getTongTien()));
                        lblGiamGiaKM.setText(String.valueOf(model.getSoTienGiam()));
                        NumberFormat currencyFormatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                        String tongTienFormat = currencyFormatVN.format(model.getTongTien());
                        lblTongTo.setText(tongTienFormat);
                } else {
                        DialogHelper.alert(this, "Lỗi bán hàng!");
                }
        }
        
        private void clearFormHD() {
                lblMaHD.setText("_____________________________________");
                lblNgayTao.setText("_____________________________________");
                lblNgayThanhToan.setText("_____________________________________");
                lblMaNV.setText("_____________________________________");
                lblTenKH.setText("_____________________________________");
                lblTongTien.setText("_____________________________________");
                lblGiamGiaKM.setText("_____________________________________");
        }

        private void createHD(String maSPCT, int slBan, int idHD) {
                dao.banHang(maSPCT, slBan, idHD);
                fillTableGioHang();
                fillToTableSP();
                fillFormHD(trangThai);
        }
        
        private void thanhToan() {
                if (!txtTienKhachDua.getText().isEmpty()) {
                        double tienTra = Double.parseDouble(txtTienKhachDua.getText());
                        double tienTong = Double.parseDouble(lblTongTien.getText());
                        if (tienTra < tienTong) {
                                DialogHelper.alert(this, "Chưa đủ điều kiện thanh toán!");
                        } else {
                                lblTienThua.setText(String.valueOf(tienTong - tienTra));
                                maHD = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
                                try {
                                        hdDao.thanhToan(maHD);
                                        fillTableHoaDon();
                                        fillTableGioHang();
                                } catch (Exception e) {
                                        DialogHelper.alert(this, "Thanh toán thất bại!");
                                }
                                DialogHelper.alert(this, "Thanh toán thành công!");
                                clearFormHD();
                                DefaultTableModel tblModel = (DefaultTableModel) tblGioHang.getModel();
                                tblModel.setRowCount(0);
                        }
                } else {
                        DialogHelper.alert(this, "Vui lòng nhập số tiền thanh toán!");
                }
        }
        
}
