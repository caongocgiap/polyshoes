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
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class BanHangJPanel2 extends javax.swing.JPanel {

        BanHangDAO dao = new BanHangDAO();
        HoaDonDao hdDao = new HoaDonDao();
        int index = -1;
        int trangThai = 1; // 1: chờ thanh toán - 0: đã thanh toán
        String maHD = "";
        public static String maSPCT;

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
                txtTienMat = new javax.swing.JTextField();
                lblMoTaSP16 = new javax.swing.JLabel();
                lblMoTaSP17 = new javax.swing.JLabel();
                lblTienThua = new javax.swing.JLabel();
                cboHTTT = new javax.swing.JComboBox<>();
                txtChuyenKhoan = new javax.swing.JTextField();
                tab2 = new com.polyshoes.swing.tabbed.PanelRound();
                lblMoTaSP = new javax.swing.JLabel();
                pnlHoaDon = new javax.swing.JPanel();
                cboHinhThucHD = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                jScrollPaneHoaDon = new javax.swing.JScrollPane();
                tblHoaDon = new com.polyshoes.swing.table.Table();
                btnQuetMa = new com.polyshoes.swing.Button();
                btnTaoHD = new com.polyshoes.swing.Button();
                btnHuyHD = new com.polyshoes.swing.Button();
                lblMoTaSP2 = new javax.swing.JLabel();
                pnlGioHang = new javax.swing.JPanel();
                jScrollPaneGioHang = new javax.swing.JScrollPane();
                tblGioHang = new com.polyshoes.swing.table.Table();
                btnXoaGioHang = new com.polyshoes.swing.Button();
                jCheckBoxCustom1 = new com.polyshoes.swing.JCheckBoxCustom();
                lblMoTaSP3 = new javax.swing.JLabel();
                lblMoTaSP4 = new javax.swing.JLabel();
                pnlDSSP = new javax.swing.JPanel();
                jScrollPaneDSSP = new javax.swing.JScrollPane();
                tblDSSP = new com.polyshoes.swing.table.Table();
                cboSize = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboDanhMuc = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                txtTimKiem = new com.polyshoes.swing.TextField();
                cboXuatXu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboNhaSanXuat = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();

                setBackground(new java.awt.Color(255, 255, 255));

                lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                lblTitle.setText("QUẢN LÝ BÁN HÀNG ");

                pnlDonHang.setBackground(new java.awt.Color(255, 255, 255));
                pnlDonHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                tab1.setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                txtMaKH.setBackground(new java.awt.Color(255, 255, 255));
                txtMaKH.setText("KH-01");
                txtMaKH.setLabelText("Mã KH");

                txtTenKH.setBackground(new java.awt.Color(255, 255, 255));
                txtTenKH.setText("Khách bán lẻ");
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
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnChonKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
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

                lblMaHD.setText("_______________________________");

                lblNgayTao.setText("_______________________________");

                lblNgayThanhToan.setText("_______________________________");

                lblMaNV.setText("_______________________________");

                lblTenKH.setText("_______________________________");

                lblTongTien.setText("_______________________________");

                lblGiamGiaKM.setText("_______________________________");

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

                txtTienMat.setBackground(new java.awt.Color(255, 255, 255));
                txtTienMat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                txtTienMat.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtTienMatKeyReleased(evt);
                        }
                });

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

                lblTienThua.setText("_______________________________");

                cboHTTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản", "Cả 2" }));
                cboHTTT.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboHTTTItemStateChanged(evt);
                        }
                });

                txtChuyenKhoan.setBackground(new java.awt.Color(255, 255, 255));
                txtChuyenKhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                txtChuyenKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtChuyenKhoanKeyReleased(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lblMoTaSP9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(lblTongTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                                        .addComponent(lblTenKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblNgayThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblNgayTao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMaHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(cboHTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(lblGiamGiaKM))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(lblMoTaSP17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblMoTaSP14, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                                .addGap(14, 14, 14)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(43, 43, 43)
                                                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(lblTienThua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                                .addComponent(txtTienMat, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addComponent(txtChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(12, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblTitle1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblTongTo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
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
                                        .addComponent(txtTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP16)
                                        .addComponent(txtChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP17)
                                        .addComponent(lblTienThua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTitle1)
                                        .addComponent(lblTongTo))
                                .addGap(10, 10, 10)
                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
                tab1.setLayout(tab1Layout);
                tab1Layout.setHorizontalGroup(
                        tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblMoTaSP5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMoTaSP6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(0, 311, Short.MAX_VALUE)
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
                        .addComponent(tabTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

                tblHoaDon.setBackground(new java.awt.Color(255, 255, 255));
                tblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
                tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "#", "Mã hóa đơn", "Ngày tạo", "Nhân viên", "Tổng SP", "Trạng thái"
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
                tblHoaDon.setRowHeight(30);
                tblHoaDon.setSelectionForeground(new java.awt.Color(255, 255, 255));
                tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblHoaDonMouseClicked(evt);
                        }
                });
                jScrollPaneHoaDon.setViewportView(tblHoaDon);
                if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
                        tblHoaDon.getColumnModel().getColumn(0).setPreferredWidth(30);
                        tblHoaDon.getColumnModel().getColumn(0).setMaxWidth(30);
                }

                btnQuetMa.setBackground(new java.awt.Color(204, 255, 255));
                btnQuetMa.setForeground(new java.awt.Color(51, 51, 255));
                btnQuetMa.setText("Quét mã SP");
                btnQuetMa.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnQuetMa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnQuetMaActionPerformed(evt);
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

                btnHuyHD.setBackground(new java.awt.Color(204, 255, 255));
                btnHuyHD.setForeground(new java.awt.Color(51, 51, 255));
                btnHuyHD.setText("Hủy hóa đơn");
                btnHuyHD.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnHuyHD.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnHuyHDActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
                pnlHoaDon.setLayout(pnlHoaDonLayout);
                pnlHoaDonLayout.setHorizontalGroup(
                        pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnQuetMa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboHinhThucHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(jScrollPaneHoaDon, javax.swing.GroupLayout.Alignment.TRAILING)
                );
                pnlHoaDonLayout.setVerticalGroup(
                        pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnQuetMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlHoaDonLayout.createSequentialGroup()
                                                .addComponent(cboHinhThucHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(btnHuyHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTaoHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                "#", "Mã SPCT", "Tên SP", "Giá bán", "Số lượng", "Thành tiền", "Chọn"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblGioHang.setMinimumSize(new java.awt.Dimension(40, 0));
                tblGioHang.setRowHeight(30);
                tblGioHang.setSelectionBackground(new java.awt.Color(255, 255, 255));
                tblGioHang.setSelectionForeground(new java.awt.Color(255, 255, 255));
                tblGioHang.setShowGrid(false);
                tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblGioHangMouseClicked(evt);
                        }
                });
                jScrollPaneGioHang.setViewportView(tblGioHang);
                if (tblGioHang.getColumnModel().getColumnCount() > 0) {
                        tblGioHang.getColumnModel().getColumn(0).setPreferredWidth(10);
                }

                btnXoaGioHang.setForeground(new java.awt.Color(51, 51, 255));
                btnXoaGioHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/delete.png"))); // NOI18N
                btnXoaGioHang.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnXoaGioHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

                jCheckBoxCustom1.setBackground(new java.awt.Color(51, 255, 51));

                javax.swing.GroupLayout pnlGioHangLayout = new javax.swing.GroupLayout(pnlGioHang);
                pnlGioHang.setLayout(pnlGioHangLayout);
                pnlGioHangLayout.setHorizontalGroup(
                        pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlGioHangLayout.createSequentialGroup()
                                .addComponent(jScrollPaneGioHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoaGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );
                pnlGioHangLayout.setVerticalGroup(
                        pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlGioHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlGioHangLayout.createSequentialGroup()
                                                .addComponent(jCheckBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56)
                                                .addComponent(btnXoaGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 52, Short.MAX_VALUE))
                                        .addComponent(jScrollPaneGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                tblDSSP.setRowHeight(30);
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

                cboSize.setEditable(false);

                cboDanhMuc.setEditable(false);

                txtTimKiem.setBackground(new java.awt.Color(255, 255, 255));
                txtTimKiem.setLabelText("Tìm kiếm");

                cboXuatXu.setEditable(false);

                cboNhaSanXuat.setEditable(false);

                javax.swing.GroupLayout pnlDSSPLayout = new javax.swing.GroupLayout(pnlDSSP);
                pnlDSSP.setLayout(pnlDSSPLayout);
                pnlDSSPLayout.setHorizontalGroup(
                        pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSSPLayout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(cboNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(jScrollPaneDSSP)
                );
                pnlDSSPLayout.setVerticalGroup(
                        pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSSPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(pnlDSSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlGioHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblMoTaSP4)
                                                        .addComponent(lblMoTaSP2)
                                                        .addComponent(lblMoTaSP3))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMoTaSP)
                                        .addComponent(pnlDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                if (evt.getClickCount() == 2) {
                        maSPCT = (String) tblDSSP.getValueAt(tblDSSP.getSelectedRow(), 1);
                        nhapSoLuongSP(maSPCT);
                }
        }//GEN-LAST:event_tblDSSPMouseClicked

        private void btnTaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHDActionPerformed
                if(tblHoaDon.getRowCount() == 10) {
                        DialogHelper.alert(this, "Số lượng hóa đơn đã quá giới hạn!");
                        return;
                }
                dao.taoHD(1, 1);
                DialogHelper.alert(this, "Tạo hóa đơn thành công!");
                fillTableHoaDon();
                index = 0;
                maHD = (String) tblHoaDon.getValueAt(index, 1);
        }//GEN-LAST:event_btnTaoHDActionPerformed

        private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
                index = tblHoaDon.getSelectedRow();
                maHD = (String) tblHoaDon.getValueAt(index, 1);
                fillTableGioHang(maHD);
                fillFormHD();
        }//GEN-LAST:event_tblHoaDonMouseClicked

        private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
                if (index == -1) {
                        index = 0;
                }
                thanhToan();
        }//GEN-LAST:event_btnThanhToanActionPerformed

        private void btnQuetMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetMaActionPerformed
                quetQR();
        }//GEN-LAST:event_btnQuetMaActionPerformed

        private void btnHuyHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyHDActionPerformed
                huyHD();
        }//GEN-LAST:event_btnHuyHDActionPerformed

        private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
                if(evt.getClickCount() == 2) {
                        int slGiam = 0;
                        try {
                                slGiam = Integer.parseInt(DialogHelper.prompt(this, "Vui lòng nhập số lượng muốn bỏ bớt?"));
                        } catch (NumberFormatException e) {
                                DialogHelper.alert(this, "Dữ liệu nhập vào sai định dạng!");
                        }
                        giamSLBan(slGiam);
                }
        }//GEN-LAST:event_tblGioHangMouseClicked

        private void txtTienMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienMatKeyReleased
                try {
                        tinhTienThua();
                } catch (Exception e) {
                        System.out.println("No problem");
                }
        }//GEN-LAST:event_txtTienMatKeyReleased

        private void cboHTTTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHTTTItemStateChanged
                phuongThucTT();
        }//GEN-LAST:event_cboHTTTItemStateChanged

        private void txtChuyenKhoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChuyenKhoanKeyReleased
                // TODO add your handling code here:
        }//GEN-LAST:event_txtChuyenKhoanKeyReleased


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnChonKH;
        private com.polyshoes.swing.Button btnHuyHD;
        private com.polyshoes.swing.Button btnQuetMa;
        private com.polyshoes.swing.Button btnTaoHD;
        private com.polyshoes.swing.Button btnThanhToan;
        private com.polyshoes.swing.Button btnXoaGioHang;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboDanhMuc;
        private javax.swing.JComboBox<String> cboHTTT;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboHinhThucHD;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboNhaSanXuat;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboSize;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboXuatXu;
        private com.polyshoes.swing.JCheckBoxCustom jCheckBoxCustom1;
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
        private javax.swing.JTextField txtChuyenKhoan;
        private com.polyshoes.swing.TextField txtMaKH;
        private com.polyshoes.swing.TextField txtTenKH;
        private javax.swing.JTextField txtTienMat;
        private com.polyshoes.swing.TextField txtTimKiem;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblHoaDon.fixTable(jScrollPaneHoaDon);
                tblGioHang.fixTable(jScrollPaneGioHang);
                tblDSSP.fixTable(jScrollPaneDSSP);
                this.fillToTableSP();
                fillTableHoaDon();
        }

        private void fillToTableSP() {
                SanPhamCTDAO spctDao = new SanPhamCTDAO();
                DefaultTableModel tblModel = (DefaultTableModel) tblDSSP.getModel();
                tblModel.setRowCount(0);
                List<SanPhamChiTiet> list = spctDao.selectAll(0, 20);
                NumberFormat formatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                for (SanPhamChiTiet x : list) {
                        Object[] rowData = new Object[]{
                                x.getStt(), x.getMa(), x.getTen(), x.getMauSac(), x.getSize(), x.getThuongHieu(), x.getSoLuongTon(), formatVN.format(x.getGia())
                        };
                        tblModel.addRow(rowData);
                }
        }

        private void fillTableHoaDon() {
                DefaultTableModel tblModel = (DefaultTableModel) tblHoaDon.getModel();
                tblModel.setRowCount(0);
                List<HoaDon> listHD = hdDao.getHD_ByMa("%", 1);
                int stt = 0;
                for (HoaDon x : listHD) {
                        stt++;
                        Object[] rowData = new Object[]{
                                stt, x.getMaHD(), x.getNgayTao(), x.getMaNV(), x.getTongSP(), x.getTrangThai() == 1 ? "Chờ thanh toán" : "Đã thanh toán"
                        };
                        tblModel.addRow(rowData);
                };
        }

        private void fillTableGioHang(String maHD) {
                DefaultTableModel tblModel = (DefaultTableModel) tblGioHang.getModel();
                tblModel.setRowCount(0);
                HoaDonChiTietDao hdctDao = new HoaDonChiTietDao();
                List<HoaDonChiTiet> listHD = hdctDao.selectHDBanHang(maHD);
                int stt = 0;
                NumberFormat formatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                for (HoaDonChiTiet x : listHD) {
                        stt++;
                        Object[] rowData = new Object[]{
                                stt, x.getMaSPCT(), x.getTenSp(), formatVN.format(x.getDonGia()), x.getSoLuong(), formatVN.format(x.getTongTien())
                        };
                        tblModel.addRow(rowData);
                }
        }

        private void fillFormHD() {
                maHD = (String) tblHoaDon.getValueAt(index, 1);
                HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                if (model != null) {
                        lblMaHD.setText(model.getMaHD());
                        lblNgayTao.setText(model.getNgayTaoString());
                        lblNgayThanhToan.setText(model.getNgayTTAsString());
                        lblMaNV.setText(model.getMaNV());
                        lblTenKH.setText(txtTenKH.getText());
                        lblGiamGiaKM.setText(String.valueOf(model.getSoTienGiam()));
                        NumberFormat currencyFormatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                        String tongTienFormat = currencyFormatVN.format(model.getTongTien());
                        String tongToFormat = currencyFormatVN.format(model.getTongTien());
                        lblTongTien.setText(tongTienFormat);
                        lblTongTien.setForeground(Color.red);
                        lblTongTo.setText(tongToFormat);
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
                lblTongTo.setText("0 đ");
                txtTienMat.setText("");
                lblTienThua.setText("");
        }

        private void createHD(String maSPCT, int slBan, int idHD) {
                dao.banHang(maSPCT, slBan, idHD);
                fillTableGioHang(maHD);
                fillToTableSP();
                fillFormHD();
        }

        private void thanhToan() {
                if (!txtTienMat.getText().isEmpty()) {
                        maHD = (String) tblHoaDon.getValueAt(index, 1);
                        HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                        double tienTra = Double.parseDouble(txtTienMat.getText());
                        double tienTong = model.getTongTien();
                        if (tienTra < tienTong) {
                                DialogHelper.alert(this, "Chưa đủ điều kiện thanh toán!");
                        } else {
                                lblTienThua.setText(String.valueOf(tienTong - tienTra));
                                try {
                                        hdDao.thanhToan(maHD);
                                        fillTableHoaDon();
                                        fillTableGioHang("");
                                        DialogHelper.alert(this, "Thanh toán thành công!");
                                        clearFormHD();
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thanh toán thất bại!");
                                }
                        }
                } else {
                        DialogHelper.alert(this, "Vui lòng nhập số tiền thanh toán!");
                }
        }

        private void nhapSoLuongSP(String maSPChiTiet) {
                if (index < 0) {
                        DialogHelper.alert(this, "Vui lòng chọn hóa đơn trước khi thêm vào giỏ hàng!");
                } else {
                        maHD = (String) tblHoaDon.getValueAt(index, 1);
                        SanPhamCTDAO spctDao = new SanPhamCTDAO();
                        int maxSL = spctDao.getByMa(maSPChiTiet).getSoLuongTon();
                        try {
                                int soLuongMua = Integer.parseInt(DialogHelper.prompt(this, "Nhập số lượng muốn mua:"));
                                if (soLuongMua <= 0 || soLuongMua > maxSL) {
                                        DialogHelper.alert(this, "Số lượng mua không hợp lệ");
                                        return;
                                }
                                this.createHD(maSPChiTiet, soLuongMua, hdDao.getHD_ByMa(maHD, trangThai).get(0).getID());
                                fillTableHoaDon();
                        } catch (NumberFormatException e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Vui lòng nhập đúng định dạng!");
                        }
                }
        }

        private void giamSLBan(int slGiam) {
                SanPhamCTDAO spctDao = new SanPhamCTDAO();
                maSPCT = (String) tblGioHang.getValueAt(tblGioHang.getSelectedRow(), 1);
                int idSPCT = spctDao.getID_ByMa(maSPCT).getId();
                try {
                        dao.giamSL(slGiam, idSPCT, maSPCT);
                } catch (Exception e) {
                        e.printStackTrace();
                        DialogHelper.alert(this, "Bug rồi");
                }
                fillFormHD();
                fillTableGioHang(maHD);
                fillTableHoaDon();
                fillToTableSP();
        }

        private void huyHD() {
                index = tblHoaDon.getSelectedRow();
                if(index < 0) {
                        DialogHelper.alert(this, "Vui lòng chọn hóa đơn cần hủy!");
                        return;
                }
                maHD = (String) tblHoaDon.getValueAt(index, 1);
                if(DialogHelper.confirm(this, "Bạn có chắc muốn hủy hóa đơn này không?")) {
                        dao.huyHD(maHD);
                        DialogHelper.alert(this, "Hủy thành công!");
                        fillTableHoaDon();
                        fillTableGioHang("");
                }
        }

        private void quetQR() {
                QR_Code qrCode = new QR_Code();
                qrCode.trangHienThi = 1;
                qrCode.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                qrCode.setVisible(true);
                qrCode.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                                SanPhamCTDAO spctDao = new SanPhamCTDAO();
                                int maxSL = spctDao.getByMa(maSPCT).getSoLuongTon();
                                try {
                                        int soLuongMua = Integer.parseInt(DialogHelper.prompt(new BanHangJPanel2(), "Nhập số lượng muốn mua:"));
                                        if (soLuongMua <= 0 || soLuongMua > maxSL) {
                                                DialogHelper.alert(new BanHangJPanel2(), "Số lượng mua không hợp lệ");
                                                return;
                                        }
                                        createHD(maSPCT, soLuongMua, hdDao.getHD_ByMa(maHD, trangThai).get(0).getID());
                                        fillTableHoaDon();
                                        fillFormHD();
                                } catch (NumberFormatException ex) {
                                        ex.printStackTrace();
                                        DialogHelper.alert(new BanHangJPanel2(), "Vui lòng nhập đúng định dạng!");
                                }
                        }
                });
        }

        private void tinhTienThua() {
                HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                double tienTra = Double.parseDouble(txtTienMat.getText());
                double tienTong = model.getTongTien();
                NumberFormat tienFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                lblTienThua.setText(tienFormat.format(tienTra - tienTong));
        }

        private void phuongThucTT() {
                HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                double tienTra = 0;
                double tienTong = 0;
                try {
                        tienTra = Double.parseDouble(txtTienMat.getText());
                        tienTong  = model.getTongTien();
                } catch (NumberFormatException e) {
                        System.out.println("No problem");
                }
                NumberFormat tienFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                if(cboHTTT.getSelectedIndex() == 0) {
                        lblTienThua.setText(tienFormat.format(tienTra - tienTong));
                        txtChuyenKhoan.setEnabled(false);
                } else if(cboHTTT.getSelectedIndex() == 1) {
                        lblTienThua.setText(tienFormat.format(tienTra - tienTong));
                        txtTienMat.setEnabled(false);
                } else {
                        lblTienThua.setText(tienFormat.format(tienTra - tienTong));
                        txtChuyenKhoan.setText(tienFormat.format(tienTra - tienTong));
                        txtChuyenKhoan.setEnabled(false);
                }
        }
}
