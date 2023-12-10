package com.polyshoes.view.sanpham;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.polyshoes.dao.sanpham.HinhAnhDAO;
import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.dao.sanpham.ThuocTinhDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.polyshoes.model.sanpham.ThuocTinh;
import com.qrcode.QR_Code;
import static com.qrcode.TaiMaQR.maSPCT;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class SanPhamChiTietJPanel extends javax.swing.JPanel {

        SanPhamCTDAO dao = new SanPhamCTDAO();
        ThuocTinhDAO thuocTinhDao = new ThuocTinhDAO();
        int index = -1;
        int pageIndex = 1;
        int pageSize = 1;
        int limit = 5;
        public static String maSP = "%";
        private String findNsx = "%";
        private String findXuatXu = "%";
        private String findDanhMuc = "%";
        private boolean findGia = false; //  true: cao -> thấp, false: thấp -> cao

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
                pnlBoLoc = new com.polyshoes.component.BorderJPanel();
                cboFindDanhMuc = new com.polyshoes.component.Combobox();
                cboFindXuatXu = new com.polyshoes.component.Combobox();
                cboFindNSX = new com.polyshoes.component.Combobox();
                cboFindGia = new com.polyshoes.component.Combobox();
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
                btnXuatExcel = new com.polyshoes.swing.Button();
                btnOpenThem = new com.polyshoes.swing.Button();
                btnOpenQRCode = new com.polyshoes.swing.Button();
                btnTaiMaQR = new com.polyshoes.swing.Button();
                btnMoi = new com.polyshoes.swing.Button();
                chkAllSPCT = new com.polyshoes.swing.JCheckBoxCustom();
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
                btnThem = new com.polyshoes.swing.Button();
                btnQuayLai = new com.polyshoes.swing.Button();
                lblAnh = new javax.swing.JLabel();

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

                pnlBoLoc.setBackground(new java.awt.Color(255, 255, 255));
                pnlBoLoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                pnlBoLoc.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 55, 45));

                cboFindDanhMuc.setLabeText("Danh mục");
                cboFindDanhMuc.setPreferredSize(new java.awt.Dimension(200, 46));
                cboFindDanhMuc.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindDanhMucItemStateChanged(evt);
                        }
                });
                pnlBoLoc.add(cboFindDanhMuc);

                cboFindXuatXu.setLabeText("Xuất xứ");
                cboFindXuatXu.setPreferredSize(new java.awt.Dimension(200, 46));
                cboFindXuatXu.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindXuatXuItemStateChanged(evt);
                        }
                });
                pnlBoLoc.add(cboFindXuatXu);

                cboFindNSX.setLabeText("Nhà sản xuất");
                cboFindNSX.setPreferredSize(new java.awt.Dimension(200, 46));
                cboFindNSX.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindNSXItemStateChanged(evt);
                        }
                });
                pnlBoLoc.add(cboFindNSX);

                cboFindGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Thấp đến cao", "Cao đến thấp" }));
                cboFindGia.setLabeText("Giá");
                cboFindGia.setPreferredSize(new java.awt.Dimension(200, 46));
                cboFindGia.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                cboFindGiaItemStateChanged(evt);
                        }
                });
                pnlBoLoc.add(cboFindGia);

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

                btnXuatExcel.setBackground(new java.awt.Color(204, 255, 255));
                btnXuatExcel.setForeground(new java.awt.Color(51, 51, 255));
                btnXuatExcel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnXuatExcel.setLabel("Xuất excel");
                btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnXuatExcelActionPerformed(evt);
                        }
                });

                btnOpenThem.setBackground(new java.awt.Color(204, 255, 255));
                btnOpenThem.setForeground(new java.awt.Color(51, 51, 255));
                btnOpenThem.setText("Thêm mới");
                btnOpenThem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnOpenThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOpenThemActionPerformed(evt);
                        }
                });

                btnOpenQRCode.setBackground(new java.awt.Color(204, 255, 255));
                btnOpenQRCode.setForeground(new java.awt.Color(51, 51, 255));
                btnOpenQRCode.setText("Quét QR");
                btnOpenQRCode.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnOpenQRCode.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOpenQRCodeActionPerformed(evt);
                        }
                });

                btnTaiMaQR.setBackground(new java.awt.Color(204, 255, 255));
                btnTaiMaQR.setForeground(new java.awt.Color(51, 51, 255));
                btnTaiMaQR.setText("Tải mã QR");
                btnTaiMaQR.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnTaiMaQR.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTaiMaQRActionPerformed(evt);
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

                chkAllSPCT.setText("All");
                chkAllSPCT.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chkAllSPCTActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout pnlDanhSachSPCTLayout = new javax.swing.GroupLayout(pnlDanhSachSPCT);
                pnlDanhSachSPCT.setLayout(pnlDanhSachSPCTLayout);
                pnlDanhSachSPCTLayout.setHorizontalGroup(
                        pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlBoLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                                        .addComponent(jScrollPaneSpct)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addGroup(pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                                                .addGap(409, 409, 409)
                                                                .addComponent(lblTieuDe))
                                                        .addComponent(lblBoLoc, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(chkAllSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnOpenThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnOpenQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnTaiMaQR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                pnlDanhSachSPCTLayout.setVerticalGroup(
                        pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachSPCTLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDe)
                                .addGap(18, 18, 18)
                                .addComponent(lblBoLoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlBoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlDanhSachSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnOpenThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnOpenQRCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTaiMaQR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkAllSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPaneSpct, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
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

                lblTieuDe13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe13.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe13.setText("Tên sản phẩm");
                lblTieuDe13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnTenSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnTenSP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTenSPActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(220, Short.MAX_VALUE)
                                .addComponent(btnTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTieuDe13)
                                                .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 52, Short.MAX_VALUE)))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(66, Short.MAX_VALUE)
                                .addComponent(btnTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe13)
                                        .addGap(6, 6, 6)
                                        .addComponent(cboTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel2);

                jPanel3.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe15.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe15.setText("Danh mục");
                lblTieuDe15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDanhMucActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe15)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel3);

                jPanel4.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe17.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe17.setText("Thương hiệu");
                lblTieuDe17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnThuongHieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnThuongHieu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThuongHieuActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe17)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel4);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                lblXuatXu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblXuatXu.setForeground(new java.awt.Color(76, 76, 76));
                lblXuatXu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblXuatXu.setText("Xuất xứ");
                lblXuatXu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnXuatXu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnXuatXu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnXuatXuActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblXuatXu)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel1);

                jPanel9.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe25.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe25.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe25.setText("Nhà sản xuất");
                lblTieuDe25.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnNhaSanXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnNhaSanXuat.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNhaSanXuatActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe25)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel9);

                jPanel10.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe26.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe26.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe26.setText("Chất liệu");
                lblTieuDe26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnChatLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnChatLieu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnChatLieuActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe26)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel10);

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe19.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe19.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe19.setText("Đế giày");
                lblTieuDe19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnDeGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnDeGiay.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDeGiayActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe19)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel5);

                jPanel6.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe20.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe20.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe20.setText("Cổ giày");
                lblTieuDe20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnCoGiay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnCoGiay.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCoGiayActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe20)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnCoGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel6);

                jPanel8.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe24.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe24.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe24.setText("Size");
                lblTieuDe24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnSize.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSizeActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe24)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
                );

                pnlCboTong.add(jPanel8);

                jPanel7.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe23.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe23.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe23.setText("Màu sắc");
                lblTieuDe23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                btnMauSac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/add.png"))); // NOI18N
                btnMauSac.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMauSacActionPerformed(evt);
                        }
                });

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
                                        .addGap(0, 43, Short.MAX_VALUE)
                                        .addComponent(lblTieuDe23)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 44, Short.MAX_VALUE)))
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

                btnThem.setBackground(new java.awt.Color(153, 255, 255));
                btnThem.setForeground(new java.awt.Color(51, 51, 255));
                btnThem.setText("Thêm");
                btnThem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });

                btnQuayLai.setBackground(new java.awt.Color(153, 255, 255));
                btnQuayLai.setForeground(new java.awt.Color(51, 51, 255));
                btnQuayLai.setText("Quay lại");
                btnQuayLai.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnQuayLaiActionPerformed(evt);
                        }
                });

                lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblAnh.setText("Ảnh");
                lblAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                lblAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                lblAnh.setPreferredSize(new java.awt.Dimension(155, 155));
                lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lblAnhMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout pnlThemSPCTLayout = new javax.swing.GroupLayout(pnlThemSPCT);
                pnlThemSPCT.setLayout(pnlThemSPCTLayout);
                pnlThemSPCTLayout.setHorizontalGroup(
                        pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThemSPCTLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTieuDe1)
                                .addGap(380, 380, 380))
                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                .addGroup(pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                                .addComponent(pnlCboTong, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                .addGap(441, 441, 441)
                                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(460, Short.MAX_VALUE))
                );
                pnlThemSPCTLayout.setVerticalGroup(
                        pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlThemSPCTLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDe1)
                                .addGap(18, 18, 18)
                                .addComponent(pnlCboTong, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlThemSPCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );

                add(pnlThemSPCT, "card2");
        }// </editor-fold>//GEN-END:initComponents

        private void tblSPCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPCTMouseClicked
                if (evt.getClickCount() == 2) {
                        index = tblSPCT.getSelectedRow();
                        if (index >= 0) {
                                index = tblSPCT.getSelectedRow();
                                SanPhamChiTietJFrame.maSPCT = (String) tblSPCT.getValueAt(index, 1);
                                SanPhamChiTietJFrame frame = new SanPhamChiTietJFrame();
                                frame.setVisible(true);
                                frame.addWindowListener(new WindowAdapter() {
                                        @Override
                                        public void windowClosed(WindowEvent e) {
                                                fillToTable();
                                        }
                                });
                        }
                }
        }//GEN-LAST:event_tblSPCTMouseClicked

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
        }//GEN-LAST:event_pnlThemSPCTComponentShown

        private void btnFirstSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSpctActionPerformed
                pageIndex = 1;
                this.fillToTable();
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnFirstSpctActionPerformed

        private void btnPreviousSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousSpctActionPerformed
                if (pageIndex > 1) {
                        pageIndex--;
                } else {
                        pageIndex = 1;
                }
                this.fillToTable();
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnPreviousSpctActionPerformed

        private void btnNextSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSpctActionPerformed
                if (pageIndex < this.pageSize) {
                        pageIndex++;
                } else {
                        pageIndex = this.getPageSize();
                }
                this.fillToTable();
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnNextSpctActionPerformed

        private void btnEndSpctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndSpctActionPerformed
                pageIndex = pageSize;
                this.fillToTable();
                lblIndexSpct.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnEndSpctActionPerformed

        private void btnNhaSanXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaSanXuatActionPerformed
                fillThemTTNhanh(cboNhaSanXuat, "Nha_San_Xuat");
        }//GEN-LAST:event_btnNhaSanXuatActionPerformed

        private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
                fillThemTTNhanh(cboSize, "Size");
        }//GEN-LAST:event_btnSizeActionPerformed

        private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
                fillThemTTNhanh(cboDanhMuc, "Danh_Muc");
        }//GEN-LAST:event_btnDanhMucActionPerformed

        private void btnChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatLieuActionPerformed
                fillThemTTNhanh(cboChatLieu, "Chat_Lieu");
        }//GEN-LAST:event_btnChatLieuActionPerformed

        private void btnMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMauSacActionPerformed
                fillThemTTNhanh(cboMauSac, "Mau_Sac");
        }//GEN-LAST:event_btnMauSacActionPerformed

        private void btnThuongHieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuongHieuActionPerformed
                fillThemTTNhanh(cboThuongHieu, "Thuong_Hieu");
        }//GEN-LAST:event_btnThuongHieuActionPerformed

        private void btnDeGiayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeGiayActionPerformed
                fillThemTTNhanh(cboDeGiay, "De_Giay");
        }//GEN-LAST:event_btnDeGiayActionPerformed

        private void btnXuatXuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatXuActionPerformed
                fillThemTTNhanh(cboXuatXu, "Xuat_Xu");
        }//GEN-LAST:event_btnXuatXuActionPerformed

        private void btnCoGiayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoGiayActionPerformed
                fillThemTTNhanh(cboCoGiay, "Co_Giay");
        }//GEN-LAST:event_btnCoGiayActionPerformed

        private void btnTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenSPActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnTenSPActionPerformed

        private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                if (insert()) {
                        pnlDanhSachSPCT.setVisible(true);
                        pnlThemSPCT.setVisible(false);
                }
        }//GEN-LAST:event_btnThemActionPerformed

        private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
                pnlDanhSachSPCT.setVisible(true);
                pnlThemSPCT.setVisible(false);
        }//GEN-LAST:event_btnQuayLaiActionPerformed

        private void btnOpenThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenThemActionPerformed
                this.openInsert();
        }//GEN-LAST:event_btnOpenThemActionPerformed

        private void btnOpenQRCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenQRCodeActionPerformed
                new QR_Code().setVisible(true);
        }//GEN-LAST:event_btnOpenQRCodeActionPerformed

        private void btnTaiMaQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiMaQRActionPerformed
                taiNhieuQR();
        }//GEN-LAST:event_btnTaiMaQRActionPerformed

        private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
                this.clear();
                maSP = "%";
                fillToTable();
        }//GEN-LAST:event_btnMoiActionPerformed

        private void chkAllSPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAllSPCTActionPerformed
                chonAll();
        }//GEN-LAST:event_chkAllSPCTActionPerformed

        private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
                xuatFile();
        }//GEN-LAST:event_btnXuatExcelActionPerformed

        private void cboFindDanhMucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindDanhMucItemStateChanged
                if (cboFindDanhMuc.getSelectedIndex() >= 0) {
                        findDanhMuc = cboFindDanhMuc.getSelectedItem().toString();
                        locSPCT();
                } else {
                        findDanhMuc = "%";
                        fillToTable();
                }
        }//GEN-LAST:event_cboFindDanhMucItemStateChanged

        private void cboFindXuatXuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindXuatXuItemStateChanged
                if (cboFindXuatXu.getSelectedIndex() >= 0) {
                        findXuatXu = cboFindXuatXu.getSelectedItem().toString();
                        locSPCT();
                } else {
                        findXuatXu = "%";
                        fillToTable();
                }
        }//GEN-LAST:event_cboFindXuatXuItemStateChanged

        private void cboFindNSXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindNSXItemStateChanged
                if (cboFindNSX.getSelectedIndex() >= 0) {
                        findNsx = cboFindNSX.getSelectedItem().toString();
                        locSPCT();
                } else {
                        findNsx = "%";
                        fillToTable();
                }
        }//GEN-LAST:event_cboFindNSXItemStateChanged

        private void cboFindGiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindGiaItemStateChanged
                if (cboFindGia.getSelectedIndex() >= 0) {
                        findGia = cboFindGia.getSelectedIndex() == 1;
                        locSPCT();
                }
        }//GEN-LAST:event_cboFindGiaItemStateChanged

        private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
                getURLAnh();
        }//GEN-LAST:event_lblAnhMouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnChatLieu;
        private com.polyshoes.swing.Button btnCoGiay;
        private com.polyshoes.swing.Button btnDanhMuc;
        private com.polyshoes.swing.Button btnDeGiay;
        private com.polyshoes.swing.Button btnEndSpct;
        private com.polyshoes.swing.Button btnFirstSpct;
        private com.polyshoes.swing.Button btnMauSac;
        private com.polyshoes.swing.Button btnMoi;
        private com.polyshoes.swing.Button btnNextSpct;
        private com.polyshoes.swing.Button btnNhaSanXuat;
        private com.polyshoes.swing.Button btnOpenQRCode;
        private com.polyshoes.swing.Button btnOpenThem;
        private com.polyshoes.swing.Button btnPreviousSpct;
        private com.polyshoes.swing.Button btnQuayLai;
        private com.polyshoes.swing.Button btnSize;
        private com.polyshoes.swing.Button btnTaiMaQR;
        private com.polyshoes.swing.Button btnTenSP;
        private com.polyshoes.swing.Button btnThem;
        private com.polyshoes.swing.Button btnThuongHieu;
        private com.polyshoes.swing.Button btnXuatExcel;
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
        private com.polyshoes.swing.JCheckBoxCustom chkAllSPCT;
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
        private javax.swing.JLabel lblAnh;
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
        private javax.swing.JLabel lblXuatXu;
        private com.polyshoes.component.BorderJPanel pnlBoLoc;
        private javax.swing.JPanel pnlButton;
        private javax.swing.JPanel pnlCboTong;
        private javax.swing.JPanel pnlDanhSachSPCT;
        private javax.swing.JPanel pnlThemSPCT;
        private com.polyshoes.swing.table.Table tblSPCT;
        private com.polyshoes.swing.TextField txtGia;
        private com.polyshoes.swing.TextField txtSoLuong;
        // End of variables declaration//GEN-END:variables

        private void init() {
                tblSPCT.fixTable(jScrollPaneSpct);
                this.fillComboBoxSPCT();
                this.fillToTable();
                int tongTrang = tongTrangSPCT();
                lblSizeSpct.setText(String.valueOf(tongTrang));
        }

        private void fillComboBox(JComboBox cbo, String tenBang) {
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cbo.getModel();
                cboModel.removeAllElements();
                List<ThuocTinh> list = thuocTinhDao.select(tenBang);
                for (ThuocTinh x : list) {
                        cboModel.addElement(x);
                }
                if (cbo.getItemCount() > 0) {
                        cbo.setSelectedIndex(0);
                }
                AutoCompleteDecorator.decorate(cbo);
        }

        private void fillThemTTNhanh(JComboBox cbo, String tenBang) {
                ThuocTinhJFrame.tenBang = tenBang;
                ThuocTinhJFrame thuocTinh = new ThuocTinhJFrame();
                thuocTinh.setVisible(true);
                thuocTinh.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                                fillComboBox(cbo, tenBang);
                        }
                });
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
                cboFindDanhMuc.setSelectedIndex(-1);
                cboFindXuatXu.setSelectedIndex(-1);
                cboFindNSX.setSelectedIndex(-1);
                cboFindGia.setSelectedIndex(-1);
        }

        private int tongTrangSPCT() {
                int tongBanGhi = dao.selectAll(0, 1000).size();
                int tongTrang = (int) Math.ceil((double) tongBanGhi / limit);
                return tongTrang;
        }

        private void fillToTable() {
                DefaultTableModel tblModel = (DefaultTableModel) tblSPCT.getModel();
                tblModel.setRowCount(0);
                List<SanPhamChiTiet> list = dao.selectDeleted(maSP, 0, (pageIndex - 1) * limit, limit);
                if (list != null) {
                        for (SanPhamChiTiet x : list) {
                                tblModel.addRow(x.toDataRow());
                        }
                }
                lblSizeSpct.setText(String.valueOf(getPageSize()));
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
                if (DialogHelper.confirm(this, "Bạn có chắc muốn thêm không?")) {
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
                                        dao.insert(idDanhMuc, idXuatXu, idNSX, idMauSac, idSize, idSP, idThuongHieu, idChatLieu, idDeGiay, idCoGiay, ma, gia, soLuong);
                                        
                                        DialogHelper.alert(this, "Thêm thành công!");
                                        this.fillToTable();
                                        return true;
                                } catch (Exception e) {
                                        e.printStackTrace();
                                        DialogHelper.alert(this, "Thêm thất bại!");
                                        return false;
                                }
                        }
                }
                return false;
        }

        private void taiNhieuQR() {
                JFileChooser jfc = new JFileChooser("D:\\Tai_Ve_DuAn1");
                jfc.setDialogTitle("Save QR");
                DefaultTableModel tblModel = (DefaultTableModel) tblSPCT.getModel();
                int noiLuu = jfc.showSaveDialog(null);
                boolean bienTam = false;
                if (noiLuu == JFileChooser.APPROVE_OPTION) {
                        for (int i = 0; i < tblModel.getRowCount(); i++) {
                                boolean rowChoose = (boolean) tblSPCT.getValueAt(i, 14);
                                maSPCT = (String) tblSPCT.getValueAt(i, 1);
                                if (rowChoose) {
                                        try {
                                                String maSPCT = tblSPCT.getValueAt(i, 1).toString();
                                                if (rowChoose == true) {
                                                        bienTam = genMaQR(jfc.getSelectedFile() + (maSPCT + ".PNG"));
                                                }
                                        } catch (IOException e) {
                                                System.out.print(e);
                                        }
                                }
                        }
                        if (bienTam) {
                                DialogHelper.alert(this, "Lưu mã thành công!");
                        } else {
                                DialogHelper.alert(this, "Lưu mã thất bại");
                        }
                }
        }

        public boolean genMaQR(String path) throws IOException {
                try {
                        QRCodeWriter qrCodeWriter = new QRCodeWriter();
                        BitMatrix bitMatrix = qrCodeWriter.encode(maSPCT, BarcodeFormat.QR_CODE, 300, 300);
                        BufferedImage bufferedImage = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
                        Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();
                        graphics.setColor(Color.WHITE);
                        graphics.fillRect(0, 0, 300, 300);
                        graphics.setColor(Color.BLACK);
                        for (int i = 0; i < 300; i++) {
                                for (int j = 0; j < 300; j++) {
                                        if (bitMatrix.get(i, j)) {
                                                graphics.fillRect(i, j, 1, 1);
                                        }
                                }
                        }
                        ImageIO.write(bufferedImage, "png", new File(path));
                } catch (WriterException e) {
                        System.out.println(e);
                        return false;
                }
                return true;
        }

        private void xuatFile() {
                FileOutputStream execlFOS = null;
                BufferedOutputStream excelBOS = null;
                XSSFWorkbook excelJTableExporter = null;
                JFileChooser noiSave = new JFileChooser("D:\\Tai_Ve_DuAn1");
                noiSave.setDialogTitle("Save As");
                FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
                noiSave.setFileFilter(fnef);
                int excelChooser = noiSave.showSaveDialog(null);
                DefaultTableModel tblModel = (DefaultTableModel) tblSPCT.getModel();
                if (excelChooser == JFileChooser.APPROVE_OPTION) {
                        try {
                                excelJTableExporter = new XSSFWorkbook();
                                XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
                                for (int i = 0; i < tblModel.getRowCount(); i++) {
                                        XSSFRow column = excelSheet.createRow(0);
                                        XSSFRow row = excelSheet.createRow(i + 1);
                                        for (int j = 0; j < tblModel.getColumnCount() - 1; j++) {
                                                XSSFCell excelCell = row.createCell(j);
                                                XSSFCell nameColumn = column.createCell(j);
                                                nameColumn.setCellValue(tblModel.getColumnName(j));
                                                excelCell.setCellValue(tblModel.getValueAt(i, j).toString());
                                        }
                                }
                                execlFOS = new FileOutputStream(noiSave.getSelectedFile() + ".xlsx");
                                excelBOS = new BufferedOutputStream(execlFOS);
                                excelJTableExporter.write(excelBOS);
                                DialogHelper.alert(null, "Lưu file thành công");
                        } catch (FileNotFoundException ex) {
                                ex.printStackTrace();
                        } catch (IOException ex) {
                                ex.printStackTrace();
                        } finally {
                                try {
                                        if (excelBOS != null) {
                                                excelBOS.close();
                                        }
                                        if (execlFOS != null) {
                                                execlFOS.close();
                                        }
                                        if (excelJTableExporter != null) {
                                                excelJTableExporter.close();
                                        }
                                } catch (IOException ex) {
                                        ex.printStackTrace();
                                }
                        }
                }
        }

        private int getPageSize() {
                int tongChuaXoa = dao.selectDeleted(maSP, 0, 0, 1000) == null ? 1 : dao.selectDeleted(maSP, 0, 0, 100).size();
                int tongTrang = (int) Math.ceil((double) tongChuaXoa / limit);
                pageSize = tongTrang;
                return pageSize;
        }

        private void locSPCT() {
                List<SanPhamChiTiet> list = dao.locSPCT("%", findDanhMuc, findXuatXu, findNsx, findGia);
                DefaultTableModel tblModel = (DefaultTableModel) tblSPCT.getModel();
                tblModel.setRowCount(0);
                DecimalFormat df = new DecimalFormat("#,##0 VND");
                int stt = 0;
                for (SanPhamChiTiet x : list) {
                        stt++;
                        Object[] rowData = new Object[]{
                                stt, x.getMa(), x.getDanhMuc(), x.getXuatXu(), x.getNsx(), x.getMauSac(), x.getSize(), x.getThuongHieu(), x.getChatLieu(),
                                x.getDeGiay(), x.getCoGiay(), df.format(x.getGia()), x.getSoLuongTon(), x.getTrangThai().equals("0") ? "Còn hàng" : "Hết hàng"
                        };
                        tblModel.addRow(rowData);
                }
                pageSize = (int) Math.ceil((double) list.size() / limit);
                lblSizeSpct.setText(String.valueOf(pageSize));
        }

        private void chonAll() {
                boolean selected = chkAllSPCT.isSelected();
                for (int row = 0; row < tblSPCT.getRowCount(); row++) {
                        tblSPCT.setValueAt(selected, row, 14);
                }
        }

        private String urlAnh;
        private void getURLAnh() {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                        urlAnh = fileChooser.getSelectedFile().getAbsolutePath();
                        ImageIcon icon = new ImageIcon(urlAnh);
                        lblAnh.setIcon(icon);
                        lblAnh.setText("");
                        System.out.println(urlAnh);
                }
        }
        
        private void insertAnh(int idSPCT) {
                if(urlAnh != null) {
                        HinhAnhDAO dao = new HinhAnhDAO();
                        if(dao.insert(idSPCT, urlAnh) == 0) {
                                DialogHelper.alert(this, "Lỗi hình ảnh!");
                        }
                }
        }
}
