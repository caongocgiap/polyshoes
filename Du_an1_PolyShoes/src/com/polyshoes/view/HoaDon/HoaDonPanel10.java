/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.HoaDon;

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
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.polyshoes.dao.HoaDon.HoaDonDao;
import com.polyshoes.dao.HoaDon.LichSuHoaDonDao;
import com.polyshoes.dao.HoaDon.XuatDanhSachDao;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.main.MainJFrame;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import com.polyshoes.model.HoaDon.LichSuHoaDon;
import com.polyshoes.model.HoaDon.XuatDanhSach;
import com.polyshoes.view.banhang.BanHangJPanel2;
import static com.polyshoes.view.sanpham.SanPhamChiTietJPanel.maSP;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HoaDonPanel10 extends javax.swing.JPanel {

    int index = -1;
    int pageIndex = 1;
    int pageSize = 1;
    int limit = 5;
    private WebcamPanel panel = null;
    private Webcam webcam = null;
    public static String maHDTK;
    private List<XuatDanhSach> ListDS = new ArrayList<>();
    private List<HoaDon> ListHD = new ArrayList<>();
    private List<HoaDonChiTiet> ListCT = new ArrayList<>();
    HoaDonChiTietDao hdctdao = new HoaDonChiTietDao();
    HoaDonDao dao = new HoaDonDao();
    LichSuHoaDonDao lsdao = new LichSuHoaDonDao();
    XuatDanhSachDao DSdao = new XuatDanhSachDao();

    public HoaDonPanel10() {
        initComponents();
        init();

    }

    public void init() {
        setBackground(Color.WHITE);
        addPlaceHolderStyle(txtTimKiem);
        fixTable();
        loadDuLieu(pageIndex, limit);

        if (tblHoaDon.getRowCount() > 0) {
            lblSizeHD.setText(String.valueOf(calculateTotalPages(limit)));
        } else {
            pageSize = 1;
            lblSizeHD.setText(String.valueOf(pageSize));
        }
    }

    private int calculateTotalPages(int limit) {
        List<HoaDon> data = dao.paging3(0, 5); // Assuming dao.paging3 returns List<HoaDon>
        int totalRecords = (data != null) ? data.size() : 0;
        return (int) Math.ceil((double) totalRecords / limit);
    }

    private int getPageSize(int limit) {
        List<HoaDon> data = dao.paging3(pageIndex, limit); // Assuming dao.paging3 returns List<HoaDon>
        int totalItems = (data != null) ? data.size() : 1;
        pageSize = (int) Math.ceil((double) totalItems / limit);
        return pageSize;
    }

    private void fixTable() {
        tblHoaDon.fixTable(jScrollPane19);
        tblTimeLine2.fixTable(jScrollPane6);
        tblChiTiet.fixTable(jScrollPane2);

    }

    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);

    }

    public void removePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.gray);

    }

    void loadDuLieu(int page, int limit) {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            List<HoaDon> list = dao.paging3((pageIndex - 1) * limit, limit);
            for (HoaDon hd : list) {
                Object[] row = {
                    hd.getStt(),
                    hd.getMaHD(),
                    hd.getFormattedTao(),
                    hd.getFormattedTT(),
                    hd.getFormattedTongTien(),
                    hd.getFormattedGiamGia(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {

            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");

            e.printStackTrace();
        }
        lblSizeHD.setText(String.valueOf(this.getPageSize(limit)));
    }

    void fillTimKiemHDQR(String mahd) {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {

            List<HoaDon> list = dao.selectByKeyword(mahd, mahd, mahd, mahd);
            for (HoaDon hd : list) {
                Object[] row = {
                    hd.getStt(),
                    hd.getMaHD(),
                    hd.getFormattedTao(),
                    hd.getFormattedTT(),
                    hd.getFormattedTongTien(),
                    hd.getFormattedGiamGia(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void fillTimKiemHD() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<HoaDon> list = dao.selectByKeyword(keyword, keyword, keyword, keyword);
            for (HoaDon hd : list) {
                Object[] row = {
                    hd.getStt(),
                    hd.getMaHD(),
                    hd.getFormattedTao(),
                    hd.getFormattedTT(),
                    hd.getFormattedTongTien(),
                    hd.getFormattedGiamGia(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void fillComBo() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        int mahd = 0;
        switch (cboTrangThai.getSelectedItem().toString()) {
            case "Đã thanh toán":
                mahd = 0;

                break;
            case "Chưa thanh toán":
                mahd = 1;

                break;
            case "Tất cả":
                loadDuLieu(0, 5);

                break;
            default:
                throw new AssertionError();
        }
        try {

            List<HoaDon> list = dao.selectTrangThai(mahd);

            for (HoaDon hd : list) {

                Object[] row = {
                    hd.getStt(),
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getFormattedTongTien(),
                    hd.getFormattedGiamGia(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void fillComBoThanhToan() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {

            List<HoaDon> list = dao.selectThanhToan((String) cboThanhToan.getSelectedItem());

            for (HoaDon hd : list) {

                Object[] row = {
                    hd.getStt(),
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getFormattedTongTien(),
                    hd.getFormattedGiamGia(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void TimKiemTheoBang() {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
        model.setRowCount(0);
        String mahd = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
        try {
            List<HoaDonChiTiet> list = hdctdao.selectByKeyword(mahd);
            int stt = 0;
            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {
                    stt,
                    hdct.getMaSPCT(),
                    hdct.getTenSp(),
                    hdct.getSoLuong(),
                    hdct.getFormattedTongTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void TimKiemTheoBangQR(String mahd) {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
        model.setRowCount(0);

        try {
            List<HoaDonChiTiet> list = hdctdao.selectByKeyword(mahd);
            int stt = 0;
            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {
                    stt,
                    hdct.getMaSPCT(),
                    hdct.getTenSp(),
                    hdct.getSoLuong(),
                    hdct.getFormattedTongTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void fillTimTimeLine() {
        DefaultTableModel model = (DefaultTableModel) tblTimeLine2.getModel();
        model.setRowCount(0);
        int stt = 0;
        String mahd = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
        try {

            List<LichSuHoaDon> list = lsdao.selectByKeyword3(mahd);
            for (LichSuHoaDon ls : list) {
                stt++;
                Object[] row = {
                    stt,
                    ls.getMaNV(),
                    ls.ThoiGian(),
                    ls.NgayCapS(),
                    ls.getTrangThaiA(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void fillTimelineQR(String mahd) {
        DefaultTableModel model = (DefaultTableModel) tblTimeLine2.getModel();
        model.setRowCount(0);
        int stt = 0;
        try {
            List<LichSuHoaDon> list = lsdao.selectByKeyword3(mahd);
            for (LichSuHoaDon ls : list) {
                stt++;
                Object[] row = {
                    stt,
                    ls.getMaNV(),
                    ls.ThoiGian(),
                    ls.NgayCapS(),
                    ls.getTrangThaiA(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void fillLocDuLieu(int page, int limit) {
        int TuSo = Integer.parseInt(txtTu.getText());
        int DenSo = Integer.parseInt(txtDen.getText());
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);

        try {
            List<HoaDon> list = dao.pagingLoc(TuSo, DenSo, page, limit);
            int stt = 0;
            for (HoaDon hd : list) {
                stt++;
                Object[] row = {
                    stt,
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getFormattedTongTien(),
                    hd.getFormattedGiamGia(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(panel, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }

    }

    boolean check() {
        String txtTuValue = txtTu.getText();
        String txtDenValue = txtDen.getText();

        // Kiểm tra xem các trường có rỗng không
        if (txtTuValue.isEmpty() || txtDenValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mời nhập các giá trị");
            return false;
        }

        try {
            // Kiểm tra xem các giá trị có phải là số và lớn hơn hoặc bằng 0 không
            double tu = Double.parseDouble(txtTuValue);
            double den = Double.parseDouble(txtDenValue);

            if (tu < 0 || den < 0) {
                JOptionPane.showMessageDialog(this, "Giá trị phải là số và lớn hơn hoặc bằng 0");
                return false;
            }
        } catch (NumberFormatException e) {
            // Xử lý nếu không thể chuyển đổi thành số
            JOptionPane.showMessageDialog(this, "Giá trị không hợp lệ, mời nhập số");
            return false;
        }

        return true;
    }

    public void inHoaDon() {
        int selectedRow = tblHoaDon.getSelectedRow();
        if (selectedRow != -1) {
            String mahd = (String) tblHoaDon.getValueAt(selectedRow, 1);
            if (isValidMahd(mahd)) {
                dao.InsertHanhDongInHoaDon(mahd);
                fillTimelineQR(mahd);
                PrintHoaDonV2 frame2 = new PrintHoaDonV2(mahd);
            } else {

                DialogHelper.alert(panel, "Hóa đơn không hợp lệ");
            }
        } else {
            DialogHelper.alert(panel, "Mời chọn hóa đơn");

        }

    }

    private boolean isValidMahd(String mahd) {
        // Kiểm tra xem mahd có rỗng hay không
        if (mahd == null || mahd.trim().isEmpty()) {
            return false;
        }

        // Kiểm tra các điều kiện khác nếu cần
        // Ví dụ: Mahd phải có độ dài nhất định, chứa chỉ các ký tự hợp lệ, ...
        // Ví dụ đơn giản: Kiểm tra độ dài của mahd
        if (mahd.length() < 3 || mahd.length() > 10) {
            return false;
        }

        // Nếu điều kiện nào đó không được đáp ứng, trả về false
        // Nếu tất cả các điều kiện đều được đáp ứng, trả về true
        return true;
    }

    public void InDanhSachv2() {
        // Kiểm tra xem một hàng có được chọn trong bảng hay không
        int selectedRow = tblHoaDon.getSelectedRow();
        if (selectedRow != -1) {
            // Lấy "Mã hóa đơn" từ hàng được chọn
            String mahd = (String) tblHoaDon.getValueAt(selectedRow, 1);
            // Kiểm tra hợp lệ của "Mã hóa đơn"
            if (isValidMahd(mahd)) {
                // Thực hiện hành động và điền vào dòng thời gian dựa trên "Mã hóa đơn" đã kiểm tra
                dao.InsertHanhDongXuatDanhSach(mahd);
                fillTimelineQR(mahd);
                try {
                    // Tạo một workbook và sheet Excel
                    XSSFWorkbook wordkbook = new XSSFWorkbook();
                    XSSFSheet sheet = wordkbook.createSheet("HoaDon");
                    XSSFRow row = null;
                    Cell cell = null;
                    // Đặt tiêu đề cho các cột khác nhau trong sheet Excel
                    // ...
                    row = sheet.createRow(2);
                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellValue("DANH SACH HOA DON");
                    row = sheet.createRow(3);
                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellValue("STT");
                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue("Mã hóa đơn");
                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue("Ngày Tạo");
                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue("Ngàng thanh toán");
                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue("Mã nhân viên");
                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue("Tên khách hàng");
                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue("SDT");
                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue("Địa chỉ");
                    cell = row.createCell(8, CellType.STRING);
                    cell.setCellValue("Mã SP");
                    cell = row.createCell(9, CellType.STRING);
                    cell.setCellValue("Tên SP");
                    cell = row.createCell(10, CellType.STRING);
                    cell.setCellValue("Hãng");
                    cell = row.createCell(11, CellType.STRING);
                    cell.setCellValue("Màu");
                    cell = row.createCell(12, CellType.STRING);
                    cell.setCellValue("Size");
                    cell = row.createCell(13, CellType.STRING);
                    cell.setCellValue("Số lượng");
                    cell = row.createCell(14, CellType.STRING);
                    cell.setCellValue("Giá ");

                    cell = row.createCell(15, CellType.STRING);
                    cell.setCellValue("Thành tiền");
// Lấy dữ liệu liên quan đến "Mã hóa đơn" đã kiểm tra
                    ListDS = DSdao.select(mahd);
// Điền vào sheet Excel với dữ liệu từ danh sách đã lấy
                    // ...
                    for (int i = 0; i < ListDS.size(); i++) {
                        row = sheet.createRow(4 + i);

                        cell = row.createCell(0, CellType.NUMERIC);
                        cell.setCellValue(i + 1);

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getMaHD());

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getNgayTaoString());

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getNgayTTAsString());

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getMaNV());

                        cell = row.createCell(5, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getTenNguoiNhan());

                        cell = row.createCell(6, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getSDT());

                        cell = row.createCell(7, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getDiaChi());

                        cell = row.createCell(8, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getMaSP());

                        cell = row.createCell(9, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getTenSP());

                        cell = row.createCell(10, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getHang());

                        cell = row.createCell(11, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getMau());

                        cell = row.createCell(12, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getSize());

                        cell = row.createCell(13, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getSoLuong());

                        cell = row.createCell(14, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getGiaBan());

                        cell = row.createCell(15, CellType.STRING);
                        cell.setCellValue(ListDS.get(i).getThanhTien());

                    }
                    // Mở hộp thoại lưu file
                    File fileToSave = null;
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Chọn nơi lưu trữ");
                    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    int userSelection = fileChooser.showSaveDialog(this);
                    // Kiểm tra xem người dùng đã chọn một file chưa
                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        // Lấy file đã chọn
                        fileToSave = fileChooser.getSelectedFile();
                        // Đảm bảo rằng file có phần mở rộng .xlsx
                        if (!fileToSave.getAbsolutePath().endsWith(".xlsx")) {
                            fileToSave = new File(fileToSave.getAbsolutePath() + ".xlsx");
                        }
                    }

                    if (fileToSave != null) {
                        try {
                            // Xuất workbook vào file đã chọn
                            FileOutputStream fis = new FileOutputStream(fileToSave);
                            wordkbook.write(fis);
                            fis.close();
                            DialogHelper.alert(panel, "Xuất thành công");

                        } catch (FileNotFoundException ex) {
                            ex.printStackTrace();
                            DialogHelper.alert(panel, "Lỗi mở file!");

                        } catch (IOException ex) {
                            ex.printStackTrace();
                            DialogHelper.alert(panel, "Lỗi ghi file!");

                        }
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    DialogHelper.alert(panel, "Lỗi mở file!");

                }
            } else {
                DialogHelper.alert(panel, "Hóa đơn không hợp lệ!");
            }
        } else {
            DialogHelper.alert(panel, "Mời chọn hóa đơn");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialTabbed1 = new com.polyshoes.swing.tabbed.MaterialTabbed();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblHoaDon = new com.polyshoes.swing.table.Table();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboThanhToan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDen = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblIndexHD = new javax.swing.JLabel();
        btnTimKiem = new com.polyshoes.swing.Button();
        btnLoc = new com.polyshoes.swing.Button();
        btnThem = new com.polyshoes.swing.Button();
        btnInHoaDon = new com.polyshoes.swing.Button();
        btnXuatDanhSach = new com.polyshoes.swing.Button();
        btnQuetQR = new com.polyshoes.swing.Button();
        lblSizeHD = new javax.swing.JLabel();
        JText4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTiet = new com.polyshoes.swing.table.Table();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTimeLine2 = new com.polyshoes.swing.table.Table();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        materialTabbed1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1300, 1300));
        jPanel3.setMinimumSize(new java.awt.Dimension(1300, 1300));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(1058, 741));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn"));
        jPanel11.setMaximumSize(new java.awt.Dimension(1300, 1300));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hóa đơn", "Ngày tạo", "Ngày thanh toán", "Tổng tiền", "Giảm giá", "Mã nhân viên", "Tên khách hàng", "Địa chỉ", "SĐT", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDontblHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseEntered(evt);
            }
        });
        jScrollPane19.setViewportView(tblHoaDon);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Tìm kiếm hóa đơn");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Trạng thái hóa đơn");

        txtTimKiem.setText("Mã hóa đơn - Tên khách hàng - Nhân viên -SĐT");
        txtTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemtxtTimKiemActionPerformed(evt);
            }
        });

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đã thanh toán", "Chưa thanh toán" }));
        cboTrangThai.setToolTipText("");
        cboTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTrangThaicboTrangThaiActionPerformed(evt);
            }
        });

        jLabel2.setText("Hình thức thanh toán:");

        cboThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chuyển khoản", "Tiền mặt" }));
        cboThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThanhToanActionPerformed(evt);
            }
        });

        jLabel4.setText("Giá khoảng Từ");

        txtTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuActionPerformed(evt);
            }
        });

        jLabel5.setText("Đến");

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextbtnThemActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastbtnThemActionPerformed(evt);
            }
        });

        lblIndexHD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIndexHD.setText("1");

        btnTimKiem.setBackground(new java.awt.Color(153, 204, 255));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/3.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnLoc.setBackground(new java.awt.Color(153, 204, 255));
        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(153, 204, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/them.png"))); // NOI18N
        btnThem.setText("Tạo hóa đơn mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnInHoaDon.setBackground(new java.awt.Color(153, 204, 255));
        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/hoadon.png"))); // NOI18N
        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        btnXuatDanhSach.setBackground(new java.awt.Color(153, 204, 255));
        btnXuatDanhSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/export.png"))); // NOI18N
        btnXuatDanhSach.setText("Xuất danh sách");
        btnXuatDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatDanhSachActionPerformed(evt);
            }
        });

        btnQuetQR.setBackground(new java.awt.Color(153, 204, 255));
        btnQuetQR.setText("Quét QR");
        btnQuetQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuetQRActionPerformed(evt);
            }
        });

        lblSizeHD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSizeHD.setText("3");

        JText4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JText4.setText("/");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(306, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuetQR, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane19)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLast)
                        .addGap(3, 3, 3)
                        .addComponent(lblIndexHD, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JText4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSizeHD, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addGap(310, 310, 310)
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtTimKiem)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnQuetQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cboThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JText4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIndexHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSizeHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXuatDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(btnLast)
                                    .addGap(4, 4, 4)))
                            .addComponent(btnNext))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn chi tiết"));

        tblChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SPCT", "Tên sản phẩm", "Số lượng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblChiTiet);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 204, 255));
        jLabel22.setText("Hóa Đơn");

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lịch sử hóa đơn"));

        tblTimeLine2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Người tác động", "Giờ", "Ngày cập nhật", "Hành động"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblTimeLine2);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(jLabel22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1341, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        materialTabbed1.addTab("Hóa Đơn", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 1277, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuetQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuetQRActionPerformed
        WebCamXYZ qrCode = new WebCamXYZ();
        qrCode.setDefaultCloseOperation(qrCode.DISPOSE_ON_CLOSE);
        qrCode.setVisible(true);
        qrCode.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("window closing");
                txtTimKiem.setText(qrCode.maHDKK);
                dao.InsertHanhDongQR(qrCode.maHDKK);
                fillTimKiemHDQR(qrCode.maHDKK);
                fillTimelineQR(qrCode.maHDKK);
                TimKiemTheoBangQR(qrCode.maHDKK);

            }
        });


    }//GEN-LAST:event_btnQuetQRActionPerformed

    private void btnXuatDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatDanhSachActionPerformed
        InDanhSachv2();
    }//GEN-LAST:event_btnXuatDanhSachActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        inHoaDon();
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        if (check()) {
            fillLocDuLieu(0, 5);
        }
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

        String mahd = txtTimKiem.getText();
        fillTimKiemHD();

        dao.InsertHanhDongTimKiem(mahd);
        fillTimelineQR(mahd);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLastbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastbtnThemActionPerformed
//        if (pageIndex == 0) {
//
//        } else {
//            try {
//                if (pageIndex >= 0) {
//                    pageIndex--;
//                    this.loadDuLieu(pageIndex, 5);
//                    lblIndexHD.setText(String.valueOf(pageIndex + 1));
//                } else {
//                    pageIndex = 0;
//                    this.loadDuLieu(pageIndex, 5);
//                    lblIndexHD.setText(String.valueOf(pageIndex + 1));
//                }
//            } catch (Exception e) {
//            }
//        }

        if (pageIndex > 1) {
            pageIndex--;
        } else {
            pageIndex = 1;
        }
        this.loadDuLieu(pageIndex, limit);
        lblIndexHD.setText(String.valueOf(pageIndex));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastbtnThemActionPerformed

    private void btnNextbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextbtnThemActionPerformed
        if (pageIndex >= 0) {
            pageIndex++;
            this.loadDuLieu(pageIndex, 5);
            lblIndexHD.setText(String.valueOf(pageIndex));
        } else {
            pageIndex = 0;
            this.loadDuLieu(pageIndex, 5);
            lblIndexHD.setText(String.valueOf(pageIndex));
        }
// TODO add your handling code here:

//        if (pageIndex < this.pageSize) {
//            pageIndex++;
//        } else {
//            pageIndex = this.getPageSize(limit);
//        }
//        this.loadDuLieu(pageIndex, limit);
//        lblIndexHD.setText(String.valueOf(pageIndex));
    }//GEN-LAST:event_btnNextbtnThemActionPerformed

    private void txtTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuActionPerformed

    private void cboTrangThaicboTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrangThaicboTrangThaiActionPerformed
        fillComBo();        // TODO add your handling code here:
    }//GEN-LAST:event_cboTrangThaicboTrangThaiActionPerformed

    private void txtTimKiemtxtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemtxtTimKiemActionPerformed
        String mahd = txtTimKiem.getText();
        fillTimKiemHD();
        dao.InsertHanhDongTimKiem(mahd);
        fillTimelineQR(mahd);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemtxtTimKiemActionPerformed

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost
        if (txtTimKiem.getText().length() == 0) {
            addPlaceHolderStyle(txtTimKiem);
            txtTimKiem.setText("Mã hóa đơn - Tên khách hàng - Nhân viên -SĐT");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemFocusLost

    private void txtTimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusGained
        if (txtTimKiem.getText().equals("Mã hóa đơn - Tên khách hàng - Nhân viên -SĐT")) {
            txtTimKiem.setText(null);
            removePlaceHolderStyle(txtTimKiem);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemFocusGained

    private void tblHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHoaDonMouseEntered

    private void tblHoaDontblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDontblHoaDonMouseClicked
        fillTimTimeLine();
        TimKiemTheoBang();

        // TODO add your handling code here:
    }//GEN-LAST:event_tblHoaDontblHoaDonMouseClicked

    private void cboThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThanhToanActionPerformed
        fillComBoThanhToan();        // TODO add your handling code here:
    }//GEN-LAST:event_cboThanhToanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JText4;
    private com.polyshoes.swing.Button btnInHoaDon;
    private javax.swing.JButton btnLast;
    private com.polyshoes.swing.Button btnLoc;
    private javax.swing.JButton btnNext;
    private com.polyshoes.swing.Button btnQuetQR;
    private com.polyshoes.swing.Button btnThem;
    private com.polyshoes.swing.Button btnTimKiem;
    private com.polyshoes.swing.Button btnXuatDanhSach;
    private javax.swing.JComboBox<String> cboThanhToan;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblIndexHD;
    private javax.swing.JLabel lblSizeHD;
    private com.polyshoes.swing.tabbed.MaterialTabbed materialTabbed1;
    private com.polyshoes.swing.table.Table tblChiTiet;
    private com.polyshoes.swing.table.Table tblHoaDon;
    private com.polyshoes.swing.table.Table tblTimeLine2;
    private javax.swing.JTextField txtDen;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTu;
    // End of variables declaration//GEN-END:variables

}
