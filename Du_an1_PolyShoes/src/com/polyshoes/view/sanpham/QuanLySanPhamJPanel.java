package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.dao.sanpham.SanPhamDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.SanPham;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class QuanLySanPhamJPanel extends javax.swing.JPanel {

        SanPhamDAO spDAO = new SanPhamDAO();
        SanPhamCTDAO spctDAO = new SanPhamCTDAO();
        ThuocTinhDAO thuocTinhDAO = new ThuocTinhDAO();
        int index = -1;
        int pageIndex = 1;
        int limit = 5;
        public static String ma;

        public QuanLySanPhamJPanel() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                grpSanPham = new javax.swing.ButtonGroup();
                grpChiTietSP = new javax.swing.ButtonGroup();
                grpThuocTinh = new javax.swing.ButtonGroup();
                jPanel1 = new javax.swing.JPanel();
                tabTong = new com.polyshoes.swing.tabbed.MaterialTabbed();
                tab1 = new javax.swing.JPanel();
                lblTieuDe = new javax.swing.JLabel();
                lblTieuDe4 = new javax.swing.JLabel();
                jScrollPaneMoTa = new javax.swing.JScrollPane();
                txtMoTa = new javax.swing.JTextArea();
                lblTieuDe2 = new javax.swing.JLabel();
                lblTieuDe3 = new javax.swing.JLabel();
                jScrollPaneSanPham = new javax.swing.JScrollPane();
                tblSanPham = new com.polyshoes.swing.table.Table();
                jPanel2 = new javax.swing.JPanel();
                btnFirstSP = new com.polyshoes.swing.Button();
                btnPreviousSP = new com.polyshoes.swing.Button();
                lblIndexSP = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                lblSizeSP = new javax.swing.JLabel();
                btnNextSP = new com.polyshoes.swing.Button();
                btnEndSP = new com.polyshoes.swing.Button();
                txtTenSP = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                txtMaSP = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
                lblTieuDe5 = new javax.swing.JLabel();
                rdoSPTatCa = new com.polyshoes.swing.RadioButtonCustom();
                rdoSPDangBan = new com.polyshoes.swing.RadioButtonCustom();
                rdoSPNgungBan = new com.polyshoes.swing.RadioButtonCustom();
                btnThemSP = new javax.swing.JButton();
                btnCapNhatSP = new javax.swing.JButton();
                btnXoaSP = new javax.swing.JButton();
                btnLamMoiSP = new javax.swing.JButton();
                cboFindTenSP = new com.polyshoes.component.Combobox();
                tab2 = new javax.swing.JPanel();
                DanhSachSPCT = new javax.swing.JPanel();
                pnlButton = new javax.swing.JPanel();
                btnFirstSpzt = new com.polyshoes.swing.Button();
                btnPreviousSpzt = new com.polyshoes.swing.Button();
                lblIndexSpzt = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                lblSizeSpzt = new javax.swing.JLabel();
                btnNextSpct = new com.polyshoes.swing.Button();
                btnEndSpct = new com.polyshoes.swing.Button();
                jScrollPaneSpct = new javax.swing.JScrollPane();
                tblSpct = new com.polyshoes.swing.table.Table();
                lblTieuDe8 = new javax.swing.JLabel();
                rdoCTSPTatCa = new com.polyshoes.swing.RadioButtonCustom();
                rdoCTSPDangBan = new com.polyshoes.swing.RadioButtonCustom();
                rdoCTSPNgungBan = new com.polyshoes.swing.RadioButtonCustom();
                btnMoi = new javax.swing.JButton();
                btnTaiVe = new javax.swing.JButton();
                btnSpctThem = new javax.swing.JButton();
                borderJPanel6 = new com.polyshoes.component.BorderJPanel();
                cboFindNSX = new com.polyshoes.component.Combobox();
                cboFindXuatXu = new com.polyshoes.component.Combobox();
                cboFindDanhMuc = new com.polyshoes.component.Combobox();
                cboFindGia = new com.polyshoes.component.Combobox();
                ThemSPCT = new javax.swing.JPanel();
                cboThuongHieu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                btnDanhMuc = new com.polyshoes.swing.Button();
                lblTieuDe12 = new javax.swing.JLabel();
                lblTieuDe14 = new javax.swing.JLabel();
                btnDeGiay = new com.polyshoes.swing.Button();
                cboDanhMuc = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                btnThuongHieu = new com.polyshoes.swing.Button();
                cboXuatXu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                btnCoGiay = new com.polyshoes.swing.Button();
                btnXuatXu = new com.polyshoes.swing.Button();
                lblTieuDe16 = new javax.swing.JLabel();
                btnNSX = new com.polyshoes.swing.Button();
                cboCoGiay = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe10 = new javax.swing.JLabel();
                lblTieuDe18 = new javax.swing.JLabel();
                lblTieuDe9 = new javax.swing.JLabel();
                cboTenSP = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboDeGiay = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                cboChatLieu = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe20 = new javax.swing.JLabel();
                lblTieuDe22 = new javax.swing.JLabel();
                txtGia = new com.polyshoes.swing.TextField();
                txtSoLuong = new com.polyshoes.swing.TextField();
                btnTenSP = new com.polyshoes.swing.Button();
                lblTieuDe11 = new javax.swing.JLabel();
                btnChatLieu = new com.polyshoes.swing.Button();
                cboNSX = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                btnSize = new com.polyshoes.swing.Button();
                cboSize = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                btnMauSac = new com.polyshoes.swing.Button();
                lblTieuDe21 = new javax.swing.JLabel();
                cboMauSac = new com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion();
                lblTieuDe1 = new javax.swing.JLabel();
                btnThemSPCT = new javax.swing.JButton();
                btnQuayLai = new javax.swing.JButton();
                tab3 = new javax.swing.JPanel();
                borderJPanel3 = new com.polyshoes.component.BorderJPanel();
                borderJPanel4 = new com.polyshoes.component.BorderJPanel();
                btnThemTHuocTinh = new javax.swing.JButton();
                btnSuaThuocTinh = new javax.swing.JButton();
                btnXoaThuocTinh = new javax.swing.JButton();
                btnMoiThuocTinh = new javax.swing.JButton();
                borderJPanel2 = new com.polyshoes.component.BorderJPanel();
                rdoDanhMuc = new javax.swing.JRadioButton();
                rdoXuatXu = new javax.swing.JRadioButton();
                rdoNhaSanXuat = new javax.swing.JRadioButton();
                rdoMauSac = new javax.swing.JRadioButton();
                rdoSize = new javax.swing.JRadioButton();
                rdoThuongHieu = new javax.swing.JRadioButton();
                rdoChatLieu = new javax.swing.JRadioButton();
                rdoDeGiay = new javax.swing.JRadioButton();
                rdoCoGiay = new javax.swing.JRadioButton();
                borderJPanel1 = new com.polyshoes.component.BorderJPanel();
                txtMaThuocTinh = new com.polyshoes.swing.TextField();
                txtTenThuocTinh = new com.polyshoes.swing.TextField();
                lblTieuDe6 = new javax.swing.JLabel();
                pnlButton1 = new javax.swing.JPanel();
                btnFirstThuocTinh = new com.polyshoes.swing.Button();
                btnPreviousThuocTinh = new com.polyshoes.swing.Button();
                lblIndexThuocTinh = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                lblSizeThuocTinh = new javax.swing.JLabel();
                btnNextThuocTinh = new com.polyshoes.swing.Button();
                btnEndThuocTinh = new com.polyshoes.swing.Button();
                lblTieuDe7 = new javax.swing.JLabel();
                jScrollPaneThuocTinh = new javax.swing.JScrollPane();
                tblThuocTinh = new com.polyshoes.swing.table.Table();

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setForeground(new java.awt.Color(255, 255, 255));
                jPanel1.setPreferredSize(new java.awt.Dimension(1056, 715));
                jPanel1.setLayout(new java.awt.BorderLayout());

                tab1.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe.setText("Thông tin sản phẩm");
                lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe4.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe4.setText("Mô tả sản phẩm");
                lblTieuDe4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
                lblTieuDe4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

                txtMoTa.setBackground(new java.awt.Color(255, 255, 255));
                txtMoTa.setColumns(20);
                txtMoTa.setRows(5);
                jScrollPaneMoTa.setViewportView(txtMoTa);

                lblTieuDe2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe2.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe2.setText("Mã sản phẩm");
                lblTieuDe2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe3.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe3.setText("Tên sản phẩm");
                lblTieuDe3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                tblSanPham.setBackground(new java.awt.Color(255, 255, 255));
                tblSanPham.setForeground(new java.awt.Color(255, 255, 255));
                tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "#", "Mã sản phẩm", "Tên sản phẩm", "Mô tả", "Số lượng", "Trạng thái"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblSanPham.setOpaque(false);
                tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblSanPhamMouseClicked(evt);
                        }
                });
                jScrollPaneSanPham.setViewportView(tblSanPham);
                if (tblSanPham.getColumnModel().getColumnCount() > 0) {
                        tblSanPham.getColumnModel().getColumn(0).setResizable(false);
                        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(5);
                        tblSanPham.getColumnModel().getColumn(3).setPreferredWidth(100);
                        tblSanPham.getColumnModel().getColumn(4).setPreferredWidth(20);
                }

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                btnFirstSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                btnFirstSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFirstSPActionPerformed(evt);
                        }
                });
                jPanel2.add(btnFirstSP);

                btnPreviousSP.setForeground(new java.awt.Color(76, 76, 76));
                btnPreviousSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                btnPreviousSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPreviousSPActionPerformed(evt);
                        }
                });
                jPanel2.add(btnPreviousSP);

                lblIndexSP.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblIndexSP.setForeground(new java.awt.Color(255, 0, 0));
                lblIndexSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblIndexSP.setText("1");
                jPanel2.add(lblIndexSP);

                jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 0, 0));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("/");
                jPanel2.add(jLabel2);

                lblSizeSP.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblSizeSP.setForeground(new java.awt.Color(255, 0, 0));
                lblSizeSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblSizeSP.setText("3");
                jPanel2.add(lblSizeSP);

                btnNextSP.setForeground(new java.awt.Color(76, 76, 76));
                btnNextSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                btnNextSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNextSPActionPerformed(evt);
                        }
                });
                jPanel2.add(btnNextSP);

                btnEndSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                btnEndSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEndSPActionPerformed(evt);
                        }
                });
                jPanel2.add(btnEndSP);

                txtMaSP.setBackground(new java.awt.Color(255, 255, 255));
                txtMaSP.setText("###");

                lblTieuDe5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe5.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe5.setText("Trạng thái");
                lblTieuDe5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                grpSanPham.add(rdoSPTatCa);
                rdoSPTatCa.setSelected(true);
                rdoSPTatCa.setText("Tất cả");
                rdoSPTatCa.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdoSPTatCaActionPerformed(evt);
                        }
                });

                rdoSPDangBan.setBackground(new java.awt.Color(51, 255, 51));
                grpSanPham.add(rdoSPDangBan);
                rdoSPDangBan.setText("Đang bán");
                rdoSPDangBan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdoSPDangBanActionPerformed(evt);
                        }
                });

                rdoSPNgungBan.setBackground(new java.awt.Color(255, 0, 0));
                grpSanPham.add(rdoSPNgungBan);
                rdoSPNgungBan.setText("Ngừng bán");
                rdoSPNgungBan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdoSPNgungBanActionPerformed(evt);
                        }
                });

                btnThemSP.setText("Thêm");
                btnThemSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemSPActionPerformed(evt);
                        }
                });

                btnCapNhatSP.setText("Cập nhật");
                btnCapNhatSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCapNhatSPActionPerformed(evt);
                        }
                });

                btnXoaSP.setText("Xóa");
                btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnXoaSPActionPerformed(evt);
                        }
                });

                btnLamMoiSP.setText("Làm mới");
                btnLamMoiSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLamMoiSPActionPerformed(evt);
                        }
                });

                cboFindTenSP.setLabeText("Tên sản phẩm");
                cboFindTenSP.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindTenSPItemStateChanged(evt);
                        }
                });

                javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
                tab1.setLayout(tab1Layout);
                tab1Layout.setHorizontalGroup(
                        tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPaneSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(tab1Layout.createSequentialGroup()
                                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe2)
                                                                        .addComponent(lblTieuDe3))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(tab1Layout.createSequentialGroup()
                                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(74, 74, 74)))
                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(tab1Layout.createSequentialGroup()
                                                                .addComponent(jScrollPaneMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(77, 77, 77)
                                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(tab1Layout.createSequentialGroup()
                                                                                .addComponent(btnXoaSP)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btnLamMoiSP))
                                                                        .addGroup(tab1Layout.createSequentialGroup()
                                                                                .addComponent(btnThemSP)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(btnCapNhatSP))))
                                                        .addComponent(lblTieuDe4))
                                                .addGap(34, 34, 34))
                                        .addGroup(tab1Layout.createSequentialGroup()
                                                .addComponent(lblTieuDe)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(tab1Layout.createSequentialGroup()
                                                .addComponent(lblTieuDe5)
                                                .addGap(39, 39, 39)
                                                .addComponent(rdoSPTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoSPDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoSPNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cboFindTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );

                tab1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCapNhatSP, btnLamMoiSP, btnThemSP, btnXoaSP});

                tab1Layout.setVerticalGroup(
                        tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTieuDe2)
                                        .addComponent(lblTieuDe4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(tab1Layout.createSequentialGroup()
                                                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblTieuDe3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPaneMoTa)
                                        .addGroup(tab1Layout.createSequentialGroup()
                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnThemSP)
                                                        .addComponent(btnCapNhatSP))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnXoaSP)
                                                        .addComponent(btnLamMoiSP))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTieuDe5)
                                        .addComponent(rdoSPTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdoSPDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdoSPNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFindTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPaneSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                tabTong.addTab("Sản phẩm", tab1);

                tab2.setBackground(new java.awt.Color(255, 255, 255));
                tab2.setLayout(new java.awt.CardLayout());

                DanhSachSPCT.setBackground(new java.awt.Color(255, 255, 255));

                pnlButton.setBackground(new java.awt.Color(255, 255, 255));

                btnFirstSpzt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                pnlButton.add(btnFirstSpzt);

                btnPreviousSpzt.setForeground(new java.awt.Color(76, 76, 76));
                btnPreviousSpzt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                pnlButton.add(btnPreviousSpzt);

                lblIndexSpzt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblIndexSpzt.setForeground(new java.awt.Color(255, 0, 0));
                lblIndexSpzt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblIndexSpzt.setText("1");
                pnlButton.add(lblIndexSpzt);

                jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 0, 0));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("/");
                pnlButton.add(jLabel3);

                lblSizeSpzt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblSizeSpzt.setForeground(new java.awt.Color(255, 0, 0));
                lblSizeSpzt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblSizeSpzt.setText("3");
                pnlButton.add(lblSizeSpzt);

                btnNextSpct.setForeground(new java.awt.Color(76, 76, 76));
                btnNextSpct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                pnlButton.add(btnNextSpct);

                btnEndSpct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                pnlButton.add(btnEndSpct);

                tblSpct.setBackground(new java.awt.Color(255, 255, 255));
                tblSpct.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "#", "Mã SP", "Danh mục", "Xuất xứ", "NSX", "Màu sắc", "Size", "Thương hiệu", "Chất liệu", "Đế giày", "Cổ giày", "Giá", "Số lượng", "Trạng thái", "Hành động"
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
                tblSpct.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblSpctMouseClicked(evt);
                        }
                });
                jScrollPaneSpct.setViewportView(tblSpct);
                if (tblSpct.getColumnModel().getColumnCount() > 0) {
                        tblSpct.getColumnModel().getColumn(0).setPreferredWidth(10);
                        tblSpct.getColumnModel().getColumn(1).setPreferredWidth(35);
                        tblSpct.getColumnModel().getColumn(4).setPreferredWidth(35);
                        tblSpct.getColumnModel().getColumn(5).setPreferredWidth(40);
                        tblSpct.getColumnModel().getColumn(6).setPreferredWidth(30);
                        tblSpct.getColumnModel().getColumn(8).setPreferredWidth(45);
                        tblSpct.getColumnModel().getColumn(9).setPreferredWidth(45);
                        tblSpct.getColumnModel().getColumn(10).setPreferredWidth(45);
                        tblSpct.getColumnModel().getColumn(11).setPreferredWidth(35);
                        tblSpct.getColumnModel().getColumn(12).setPreferredWidth(40);
                        tblSpct.getColumnModel().getColumn(13).setPreferredWidth(40);
                        tblSpct.getColumnModel().getColumn(14).setPreferredWidth(30);
                }

                lblTieuDe8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe8.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe8.setText("Trạng thái");
                lblTieuDe8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                grpChiTietSP.add(rdoCTSPTatCa);
                rdoCTSPTatCa.setSelected(true);
                rdoCTSPTatCa.setText("Tất cả");

                rdoCTSPDangBan.setBackground(new java.awt.Color(51, 255, 51));
                grpChiTietSP.add(rdoCTSPDangBan);
                rdoCTSPDangBan.setText("Đang bán");

                rdoCTSPNgungBan.setBackground(new java.awt.Color(255, 0, 0));
                grpChiTietSP.add(rdoCTSPNgungBan);
                rdoCTSPNgungBan.setText("Ngừng bán");

                btnMoi.setText("Làm mới");
                btnMoi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMoiActionPerformed(evt);
                        }
                });

                btnTaiVe.setText("Tải về");
                btnTaiVe.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTaiVeActionPerformed(evt);
                        }
                });

                btnSpctThem.setText("Thêm mới");
                btnSpctThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSpctThemActionPerformed(evt);
                        }
                });

                borderJPanel6.setBackground(new java.awt.Color(255, 255, 255));
                borderJPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                cboFindNSX.setLabeText("Nhà sản xuất");

                cboFindXuatXu.setLabeText("Xuất xứ");

                cboFindDanhMuc.setLabeText("Danh mục");

                cboFindGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cao đến thấp", "Thấp đến cao" }));
                cboFindGia.setLabeText("Giá");

                javax.swing.GroupLayout borderJPanel6Layout = new javax.swing.GroupLayout(borderJPanel6);
                borderJPanel6.setLayout(borderJPanel6Layout);
                borderJPanel6Layout.setHorizontalGroup(
                        borderJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel6Layout.createSequentialGroup()
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
                borderJPanel6Layout.setVerticalGroup(
                        borderJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel6Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(borderJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cboFindXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFindNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFindDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFindGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout DanhSachSPCTLayout = new javax.swing.GroupLayout(DanhSachSPCT);
                DanhSachSPCT.setLayout(DanhSachSPCTLayout);
                DanhSachSPCTLayout.setHorizontalGroup(
                        DanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DanhSachSPCTLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(DanhSachSPCTLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(DanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(DanhSachSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoCTSPTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoCTSPDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdoCTSPNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSpctThem)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnTaiVe)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnMoi))
                                        .addComponent(borderJPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
                        .addGroup(DanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DanhSachSPCTLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPaneSpct, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                                        .addContainerGap()))
                );
                DanhSachSPCTLayout.setVerticalGroup(
                        DanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DanhSachSPCTLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(borderJPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(DanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(DanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblTieuDe8)
                                                .addComponent(rdoCTSPTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rdoCTSPDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rdoCTSPNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnSpctThem)
                                        .addComponent(btnTaiVe)
                                        .addComponent(btnMoi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(DanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DanhSachSPCTLayout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(jScrollPaneSpct, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(51, Short.MAX_VALUE)))
                );

                tab2.add(DanhSachSPCT, "card2");

                ThemSPCT.setBackground(new java.awt.Color(255, 255, 255));

                cboThuongHieu.setEditable(false);

                btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                lblTieuDe12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe12.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe12.setText("Thương hiệu");
                lblTieuDe12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe14.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe14.setText("Danh mục");
                lblTieuDe14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnDeGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                cboDanhMuc.setEditable(false);

                btnThuongHieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                cboXuatXu.setEditable(false);

                btnCoGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                btnXuatXu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                lblTieuDe16.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe16.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe16.setText("Chất liệu");
                lblTieuDe16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnNSX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                cboCoGiay.setEditable(false);

                lblTieuDe10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe10.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe10.setText("Nhà sản xuất");
                lblTieuDe10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe18.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe18.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe18.setText("Cổ giày");
                lblTieuDe18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe9.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe9.setText("Đế giày");
                lblTieuDe9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                cboTenSP.setEditable(false);

                cboDeGiay.setEditable(false);

                cboChatLieu.setEditable(false);

                lblTieuDe20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe20.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe20.setText("Xuất xứ");
                lblTieuDe20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe22.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe22.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe22.setText("Màu sắc");
                lblTieuDe22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                txtGia.setBackground(new java.awt.Color(255, 255, 255));
                txtGia.setLabelText("Giá");

                txtSoLuong.setBackground(new java.awt.Color(255, 255, 255));
                txtSoLuong.setLabelText("Số lượng");

                btnTenSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                lblTieuDe11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe11.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe11.setText("Tên sản phẩm");
                lblTieuDe11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnChatLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                cboNSX.setEditable(false);

                btnSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                cboSize.setEditable(false);

                btnMauSac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N

                lblTieuDe21.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe21.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe21.setText("Size");
                lblTieuDe21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                cboMauSac.setEditable(false);

                lblTieuDe1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe1.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe1.setText("Thêm sản phẩm chi tiết");
                lblTieuDe1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnThemSPCT.setText("Thêm sản phẩm");
                btnThemSPCT.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemSPCTActionPerformed(evt);
                        }
                });

                btnQuayLai.setText("Quay lại");
                btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnQuayLaiActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout ThemSPCTLayout = new javax.swing.GroupLayout(ThemSPCT);
                ThemSPCT.setLayout(ThemSPCTLayout);
                ThemSPCTLayout.setHorizontalGroup(
                        ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe16)
                                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe9)
                                                                        .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cboCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblTieuDe18))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe21)
                                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe22)
                                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnThemSPCT)
                                                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblTieuDe10, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cboNSX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                                .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(lblTieuDe11))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe14)
                                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                                .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(lblTieuDe1))
                                                .addGap(18, 18, 18)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTieuDe12)
                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTieuDe20)
                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(14, 14, 14))
                );

                ThemSPCTLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnQuayLai, btnThemSPCT});

                ThemSPCTLayout.setVerticalGroup(
                        ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblTieuDe1)
                                .addGap(106, 106, 106)
                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnXuatXu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnThuongHieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnChatLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnDeGiay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnNSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addComponent(lblTieuDe18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnCoGiay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTieuDe21)
                                                        .addGroup(ThemSPCTLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(lblTieuDe22)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cboSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnMauSac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboMauSac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(74, 74, 74)
                                .addGroup(ThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThemSPCT)
                                        .addComponent(btnQuayLai))
                                .addContainerGap(210, Short.MAX_VALUE))
                );

                tab2.add(ThemSPCT, "card3");

                tabTong.addTab("Sản phẩm chi tiết", tab2);

                tab3.setBackground(new java.awt.Color(255, 255, 255));

                borderJPanel3.setBackground(new java.awt.Color(255, 255, 255));

                borderJPanel4.setBackground(new java.awt.Color(255, 255, 255));

                btnThemTHuocTinh.setText("Thêm");
                btnThemTHuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemTHuocTinhActionPerformed(evt);
                        }
                });

                btnSuaThuocTinh.setText("Sửa");
                btnSuaThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSuaThuocTinhActionPerformed(evt);
                        }
                });

                btnXoaThuocTinh.setText("Xóa");
                btnXoaThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnXoaThuocTinhActionPerformed(evt);
                        }
                });

                btnMoiThuocTinh.setText("Mới");
                btnMoiThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMoiThuocTinhActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout borderJPanel4Layout = new javax.swing.GroupLayout(borderJPanel4);
                borderJPanel4.setLayout(borderJPanel4Layout);
                borderJPanel4Layout.setHorizontalGroup(
                        borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel4Layout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addGroup(borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMoiThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoaThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSuaThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThemTHuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                );
                borderJPanel4Layout.setVerticalGroup(
                        borderJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnThemTHuocTinh)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaThuocTinh)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaThuocTinh)
                                .addGap(18, 18, 18)
                                .addComponent(btnMoiThuocTinh)
                                .addContainerGap(20, Short.MAX_VALUE))
                );

                borderJPanel2.setBackground(new java.awt.Color(255, 255, 255));

                grpThuocTinh.add(rdoDanhMuc);
                rdoDanhMuc.setSelected(true);
                rdoDanhMuc.setText("Danh mục");
                rdoDanhMuc.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoDanhMucItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoXuatXu);
                rdoXuatXu.setText("Xuất xứ");
                rdoXuatXu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoXuatXuItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoNhaSanXuat);
                rdoNhaSanXuat.setText("Nhà sản xuất");
                rdoNhaSanXuat.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoNhaSanXuatItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoMauSac);
                rdoMauSac.setText("Màu sắc");
                rdoMauSac.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoMauSacItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoSize);
                rdoSize.setText("Size");
                rdoSize.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoSizeItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoThuongHieu);
                rdoThuongHieu.setText("Thương hiệu");
                rdoThuongHieu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoThuongHieuItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoChatLieu);
                rdoChatLieu.setText("Chất liệu");
                rdoChatLieu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoChatLieuItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoDeGiay);
                rdoDeGiay.setText("Đế giày");
                rdoDeGiay.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoDeGiayItemStateChanged(evt);
                        }
                });

                grpThuocTinh.add(rdoCoGiay);
                rdoCoGiay.setText("Cổ giày");
                rdoCoGiay.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                rdoCoGiayItemStateChanged(evt);
                        }
                });

                javax.swing.GroupLayout borderJPanel2Layout = new javax.swing.GroupLayout(borderJPanel2);
                borderJPanel2.setLayout(borderJPanel2Layout);
                borderJPanel2Layout.setHorizontalGroup(
                        borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoDanhMuc)
                                        .addComponent(rdoXuatXu)
                                        .addComponent(rdoNhaSanXuat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoMauSac)
                                        .addComponent(rdoSize)
                                        .addComponent(rdoThuongHieu))
                                .addGap(30, 30, 30)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoCoGiay)
                                        .addComponent(rdoDeGiay)
                                        .addComponent(rdoChatLieu))
                                .addGap(30, 30, 30))
                );
                borderJPanel2Layout.setVerticalGroup(
                        borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(rdoDanhMuc)
                                                .addComponent(rdoChatLieu))
                                        .addComponent(rdoMauSac))
                                .addGap(18, 18, 18)
                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoSize)
                                        .addGroup(borderJPanel2Layout.createSequentialGroup()
                                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rdoXuatXu)
                                                        .addComponent(rdoDeGiay))
                                                .addGap(18, 18, 18)
                                                .addGroup(borderJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(rdoNhaSanXuat)
                                                        .addComponent(rdoThuongHieu)
                                                        .addComponent(rdoCoGiay))))
                                .addContainerGap(43, Short.MAX_VALUE))
                );

                borderJPanel1.setBackground(new java.awt.Color(255, 255, 255));
                borderJPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                txtMaThuocTinh.setEditable(false);
                txtMaThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
                txtMaThuocTinh.setText("###");
                txtMaThuocTinh.setLabelText("Mã thuộc tính");

                txtTenThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
                txtTenThuocTinh.setLabelText("Tên thuộc tính");

                javax.swing.GroupLayout borderJPanel1Layout = new javax.swing.GroupLayout(borderJPanel1);
                borderJPanel1.setLayout(borderJPanel1Layout);
                borderJPanel1Layout.setHorizontalGroup(
                        borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
                );
                borderJPanel1Layout.setVerticalGroup(
                        borderJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(borderJPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txtMaThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtTenThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout borderJPanel3Layout = new javax.swing.GroupLayout(borderJPanel3);
                borderJPanel3.setLayout(borderJPanel3Layout);
                borderJPanel3Layout.setHorizontalGroup(
                        borderJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderJPanel3Layout.createSequentialGroup()
                                .addComponent(borderJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(borderJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(borderJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                borderJPanel3Layout.setVerticalGroup(
                        borderJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(borderJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borderJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borderJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                lblTieuDe6.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe6.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe6.setText("Danh sách thuộc tính");
                lblTieuDe6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                pnlButton1.setBackground(new java.awt.Color(255, 255, 255));

                btnFirstThuocTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                btnFirstThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFirstThuocTinhActionPerformed(evt);
                        }
                });
                pnlButton1.add(btnFirstThuocTinh);

                btnPreviousThuocTinh.setForeground(new java.awt.Color(76, 76, 76));
                btnPreviousThuocTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                btnPreviousThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPreviousThuocTinhActionPerformed(evt);
                        }
                });
                pnlButton1.add(btnPreviousThuocTinh);

                lblIndexThuocTinh.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblIndexThuocTinh.setForeground(new java.awt.Color(255, 0, 0));
                lblIndexThuocTinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblIndexThuocTinh.setText("1");
                pnlButton1.add(lblIndexThuocTinh);

                jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 0, 0));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("/");
                pnlButton1.add(jLabel4);

                lblSizeThuocTinh.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblSizeThuocTinh.setForeground(new java.awt.Color(255, 0, 0));
                lblSizeThuocTinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblSizeThuocTinh.setText("3");
                pnlButton1.add(lblSizeThuocTinh);

                btnNextThuocTinh.setForeground(new java.awt.Color(76, 76, 76));
                btnNextThuocTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                btnNextThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNextThuocTinhActionPerformed(evt);
                        }
                });
                pnlButton1.add(btnNextThuocTinh);

                btnEndThuocTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                btnEndThuocTinh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEndThuocTinhActionPerformed(evt);
                        }
                });
                pnlButton1.add(btnEndThuocTinh);

                lblTieuDe7.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe7.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe7.setText("Thiết lập thuộc tính");
                lblTieuDe7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                jScrollPaneThuocTinh.setBackground(new java.awt.Color(255, 255, 255));

                tblThuocTinh.setBackground(new java.awt.Color(255, 255, 255));
                tblThuocTinh.setForeground(new java.awt.Color(255, 255, 255));
                tblThuocTinh.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "STT", "Mã thuộc tính", "Tên thuộc tính"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblThuocTinh.setOpaque(false);
                tblThuocTinh.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblThuocTinhMouseClicked(evt);
                        }
                });
                jScrollPaneThuocTinh.setViewportView(tblThuocTinh);

                javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
                tab3.setLayout(tab3Layout);
                tab3Layout.setHorizontalGroup(
                        tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(borderJPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPaneThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                                        .addGroup(tab3Layout.createSequentialGroup()
                                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTieuDe7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTieuDe6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                tab3Layout.setVerticalGroup(
                        tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tab3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDe7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(borderJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(lblTieuDe6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                tabTong.addTab("Thuộc tính", tab3);

                jPanel1.add(tabTong, java.awt.BorderLayout.CENTER);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                );
        }// </editor-fold>//GEN-END:initComponents

        private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
                if (evt.getClickCount() == 2) {
                        if (this.index >= 0) {
                                tabTong.setSelectedIndex(1);
                                this.ma = (String) tblSanPham.getValueAt(tblSanPham.getSelectedRow(), 1);
                                this.fillToTableSPCT(this.ma, pageIndex, limit);
                        }
                } else {
                        this.showDetailSP();
                }
        }//GEN-LAST:event_tblSanPhamMouseClicked

        private void btnPreviousSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousSPActionPerformed
                if (pageIndex > 1) {
                        pageIndex--;
                } else {
                        pageIndex = 1;
                }
                this.fillToTableSP(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnPreviousSPActionPerformed

        private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
                if (pageIndex < this.tongTrangSP(limit)) {
                        pageIndex++;
                } else {
                        pageIndex = this.tongTrangSP(limit);
                }
                this.fillToTableSP(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnNextSPActionPerformed

        private void rdoDanhMucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDanhMucItemStateChanged
                if (rdoDanhMuc.isSelected()) {
                        this.fillToTableThuocTinh("Danh_Muc");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoDanhMucItemStateChanged

        private void rdoXuatXuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoXuatXuItemStateChanged
                if (rdoXuatXu.isSelected()) {
                        this.fillToTableThuocTinh("Xuat_Xu");
                }
        }//GEN-LAST:event_rdoXuatXuItemStateChanged

        private void rdoNhaSanXuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoNhaSanXuatItemStateChanged
                if (rdoNhaSanXuat.isSelected()) {
                        this.fillToTableThuocTinh("Nha_San_Xuat");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoNhaSanXuatItemStateChanged

        private void rdoMauSacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoMauSacItemStateChanged
                if (rdoMauSac.isSelected()) {
                        this.fillToTableThuocTinh("Mau_Sac");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoMauSacItemStateChanged

        private void rdoSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoSizeItemStateChanged
                if (rdoSize.isSelected()) {
                        this.fillToTableThuocTinh("Size");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoSizeItemStateChanged

        private void rdoThuongHieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoThuongHieuItemStateChanged
                if (rdoThuongHieu.isSelected()) {
                        this.fillToTableThuocTinh("Thuong_Hieu");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoThuongHieuItemStateChanged

        private void rdoChatLieuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoChatLieuItemStateChanged
                if (rdoChatLieu.isSelected()) {
                        this.fillToTableThuocTinh("Chat_lieu");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoChatLieuItemStateChanged

        private void rdoDeGiayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoDeGiayItemStateChanged
                if (rdoDeGiay.isSelected()) {
                        this.fillToTableThuocTinh("De_Giay");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoDeGiayItemStateChanged

        private void rdoCoGiayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoCoGiayItemStateChanged
                if (rdoCoGiay.isSelected()) {
                        this.fillToTableThuocTinh("Co_Giay");
                } else {
                        this.clearThuocTinh();
                        index = -1;
                }
        }//GEN-LAST:event_rdoCoGiayItemStateChanged

        private void btnThemTHuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTHuocTinhActionPerformed
                this.insertThuocTinh();
        }//GEN-LAST:event_btnThemTHuocTinhActionPerformed

        private void btnSpctThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpctThemActionPerformed
                ThemSPCT.setVisible(true);
                DanhSachSPCT.setVisible(false);
        }//GEN-LAST:event_btnSpctThemActionPerformed

        private void tblSpctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSpctMouseClicked
                if (evt.getClickCount() == 2) {
                        index = tblSpct.rowAtPoint(evt.getPoint());
                        if (index >= 0) {
                                new SanPhamChiTietJFrame().setVisible(true);
                        }
                } else {
                        this.showDetailSPCT();
                }
        }//GEN-LAST:event_tblSpctMouseClicked

        private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
                this.insertSP();
        }//GEN-LAST:event_btnThemSPActionPerformed

        private void tblThuocTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThuocTinhMouseClicked
                this.showDetailThuocTinh();
        }//GEN-LAST:event_tblThuocTinhMouseClicked

        private void btnSuaThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThuocTinhActionPerformed
                if (index >= 0) {
                        this.updateThuocTinh();
                } else {
                        DialogHelper.alert(this, "Vui lòng chọn thuộc tính cần sửa!");
                }
        }//GEN-LAST:event_btnSuaThuocTinhActionPerformed

        private void btnXoaThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThuocTinhActionPerformed
                if (index >= 0) {
                        this.deleteThuocTinh();
                } else {
                        DialogHelper.alert(this, "Vui lòng chọn thuộc tính cần xóa!");
                }
        }//GEN-LAST:event_btnXoaThuocTinhActionPerformed

        private void btnMoiThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiThuocTinhActionPerformed
                this.clearThuocTinh();
        }//GEN-LAST:event_btnMoiThuocTinhActionPerformed

        private void btnCapNhatSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatSPActionPerformed
                this.updateSP();
        }//GEN-LAST:event_btnCapNhatSPActionPerformed

        private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
                this.deleteSP();
        }//GEN-LAST:event_btnXoaSPActionPerformed

        private void btnLamMoiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiSPActionPerformed
                this.clearSP();
        }//GEN-LAST:event_btnLamMoiSPActionPerformed

        private void btnTaiVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiVeActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnTaiVeActionPerformed

        private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
                this.clearSPCT();
        }//GEN-LAST:event_btnMoiActionPerformed

        private void btnEndSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndSPActionPerformed
                pageIndex = tongTrangSP(limit);
                this.fillToTableSP(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnEndSPActionPerformed

        private void btnFirstSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSPActionPerformed
                pageIndex = 1;
                this.fillToTableSP(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnFirstSPActionPerformed

        private void rdoSPTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSPTatCaActionPerformed
                pageIndex = 1;
                if (rdoSPTatCa.isSelected()) {
                        this.fillToTableSP(pageIndex, limit);
                }
                lblIndexSP.setText(String.valueOf(pageIndex));
                lblSizeSP.setText(String.valueOf(tongTrangSP(limit)));
        }//GEN-LAST:event_rdoSPTatCaActionPerformed

        private void rdoSPDangBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSPDangBanActionPerformed
                pageIndex = 1;
                if (rdoSPDangBan.isSelected()) {
                        this.fillToTableSP(pageIndex, limit);
                }
                lblIndexSP.setText(String.valueOf(pageIndex));
                lblSizeSP.setText(String.valueOf(tongTrangSP(limit)));
        }//GEN-LAST:event_rdoSPDangBanActionPerformed

        private void rdoSPNgungBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSPNgungBanActionPerformed
                pageIndex = 1;
                if (rdoSPNgungBan.isSelected()) {
                        this.fillToTableSP(pageIndex, limit);
                }
                lblIndexSP.setText(String.valueOf(pageIndex));
                lblSizeSP.setText(String.valueOf(tongTrangSP(limit)));
        }//GEN-LAST:event_rdoSPNgungBanActionPerformed

        private void btnFirstThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstThuocTinhActionPerformed
//                System.out.println(cboChatLieu.getSelectedItem().toString());
        }//GEN-LAST:event_btnFirstThuocTinhActionPerformed

        private void btnPreviousThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousThuocTinhActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnPreviousThuocTinhActionPerformed

        private void btnNextThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextThuocTinhActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnNextThuocTinhActionPerformed

        private void btnEndThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndThuocTinhActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnEndThuocTinhActionPerformed

        private void btnThemSPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPCTActionPerformed
                if(this.insertSPCT()) {
                        DanhSachSPCT.setVisible(true);
                        ThemSPCT.setVisible(false);
                }
        }//GEN-LAST:event_btnThemSPCTActionPerformed

        private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
                ThemSPCT.setVisible(false);
                DanhSachSPCT.setVisible(true);
        }//GEN-LAST:event_btnQuayLaiActionPerformed

        private void cboFindTenSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindTenSPItemStateChanged

        }//GEN-LAST:event_cboFindTenSPItemStateChanged


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel DanhSachSPCT;
        private javax.swing.JPanel ThemSPCT;
        private com.polyshoes.component.BorderJPanel borderJPanel1;
        private com.polyshoes.component.BorderJPanel borderJPanel2;
        private com.polyshoes.component.BorderJPanel borderJPanel3;
        private com.polyshoes.component.BorderJPanel borderJPanel4;
        private com.polyshoes.component.BorderJPanel borderJPanel6;
        private javax.swing.JButton btnCapNhatSP;
        private com.polyshoes.swing.Button btnChatLieu;
        private com.polyshoes.swing.Button btnCoGiay;
        private com.polyshoes.swing.Button btnDanhMuc;
        private com.polyshoes.swing.Button btnDeGiay;
        private com.polyshoes.swing.Button btnEndSP;
        private com.polyshoes.swing.Button btnEndSpct;
        private com.polyshoes.swing.Button btnEndThuocTinh;
        private com.polyshoes.swing.Button btnFirstSP;
        private com.polyshoes.swing.Button btnFirstSpzt;
        private com.polyshoes.swing.Button btnFirstThuocTinh;
        private javax.swing.JButton btnLamMoiSP;
        private com.polyshoes.swing.Button btnMauSac;
        private javax.swing.JButton btnMoi;
        private javax.swing.JButton btnMoiThuocTinh;
        private com.polyshoes.swing.Button btnNSX;
        private com.polyshoes.swing.Button btnNextSP;
        private com.polyshoes.swing.Button btnNextSpct;
        private com.polyshoes.swing.Button btnNextThuocTinh;
        private com.polyshoes.swing.Button btnPreviousSP;
        private com.polyshoes.swing.Button btnPreviousSpzt;
        private com.polyshoes.swing.Button btnPreviousThuocTinh;
        private javax.swing.JButton btnQuayLai;
        private com.polyshoes.swing.Button btnSize;
        private javax.swing.JButton btnSpctThem;
        private javax.swing.JButton btnSuaThuocTinh;
        private javax.swing.JButton btnTaiVe;
        private com.polyshoes.swing.Button btnTenSP;
        private javax.swing.JButton btnThemSP;
        private javax.swing.JButton btnThemSPCT;
        private javax.swing.JButton btnThemTHuocTinh;
        private com.polyshoes.swing.Button btnThuongHieu;
        private javax.swing.JButton btnXoaSP;
        private javax.swing.JButton btnXoaThuocTinh;
        private com.polyshoes.swing.Button btnXuatXu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboChatLieu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboCoGiay;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboDanhMuc;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboDeGiay;
        private com.polyshoes.component.Combobox cboFindDanhMuc;
        private com.polyshoes.component.Combobox cboFindGia;
        private com.polyshoes.component.Combobox cboFindNSX;
        private com.polyshoes.component.Combobox cboFindTenSP;
        private com.polyshoes.component.Combobox cboFindXuatXu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboMauSac;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboNSX;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboSize;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboTenSP;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboThuongHieu;
        private com.polyshoes.swing.combo_suggestion.ComboBoxSuggestion cboXuatXu;
        private javax.swing.ButtonGroup grpChiTietSP;
        private javax.swing.ButtonGroup grpSanPham;
        private javax.swing.ButtonGroup grpThuocTinh;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPaneMoTa;
        private javax.swing.JScrollPane jScrollPaneSanPham;
        private javax.swing.JScrollPane jScrollPaneSpct;
        private javax.swing.JScrollPane jScrollPaneThuocTinh;
        private javax.swing.JLabel lblIndexSP;
        private javax.swing.JLabel lblIndexSpzt;
        private javax.swing.JLabel lblIndexThuocTinh;
        private javax.swing.JLabel lblSizeSP;
        private javax.swing.JLabel lblSizeSpzt;
        private javax.swing.JLabel lblSizeThuocTinh;
        private javax.swing.JLabel lblTieuDe;
        private javax.swing.JLabel lblTieuDe1;
        private javax.swing.JLabel lblTieuDe10;
        private javax.swing.JLabel lblTieuDe11;
        private javax.swing.JLabel lblTieuDe12;
        private javax.swing.JLabel lblTieuDe14;
        private javax.swing.JLabel lblTieuDe16;
        private javax.swing.JLabel lblTieuDe18;
        private javax.swing.JLabel lblTieuDe2;
        private javax.swing.JLabel lblTieuDe20;
        private javax.swing.JLabel lblTieuDe21;
        private javax.swing.JLabel lblTieuDe22;
        private javax.swing.JLabel lblTieuDe3;
        private javax.swing.JLabel lblTieuDe4;
        private javax.swing.JLabel lblTieuDe5;
        private javax.swing.JLabel lblTieuDe6;
        private javax.swing.JLabel lblTieuDe7;
        private javax.swing.JLabel lblTieuDe8;
        private javax.swing.JLabel lblTieuDe9;
        private javax.swing.JPanel pnlButton;
        private javax.swing.JPanel pnlButton1;
        private com.polyshoes.swing.RadioButtonCustom rdoCTSPDangBan;
        private com.polyshoes.swing.RadioButtonCustom rdoCTSPNgungBan;
        private com.polyshoes.swing.RadioButtonCustom rdoCTSPTatCa;
        private javax.swing.JRadioButton rdoChatLieu;
        private javax.swing.JRadioButton rdoCoGiay;
        private javax.swing.JRadioButton rdoDanhMuc;
        private javax.swing.JRadioButton rdoDeGiay;
        private javax.swing.JRadioButton rdoMauSac;
        private javax.swing.JRadioButton rdoNhaSanXuat;
        private com.polyshoes.swing.RadioButtonCustom rdoSPDangBan;
        private com.polyshoes.swing.RadioButtonCustom rdoSPNgungBan;
        private com.polyshoes.swing.RadioButtonCustom rdoSPTatCa;
        private javax.swing.JRadioButton rdoSize;
        private javax.swing.JRadioButton rdoThuongHieu;
        private javax.swing.JRadioButton rdoXuatXu;
        private javax.swing.JPanel tab1;
        private javax.swing.JPanel tab2;
        private javax.swing.JPanel tab3;
        private com.polyshoes.swing.tabbed.MaterialTabbed tabTong;
        private com.polyshoes.swing.table.Table tblSanPham;
        private com.polyshoes.swing.table.Table tblSpct;
        private com.polyshoes.swing.table.Table tblThuocTinh;
        private com.polyshoes.swing.TextField txtGia;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtMaSP;
        private com.polyshoes.swing.TextField txtMaThuocTinh;
        private javax.swing.JTextArea txtMoTa;
        private com.polyshoes.swing.TextField txtSoLuong;
        private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtTenSP;
        private com.polyshoes.swing.TextField txtTenThuocTinh;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblSanPham.fixTable(jScrollPaneSanPham);
                tblSpct.fixTable(jScrollPaneSpct);
                tblThuocTinh.fixTable(jScrollPaneThuocTinh);
                txtMaSP.setEditable(false);
                lblSizeSpzt.setText(String.valueOf(this.tongTrangSPCT(limit)));
                lblSizeThuocTinh.setText(String.valueOf(this.tongTrangThuocTinh("Danh_Muc", limit)));
                this.fillToTableSP(pageIndex, limit);
                this.fillToTableSPCT("SP01", pageIndex, limit);
                this.fillToTableThuocTinh("Danh_Muc");
                this.fillComboBoxSPCT();
        }

        private int tongTrangSP(int limit) {
                int tongSoSP = spDAO.selectAll().size();
                int tongDaXoa = spDAO.selectSP_Deleted(1, 0, 100).size();
                int tongChuaXoa = spDAO.selectSP_Deleted(0, 0, 100).size();
                int tongTrang = (int) Math.ceil((double) tongSoSP / limit);
                int tongTrangXoa = (int) Math.ceil((double) tongDaXoa / limit);
                int tongTrangChuaXoa = (int) Math.ceil((double) tongChuaXoa / limit);
                if (rdoSPTatCa.isSelected()) {
                        return tongTrang;
                } else if (rdoSPDangBan.isSelected()) {
                        return tongTrangChuaXoa;
                } else {
                        return tongTrangXoa;
                }
        }

        private int tongTrangSPCT(int limit) {
                SanPhamCTDAO dao = new SanPhamCTDAO();
                int tongBanGhi = dao.select().size();
                int tongTrang = (int) Math.ceil((double) tongBanGhi / limit);
                return tongTrang;
        }

        private int tongTrangThuocTinh(String tenBang, int limit) {
                ThuocTinhDAO dao = new ThuocTinhDAO();
                int tongBanGhi = dao.select(tenBang).size();
                int tongTrang = (int) Math.ceil((double) tongBanGhi / limit);
                return tongTrang;
        }

        private void fillToTableSP(int pageIndex, int limit) {
                if (rdoSPTatCa.isSelected()) {
                        this.fillSP(-1, pageIndex, limit);
                }
                if (rdoSPDangBan.isSelected()) {
                        this.fillSP(0, pageIndex, limit);
                }
                if (rdoSPNgungBan.isSelected()) {
                        this.fillSP(1, pageIndex, limit);
                }
        }

        private void fillSP(int deleted, int pageIndex, int limit) {
                DefaultTableModel tblModel = (DefaultTableModel) tblSanPham.getModel();
                tblModel.setRowCount(0);
                int stt = 0;
                if (deleted == -1) {
                        List<SanPham> list = spDAO.paging((pageIndex - 1) * limit, limit);
                        for (SanPham x : list) {
                                stt++;
                                Object[] rowData = new Object[]{
                                        stt, x.getMa(), x.getTen(), x.getMoTa(), x.getSoLuong(), x.isTrangThai() ? "Còn hàng" : "Hết hàng"
                                };
                                tblModel.addRow(rowData);
                        }
                } else {
                        List<SanPham> list = spDAO.pagingDeleted(deleted, (pageIndex - 1) * limit, limit);
                        for (SanPham x : list) {
                                stt++;
                                Object[] rowData = new Object[]{
                                        stt, x.getMa(), x.getTen(), x.getMoTa(), x.getSoLuong(), x.isTrangThai() ? "Còn hàng" : "Hết hàng"
                                };
                                tblModel.addRow(rowData);
                        }
                }
                lblSizeSP.setText(String.valueOf(this.tongTrangSP(limit)));
        }

        private void fillToTableSPCT(String ma, int pageIndex, int limit) {
                DefaultTableModel tblModel = (DefaultTableModel) tblSpct.getModel();
                tblModel.setRowCount(0);
                List<SanPhamChiTiet> list = spctDAO.paging(ma, (pageIndex - 1) * limit, limit);
                int stt = 0;
                for (SanPhamChiTiet x : list) {
                        stt++;
                        Object[] rowData = new Object[]{
                                stt, x.getMa(), x.getDanhMuc(), x.getXuatXu(), x.getNSX(), x.getMauSac(), x.getSize(), x.getThuongHieu(),
                                x.getChatLieu(), x.getDeGiay(), x.getCoGiay(), x.getGia(), x.getSoLuongTon(), x.getTrangThai().equalsIgnoreCase("0") ? "Còn hàng" : "Hết hàng"
                        };
                        tblModel.addRow(rowData);
                }
        }

        private void fillToTableThuocTinh(String tenBang) {
                int stt = 0;
                ThuocTinhDAO dao = new ThuocTinhDAO();
                DefaultTableModel tblModel = (DefaultTableModel) tblThuocTinh.getModel();
                tblModel.setRowCount(0);
                List<ThuocTinh> list = dao.select(tenBang);
                for (ThuocTinh x : list) {
                        stt++;
                        Object[] rowData = new Object[]{stt, x.getMa(), x.getTen()};
                        tblModel.addRow(rowData);
                }
        }

        private void fillComboBox(JComboBox cbo, String tenBang) {
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cbo.getModel();
                cboModel.removeAllElements();
                ThuocTinhDAO dao = new ThuocTinhDAO();
                List<ThuocTinh> list = dao.select(tenBang);
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
                fillComboBox(cboNSX, "Nha_San_Xuat");
                fillComboBox(cboFindDanhMuc, "Danh_Muc");
                fillComboBox(cboFindXuatXu, "Xuat_Xu");
                fillComboBox(cboFindNSX, "Nha_San_Xuat");
                fillComboBox(cboFindTenSP, "San_Pham");
                cboFindGia.setSelectedIndex(-1);
        }

        private SanPham readFormSP() {
                SanPham model = new SanPham();
                model.setMa(txtMaSP.getText());
                model.setTen(txtTenSP.getText());
                model.setMoTa(txtMoTa.getText());
                return model;
        }

        private boolean checkSPCT() {
                if (cboChatLieu.getSelectedIndex() == -1 || cboSize.getSelectedIndex() == -1 || cboDanhMuc.getSelectedIndex() == -1
                        || cboDeGiay.getSelectedIndex() == -1 || cboMauSac.getSelectedIndex() == -1 || cboThuongHieu.getSelectedIndex() == -1
                        || cboCoGiay.getSelectedIndex() == -1 || cboXuatXu.getSelectedIndex() == -1 || cboNSX.getSelectedIndex() == -1) {
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

        private boolean insertSPCT() {
                if (this.checkSPCT()) {
                        ThuocTinh sp = (ThuocTinh) cboTenSP.getSelectedItem();
                        int idSP = sp.getId();
                        int idChatLieu = thuocTinhDAO.getByName("Chat_Lieu", cboChatLieu.getSelectedItem().toString()).getId();
                        int idSize = thuocTinhDAO.getByName("Size", cboSize.getSelectedItem().toString()).getId();
                        int idDanhMuc = thuocTinhDAO.getByName("Danh_Muc", cboDanhMuc.getSelectedItem().toString()).getId();
                        int idDeGiay = thuocTinhDAO.getByName("De_Giay", cboDeGiay.getSelectedItem().toString()).getId();
                        int idMauSac = thuocTinhDAO.getByName("Mau_Sac", cboMauSac.getSelectedItem().toString()).getId();
                        int idThuongHieu = thuocTinhDAO.getByName("Thuong_Hieu", cboThuongHieu.getSelectedItem().toString()).getId();
                        int idCoGiay = thuocTinhDAO.getByName("Co_Giay", cboCoGiay.getSelectedItem().toString()).getId();
                        int idXuatXu = thuocTinhDAO.getByName("Xuat_Xu", cboXuatXu.getSelectedItem().toString()).getId();
                        int idNSX = thuocTinhDAO.getByName("Nha_San_Xuat", cboNSX.getSelectedItem().toString()).getId();
                        int soLuong = Integer.parseInt(txtSoLuong.getText());
                        double gia = Double.parseDouble(txtGia.getText());
                        try {
                                spctDAO.insertSPCT(idDanhMuc, idXuatXu, idNSX, idMauSac, idSize, idSP, idThuongHieu, idChatLieu, idDeGiay, idCoGiay, gia, soLuong);
                                DialogHelper.alert(this, "Thêm thành công!");
                                return true;
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Thêm thất bại!");
                                return false;
                        }
                }
                return false;
        }

        private ThuocTinh getThuocTinhByTen(String tenBang, String ten) {
                return thuocTinhDAO.getByName(tenBang, ten);
        }

        private void clearSP() {
                txtMaSP.setText("###");
                txtTenSP.setText("");
                txtMoTa.setText("");
        }

        private void clearSPCT() {
                cboChatLieu.setSelectedIndex(-1);
                cboCoGiay.setSelectedIndex(-1);
                cboDanhMuc.setSelectedIndex(-1);
                cboDeGiay.setSelectedIndex(-1);
                cboMauSac.setSelectedIndex(-1);
                cboTenSP.setSelectedIndex(-1);
                cboThuongHieu.setSelectedIndex(-1);
                cboXuatXu.setSelectedIndex(-1);
                cboSize.setSelectedIndex(-1);
                cboNSX.setSelectedIndex(-1);
                txtGia.setText("");
                txtSoLuong.setText("");
        }

        private void clearThuocTinh() {
                txtMaThuocTinh.setText("###");
                txtTenThuocTinh.setText("");
        }

        private void showDetailSP() {
                index = tblSanPham.getSelectedRow();
                ma = (String) tblSanPham.getValueAt(index, 1);
                SanPham model = spDAO.findByMa(ma);
                txtMaSP.setText(model.getMa());
                txtTenSP.setText(model.getTen());
                txtMoTa.setText(model.getMoTa());
        }

        private void showDetailSPCT() {
        }

        private void showDetailThuocTinh() {
                index = tblThuocTinh.getSelectedRow();
                String ten = (String) tblThuocTinh.getValueAt(index, 2);
                ThuocTinh model = null;
                if (rdoDanhMuc.isSelected()) {
                        model = this.getThuocTinhByTen("Danh_Muc", ten);
                }
                if (rdoChatLieu.isSelected()) {
                        model = this.getThuocTinhByTen("Chat_Lieu", ten);
                }
                if (rdoXuatXu.isSelected()) {
                        model = this.getThuocTinhByTen("Xuat_Xu", ten);
                }
                if (rdoNhaSanXuat.isSelected()) {
                        model = this.getThuocTinhByTen("Nha_San_Xuat", ten);
                }
                if (rdoMauSac.isSelected()) {
                        model = this.getThuocTinhByTen("Mau_Sac", ten);
                        System.out.println(ten);
                }
                if (rdoSize.isSelected()) {
                        System.out.println(ten);
                        model = this.getThuocTinhByTen("Size", ten);
                }
                if (rdoThuongHieu.isSelected()) {
                        model = this.getThuocTinhByTen("Thuong_Hieu", ten);
                }
                if (rdoDeGiay.isSelected()) {
                        model = this.getThuocTinhByTen("De_giay", ten);
                }
                if (rdoCoGiay.isSelected()) {
                        model = this.getThuocTinhByTen("Co_Giay", ten);
                }
                if (model != null) {
                        txtMaThuocTinh.setText(model.getMa());
                        txtTenThuocTinh.setText(model.getTen());
                }
        }

        private void insertThuocTinh() {
                String ma = txtMaThuocTinh.getText();
                String ten = txtTenThuocTinh.getText();
                ThuocTinh model = new ThuocTinh(ma, ten);
                if (this.checkDataThuocTinh()) {
                        if (rdoDanhMuc.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Danh_Muc", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Danh_Muc");
                        }
                        if (rdoChatLieu.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Chat_Lieu", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Chat_Lieu");
                        }
                        if (rdoXuatXu.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Xuat_Xu", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Xuat_Xu");
                        }
                        if (rdoNhaSanXuat.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Nha_San_Xuat", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Nha_San_Xuat");
                        }
                        if (rdoMauSac.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Mau_Sac", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Mau_Sac");
                        }
                        if (rdoSize.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Size", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Size");
                        }
                        if (rdoThuongHieu.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Thuong_Hieu", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Thuong_Hieu");
                        }
                        if (rdoDeGiay.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("De_Giay", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("De_Giay");
                        }
                        if (rdoCoGiay.isSelected()) {
                                try {
                                        thuocTinhDAO.insert("Co_Giay", model);
                                        DialogHelper.alert(this, "Thêm thành công!");
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                }
                                this.fillToTableThuocTinh("Co_Giay");
                        }
                }
        }

        private void insertSP() {
                if (this.checkDataSP()) {
                        if (spDAO.insert(this.readFormSP()) > 0) {
                                DialogHelper.alert(this, "Thêm thành công !!");
                                this.fillToTableSP(pageIndex, limit);
                                this.clearSP();
                        }
                }
        }

        private boolean checkDataSP() {
                if (txtTenSP.getText().isEmpty() || txtMoTa.getText().isEmpty()) {
                        DialogHelper.alert(this, "Vui lòng nhập đủ dữ liệu!");
                        return false;
                }
                return true;
        }

        private boolean checkDataThuocTinh() {
                String ma = txtMaThuocTinh.getText();
                String ten = txtTenThuocTinh.getText();
                if (ten.trim().isEmpty()) {
                        DialogHelper.alert(this, "Chưa nhập tên !!");
                        return false;
                }
                if (rdoDanhMuc.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Danh_Muc");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoChatLieu.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Chat_Lieu");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoXuatXu.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Xuat_Xu");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoNhaSanXuat.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Nha_San_Xuat");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoMauSac.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Mau_Sac");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoSize.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Size");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoThuongHieu.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Thuong_Hieu");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoDeGiay.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("De_Giay");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                if (rdoCoGiay.isSelected()) {
                        List<ThuocTinh> list = thuocTinhDAO.select("Co_Giay");
                        for (ThuocTinh x : list) {
                                if (ma.equals(x.getMa())) {
                                        DialogHelper.alert(this, "Mã đã tồn tại");
                                        return false;
                                }
                        }
                }
                return true;
        }

        private void updateSP() {
                if (this.checkDataSP()) {
                        if (DialogHelper.confirm(this, "Bạn có chắc muốn cập nhật không?")) {
                                try {
                                        spDAO.update(this.readFormSP());
                                        this.fillToTableSP(pageIndex, limit);
                                        DialogHelper.alert(this, "Cập nhật thành công");
                                } catch (Exception e) {
                                        DialogHelper.alert(this, "Cập nhật thất bại");
                                }
                        }
                }
        }

        private void deleteSP() {
                if (!txtMaSP.equals("###")) {
                        if (DialogHelper.confirm(this, "Bạn có chắc muốn xóa không?")) {
                                try {
                                        spDAO.delete(txtMaSP.getText());
                                        this.fillToTableSP(pageIndex, limit);
                                        DialogHelper.alert(this, "Xóa thành công !!");
                                } catch (Exception e) {
                                        DialogHelper.alert(this, "Xóa thất bại !!");
                                }
                        }
                }
        }

        private void updateThuocTinh() {
                ThuocTinh model = new ThuocTinh(txtMaThuocTinh.getText(), txtTenThuocTinh.getText());
                index = tblThuocTinh.getSelectedRow();
                String ten = (String) tblThuocTinh.getValueAt(index, 2);
                if (rdoDanhMuc.isSelected()) {
                        try {
                                thuocTinhDAO.update("Danh_Muc", thuocTinhDAO.getByName("Danh_Muc", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Danh_Muc");
                }
                if (rdoChatLieu.isSelected()) {
                        try {
                                thuocTinhDAO.update("Chat_Lieu", thuocTinhDAO.getByName("Chat_Lieu", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Chat_Lieu");
                }
                if (rdoXuatXu.isSelected()) {
                        try {
                                thuocTinhDAO.update("Xuat_Xu", thuocTinhDAO.getByName("Xuat_Xu", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Xuat_Xu");
                }
                if (rdoNhaSanXuat.isSelected()) {
                        try {
                                thuocTinhDAO.update("Nha_San_Xuat", thuocTinhDAO.getByName("Nha_San_Xuat", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Nha_San_Xuat");
                }
                if (rdoMauSac.isSelected()) {
                        try {
                                thuocTinhDAO.update("Mau_Sac", thuocTinhDAO.getByName("Mau_Sac", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Mau_Sac");
                }
                if (rdoSize.isSelected()) {
                        try {
                                thuocTinhDAO.update("Size", thuocTinhDAO.getByName("Size", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Size");
                }
                if (rdoThuongHieu.isSelected()) {
                        try {
                                thuocTinhDAO.update("Thuong_Hieu", thuocTinhDAO.getByName("Thuong_Hieu", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Thuong_Hieu");
                }
                if (rdoDeGiay.isSelected()) {
                        try {
                                thuocTinhDAO.update("De_Giay", thuocTinhDAO.getByName("De_Giay", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("De_Giay");
                }
                if (rdoCoGiay.isSelected()) {
                        try {
                                thuocTinhDAO.update("Co_Giay", thuocTinhDAO.getByName("Co_Giay", ten).getId(), model);
                                DialogHelper.alert(this, "Cập nhật thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Cập nhật thất bại!");
                        }
                        this.fillToTableThuocTinh("Co_Giay");
                }
                index = -1;
                this.clearThuocTinh();
        }

        private void deleteThuocTinh() {
                String ten = (String) tblThuocTinh.getValueAt(tblThuocTinh.getSelectedRow(), 2);
                if (rdoDanhMuc.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Danh_Muc", thuocTinhDAO.getByName("Danh_Muc", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Danh_Muc");
                }
                if (rdoChatLieu.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Chat_Lieu", thuocTinhDAO.getByName("Chat_Lieu", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Chat_Lieu");
                }
                if (rdoXuatXu.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Xuat_Xu", thuocTinhDAO.getByName("Xuat_Xu", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Xuat_Xu");
                }
                if (rdoNhaSanXuat.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Nha_San_Xuat", thuocTinhDAO.getByName("Nha_San_Xuat", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Nha_San_Xuat");
                }
                if (rdoMauSac.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Mau_Sac", thuocTinhDAO.getByName("Mau_Sac", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Mau_Sac");
                }
                if (rdoSize.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Size", thuocTinhDAO.getByName("Size", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Size");
                }
                if (rdoThuongHieu.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Thuong_Hieu", thuocTinhDAO.getByName("Thuong_Hieu", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Thuong_Hieu");
                }
                if (rdoDeGiay.isSelected()) {
                        try {
                                thuocTinhDAO.delete("De_Giay", thuocTinhDAO.getByName("De_Giay", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("De_Giay");
                }
                if (rdoCoGiay.isSelected()) {
                        try {
                                thuocTinhDAO.delete("Co_Giay", thuocTinhDAO.getByName("Co_Giay", ten).getId(), 1);
                                DialogHelper.alert(this, "Xóa thành công!");
                        } catch (Exception e) {
                                e.printStackTrace();
                                DialogHelper.alert(this, "Xóa thất bại!");
                        }
                        this.fillToTableThuocTinh("Co_Giay");
                }
                index = -1;
                this.clearThuocTinh();
        }

}
