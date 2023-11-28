/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.banhang;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.polyshoes.dao.HoaDon.HoaDonChiTietDao;
import com.polyshoes.dao.HoaDon.HoaDonDao;
import com.polyshoes.dao.banhang.BanHangDao;
import com.polyshoes.dao.sanpham.SanPhamCTDAO;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import com.polyshoes.model.banhang.BanHang;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import com.polyshoes.view.HoaDon.PrintHoaDon2;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vu Hieu
 */
public class BanHang1JPanel1 extends javax.swing.JPanel implements Runnable, ThreadFactory {

    /**
     * Creates new form BanHang1JPanel
     */
    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    SanPhamCTDAO spctdao = new SanPhamCTDAO();
    BanHangDao bhdao = new BanHangDao();
    DefaultTableModel model = new DefaultTableModel();
    HoaDonDao hddao = new HoaDonDao();
    HoaDonChiTietDao hdctdao = new HoaDonChiTietDao();

    public BanHang1JPanel1() {
        initComponents();
        initWebcam();
        this.fillSP();
        this.fillHD();
    }

    private void initWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0); //0 is default webcam
        webcam.setViewSize(size);

        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);

        QuetQrSanPham.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 23, 225, 145));

        executor.execute(this);
    }

    @Override
    public void run() {

        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
                //No result...
            }

            if (result != null) {

            }
        } while (true);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }

    void fillSP() {
        model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);
        List<BanHang> ListBH = bhdao.selectAll2();
        for (BanHang x : ListBH) {
            model.addRow(x.toDataRow());
        }
    }

    void fillHD() {
        model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        int count = 1;
        List<BanHang> ListBH = bhdao.selectHD1();
        for (BanHang x : ListBH) {
            Object[] row = {count, x.getMaHD(), x.getNgayTao(), x.getTenNhanVien(), x.getTrangThai() == 0 ? "Chưa thanh toán" : "Đã thanh toán"};
            model.addRow(row);
            count++;
        }
    }

    void setFormMaHDTenMV() {

        int row = tblHD.getSelectedRow();
        String maHD = (String) tblHD.getValueAt(row, 1);

        String tenNV = (String) tblHD.getValueAt(row, 3);
        txtMaHD.setText(maHD);
        txtTenNV.setText(tenNV);
    }

    int insertedCount = 0; // Biến đếm số lượng hóa đơn đã được insert

// Hàm kiểm tra và thêm hóa đơn
    public void insertHD() {
        HoaDon hd = new HoaDon();
        if (insertedCount < 5) {
            // Thực hiện thêm hóa đơn
            hddao.insert(hd);
            fillHD();
            txtMaHD.setText(hd.getMaHD());
            txtTenNV.setText("Vũ Quỳnh Trang");
            JOptionPane.showMessageDialog(this, "Tạo hóa đơn thành công");

            insertedCount++; // Tăng biến đếm sau mỗi lần insert thành công
        } else {
            JOptionPane.showMessageDialog(this, "Chỉ được thêm tối đa 5 hóa đơn chờ");
        }
    }

    void getForm() {

    }

    void setForm() {

        txtThanhToan.setText(txtTongTien.getText());
        txtGiamgiaKM.setText(String.valueOf(0));
        lblChuyenChu.setText(convertToWords(Double.parseDouble(txtTongTien.getText())));

    }

    void fillGH() {
        double tongTien = 0.0; // Biến tích luỹ tổng tiền
        int selecctRow = tblHD.getSelectedRow();
        String maHD = tblHD.getValueAt(selecctRow, 1).toString();
        model = (DefaultTableModel) tblGH.getModel();
        model.setRowCount(0);
        List<HoaDonChiTiet> ListBH = hdctdao.selectHDCTtheoHD(maHD);
        for (HoaDonChiTiet x : ListBH) {
            Object[] row = {x.getMaSPCT(), x.getTenSp(), x.getDonGia(), x.getSoLuong(), 0, x.getTongTien()};
            model.addRow(row);
            tongTien += x.getTongTien(); // Cộng tổng tiền sản phẩm vào tổng tiền

            // Cập nhật tổng tiền dòng cuối cùng trong bảng
        }
        txtTongTien.setText(String.valueOf(tongTien));

    }

//    void fillGHtheomaHD(List<HoaDonChiTiet> ListBH) {
//        model = (DefaultTableModel) tblGH.getModel();
//        model.setRowCount(0);
//        ListBH = hdctdao.selectAll();
//        for (HoaDonChiTiet x : ListBH) {
//            Object[] row = {x.getMaSPCT(), x.getTenSp(), x.getDonGia(), x.getSoLuong(), 0, x.getTongTien()};
//            model.addRow(row);
//
//        }
//
//    }
    void insertSPCTtoHDCT() {
        int row = tblSP.getSelectedRow();

        int rowHD = tblHD.getSelectedRow();
        if (rowHD < 0) {
            JOptionPane.showMessageDialog(this, "Bạn phải chọn hóa đơn để thêm!");
            return;
        }
        String maSPCT = (String) tblSP.getValueAt(row, 0);

        SanPhamChiTiet spct = spctdao.getByMa(maSPCT);
        String slString = JOptionPane.showInputDialog("Mời nhập số lượng");
        if (slString == null) {
            return;
        }
        if (!slString.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Sai kiểu dữ liệu");
            return;
        }
        int sl = Integer.valueOf(slString);
        if (sl > spct.getSoLuongTon()) {
            JOptionPane.showMessageDialog(null, "Không dủ số lượng sản phẩm");
            return;
        }

        insertDHCT(sl);

    }

    void suaSoLuong() {
        int row = tblSP.getSelectedRow();
        String maSPCT = (String) tblSP.getValueAt(row, 0);
        SanPhamChiTiet spct = spctdao.getByMaSPCT(maSPCT);

        int row2 = tblGH.getSelectedRow();
        String maSP = (String) tblGH.getValueAt(row2, 0);
        String soLuong = (String) tblGH.getValueAt(row2, 3);
        HoaDonChiTiet hdct = hdctdao.selectHDCTtheoMaSP(maSP);
        int sl = Integer.parseInt(soLuong);

        hdctdao.UpdateSoLuongHDCT(sl, hdct.getIDSPchitiet());

        spct.setSoLuongTon(spct.getSoLuongTon() - sl);
        spctdao.UpdateSoLuong(sl, maSPCT);

    }
    private static final String[] ones = {
        "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười", "mười một", "mười hai",
        "mười ba", "mười bốn", "mười năm", "mười sáu", "mười bảy", "mười tám", "mười chín"
    };

    private static final String[] tens = {
        "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
    };

    private static final String[] groups = {
        "", "nghìn", "triệu", "tỷ"
    };

    public static String convertToWords(double amount) {
        long roundedAmount = Math.round(amount);
        String amountStr = String.valueOf(roundedAmount);
        String[] parts = amountStr.split("\\.");

        StringBuilder result = new StringBuilder();

        // Xử lý phần nguyên
        long integerPart = Long.parseLong(parts[0]);
        int groupIndex = 0;
        boolean hasNonZeroGroup = false;

        if (integerPart == 0) {
            result.append("không đồng");
        } else {
            while (integerPart > 0) {
                int hundreds = (int) (integerPart % 1000);
                if (hundreds > 0) {
                    String groupWords = convertGroupToWords(hundreds);
                    result.insert(0, groupWords + " " + groups[groupIndex] + " ");
                    hasNonZeroGroup = true;
                }
                integerPart /= 1000;
                groupIndex++;
            }
            if (!hasNonZeroGroup) {
                result.insert(0, "không đồng");
            }
        }

        // Xử lý phần thập phân (nếu có)
        if (parts.length > 1) {
            long decimalPart = Long.parseLong(parts[1]);
            if (decimalPart > 0) {
                String decimalWords = convertGroupToWords(decimalPart);
                result.append("phẩy ").append(decimalWords);
            }
        }

        return result.toString().trim();
    }

    private static String convertGroupToWords(long number) {
        StringBuilder groupWords = new StringBuilder();

        int hundreds = (int) (number / 100);
        int tensAndOnes = (int) (number % 100);

        if (hundreds > 0) {
            groupWords.append(ones[hundreds]).append(" trăm ");
        }

        if (tensAndOnes > 0) {
            if (tensAndOnes < 20) {
                groupWords.append(ones[tensAndOnes]);
            } else {
                int tensDigit = tensAndOnes / 10;
                int onesDigit = tensAndOnes % 10;
                groupWords.append(tens[tensDigit]);
                if (onesDigit > 0) {
                    groupWords.append(" ").append(ones[onesDigit]);
                }
            }
        }

        return groupWords.toString().trim();
    }

    public void insertDHCT(int sl) {
        HoaDonChiTiet hdct = new HoaDonChiTiet();

        int row = tblSP.getSelectedRow();
        String maSPCT = (String) tblSP.getValueAt(row, 0);
        SanPhamChiTiet spct = spctdao.getByMaSPCT(maSPCT);
        hdct.setIDSPchitiet(spct.getId());

        int row2 = tblHD.getSelectedRow();
        String maHD = (String) tblHD.getValueAt(row2, 1);
        HoaDon hd = (HoaDon) hddao.selectByHD1(maHD);

        hdct.setSoLuong(sl);

        hdct.setDonGia(spct.getGia());
        hdct.setIDHoaDon(hd.getID());
        Double tongtien = hdct.getTongTien();
        tongtien = sl * spct.getGia();
        hdct.setTongTien(tongtien);
        try {
            hdctdao.insert(hdct);
            this.fillHD();
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm vào giỏ hàng thành công");

            spct.setSoLuongTon(spct.getSoLuongTon() - sl);
            spctdao.UpdateSoLuong(sl, maSPCT);
            this.fillSP();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm vào giỏ hàng thất bại");
        }

    }

    void thanhToan() {

        int row = tblHD.getSelectedRow();
        String maHD = (String) tblHD.getValueAt(row, 1);
        HoaDon hd = (HoaDon) hddao.selectByHD1(maHD);

        try {
            hddao.update(maHD);
            this.fillHD();
            JOptionPane.showMessageDialog(this, "Thanh Toán Thanh Công");
            int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn xuất hóa đơn không");
            if (chon == JOptionPane.YES_OPTION) {
                String mahd = (String) tblHD.getValueAt(tblHD.getSelectedRow(), 1);
                PrintHoaDon2 frame2 = new PrintHoaDon2(mahd);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thanh Toán Thất bại");
        }
    }

    void clear() {
        txtTenNV.setText("");
        txtMaHD.setText("");
        txtTongTien.setText("");
        txtThanhToan.setText("");
        lblChuyenChu.setText("");
        txtTienKhachdua.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        rdoAll = new javax.swing.JRadioButton();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        rdoChoThanhToan = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        QuetQrSanPham = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKhach = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        txtMaHD = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtGiamgiaKM = new javax.swing.JTextField();
        txtThanhToan = new javax.swing.JTextField();
        txtTienKhachdua = new javax.swing.JTextField();
        txtTienKhachchuyenKhoan = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblChuyenChu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnXoaGH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGH = new com.polyshoes.swing.table.Table();
        jPanel9 = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSP = new com.polyshoes.swing.table.Table();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        cboHang = new javax.swing.JComboBox<>();
        cboMauSac = new javax.swing.JComboBox<>();
        cboSize = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("QUẢN LÝ BÁN HÀNG ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/chuong.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 35));

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/xoa.png"))); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        rdoAll.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoAll);
        rdoAll.setText("Tất cả");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });
        jPanel1.add(rdoAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        rdoDaThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoDaThanhToan);
        rdoDaThanhToan.setText("Đã thanh toán ");
        rdoDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaThanhToanActionPerformed(evt);
            }
        });
        jPanel1.add(rdoDaThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        rdoChoThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoChoThanhToan);
        rdoChoThanhToan.setText("Chờ thanh toán ");
        rdoChoThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChoThanhToanActionPerformed(evt);
            }
        });
        jPanel1.add(rdoChoThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Ma HĐ", "Ngày Tạo", "Nhân Viên", "TrangThai"
            }
        ));
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblHD);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, 100));

        QuetQrSanPham.setBackground(new java.awt.Color(255, 255, 255));
        QuetQrSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quét mã vạch sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        QuetQrSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuetQrSanPhamMouseClicked(evt);
            }
        });
        QuetQrSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn hàng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Mã KH:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 28, -1, -1));

        jLabel4.setText("Tên KH:");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtMaKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaKH.setForeground(new java.awt.Color(0, 153, 255));
        txtMaKH.setText("KH000");
        jPanel6.add(txtMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 25, 192, -1));

        txtTenKhach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTenKhach.setForeground(new java.awt.Color(0, 153, 255));
        txtTenKhach.setText("Khách lẻ");
        jPanel6.add(txtTenKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 192, -1));

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/click.png"))); // NOI18N
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Mã hóa đơn: ");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel9.setText("Tên nhân viên:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel10.setText("Tổng tiền:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel11.setText("Giảm giá KM:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel13.setText("Thanh toán:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel14.setText("Bằng chữ:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel15.setText("Hình thức thanh toán: ");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel16.setText("Tiền khách đưa:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel17.setText("Tiền khách chuyển khoản:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel18.setText("Tiền thừa:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/xoa.png"))); // NOI18N
        jButton5.setText("LÀM MỚI");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, -1));

        btnThanhToan.setBackground(new java.awt.Color(51, 255, 255));
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/pay (2).png"))); // NOI18N
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });
        jPanel7.add(btnThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        txtMaHD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaHD.setForeground(new java.awt.Color(0, 153, 255));
        txtMaHD.setBorder(null);
        jPanel7.add(txtMaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 230, -1));

        txtTenNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTenNV.setForeground(new java.awt.Color(0, 153, 255));
        txtTenNV.setBorder(null);
        jPanel7.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 230, -1));

        txtTongTien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(0, 153, 255));
        txtTongTien.setBorder(null);
        jPanel7.add(txtTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 230, -1));

        txtGiamgiaKM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGiamgiaKM.setForeground(new java.awt.Color(0, 153, 255));
        txtGiamgiaKM.setBorder(null);
        jPanel7.add(txtGiamgiaKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 230, -1));

        txtThanhToan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtThanhToan.setForeground(new java.awt.Color(0, 153, 255));
        txtThanhToan.setBorder(null);
        jPanel7.add(txtThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, -1));

        txtTienKhachdua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTienKhachdua.setForeground(new java.awt.Color(0, 153, 255));
        txtTienKhachdua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachduaKeyReleased(evt);
            }
        });
        jPanel7.add(txtTienKhachdua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 180, -1));

        txtTienKhachchuyenKhoan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTienKhachchuyenKhoan.setForeground(new java.awt.Color(0, 153, 255));
        txtTienKhachchuyenKhoan.setToolTipText("");
        txtTienKhachchuyenKhoan.setEnabled(false);
        jPanel7.add(txtTienKhachchuyenKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 180, -1));

        txtTienThua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTienThua.setForeground(new java.awt.Color(0, 153, 255));
        txtTienThua.setEnabled(false);
        jPanel7.add(txtTienThua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 180, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản", "Tiền mặt & chuyển khoản" }));
        jPanel7.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 180, -1));

        lblChuyenChu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblChuyenChu.setForeground(new java.awt.Color(255, 0, 0));
        jPanel7.add(lblChuyenChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 260, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tại quầy", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Đặt hàng", jPanel5);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnXoaGH.setBackground(new java.awt.Color(51, 255, 255));
        btnXoaGH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/thungrac.png"))); // NOI18N
        jPanel8.add(btnXoaGH, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 65, -1, -1));

        tblGH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Đơn giá", "Số lượng", "Giảm giá ", "Thành tiền "
            }
        ));
        tblGH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblGHMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblGH);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 26, 717, 117));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFind.setBorder(null);
        jPanel9.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 20));

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ma SPCT", "Tên SP", "Màu sắc", "Size", "Hãng", "SL tồn", "Giá "
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSP);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 68, 798, 236));

        jLabel5.setText("Hãng:");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 30));

        jLabel6.setText("Màu sắc:");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 30));

        jLabel7.setText("Size:");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/rsz_2989542.png"))); // NOI18N
        jButton3.setBorder(null);
        jPanel9.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 40, 40));

        cboHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Adidas" }));
        jPanel9.add(cboHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 90, 30));

        cboMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Vàng ", "Đen", "Trắng" }));
        jPanel9.add(cboMauSac, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 90, 30));

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "35" }));
        jPanel9.add(cboSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1258, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(504, 504, 504)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(QuetQrSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(QuetQrSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        this.fillHD();
    }//GEN-LAST:event_rdoAllActionPerformed

    private void rdoDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaThanhToanActionPerformed
        model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        int count = 1;
        List<BanHang> ListBH = bhdao.selectDaThanhToan();
        for (BanHang x : ListBH) {
            Object[] row = {count, x.getMaHD(), x.getNgayTao(), x.getTenNhanVien(), x.getTrangThai() == 0 ? "Chưa thanh toán" : "Đã thanh toán"};
            model.addRow(row);
            count++;
        }
    }//GEN-LAST:event_rdoDaThanhToanActionPerformed

    private void rdoChoThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChoThanhToanActionPerformed
        model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        int count = 1;
        List<BanHang> ListBH = bhdao.selectChuaThanhToan();
        for (BanHang x : ListBH) {
            Object[] row = {count, x.getMaHD(), x.getNgayTao(), x.getTenNhanVien(), x.getTrangThai() == 0 ? "Chưa thanh toán" : "Đã thanh toán"};
            model.addRow(row);
            count++;
        }
    }//GEN-LAST:event_rdoChoThanhToanActionPerformed

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
//        this.insertHD();
//       
        this.insertSPCTtoHDCT();
////        this.fillHD();
////        tblHD.setRowSelectionInterval(0,0);
////        String input = JOptionPane.showInputDialog("Nhập số lượng sản phẩm");
////        int soluong = Integer.parseInt(input);
////        
////        this.fillGH();

    }//GEN-LAST:event_tblSPMouseClicked

    private void QuetQrSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuetQrSanPhamMouseClicked
        webcam.close();
    }//GEN-LAST:event_QuetQrSanPhamMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertHD();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseClicked
        setFormMaHDTenMV();

        fillGH();
        setForm();
    }//GEN-LAST:event_tblHDMouseClicked

    private void tblGHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGHMouseEntered

    }//GEN-LAST:event_tblGHMouseEntered

    private void tblGHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGHMouseClicked
        suaSoLuong();
    }//GEN-LAST:event_tblGHMouseClicked

    private void txtTienKhachduaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachduaKeyReleased
        double tienKhachdua = Double.parseDouble(txtTienKhachdua.getText());
        double thanhToan = Double.parseDouble(txtThanhToan.getText());

        txtTienKhachchuyenKhoan.setText((String.valueOf(thanhToan - tienKhachdua)));
        if (tienKhachdua > thanhToan) {
            txtTienKhachchuyenKhoan.setText("");
            txtTienThua.setText(String.valueOf(tienKhachdua - thanhToan));

        } else {
            txtTienKhachchuyenKhoan.setText("");
            txtTienThua.setText("");
        }
    }//GEN-LAST:event_txtTienKhachduaKeyReleased

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        thanhToan();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clear();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QuetQrSanPham;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnXoaGH;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboHang;
    private javax.swing.JComboBox<String> cboMauSac;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblChuyenChu;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoChoThanhToan;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private com.polyshoes.swing.table.Table tblGH;
    private javax.swing.JTable tblHD;
    private com.polyshoes.swing.table.Table tblSP;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtGiamgiaKM;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtTenKhach;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtThanhToan;
    private javax.swing.JTextField txtTienKhachchuyenKhoan;
    private javax.swing.JTextField txtTienKhachdua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
