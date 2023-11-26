package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.polyshoes.model.sanpham.ThuocTinh;
import com.qrcode.QR_Code;
import com.qrcode.TaiMaQR;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class SanPhamChiTietJPanel extends javax.swing.JPanel {

        SanPhamCTDAO dao = new SanPhamCTDAO();
        ThuocTinhDAO thuocTinhDao = new ThuocTinhDAO();
        int index = -1;
        int pageIndex = 1;
        int pageSize = 1;
        int limit = 5;
        public static String maSP = "%";

        public SanPhamChiTietJPanel() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                grpTrangThai = new javax.swing.ButtonGroup();
                pnlDanhSachSPCT = new javax.swing.JPanel();
                lblTieuDe = new javax.swing.JLabel();
                lblBoLoc = new javax.swing.JLabel();
                lblTrangThai = new javax.swing.JLabel();
                pnlBoLoc = new com.polyshoes.component.BorderJPanel();
                cboFindNSX = new com.polyshoes.component.Combobox();
                cboFindXuatXu = new com.polyshoes.component.Combobox();
                cboFindDanhMuc = new com.polyshoes.component.Combobox();
                cboFindGia = new com.polyshoes.component.Combobox();
                rdoTatCa = new com.polyshoes.swing.RadioButtonCustom();
                rdoDangBan = new com.polyshoes.swing.RadioButtonCustom();
                rdoNgungBan = new com.polyshoes.swing.RadioButtonCustom();
                btnOpenThem = new javax.swing.JButton();
                btnTaiMaQR = new javax.swing.JButton();
                btnMoi = new javax.swing.JButton();
                jScrollPaneSpct = new javax.swing.JScrollPane();
                tblSPCT = new com.polyshoes.swing.table.Table();
                pnlButton = new javax.swing.JPanel();
                btnFirstSpct = new com.polyshoes.swing.Button();
                btnPreviousSpct = new com.polyshoes.swing.Button();
                lblIndexSpct = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                lblSizeSpct = new javax.swing.JLabel();
                btnNextSpct = new com.polyshoes.swing.Button();
                btnEndSpct = new com.polyshoes.swing.Button();
                btnOpenQRCode = new javax.swing.JButton();
                pnlThemSPCT = new javax.swing.JPanel();
                lblTieuDe1 = new javax.swing.JLabel();
                pnlCboTong = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                cboTenSP = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe13 = new javax.swing.JLabel();
                btnTenSP = new com.polyshoes.swing.Button();
                jPanel3 = new javax.swing.JPanel();
                cboDanhMuc = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe15 = new javax.swing.JLabel();
                btnDanhMuc = new com.polyshoes.swing.Button();
                jPanel4 = new javax.swing.JPanel();
                cboThuongHieu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe17 = new javax.swing.JLabel();
                btnThuongHieu = new com.polyshoes.swing.Button();
                jPanel1 = new javax.swing.JPanel();
                cboXuatXu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblXuatXu = new javax.swing.JLabel();
                btnXuatXu = new com.polyshoes.swing.Button();
                jPanel9 = new javax.swing.JPanel();
                cboNhaSanXuat = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe25 = new javax.swing.JLabel();
                btnNhaSanXuat = new com.polyshoes.swing.Button();
                jPanel10 = new javax.swing.JPanel();
                cboChatLieu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe26 = new javax.swing.JLabel();
                btnChatLieu = new com.polyshoes.swing.Button();
                jPanel5 = new javax.swing.JPanel();
                cboDeGiay = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe19 = new javax.swing.JLabel();
                btnDeGiay = new com.polyshoes.swing.Button();
                jPanel6 = new javax.swing.JPanel();
                cboCoGiay = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe20 = new javax.swing.JLabel();
                btnCoGiay = new com.polyshoes.swing.Button();
                jPanel8 = new javax.swing.JPanel();
                cboSize = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe24 = new javax.swing.JLabel();
                btnSize = new com.polyshoes.swing.Button();
                jPanel7 = new javax.swing.JPanel();
                cboMauSac = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe23 = new javax.swing.JLabel();
                btnMauSac = new com.polyshoes.swing.Button();
                jPanel12 = new javax.swing.JPanel();
                txtSoLuong = new com.polyshoes.swing.TextField();
                jPanel11 = new javax.swing.JPanel();
                txtGia = new com.polyshoes.swing.TextField();
                btnThem = new javax.swing.JButton();
                btnQuayLai = new javax.swing.JButton();

                setBackground(new java.awt.Color(255, 255, 255));
                setLayout(new java.awt.CardLayout());

                pnlDanhSachSPCT.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
                lblTieuDe.setForeground(new java.awt.Color(51, 51, 255));
                lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe.setText("Thông tin sản phẩm chi tiết");
                lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblBoLoc.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblBoLoc.setForeground(new java.awt.Color(76, 76, 76));
                lblBoLoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblBoLoc.setText("Bộ lọc");
                lblBoLoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTrangThai.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTrangThai.setForeground(new java.awt.Color(76, 76, 76));
                lblTrangThai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTrangThai.setText("Trạng thái");
                lblTrangThai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                pnlBoLoc.setBackground(new java.awt.Color(255, 255, 255));
                pnlBoLoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                cboFindNSX.setLabeText("Nhà sản xuất");

                cboFindXuatXu.setLabeText("Xuất xứ");

                cboFindDanhMuc.setLabeText("Danh mục");

                cboFindGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cao đến thấp", "Thấp đến cao" }));
                cboFindGia.setLabeText("Giá");

                javax.swing.GroupLayout pnlBoLocLayout = new javax.swing.GroupLayout(pnlBoLoc);
                pnlBoLoc.setLayout(pnlBoLocLayout);
                pnlBoLocLayout.setHorizontalGroup(
                        pnlBoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBoLocLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(cboFindNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboFindXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboFindDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboFindGia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                );
                pnlBoLocLayout.setVerticalGroup(
                        pnlBoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBoLocLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pnlBoLocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cboFindXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFindNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFindDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFindGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
                );

                grpTrangThai.add(rdoTatCa);
                rdoTatCa.setText("Tất cả");

                rdoDangBan.setBackground(new java.awt.Color(51, 255, 51));
                grpTrangThai.add(rdoDangBan);
                rdoDangBan.setSelected(true);
                rdoDangBan.setText("Đang bán");

                rdoNgungBan.setBackground(new java.awt.Color(255, 0, 0));
                grpTrangThai.add(rdoNgungBan);
                rdoNgungBan.setText("Ngừng bán");

                btnOpenThem.setText("Thêm mới");
                btnOpenThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOpenThemActionPerformed(evt);
                        }
                });

                btnTaiMaQR.setText("Tải mã QR");
                btnTaiMaQR.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTaiMaQRActionPerformed(evt);
                        }
                });

                btnMoi.setText("Làm mới");
                btnMoi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMoiActionPerformed(evt);
                        }
                });

                tblSPCT.setBackground(new java.awt.Color(255, 255, 255));
                tblSPCT.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "#", "Mã SPCT", "Danh mục", "Xuất xứ", "NSX", "Màu sắc", "Size", "Thương hiệu", "Chất liệu", "Đế giày", "Cổ giày", "Giá", "Số lượng", "Trạng thái", "Hành động"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblSPCT.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblSPCTMouseClicked(evt);
                        }
                });
                jScrollPaneSpct.setViewportView(tblSPCT);
                if (tblSPCT.getColumnModel().getColumnCount() > 0) {
                        tblSPCT.getColumnModel().getColumn(0).setPreferredWidth(20);
                        tblSPCT.getColumnModel().getColumn(11).setPreferredWidth(80);
                }

                pnlButton.setBackground(new java.awt.Color(255, 255, 255));

                btnFirstSpct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                btnFirstSpct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFirstSpctActionPerformed(evt);
                        }
                });
                pnlButton.add(btnFirstSpct);

                btnPreviousSpct.setForeground(new java.awt.Color(76, 76, 76));
                btnPreviousSpct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                btnPreviousSpct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPreviousSpctActionPerformed(evt);
                        }
                });
                pnlButton.add(btnPreviousSpct);

                lblIndexSpct.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblIndexSpct.setForeground(new java.awt.Color(255, 0, 0));
                lblIndexSpct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblIndexSpct.setText("1");
                pnlButton.add(lblIndexSpct);

                jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 0, 0));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("/");
                pnlButton.add(jLabel3);

                lblSizeSpct.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblSizeSpct.setForeground(new java.awt.Color(255, 0, 0));
                lblSizeSpct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblSizeSpct.setText("1");
                pnlButton.add(lblSizeSpct);

                btnNextSpct.setForeground(new java.awt.Color(76, 76, 76));
                btnNextSpct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                btnNextSpct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNextSpctActionPerformed(evt);
                        }
                });
                pnlButton.add(btnNextSpct);

                btnEndSpct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                btnEndSpct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEndSpctActionPerformed(evt);
                        }
                });
                pnlButton.add(btnEndSpct);

                btnOpenQRCode.setText("Quét QR");
                btnOpenQRCode.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOpenQRCodeActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout pnlDanhSachSPCTLayout = new javax.swing.GroupLayout(pnlDanhSachSPCT);
                pnlDanhSachSPCT.setLayout(pnlDanhSachSPCTLayout);
                pnlDanhSachSPCTLayout.setHorizontalGroup(
                        pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPaneSpct, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(pnlDanhSachSPCTLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlBoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblBoLoc)
                                        .addGroup(pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTrangThai)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdoTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdoDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdoNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(279, 279, 279)
                                                .addComponent(btnOpenThem)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnOpenQRCode)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnTaiMaQR)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMoi))
                                        .addGroup(pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addGap(379, 379, 379)
                                                .addComponent(lblTieuDe)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                pnlDanhSachSPCTLayout.setVerticalGroup(
                        pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDe)
                                .addGap(18, 18, 18)
                                .addComponent(lblBoLoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlBoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(lblTrangThai))
                                        .addGroup(pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(rdoTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(rdoDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(rdoNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnTaiMaQR)
                                                .addComponent(btnOpenQRCode)
                                                .addComponent(btnOpenThem))
                                        .addComponent(btnMoi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jScrollPaneSpct, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                add(pnlDanhSachSPCT, "card2");

                pnlThemSPCT.setBackground(new java.awt.Color(255, 255, 255));
                pnlThemSPCT.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                pnlThemSPCTComponentShown(evt);
                        }
                });

                lblTieuDe1.setBackground(new java.awt.Color(51, 51, 255));
                lblTieuDe1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
                lblTieuDe1.setForeground(new java.awt.Color(51, 51, 255));
                lblTieuDe1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe1.setText("Thêm sản phẩm chi tiết");
                lblTieuDe1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                pnlCboTong.setBackground(new java.awt.Color(255, 255, 255));
                pnlCboTong.setLayout(new java.awt.GridLayout(3, 3));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                cboTenSP.setEditable(false);

                lblTieuDe13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe13.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe13.setText("Tên sản phẩm");
                lblTieuDe13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnTenSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe13)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe13)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel2);

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));

                cboDanhMuc.setEditable(false);

                lblTieuDe15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe15.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe15.setText("Danh mục");
                lblTieuDe15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe15)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe15)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel3);

                jPanel4.setBackground(new java.awt.Color(255, 255, 255));

                cboThuongHieu.setEditable(false);

                lblTieuDe17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe17.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe17.setText("Thương hiệu");
                lblTieuDe17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnThuongHieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe17)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe17)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel4);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                cboXuatXu.setEditable(false);

                lblXuatXu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblXuatXu.setForeground(new java.awt.Color(76, 76, 76));
                lblXuatXu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblXuatXu.setText("Xuất xứ");
                lblXuatXu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnXuatXu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblXuatXu)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblXuatXu)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel1);

                jPanel9.setBackground(new java.awt.Color(255, 255, 255));

                cboNhaSanXuat.setEditable(false);

                lblTieuDe25.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe25.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe25.setText("Nhà sản xuất");
                lblTieuDe25.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnNhaSanXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe25)
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(cboNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel9Layout.setVerticalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe25)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel9);

                jPanel10.setBackground(new java.awt.Color(255, 255, 255));

                cboChatLieu.setEditable(false);

                lblTieuDe26.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe26.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe26.setText("Chất liệu");
                lblTieuDe26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnChatLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe26)
                                                .addGroup(jPanel10Layout.createSequentialGroup()
                                                        .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel10Layout.setVerticalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe26)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel10);

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));

                cboDeGiay.setEditable(false);

                lblTieuDe19.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe19.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe19.setText("Đế giày");
                lblTieuDe19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnDeGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe19)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe19)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel5);

                jPanel6.setBackground(new java.awt.Color(255, 255, 255));

                cboCoGiay.setEditable(false);

                lblTieuDe20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe20.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe20.setText("Cổ giày");
                lblTieuDe20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnCoGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe20)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addComponent(cboCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe20)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel6);

                jPanel8.setBackground(new java.awt.Color(255, 255, 255));

                cboSize.setEditable(false);

                lblTieuDe24.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe24.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe24.setText("Size");
                lblTieuDe24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe24)
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe24)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel8);

                jPanel7.setBackground(new java.awt.Color(255, 255, 255));

                cboMauSac.setEditable(false);

                lblTieuDe23.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe23.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe23.setText("Màu sắc");
                lblTieuDe23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnMauSac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 262, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe23)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE)))
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe23)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel7);

                jPanel12.setBackground(new java.awt.Color(255, 255, 255));

                txtSoLuong.setBackground(new java.awt.Color(255, 255, 255));
                txtSoLuong.setLabelText("Số lượng");

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel12Layout.setVerticalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                );

                pnlCboTong.add(jPanel12);

                jPanel11.setBackground(new java.awt.Color(255, 255, 255));

                txtGia.setBackground(new java.awt.Color(255, 255, 255));
                txtGia.setLabelText("Giá");

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                );

                pnlCboTong.add(jPanel11);

                btnThem.setText("Thêm");
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });

                btnQuayLai.setText("Quay lại");
                btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnQuayLaiActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout pnlThemSPCTLayout = new javax.swing.GroupLayout(pnlThemSPCT);
                pnlThemSPCT.setLayout(pnlThemSPCTLayout);
                pnlThemSPCTLayout.setHorizontalGroup(
                        pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                .addGroup(pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlCboTong, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                                .addGap(385, 385, 385)
                                                .addComponent(btnQuayLai)
                                                .addGap(117, 117, 117)
                                                .addComponent(btnThem)))
                                .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThemSPCTLayout.createSequentialGroup()
                                .addComponent(lblTieuDe1)
                                .addGap(380, 380, 380))
                );
                pnlThemSPCTLayout.setVerticalGroup(
                        pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblTieuDe1)
                                .addGap(18, 18, 18)
                                .addComponent(pnlCboTong, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnQuayLai)
                                        .addComponent(btnThem)))
                );

                add(pnlThemSPCT, "card2");
        }// </editor-fold>//GEN-END:initComponents

        private void btnOpenThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenThemActionPerformed
                this.openInsert();
        }//GEN-LAST:event_btnOpenThemActionPerformed

        private void btnTaiMaQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiMaQRActionPerformed
                this.taiMaQR();
        }//GEN-LAST:event_btnTaiMaQRActionPerformed

        private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
                this.clear();
        }//GEN-LAST:event_btnMoiActionPerformed

        private void tblSPCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPCTMouseClicked
                if (evt.getClickCount() == 2) {
                        index = tblSPCT.getSelectedRow();
                        if (index >= 0) {
                                index = tblSPCT.getSelectedRow();
                                SanPhamChiTietJFrame.maSPCT = (String) tblSPCT.getValueAt(index, 1);
                                new SanPhamChiTietJFrame().setVisible(true);
                        }
                }
        }//GEN-LAST:event_tblSPCTMouseClicked

        private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
                pnlDanhSachSPCT.setVisible(true);
                pnlThemSPCT.setVisible(false);
        }//GEN-LAST:event_btnQuayLaiActionPerformed

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                if (insert()) {
                        pnlDanhSachSPCT.setVisible(true);
                        pnlThemSPCT.setVisible(false);
                }
        }//GEN-LAST:event_btnThemActionPerformed

        private void btnOpenQRCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenQRCodeActionPerformed
                new QR_Code().setVisible(true);
        }//GEN-LAST:event_btnOpenQRCodeActionPerformed

        private void pnlThemSPCTComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlThemSPCTComponentShown
                if (!maSP.equals("%")) {
                        ThuocTinh model = thuocTinhDao.getByMa("San_Pham", maSP);
                        for (int i = 0; i < cboTenSP.getItemCount(); i++) {
                                if (cboTenSP.getItemAt(i).toString().equals(model.getTen())) {
                                        cboTenSP.setSelectedIndex(i);
                                        cboTenSP.setEnabled(false);
                                        return;
                                }
                        }
                }
                System.out.println(maSP);
        }//GEN-LAST:event_pnlThemSPCTComponentShown

        private void btnFirstSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSpctActionPerformed
                pageIndex = 1;
                this.fillToTable(pageIndex, limit);
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnFirstSpctActionPerformed

        private void btnPreviousSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousSpctActionPerformed
                if (pageIndex > 1) {
                        pageIndex--;
                } else {
                        pageIndex = 1;
                }
                this.fillToTable(pageIndex, limit);
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnPreviousSpctActionPerformed

        private void btnNextSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSpctActionPerformed
                if (pageIndex < this.pageSize) {
                        pageIndex++;
                } else {
                        pageIndex = this.getPageSize(limit);
                }
                this.fillToTable(pageIndex, limit);
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnNextSpctActionPerformed

        private void btnEndSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndSpctActionPerformed
                pageIndex = pageSize;
                this.fillToTable(pageIndex, limit);
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnEndSpctActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnChatLieu;
        private com.polyshoes.swing.Button btnCoGiay;
        private com.polyshoes.swing.Button btnDanhMuc;
        private com.polyshoes.swing.Button btnDeGiay;
        private com.polyshoes.swing.Button btnEndSpct;
        private com.polyshoes.swing.Button btnFirstSpct;
        private com.polyshoes.swing.Button btnMauSac;
        private javax.swing.JButton btnMoi;
        private com.polyshoes.swing.Button btnNextSpct;
        private com.polyshoes.swing.Button btnNhaSanXuat;
        private javax.swing.JButton btnOpenQRCode;
        private javax.swing.JButton btnOpenThem;
        private com.polyshoes.swing.Button btnPreviousSpct;
        private javax.swing.JButton btnQuayLai;
        private com.polyshoes.swing.Button btnSize;
        private javax.swing.JButton btnTaiMaQR;
        private com.polyshoes.swing.Button btnTenSP;
        private javax.swing.JButton btnThem;
        private com.polyshoes.swing.Button btnThuongHieu;
        private com.polyshoes.swing.Button btnXuatXu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboChatLieu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboCoGiay;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboDanhMuc;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboDeGiay;
        private com.polyshoes.component.Combobox cboFindDanhMuc;
        private com.polyshoes.component.Combobox cboFindGia;
        private com.polyshoes.component.Combobox cboFindNSX;
        private com.polyshoes.component.Combobox cboFindXuatXu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboMauSac;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboNhaSanXuat;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboSize;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboTenSP;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboThuongHieu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboXuatXu;
        private javax.swing.ButtonGroup grpTrangThai;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPaneSpct;
        private javax.swing.JLabel lblBoLoc;
        private javax.swing.JLabel lblIndexSpct;
        private javax.swing.JLabel lblSizeSpct;
        private javax.swing.JLabel lblTieuDe;
        private javax.swing.JLabel lblTieuDe1;
        private javax.swing.JLabel lblTieuDe13;
        private javax.swing.JLabel lblTieuDe15;
        private javax.swing.JLabel lblTieuDe17;
        private javax.swing.JLabel lblTieuDe19;
        private javax.swing.JLabel lblTieuDe20;
        private javax.swing.JLabel lblTieuDe23;
        private javax.swing.JLabel lblTieuDe24;
        private javax.swing.JLabel lblTieuDe25;
        private javax.swing.JLabel lblTieuDe26;
        private javax.swing.JLabel lblTrangThai;
        private javax.swing.JLabel lblXuatXu;
        private com.polyshoes.component.BorderJPanel pnlBoLoc;
        private javax.swing.JPanel pnlButton;
        private javax.swing.JPanel pnlCboTong;
        private javax.swing.JPanel pnlDanhSachSPCT;
        private javax.swing.JPanel pnlThemSPCT;
        private com.polyshoes.swing.RadioButtonCustom rdoDangBan;
        private com.polyshoes.swing.RadioButtonCustom rdoNgungBan;
        private com.polyshoes.swing.RadioButtonCustom rdoTatCa;
        private com.polyshoes.swing.table.Table tblSPCT;
        private com.polyshoes.swing.TextField txtGia;
        private com.polyshoes.swing.TextField txtSoLuong;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblSPCT.fixTable(jScrollPaneSpct);
                this.fillComboBoxSPCT();
                this.fillToTable(pageIndex, limit);
                if (tblSPCT.getRowCount() > 0) {
                        lblSizeSpct.setText(String.valueOf(tongTrangSPCT(limit)));
                } else {
                        pageSize = 1;
                        lblSizeSpct.setText(String.valueOf(pageSize));
                }
        }

        private void fillComboBox(JComboBox cbo, String tenBang) {
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cbo.getModel();
                cboModel.removeAllElements();
                List<ThuocTinh> list = thuocTinhDao.select(tenBang);
                for (ThuocTinh x : list) {
                        cboModel.addElement(x);
                }
                cbo.setSelectedIndex(-1);
        }

        private void fillComboBoxSPCT() {
                fillComboBox(cboDanhMuc, "Danh_Muc");
                fillComboBox(cboTenSP, "San_Pham");
                fillComboBox(cboChatLieu, "Chat_Lieu");
                fillComboBox(cboSize, "Size");
                fillComboBox(cboDeGiay, "De_Giay");
                fillComboBox(cboMauSac, "Mau_Sac");
                fillComboBox(cboThuongHieu, "Thuong_Hieu");
                fillComboBox(cboCoGiay, "Co_Giay");
                fillComboBox(cboXuatXu, "Xuat_Xu");
                fillComboBox(cboNhaSanXuat, "Nha_San_Xuat");
                fillComboBox(cboFindDanhMuc, "Danh_Muc");
                fillComboBox(cboFindXuatXu, "Xuat_Xu");
                fillComboBox(cboFindNSX, "Nha_San_Xuat");
                cboFindGia.setSelectedIndex(-1);
        }

        private int tongTrangSPCT(int limit) {
                int tongBanGhi = dao.selectAll(0, 5).size();
                int tongTrang = (int) Math.ceil((double) tongBanGhi / limit);
                return tongTrang;
        }

        private void fillToTable(int pageIndex, int limit) {
                if (rdoTatCa.isSelected()) {
                        this.fillSP(-1, pageIndex, limit);
                }
                if (rdoDangBan.isSelected()) {
                        this.fillSP(0, pageIndex, limit);
                }
                if (rdoNgungBan.isSelected()) {
                        this.fillSP(1, pageIndex, limit);
                }
        }

        private void fillSP(int deleted, int pageIndex, int limit) {
                DefaultTableModel tblModel = (DefaultTableModel) tblSPCT.getModel();
                tblModel.setRowCount(0);
                if (deleted == -1) {
                        List<SanPhamChiTiet> list = dao.paging(maSP, (pageIndex - 1) * limit, limit);
                        for (SanPhamChiTiet x : list) {
                                tblModel.addRow(x.toDataRow());
                        }
                } else {
                        List<SanPhamChiTiet> list = dao.selectDeleted(maSP, deleted, (pageIndex - 1) * limit, limit);
                        if(list != null) {
                                for (SanPhamChiTiet x : list) {
                                        tblModel.addRow(x.toDataRow());
                                }
                        }
                }
                lblSizeSpct.setText(String.valueOf(this.getPageSize(limit)));
        }

        private boolean checkSPCT() {
                if (cboChatLieu.getSelectedIndex() == -1 || cboSize.getSelectedIndex() == -1 || cboDanhMuc.getSelectedIndex() == -1
                        || cboDeGiay.getSelectedIndex() == -1 || cboMauSac.getSelectedIndex() == -1 || cboThuongHieu.getSelectedIndex() == -1
                        || cboCoGiay.getSelectedIndex() == -1 || cboXuatXu.getSelectedIndex() == -1 || cboNhaSanXuat.getSelectedIndex() == -1) {
                        DialogHelper.alert(this, "Vui lòng nhập đủ dữ liệu!");
                        return false;
                } else {
                        double gia = 0;
                        int soLuong = 0;
                        try {
                                gia = Double.parseDouble(txtGia.getText());
                                soLuong = Integer.parseInt(txtSoLuong.getText());
                                if (gia < 0) {
                                        DialogHelper.alert(this, "Giá phải lớn hơn 0");
                                        return false;
                                }
                                if (soLuong < 0) {
                                        DialogHelper.alert(this, "Số lượng phải lớn hơn 0");
                                        return false;
                                }
                        } catch (NumberFormatException e) {
                                DialogHelper.alert(this, "Vui lòng nhập đúng dữ liệu!");
                                return false;
                        }
                }
                return true;
        }

        private void clear() {
                cboFindNSX.setSelectedIndex(-1);
                cboFindXuatXu.setSelectedIndex(-1);
                cboFindDanhMuc.setSelectedIndex(-1);
                cboFindGia.setSelectedIndex(-1);
        }

        private void openInsert() {
                pnlDanhSachSPCT.setVisible(false);
                pnlThemSPCT.setVisible(true);
        }

        private boolean insert() {
                if (this.checkSPCT()) {
                        ThuocTinh sp = (ThuocTinh) cboTenSP.getSelectedItem();
                        int idSP = sp.getId();
                        int idChatLieu = thuocTinhDao.getByName("Chat_Lieu", cboChatLieu.getSelectedItem().toString()).getId();
                        int idSize = thuocTinhDao.getByName("Size", cboSize.getSelectedItem().toString()).getId();
                        int idDanhMuc = thuocTinhDao.getByName("Danh_Muc", cboDanhMuc.getSelectedItem().toString()).getId();
                        int idDeGiay = thuocTinhDao.getByName("De_Giay", cboDeGiay.getSelectedItem().toString()).getId();
                        int idMauSac = thuocTinhDao.getByName("Mau_Sac", cboMauSac.getSelectedItem().toString()).getId();
                        int idThuongHieu = thuocTinhDao.getByName("Thuong_Hieu", cboThuongHieu.getSelectedItem().toString()).getId();
                        int idCoGiay = thuocTinhDao.getByName("Co_Giay", cboCoGiay.getSelectedItem().toString()).getId();
                        int idXuatXu = thuocTinhDao.getByName("Xuat_Xu", cboXuatXu.getSelectedItem().toString()).getId();
                        int idNSX = thuocTinhDao.getByName("Nha_San_Xuat", cboNhaSanXuat.getSelectedItem().toString()).getId();
                        int soLuong = Integer.parseInt(txtSoLuong.getText());
                        double gia = Double.parseDouble(txtGia.getText());
                        String ma = SanPhamChiTiet.generateCode();
                        try {
                                dao.insertSPCT(idDanhMuc, idXuatXu, idNSX, idMauSac, idSize, idSP, idThuongHieu, idChatLieu, idDeGiay, idCoGiay, ma, gia, soLuong);
                                DialogHelper.alert(this, "Thêm thành công!");
                                this.fillToTable(pageIndex, limit);
                                return true;
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Thêm thất bại!");
                                return false;
                        }
                }
                return false;
        }

        private void taiMaQR() {
                TaiMaQR.maSPCT = (String) tblSPCT.getValueAt(tblSPCT.getSelectedRow(), 1);
                TaiMaQR.taiQR();
        }

        private int getPageSize(int limit) {
                int tongSoSP = dao.selectAll(0, 5).size();
                int tongDaXoa = dao.selectDeleted(maSP, 1, 0, limit) == null ? 1 : dao.selectDeleted(maSP, 1, 0, limit).size();
                int tongChuaXoa = dao.selectDeleted(maSP, 0, 0, limit) == null ? 1 : dao.selectDeleted(maSP, 0, 0, limit).size();
                int tongTrang = (int) Math.ceil((double) tongSoSP / limit);
                int tongTrangXoa = (int) Math.ceil((double) tongDaXoa / limit);
                int tongTrangChuaXoa = (int) Math.ceil((double) tongChuaXoa / limit);
                if (rdoTatCa.isSelected()) {
                        pageSize = tongTrang;
                } else if (rdoDangBan.isSelected()) {
                        pageSize = tongTrangChuaXoa;
                } else {
                        pageSize = tongTrangXoa;
                }
                return pageSize;
        }

}
