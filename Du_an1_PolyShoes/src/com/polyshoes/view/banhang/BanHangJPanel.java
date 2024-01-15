package com.polyshoes.view.banhang;

import com.polyshoes.dao.HoaDon.HoaDonChiTietDao;
import com.polyshoes.dao.HoaDon.HoaDonDao;
import com.polyshoes.dao.banhang.BanHangDAO;
import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.dao.voucher.VoucherDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import com.polyshoes.model.khachhang.KhachHang;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.polyshoes.model.sanpham.ThuocTinh;
import com.polyshoes.model.voucher.Voucher;
import com.polyshoes.view.khachhang.ChonKhachHangJFrame;
import com.qrcode.QR_Code;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class BanHangJPanel extends javax.swing.JPanel {

        BanHangDAO dao = new BanHangDAO();
        SanPhamCTDAO spctDao = new SanPhamCTDAO();
        HoaDonDao hdDao = new HoaDonDao();
        double tienMat = 0;
        double tongTien = 0;
        double tienPhaiTra = 0;
        double tienThua = -1;
        private String findNsx = "%";
        private String findXuatXu = "%";
        private String findDanhMuc = "%";
        private boolean findGia = false; //  true: cao -> thấp, false: thấp -> cao
        public static String maSPCT;
        int index = -1;
        int trangThai = 1; // 1: chờ thanh toán - 0: đã thanh toán
        int limit = 20;
        String maHD = "";

        public BanHangJPanel() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lblTitle = new javax.swing.JLabel();
                pnlDonHang = new com.polyshoes.component.BorderJPanel();
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
                lblMoTaSP15 = new javax.swing.JLabel();
                lblMaHD = new javax.swing.JLabel();
                lblNgayTao = new javax.swing.JLabel();
                lblNgayThanhToan = new javax.swing.JLabel();
                lblMaNV = new javax.swing.JLabel();
                lblTenKH = new javax.swing.JLabel();
                lblTongTien = new javax.swing.JLabel();
                lblTongTo = new javax.swing.JLabel();
                lblTitle1 = new javax.swing.JLabel();
                btnThanhToan = new com.polyshoes.swing.Button();
                lblMoTaSP14 = new javax.swing.JLabel();
                lblMoTaSP16 = new javax.swing.JLabel();
                lblMoTaSP17 = new javax.swing.JLabel();
                lblTienThua = new javax.swing.JLabel();
                cboHTTT = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                txtTienMat = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                txtChuyenKhoan = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                btnHuyHD = new com.polyshoes.swing.Button();
                lblMoTaSP18 = new javax.swing.JLabel();
                cboPhieuGiamGia = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblMoTaSP = new javax.swing.JLabel();
                pnlHoaDon = new javax.swing.JPanel();
                jScrollPaneHoaDon = new javax.swing.JScrollPane();
                tblHoaDon = new com.polyshoes.swing.table.Table();
                btnQuetMa = new com.polyshoes.swing.Button();
                btnTaoHD = new com.polyshoes.swing.Button();
                btnLamMoi = new com.polyshoes.swing.Button();
                lblMoTaSP2 = new javax.swing.JLabel();
                pnlGioHang = new javax.swing.JPanel();
                jScrollPaneGioHang = new javax.swing.JScrollPane();
                tblGioHang = new com.polyshoes.swing.table.Table();
                lblMoTaSP3 = new javax.swing.JLabel();
                lblMoTaSP4 = new javax.swing.JLabel();
                pnlDSSP = new javax.swing.JPanel();
                jScrollPaneDSSP = new javax.swing.JScrollPane();
                tblDSSP = new com.polyshoes.swing.table.Table();
                cboFindGia = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboFindNsx = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                txtTimKiem = new com.polyshoes.swing.TextField();
                cboFindXuatXu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboFindDanhMuc = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblMoTaSP13 = new javax.swing.JLabel();
                lblMoTaSP19 = new javax.swing.JLabel();
                lblMoTaSP20 = new javax.swing.JLabel();
                lblMoTaSP21 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));

                lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblTitle.setText("BÁN HÀNG ");

                pnlDonHang.setBackground(new java.awt.Color(255, 255, 255));
                pnlDonHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                tab1.setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                txtMaKH.setBackground(new java.awt.Color(255, 255, 255));
                txtMaKH.setText("KHDF-001");
                txtMaKH.setLabelText("Mã KH");

                txtTenKH.setBackground(new java.awt.Color(255, 255, 255));
                txtTenKH.setText("Khách bán lẻ");
                txtTenKH.setLabelText("Tên KH");

                btnChonKH.setBackground(new java.awt.Color(204, 255, 255));
                btnChonKH.setForeground(new java.awt.Color(0, 0, 255));
                btnChonKH.setText("Chọn");
                btnChonKH.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnChonKH.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnChonKHActionPerformed(evt);
                        }
                });

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
                lblMoTaSP5.setForeground(new java.awt.Color(0, 51, 255));
                lblMoTaSP5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP5.setText("Thông tin khách hàng");
                lblMoTaSP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP6.setForeground(new java.awt.Color(0, 0, 255));
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

                lblTienThua.setText("   0");
                lblTienThua.setAlignmentX(1.0F);

                cboHTTT.setEditable(false);
                cboHTTT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiền mặt", "Chuyển khoản", "Cả 2" }));
                cboHTTT.setSelectedIndex(-1);
                cboHTTT.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cboHTTTActionPerformed(evt);
                        }
                });

                txtTienMat.setText("0");
                txtTienMat.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtTienMatKeyReleased(evt);
                        }
                });

                txtChuyenKhoan.setText("0");
                txtChuyenKhoan.setEnabled(false);

                btnHuyHD.setBackground(new java.awt.Color(204, 255, 255));
                btnHuyHD.setForeground(new java.awt.Color(0, 0, 255));
                btnHuyHD.setText("Hủy HD");
                btnHuyHD.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnHuyHD.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnHuyHDActionPerformed(evt);
                        }
                });

                lblMoTaSP18.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP18.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP18.setText("Phiếu giảm giá");
                lblMoTaSP18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                cboPhieuGiamGia.setEditable(false);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblTitle1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblTongTo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 29, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnHuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lblMoTaSP9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lblMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                                        .addComponent(lblNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblNgayThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cboPhieuGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(lblMoTaSP15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblMoTaSP14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                                                .addGap(23, 23, 23)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtChuyenKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(txtTienMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cboHTTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblTienThua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboPhieuGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboHTTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP14)
                                        .addComponent(txtTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMoTaSP16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMoTaSP17)
                                        .addComponent(lblTienThua))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTitle1)
                                        .addComponent(lblTongTo))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnHuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout pnlDonHangLayout = new javax.swing.GroupLayout(pnlDonHang);
                pnlDonHang.setLayout(pnlDonHangLayout);
                pnlDonHangLayout.setHorizontalGroup(
                        pnlDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlDonHangLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                pnlDonHangLayout.setVerticalGroup(
                        pnlDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlDonHangLayout.createSequentialGroup()
                                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                lblMoTaSP.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblMoTaSP.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP.setText("Đơn hàng");
                lblMoTaSP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                pnlHoaDon.setBackground(new java.awt.Color(255, 255, 255));
                pnlHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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

                btnLamMoi.setBackground(new java.awt.Color(204, 255, 255));
                btnLamMoi.setForeground(new java.awt.Color(51, 51, 255));
                btnLamMoi.setText("Làm mới");
                btnLamMoi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLamMoiActionPerformed(evt);
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
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(jScrollPaneHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                );
                pnlHoaDonLayout.setVerticalGroup(
                        pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnQuetMa, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(btnLamMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                "#", "Mã SPCT", "Tên SP", "Màu sắc", "Cổ giày", "Size", "Giá bán", "Số lượng", "Thành tiền"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false, false
                        };

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
                        tblGioHang.getColumnModel().getColumn(0).setPreferredWidth(5);
                }

                javax.swing.GroupLayout pnlGioHangLayout = new javax.swing.GroupLayout(pnlGioHang);
                pnlGioHang.setLayout(pnlGioHangLayout);
                pnlGioHangLayout.setHorizontalGroup(
                        pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPaneGioHang)
                );
                pnlGioHangLayout.setVerticalGroup(
                        pnlGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlGioHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
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
                                "#", "Mã SPCT", "Tên SP", "Danh mục", "Xuất xứ", "NSX", "Size", "SL tồn", "Đơn giá"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false, false
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

                cboFindGia.setEditable(false);
                cboFindGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thấp đến cao", "Cao đến thấp" }));
                cboFindGia.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindGiaItemStateChanged(evt);
                        }
                });

                cboFindNsx.setEditable(false);
                cboFindNsx.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindNsxItemStateChanged(evt);
                        }
                });

                txtTimKiem.setBackground(new java.awt.Color(255, 255, 255));
                txtTimKiem.setLabelText("Tìm kiếm");
                txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtTimKiemKeyReleased(evt);
                        }
                });

                cboFindXuatXu.setEditable(false);
                cboFindXuatXu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindXuatXuItemStateChanged(evt);
                        }
                });

                cboFindDanhMuc.setEditable(false);
                cboFindDanhMuc.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindDanhMucItemStateChanged(evt);
                        }
                });

                lblMoTaSP13.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
                lblMoTaSP13.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP13.setText("Danh mục");
                lblMoTaSP13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP19.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
                lblMoTaSP19.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP19.setText("Xuất xứ");
                lblMoTaSP19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP19.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP20.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
                lblMoTaSP20.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP20.setText("Nhà sản xuất");
                lblMoTaSP20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                lblMoTaSP21.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
                lblMoTaSP21.setForeground(new java.awt.Color(76, 76, 76));
                lblMoTaSP21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblMoTaSP21.setText("Giá");
                lblMoTaSP21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblMoTaSP21.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                javax.swing.GroupLayout pnlDSSPLayout = new javax.swing.GroupLayout(pnlDSSP);
                pnlDSSP.setLayout(pnlDSSPLayout);
                pnlDSSPLayout.setHorizontalGroup(
                        pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPaneDSSP)
                        .addGroup(pnlDSSPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSSPLayout.createSequentialGroup()
                                                .addComponent(lblMoTaSP13)
                                                .addGap(81, 81, 81)
                                                .addComponent(lblMoTaSP19)
                                                .addGap(95, 95, 95)
                                                .addComponent(lblMoTaSP20)
                                                .addGap(67, 67, 67)
                                                .addComponent(lblMoTaSP21)
                                                .addGap(117, 117, 117))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSSPLayout.createSequentialGroup()
                                                .addComponent(cboFindDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboFindXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboFindNsx, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboFindGia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                );
                pnlDSSPLayout.setVerticalGroup(
                        pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSSPLayout.createSequentialGroup()
                                .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnlDSSPLayout.createSequentialGroup()
                                                .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblMoTaSP13)
                                                        .addComponent(lblMoTaSP19)
                                                        .addComponent(lblMoTaSP20)
                                                        .addComponent(lblMoTaSP21))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlDSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cboFindGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboFindNsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboFindXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboFindDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneDSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
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
                taoHoaDon();
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
                if (DialogHelper.confirm(this, "Bạn có chắc muốn thanh toán không?")) {
                        thanhToan();
                }
        }//GEN-LAST:event_btnThanhToanActionPerformed

        private void btnQuetMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetMaActionPerformed
                if (index == -1) {
                        DialogHelper.alert(this, "Vui lòng chọn hóa đơn trước khi thêm sản phẩm vào giỏ hàng!");
                        return;
                }
                quetQR();
        }//GEN-LAST:event_btnQuetMaActionPerformed

        private void btnHuyHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyHDActionPerformed
                huyHD();
        }//GEN-LAST:event_btnHuyHDActionPerformed

        private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
                if (evt.getClickCount() == 2) {
                        int slGiam = 0;
                        int soLuongTrongGio = (int) tblGioHang.getValueAt(tblGioHang.getSelectedRow(), 7);
                        try {
                                slGiam = Integer.parseInt(DialogHelper.prompt(this, "Vui lòng nhập số lượng muốn bỏ bớt?"));
                                if (slGiam <= 0) {
                                        DialogHelper.alert(this, "Số lượng không được <= 0");
                                        return;
                                } else if (slGiam > soLuongTrongGio) {
                                        DialogHelper.alert(this, "Vượt quá số lượng trong giỏ hàng");
                                        return;
                                } else if (slGiam == soLuongTrongGio) {
                                        xoaKhoiGio(slGiam);
                                        return;
                                }
                        } catch (NumberFormatException e) {
                                DialogHelper.alert(this, "Dữ liệu nhập vào sai định dạng!");
                                return;
                        }
                        giamSLBan(slGiam);
                }
        }//GEN-LAST:event_tblGioHangMouseClicked

        private void txtTienMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienMatKeyReleased
                try {
                        tinhTienThua();
                } catch (Exception e) {
                        e.printStackTrace(System.out);
                        DialogHelper.alert(this, "Đã xảy ra lỗi trong quá trình thanh toán!");
                }
        }//GEN-LAST:event_txtTienMatKeyReleased

        private void cboHTTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHTTTActionPerformed
                phuongThucTT();
        }//GEN-LAST:event_cboHTTTActionPerformed

        private void btnChonKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonKHActionPerformed
                ChonKhachHangJFrame chon = new ChonKhachHangJFrame();
                chon.setDefaultCloseOperation(chon.DISPOSE_ON_CLOSE);
                chon.setVisible(true);
                chon.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                                KhachHang kh = chon.chon();
                                this.setTextField(kh);
                        }

                        private void setTextField(KhachHang kh) {
                                if (kh != null) {
                                        txtMaKH.setText(kh.getMaKH());
                                        txtTenKH.setText(kh.getHoTen());
                                } else {
                                        txtMaKH.setText("KHDF-001");
                                        txtTenKH.setText("Khách bán lẻ");
                                }
                        }
                });
        }//GEN-LAST:event_btnChonKHActionPerformed

        private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
                timSPTheoTen();
        }//GEN-LAST:event_txtTimKiemKeyReleased

        private void cboFindDanhMucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindDanhMucItemStateChanged
                if (cboFindDanhMuc.getSelectedIndex() >= 0) {
                        findDanhMuc = cboFindDanhMuc.getSelectedItem().toString();
                        locSPCT();
                } else {
                        findDanhMuc = "%";
                        fillToTableSPCT();
                }
        }//GEN-LAST:event_cboFindDanhMucItemStateChanged

        private void cboFindXuatXuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindXuatXuItemStateChanged
                if (cboFindXuatXu.getSelectedIndex() >= 0) {
                        findXuatXu = cboFindXuatXu.getSelectedItem().toString();
                        locSPCT();
                } else {
                        findXuatXu = "%";
                        fillToTableSPCT();
                }
        }//GEN-LAST:event_cboFindXuatXuItemStateChanged

        private void cboFindNsxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindNsxItemStateChanged
                if (cboFindNsx.getSelectedIndex() >= 0) {
                        findNsx = cboFindNsx.getSelectedItem().toString();
                        locSPCT();
                } else {
                        findNsx = "%";
                        fillToTableSPCT();
                }
        }//GEN-LAST:event_cboFindNsxItemStateChanged

        private void cboFindGiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindGiaItemStateChanged
                if (cboFindGia.getSelectedIndex() >= 0) {
                        findGia = cboFindGia.getSelectedIndex() == 1;
                        locSPCT();
                }
        }//GEN-LAST:event_cboFindGiaItemStateChanged

        private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
                cboFindDanhMuc.setSelectedIndex(-1);
                cboFindGia.setSelectedIndex(-1);
                cboFindNsx.setSelectedIndex(-1);
                cboFindXuatXu.setSelectedIndex(-1);
                fillToTableSPCT();
                clearFormHD();
        }//GEN-LAST:event_btnLamMoiActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnChonKH;
        private com.polyshoes.swing.Button btnHuyHD;
        private com.polyshoes.swing.Button btnLamMoi;
        private com.polyshoes.swing.Button btnQuetMa;
        private com.polyshoes.swing.Button btnTaoHD;
        private com.polyshoes.swing.Button btnThanhToan;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboFindDanhMuc;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboFindGia;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboFindNsx;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboFindXuatXu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboHTTT;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboPhieuGiamGia;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPaneDSSP;
        private javax.swing.JScrollPane jScrollPaneGioHang;
        private javax.swing.JScrollPane jScrollPaneHoaDon;
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
        private javax.swing.JLabel lblMoTaSP18;
        private javax.swing.JLabel lblMoTaSP19;
        private javax.swing.JLabel lblMoTaSP2;
        private javax.swing.JLabel lblMoTaSP20;
        private javax.swing.JLabel lblMoTaSP21;
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
        private com.polyshoes.swing.table.Table tblDSSP;
        private com.polyshoes.swing.table.Table tblGioHang;
        private com.polyshoes.swing.table.Table tblHoaDon;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtChuyenKhoan;
        private com.polyshoes.swing.TextField txtMaKH;
        private com.polyshoes.swing.TextField txtTenKH;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtTienMat;
        private com.polyshoes.swing.TextField txtTimKiem;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblHoaDon.fixTable(jScrollPaneHoaDon);
                tblGioHang.fixTable(jScrollPaneGioHang);
                tblDSSP.fixTable(jScrollPaneDSSP);
                fillComboBoxSPCT();
                fillComboGiamGia();
                fillToTableSPCT();
                fillTableHoaDon();
//                hdTuHuy();
                cboHTTT.setSelectedIndex(-1);
                cboPhieuGiamGia.setSelectedIndex(-1);
                cboPhieuGiamGia.addItemListener(new ItemListener() {
                        @Override
                        public void itemStateChanged(ItemEvent e) {
                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                        chonGiamGia();
                                }
                        }
                });
        }

        private void fillComboBox(JComboBox cbo, String tenBang) {
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cbo.getModel();
                ThuocTinhDAO ttDao = new ThuocTinhDAO();
                cboModel.removeAllElements();
                List<ThuocTinh> list = ttDao.select(tenBang);
                for (ThuocTinh x : list) {
                        cboModel.addElement(x);
                }
                if (cbo.getItemCount() > 0) {
                        cbo.setSelectedIndex(0);
                }
        }

        private void fillComboGiamGia() {
                VoucherDAO vcDao = new VoucherDAO();
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboPhieuGiamGia.getModel();
                cboModel.removeAllElements();
                List<Voucher> list = vcDao.selectByTrangThai(1);
                for (Voucher x : list) {
                        cboModel.addElement(x);
                }
        }

        private void fillComboBoxSPCT() {
                fillComboBox(cboFindDanhMuc, "Danh_Muc");
                fillComboBox(cboFindXuatXu, "Xuat_Xu");
                fillComboBox(cboFindNsx, "Nha_San_Xuat");
                cboFindDanhMuc.setSelectedIndex(-1);
                cboFindXuatXu.setSelectedIndex(-1);
                cboFindNsx.setSelectedIndex(-1);
                cboFindGia.setSelectedIndex(-1);
                AutoCompleteDecorator.decorate(cboFindDanhMuc);
                AutoCompleteDecorator.decorate(cboFindNsx);
                AutoCompleteDecorator.decorate(cboFindXuatXu);
        }

        private void fillToTableSPCT() {
                DefaultTableModel tblModel = (DefaultTableModel) tblDSSP.getModel();
                tblModel.setRowCount(0);
                List<SanPhamChiTiet> list = spctDao.selectAll(0, limit);
                NumberFormat formatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                if (list == null) {
                        return;
                }
                for (SanPhamChiTiet x : list) {
                        Object[] rowData = new Object[]{
                                x.getStt(), x.getMa(), x.getTen(), x.getDanhMuc(), x.getXuatXu(), x.getNSX(), x.getSize(), x.getSoLuongTon(), formatVN.format(x.getGia())
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
                                stt, x.getMaSPCT(), x.getTenSp(), x.getColor(), x.getCoGiay(), x.getSize(), formatVN.format(x.getDonGia()), x.getSoLuong(), formatVN.format(x.getTongTien())
                        };
                        tblModel.addRow(rowData);
                }
        }

        private void fillFormHD() {
                if(index == -1) {
                        maHD = (String) tblHoaDon.getValueAt(0, 1);
                } else {
                        maHD = (String) tblHoaDon.getValueAt(index, 1);
                }
                HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                tongTien = model.getTongTien();
                if (model != null) {
                        lblMaHD.setText(model.getMaHD());
                        lblNgayTao.setText(model.getNgayTaoString());
                        lblNgayThanhToan.setText(model.getNgayTTAsString());
                        lblMaNV.setText(model.getMaNV());
                        lblTenKH.setText(txtTenKH.getText());
                        NumberFormat currencyFormatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                        String tongTienFormat = currencyFormatVN.format(tongTien);
                        String tongToFormat = currencyFormatVN.format(tongTien);
                        lblTongTien.setText(tongTienFormat);
                        lblTongTien.setForeground(Color.red);
                        lblTongTo.setText(tongToFormat);
                        lblTienThua.setText("0");
                        clearCombobox();
                } else {
                        DialogHelper.alert(this, "Lỗi bán hàng!");
                }
        }

        private void clearFormHD() {
                lblMaHD.setText("__________________________");
                lblNgayTao.setText("__________________________");
                lblNgayThanhToan.setText("__________________________");
                lblMaNV.setText("__________________________");
                lblTenKH.setText("__________________________");
                lblTongTien.setText("__________________________");
                lblTongTo.setText("0 đ");
                txtTienMat.setText("0");
                txtChuyenKhoan.setText("0");
                lblTienThua.setText("0");
                index = -1;
                tienPhaiTra = 0;
                tongTien = 0;
                fillTableGioHang("");
                cboHTTT.setSelectedIndex(-1);
                cboPhieuGiamGia.setSelectedIndex(-1);
        }

        private void clearCombobox() {
                cboFindDanhMuc.setSelectedIndex(-1);
                cboFindGia.setSelectedIndex(-1);
                cboFindNsx.setSelectedIndex(-1);
                cboFindXuatXu.setSelectedIndex(-1);
        }

        private void createHD(String maSPCT, int slBan, int idHD) {
                dao.banHang(maSPCT, slBan, idHD);
                fillTableGioHang(maHD);
                fillToTableSPCT();
                fillFormHD();
        }

        private void thanhToan() {
                maHD = (String) tblHoaDon.getValueAt(index, 1);
                HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                tongTien = model.getTongTien();
                try {
                        tienMat = Double.parseDouble(txtTienMat.getText());
                } catch (NumberFormatException e) {
                        DialogHelper.alert(this, "Sai định dạng tiền!");
                        return;
                }
                if (cboHTTT.getSelectedIndex() == 2) {
                        txtChuyenKhoan.setText(String.valueOf(tongTien - tienMat));
                        tienThua = 0;
                }
                int tongSPHD = (int) tblHoaDon.getValueAt(index, 4);
                if (tongSPHD == 0) {
                        DialogHelper.alert(this, "Hóa đơn rỗng!");
                        return;
                }
                if (tienThua >= 0) {
                        VoucherDAO voucherDao = new VoucherDAO();
                        Voucher voucher = (Voucher) cboPhieuGiamGia.getSelectedItem();
                        int idVoucher = voucher.getId();
                        try {
                                dao.thanhToanHD(maHD);
                                fillTableHoaDon();
                                fillTableGioHang("");
                                DialogHelper.alert(this, "Thanh toán thành công!");
                                dao.updateTongTien(tienPhaiTra, maHD);
                                voucherDao.updateSoLuong(idVoucher);
                                tienThua = -1;
                                clearFormHD();
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Thanh toán thất bại!");
                        }
                } else {
                        DialogHelper.alert(this, "Chưa đủ điều kiện thanh toán!");
                }

        }

        private void nhapSoLuongSP(String maSPChiTiet) {
                if (index < 0) {
                        DialogHelper.alert(this, "Vui lòng chọn hóa đơn trước khi thêm vào giỏ hàng!");
                } else {
                        maHD = (String) tblHoaDon.getValueAt(index, 1);
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
                                DialogHelper.alert(this, "Vui lòng nhập đúng định dạng!");
                        }
                }
        }

        private void giamSLBan(int slGiam) {
                maSPCT = (String) tblGioHang.getValueAt(tblGioHang.getSelectedRow(), 1);
                int idSPCT = spctDao.getID_ByMa(maSPCT).getId();
                try {
                        dao.giamSL(slGiam, idSPCT, maSPCT, hdDao.getHD_ByMa(maHD, trangThai).get(0).getID());
                } catch (Exception e) {
                        e.printStackTrace();
                        DialogHelper.alert(this, "Bug rồi");
                }
                fillFormHD();
                fillTableGioHang(maHD);
                fillTableHoaDon();
                fillToTableSPCT();
        }

        private void huyHD() {
                index = tblHoaDon.getSelectedRow();
                if (index < 0) {
                        DialogHelper.alert(this, "Vui lòng chọn hóa đơn cần hủy!");
                        return;
                }
                maHD = (String) tblHoaDon.getValueAt(index, 1);
                if (DialogHelper.confirm(this, "Bạn có chắc muốn hủy hóa đơn này không?")) {
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
                                if (!maSPCT.equals("")) {
                                        int maxSL = spctDao.getByMa(maSPCT).getSoLuongTon();
                                        try {
                                                int soLuongMua = Integer.parseInt(DialogHelper.prompt(new BanHangJPanel(), "Nhập số lượng muốn mua:"));
                                                if (soLuongMua <= 0 || soLuongMua > maxSL) {
                                                        DialogHelper.alert(new BanHangJPanel(), "Số lượng mua không hợp lệ");
                                                        return;
                                                }
                                                createHD(maSPCT, soLuongMua, hdDao.getHD_ByMa(maHD, trangThai).get(0).getID());
                                                fillTableHoaDon();
                                                fillFormHD();
                                        } catch (NumberFormatException ex) {
                                                ex.printStackTrace();
                                                DialogHelper.alert(new BanHangJPanel(), "Vui lòng nhập đúng định dạng!");
                                        }
                                }
                        }
                });
        }

        private void tinhTienThua() {
                NumberFormat tienFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                HoaDon model = hdDao.getHD_ByMa(maHD, trangThai).get(0);
                tongTien = model.getTongTien();
                try {
                        tienMat = Double.parseDouble(txtTienMat.getText());
                } catch (NumberFormatException e) {
                        DialogHelper.alert(this, "Sai định dạng tiền!");
                }
                tienThua = tienMat - tienPhaiTra;
                if (cboHTTT.getSelectedIndex() == 0) {
                        lblTienThua.setText(tienFormat.format(tienThua));
                } else {
                        txtChuyenKhoan.setText(tienFormat.format(tienPhaiTra - tienMat));
                        lblTienThua.setText("0");
                }

        }

        private void phuongThucTT() {
                if (cboHTTT.getSelectedIndex() >= 0) {
                        if (maHD.equals("")) {
                                DialogHelper.alert(this, "Vui lòng chọn hóa đơn trước!");
                                return;
                        }
                        NumberFormat tienFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                        if (cboHTTT.getSelectedIndex() == 1) {
                                txtChuyenKhoan.setText(tienFormat.format(tienPhaiTra));
                                tienThua = 0;
                                lblTienThua.setText("0");
                                txtTienMat.setText("0");
                                txtTienMat.setEnabled(false);
                        } else {
                                txtTienMat.setText("0");
                                txtTienMat.setEnabled(true);
                                txtChuyenKhoan.setText("0");
                        }
                }
        }

        private void hdTuHuy() {
                Date now = new Date();

                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, 1);
                calendar.set(Calendar.HOUR_OF_DAY, 0);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);
                calendar.set(Calendar.MILLISECOND, 0);
                Date gioHomQua = calendar.getTime();
//
//                        int soSanhBD = now.compareTo();
//                        int soSanhKT = now.compareTo(x.getNgayKT());
//                        if (soSanhBD >= 0 && soSanhKT <= 0) {
//                                dao.updateTrangThai(1, x.getMa());
//                        } else if (soSanhBD < 0) {
//                                dao.updateTrangThai(0, x.getMa());
//                        } else {
//                                dao.updateTrangThai(2, x.getMa());
//                        }
                if (now.before(gioHomQua)) {
                        for (int row = 0; row < tblHoaDon.getRowCount(); row++) {
                                maHD = (String) tblHoaDon.getValueAt(row, 1);
                                dao.huyHD(maHD);
                                System.out.println("Đã hủy hóa đơn có mã: " + maHD);
                        }
                } else {
                        System.out.println("Chưa đến thời gian hủy hóa đơn!");
                }
                fillTableHoaDon();
        }

        private void timSPTheoTen() {
                DefaultTableModel tblModel = (DefaultTableModel) tblDSSP.getModel();
                tblModel.setRowCount(0);
                List<SanPhamChiTiet> list = spctDao.timTheoTen("%" + txtTimKiem.getText() + "%");
                NumberFormat formatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                if (list == null) {
                        return;
                }
                for (SanPhamChiTiet x : list) {
                        Object[] rowData = new Object[]{
                                x.getStt(), x.getMa(), x.getTen(), x.getMauSac(), x.getSize(), x.getThuongHieu(), x.getSoLuongTon(), formatVN.format(x.getGia())
                        };
                        tblModel.addRow(rowData);
                }
        }

        private void xoaKhoiGio(int slGiam) {
                maSPCT = (String) tblGioHang.getValueAt(tblGioHang.getSelectedRow(), 1);
                int idSPCT = spctDao.getID_ByMa(maSPCT).getId();
                dao.xoaSPCTKhoiGio(slGiam, idSPCT, maSPCT, hdDao.getHD_ByMa(maHD, trangThai).get(0).getID());
                fillTableGioHang(maHD);
                fillToTableSPCT();
                fillTableHoaDon();
                fillFormHD();
        }

        private void taoHoaDon() {
                if (tblHoaDon.getRowCount() == 10) {
                        DialogHelper.alert(this, "Số lượng hóa đơn đã quá giới hạn!");
                        return;
                }
                dao.taoHD(1, 1);
                DialogHelper.alert(this, "Tạo hóa đơn thành công!");
                fillTableHoaDon();
                maHD = (String) tblHoaDon.getValueAt(0, 1);
                fillFormHD();
                index = 0;
                maHD = (String) tblHoaDon.getValueAt(index, 1);
        }

        private void locSPCT() {
                List<SanPhamChiTiet> list = spctDao.locSPCT("%", findDanhMuc, findXuatXu, findNsx, findGia);
                DefaultTableModel tblModel = (DefaultTableModel) tblDSSP.getModel();
                tblModel.setRowCount(0);
                DecimalFormat df = new DecimalFormat("#,##0 VND");
                int stt = 0;
                for (SanPhamChiTiet x : list) {
                        stt++;
                        Object[] rowData = new Object[]{
                                stt, x.getMa(), x.getTen(), x.getDanhMuc(), x.getXuatXu(), x.getNsx(), x.getSize(), x.getSoLuongTon(), df.format(x.getGia())
                        };
                        tblModel.addRow(rowData);
                }
        }

        private void chonGiamGia() {
                if (cboPhieuGiamGia.getSelectedIndex() >= 0) {
                        NumberFormat tienFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                        Voucher model = (Voucher) cboPhieuGiamGia.getSelectedItem();
                        int phanTramGiam = model.getPhanTramGiam();
                        double tienGiamMax = model.getGiamToiDa();
                        double soTienGiam = tongTien / 100 * phanTramGiam;
                        tienPhaiTra = tongTien;
                        if (tongTien < model.getGiaTriMin()) {
                                DialogHelper.alert(this, "Hóa đơn phải từ " + model.getGiaTriMin() + "đ mới có thể áp dụng!");
                                cboPhieuGiamGia.setSelectedIndex(-1);
                        } else if (soTienGiam > tienGiamMax) {
                                if (DialogHelper.confirm(this, "Hóa đơn này chỉ được giảm tối đa " + tienFormat.format(model.getGiamToiDa()) + "\nGiảm ngay?")) {
                                        soTienGiam = model.getGiamToiDa();
                                        tienPhaiTra = tongTien - soTienGiam;
                                }
                        } else {
                                tienPhaiTra = tongTien - soTienGiam;
                        }
                        lblTongTo.setText(tienFormat.format(tienPhaiTra));
                }
        }
}
