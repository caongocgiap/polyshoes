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
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import com.polyshoes.model.HoaDon.LichSuHoaDon;
import com.polyshoes.model.HoaDon.XuatDanhSach;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class HoaDonPanel10 extends javax.swing.JPanel implements Runnable, ThreadFactory {

    int index = -1;
    HoaDonDao dao = new HoaDonDao();
    LichSuHoaDonDao lsdao = new LichSuHoaDonDao();
    private List<HoaDon> ListHD = new ArrayList<>();
    private List<HoaDonChiTiet> ListCT = new ArrayList<>();
    HoaDonChiTietDao hdctdao = new HoaDonChiTietDao();
    private int pageIndex = 0;
    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    private List<XuatDanhSach> ListDS = new ArrayList<>();
    XuatDanhSachDao DSdao = new XuatDanhSachDao();

    public HoaDonPanel10() {
        initComponents();
        setBackground(Color.WHITE);
        load(0, 5);
        addPlaceHolderStyle(txtTimKiem);
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/yyyy HH:mm");
//        initWebcam();

        fixTable();

    }

    private void fixTable() {

        tblHoaDon.fixTable(jScrollPane19);
        tblTimeLine2.fixTable(jScrollPane6);
        tblChiTiet3.fixTable(jScrollPane12);
        tblChiTiet.fixTable(jScrollPane2);
        tblChiTiet4.fixTable(jScrollPane13);

    }

    private void initWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0); //0 is default webcam
        webcam.setViewSize(size);
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);

        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 145));
        executor.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
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
                txtTimkiemLS2.setText(result.getText());
                TimKiemTheoBang7();
                showData7();

            }

        } while (true);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
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

    void load(int page, int limit) {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);

        try {
            List<HoaDon> list = dao.paging(page, limit);
            int stt = 0;
            for (HoaDon hd : list) {
                stt++;
                Object[] row = {
                    stt,
                    hd.getMaHD(),
                    hd.getFormattedTao(),
                    hd.getFormattedTT(),
                    hd.getTongTien(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }

//    void load2() {
//        DefaultTableModel model = (DefaultTableModel) tblTest.getModel();
//        model.setRowCount(0);
//
//        try {
//            List<XuatDanhSach> list = DSdao.filldanhSach();
//            int stt = 0;
//            for (XuatDanhSach hd : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    hd.getMaHD(),
//                    hd.getNgayTao(),
//                    hd.getNgayTT(),
//                    hd.getMaNV(),
//                    hd.getTenNguoiNhan(),
//                    hd.getDiaChi(),
//                    hd.getSDT(),
//                    hd.getMaSP(),
//                    hd.getTenSP(),
//                    hd.getHang(),
//                    hd.getMau(),
//                    hd.getSize(),
//                    hd.getSoLuong(),
//                    hd.getGiaBan(),
//                    hd.getThanhTien(),};
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
//            e.printStackTrace();
//        }
//    }
    void fillTimKiemHD() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<HoaDon> list = dao.selectByKeyword(keyword, keyword, keyword, keyword);
            int stt = 0;
            for (HoaDon hd : list) {
                stt++;
                Object[] row = {
                    stt,
                    hd.getMaHD(),
                    hd.getFormattedTao(),
                    hd.getFormattedTT(),
                    hd.getTongTien(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
            e.printStackTrace();
        }
    }

    void fillTimKiemTenKH() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<HoaDon> list = dao.selectByTenKN(keyword);
            int stt = 0;
            for (HoaDon hd : list) {
                stt++;
                Object[] row = {
                    stt,
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getTongTien(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
            e.printStackTrace();
        }
    }

    void fillTimKiemNV() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<HoaDon> list = dao.selectByMaNV(keyword);
            int stt = 0;
            for (HoaDon hd : list) {
                stt++;
                Object[] row = {
                    stt,
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getTongTien(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
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
                load(0, 5);

                break;
            default:
                throw new AssertionError();
        }
        try {

            List<HoaDon> list = dao.selectTrangThai(mahd);
            int Stt = 0;
            Stt++;
            for (HoaDon hd : list) {
                Stt++;
                Object[] row = {
                    Stt,
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getTongTien(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
        }
    }

    void fillComBoThanhToan() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {

            List<HoaDon> list = dao.selectThanhToan((String) cboThanhToan.getSelectedItem());
            int Stt = 0;
            Stt++;
            for (HoaDon hd : list) {
                Stt++;
                Object[] row = {
                    Stt,
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getTongTien(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }

    String form2() {
        String mahd = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
        return mahd;
    }

    void delete() {
        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn không", "", JOptionPane.YES_NO_OPTION);
        String mahd = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
        if (a == 0) {
            try {
                dao.delete(mahd);
                JOptionPane.showMessageDialog(this, "Đã hủy thành công!");
                load(0, 5);
//                filltableLichSu(0, 5);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Hủy thất bại!");
                e.printStackTrace();
            }
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
                    hdct.getTongTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }

//    void fillTimkiemLS2() {
//        DefaultTableModel model = (DefaultTableModel) tblTimeLine1.getModel();
//        model.setRowCount(0);
//        int stt = 0;
//        String lyDo = "....";
//        try {
//            String mahd = txtTimkiemLS1.getText();
//            List<LichSuHoaDon> list = lsdao.selectByKeyword(mahd);
//            for (LichSuHoaDon ls : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    ls.getTenNV(),
//                    ls.getNgayTao(),
//                    ls.getFormattedNgayCapNhat(),
//                    lyDo,};
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
//            e.printStackTrace();
//        }
//    }
//    void TimKiemTheoBang2() {
//        DefaultTableModel model = (DefaultTableModel) tblChiTiet1.getModel();
//        model.setRowCount(0);
//        String mahd = txtTimkiemLS.getText();
//        try {
//            List<HoaDonChiTiet> list = hdctdao.selectByKeyword(mahd);
//            int stt = 0;
//            for (HoaDonChiTiet hdct : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    hdct.getMaSPCT(),
//                    hdct.getTenSp(),
//                    hdct.getHang(),
//                    hdct.getColor(),
//                    hdct.getSize(),
//                    hdct.getSoLuong(),
//                    hdct.getDonGia(),
//                    hdct.getTongTien()
//
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
//            e.printStackTrace();
//        }
//    }
//    void TimKiemTheoBang3() {
//        DefaultTableModel model = (DefaultTableModel) tblChiTiet2.getModel();
//        model.setRowCount(0);
//        String mahd = txtTimkiemLS1.getText();
//        try {
//            List<HoaDonChiTiet> list = hdctdao.selectByKeyword1(mahd);
//            int stt = 0;
//            for (HoaDonChiTiet hdct : list) {
//                stt++;
//                Object[] row = {
//                    hdct.getTrangXep(),
//                    stt,
//                    hdct.getMaSPCT(),
//                    hdct.getTenSp(),
//                    hdct.getHang(),
//                    hdct.getColor(),
//                    hdct.getSize(),
//                    hdct.getSoLuong(),
//                    hdct.getTrangXe2p(),
//                    hdct.getDonGia(),
//                    hdct.getTongTien()
//
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
//            e.printStackTrace();
//        }
//    }
    void TimKiemTheoBang4() {

        String SoLuong = JOptionPane.showInputDialog(this, "Mời nhập số Lượng!");
        int SoLuong2 = Integer.parseInt(SoLuong);
        if (SoLuong.isEmpty() || SoLuong2 <= 0) {
            JOptionPane.showMessageDialog(this, "Mời nhập số Lượng!");

        } else {
            DefaultTableModel model = (DefaultTableModel) tblChiTiet4.getModel();
            model.setRowCount(0);
            String mahd = txtTimkiemLS2.getText();
            String masp = (String) tblChiTiet3.getValueAt(tblChiTiet3.getSelectedRow(), 1);
            try {
                List<HoaDonChiTiet> list = hdctdao.selectByTramotmon(mahd, masp);
                int stt = 0;

                for (HoaDonChiTiet hdct : list) {
                    stt++;
                    Object[] row = {
                        hdct.getTrangXep(),
                        stt,
                        hdct.getMaSPCT(),
                        hdct.getTenSp(),
                        hdct.getHang(),
                        hdct.getColor(),
                        SoLuong,
                        hdct.getDonGia(),
                        hdct.getTongTien()

                    };
                    model.addRow(row);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
                e.printStackTrace();
            }
        }

    }

    void TimKiemTheoBang12() {

        DefaultTableModel model = (DefaultTableModel) tblChiTiet4.getModel();
        model.setRowCount(0);
        String mahd = txtTimkiemLS2.getText();

        try {
            List<HoaDonChiTiet> list = hdctdao.selectByKeyword1(mahd);
            int stt = 0;

            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {
                    hdct.getTrangXep(),
                    stt,
                    hdct.getMaSPCT(),
                    hdct.getTenSp(),
                    hdct.getHang(),
                    hdct.getColor(),
                    hdct.getSoLuong(),
                    hdct.getDonGia(),
                    hdct.getTongTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }

    void TimKiemTheoBang11() {

        DefaultTableModel model = (DefaultTableModel) tblChiTiet4.getModel();
        model.setRowCount(0);
        String mahd = txtTimkiemLS2.getText();
        String masp = (String) tblChiTiet3.getValueAt(tblChiTiet3.getSelectedRow(), 1);
        try {
            List<HoaDonChiTiet> list = hdctdao.selectByTramotmon(mahd, masp);
            int stt = 0;

            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }

    void TimKiemTheoBang8(String mahd) {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet4.getModel();
        model.setRowCount(0);

        try {
            List<HoaDonChiTiet> list = hdctdao.selectByKeyword1(mahd);
            int stt = 0;
            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {
                    hdct.getTrangXep(),
                    stt,
                    hdct.getMaSPCT(),
                    hdct.getTenSp(),
                    hdct.getHang(),
                    hdct.getColor(),
                    hdct.getSoLuong(),
                    hdct.getDonGia(),
                    hdct.getTongTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }
//      void TimKiemTheoBang9() {
//        DefaultTableModel model = (DefaultTableModel) tblChiTiet4.getModel();
//        model.setRowCount(0);
//        String mahd = (String) tblChiTiet4.getValueAt(tblChiTiet4.getSelectedRow(), 2);
//        try {
//            List<HoaDonChiTiet> list = hdctdao.selectByTraHang(mahd);
//            int stt = 0;
//            for (HoaDonChiTiet hdct : list) {
//                stt++;
//               hdct.get
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
//            e.printStackTrace();
//        }
//    }

    void TimKiemTheoBang7() {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet3.getModel();
        model.setRowCount(0);
        String mahd = txtTimkiemLS2.getText();
        try {
            List<HoaDonChiTiet> list = hdctdao.selectByKeyword1(mahd);
            int stt = 0;
            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {
                    stt,
                    hdct.getMaSPCT(),
                    hdct.getTenSp(),
                    hdct.getSoLuong(),
                    hdct.getDonGia(),
                    hdct.getTongTien()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }

    void TimKiemTheoBang6() {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet3.getModel();
        model.setRowCount(0);
        String mahd = txtTimkiemLS2.getText();
        try {
            List<HoaDonChiTiet> list = hdctdao.selectByKeyword1(mahd);
            int stt = 0;
            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {
                    hdct.getTrangXep(),
                    stt,
                    hdct.getMaSPCT(),
                    hdct.getTenSp(),
                    hdct.getHang(),
                    hdct.getColor(),
                    hdct.getSize(),
                    hdct.getSoLuong(),
                    hdct.getTrangXe2p(),
                    hdct.getDonGia(),
                    hdct.getTongTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }

    void TimKiemTheoBang5(String mahd) {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet3.getModel();
        model.setRowCount(0);

        try {
            List<HoaDonChiTiet> list = hdctdao.selectByKeyword1(mahd);
            int stt = 0;
            for (HoaDonChiTiet hdct : list) {
                stt++;
                Object[] row = {
                    hdct.getTrangXep(),
                    stt,
                    hdct.getMaSPCT(),
                    hdct.getTenSp(),
                    hdct.getHang(),
                    hdct.getColor(),
                    hdct.getSize(),
                    hdct.getSoLuong(),
                    hdct.getTrangXe2p(),
                    hdct.getDonGia(),
                    hdct.getTongTien()

                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }
    }
//    void TimKiemTheoBangSanPham() {
//        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
//        model.setRowCount(0);
//        String mahd = (String) tblLichSu.getValueAt(tblLichSu.getSelectedRow(), 3);
//        try {
//            List<HoaDonChiTiet> list = hdctdao.selectByLichSu(mahd);
//            int stt = 0;
//            for (HoaDonChiTiet hdct : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    hdct.getTenSp(),
//                    hdct.getDonGia(),
//                    hdct.getSoLuong(),
//                    hdct.getTongTien()
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
//            e.printStackTrace();
//        }
//    }
//    void TimKiemTheoTraHang() {
//        DefaultTableModel model = (DefaultTableModel) tblSanPham1.getModel();
//        model.setRowCount(0);
//        String mahd = txtTraHang.getText();
//        try {
//            List<HoaDonChiTiet> list = hdctdao.selectByTraHang(mahd);
//            int stt = 0;
//            for (HoaDonChiTiet hdct : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    hdct.getTenSp(),
//                    hdct.getDonGia(),
//                    hdct.getSoLuong(),
//                    hdct.getTongTien()
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
//            e.printStackTrace();
//        }
//    }
//
//    void filltableLichSu(int page, int limit) {
//        DefaultTableModel model = (DefaultTableModel) tblLichSu.getModel();
//        model.setRowCount(0);
//        int stt = 0;
//        try {
//            List<LichSuHoaDon> list = lsdao.paging(page, limit);
//            for (LichSuHoaDon ls : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    ls.getTenNV(),
//                    ls.getMaNV(),
//                    ls.getTenKH(),
//                    ls.getTongTien(),
//                    ls.getNgayTao(),
//                    ls.getNgayTT(),
//                    ls.getTrangThaiA()
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
//            e.printStackTrace();
//        }
//    }
//    void fillTimkiemLS() {
//        DefaultTableModel model = (DefaultTableModel) tblLichSu.getModel();
//        model.setRowCount(0);
//        int stt = 0;
//        try {
//            String keyword = txtTimkiemLS.getText();
//            List<LichSuHoaDon> list = lsdao.selectByKeyword(keyword);
//            for (LichSuHoaDon ls : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    ls.getTenNV(),
//                    ls.getMaNV(),
//                    ls.getTenKH(),
//                    ls.getTongTien(),
//                    ls.getNgayTao(),
//                    ls.getNgayTT(),
//                    ls.getTrangThai()
//                };
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
//            e.printStackTrace();
//        }
//    }
//    void showData(int index) {
//
//        HoaDon model = dao.select().get(index);
//        JTextHoaDon.setText(model.getMaHD());
//        JTextKhachHang.setText(model.getTenKH());
//        JTextSDT.setText(model.getSDT());
//        JTextNgayTao.setText(model.getNgayTaoString());
//        JTextNgayTT.setText(model.getNgayTTAsString());
//        JTextArea.setText(model.getDiaChi());
//        JTextTrangThai.setText(model.getTrangThaiA());
//        JTextTongTien.setText(model.getTongTien() + "");
//    }
//
//    void showData2() {
//        try {
//            String mahd = txtTimkiemLS.getText();
//            List<HoaDon> model = dao.selectByLSSS(mahd);
//            for (HoaDon x : model) {
//                JTextHoaDon.setText(x.getMaHD());
//                JTextKhachHang.setText(x.getTenKH());
//                JTextSDT.setText(x.getSDT());
//                JTextNgayTao.setText(x.getNgayTaoString());
//                JTextNgayTT.setText(x.getNgayTTAsString());
//                JTextArea.setText(x.getDiaChi());
//                JTextTrangThai.setText(x.getTrangThaiA());
//                JTextTongTien.setText(String.valueOf(x.getTongTien()));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    void showData4() {
//        try {
//            String mahd = txtTimkiemLS.getText();
//            List<LichSuHoaDon> model = lsdao.selectByKeyword(mahd);
//            for (LichSuHoaDon x : model) {
//                JTextTenNhanVien.setText(x.getTenNV());
//                JTextMaNhanVien.setText(x.getMaNV());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

//    void showData5() {
//        try {
//            String mahd = txtTimkiemLS1.getText();
//            List<HoaDon> model = dao.selectByLSSS(mahd);
//            for (HoaDon x : model) {
//                JTextHoaDon2.setText(x.getMaHD());
//                JTextKhachHang2.setText(x.getTenKH());
//                JTextSDT2.setText(x.getSDT());
//                JTextNgayTao2.setText(x.getNgayTaoString());
//                JTextNgayTT2.setText(x.getNgayTTAsString());
//                JTextArea2.setText(x.getDiaChi());
//                JTextTrangThai2.setText(x.getTrangThaiA());
//                JTextTongTien2.setText(String.valueOf(x.getTongTien()));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//    void showData6() {
//        try {
//            String mahd = txtTimkiemLS1.getText();
//            List<LichSuHoaDon> model = lsdao.selectByKeyword(mahd);
//            for (LichSuHoaDon x : model) {
//                JTextTenNhanVien1.setText(x.getTenNV());
//                JTextMaNhanVien1.setText(x.getMaNV());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    void showData7() {
        try {
            String mahd = txtTimkiemLS2.getText();
            List<HoaDon> model = dao.selectByLSSS(mahd);
            for (HoaDon x : model) {
                JTextHoaDon3.setText(x.getMaHD());
                JTextKhachHang3.setText(x.getTenKH());
                JTextSDT3.setText(x.getSDT());
//                JTextNgayTao3.setText(x.getNgayTaoString());
//                JTextNgayTT3.setText(x.getNgayTTAsString());
                JTextDiaChi.setText(x.getDiaChi());
//                JTextTrangThai3.setText(x.getTrangThaiA());
                JTextTongTien3.setText(String.valueOf(x.getTongTien()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void showData70() {
        try {
            String mahd2 = txtTimkiemLS2.getText();
            String mahd = (String) tblChiTiet4.getValueAt(tblChiTiet4.getSelectedRow(), 2);
            List<HoaDonChiTiet> model2 = hdctdao.selectByTraHang1(mahd2, mahd);
            List<HoaDon> model = dao.selectByLSSS2(mahd2, mahd);
            for (HoaDon x : model) {
                JTextKH.setText(x.getTenKH());
                JTextTienGocHoaDon.setText(String.valueOf(x.getTongTien()));
                JTextArea.setText("....");
                JTextTienThua.setText("0");
                JTextTienGocTraHang.setText(String.valueOf(x.getTongTien()));

            }
//            for (HoaDonChiTiet x : model2) {
//               JTextTienGocTraHang.setText(x.getDonGia().toString());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void showData8(String mahd) {
        try {

            List<HoaDon> model = dao.selectByLSSS(mahd);
            for (HoaDon x : model) {
                JTextHoaDon3.setText(x.getMaHD());
                JTextKhachHang3.setText(x.getTenKH());
                JTextSDT3.setText(x.getSDT());
//                JTextNgayTao3.setText(x.getNgayTaoString());
//                JTextNgayTT3.setText(x.getNgayTTAsString());
                JTextDiaChi.setText(x.getDiaChi());
//                JTextTrangThai3.setText(x.getTrangThaiA());
                JTextTongTien3.setText(String.valueOf(x.getTongTien()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    void showData3() {
//        try {
//            String mahd = txtTraHang.getText();
//            List<HoaDon> model = dao.selectByHD(mahd);
//            for (HoaDon x : model) {
//                JTextHoaDon1.setText(x.getMaHD());
//                JTextKhachHang1.setText(x.getTenKH());
//                JTextSDT1.setText(x.getSDT());
//                JTextNgayTao1.setText(x.getNgayTaoString());
//                JTextNgayTT1.setText(x.getNgayTTAsString());
//                JTextArea1.setText(x.getDiaChi());
//                JTextTrangThai1.setText(x.getTrangThaiA());
//                JTextTongTien1.setText(String.valueOf(x.getTongTien()));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//    void fillTimkiemLS() {
//        DefaultTableModel model = (DefaultTableModel) tblTimeLine.getModel();
//        model.setRowCount(0);
//        int stt = 0;
//        String lyDo = "....";
//        try {
//            String mahd = txtTimkiemLS.getText();
//            List<LichSuHoaDon> list = lsdao.selectByKeyword(mahd);
//            for (LichSuHoaDon ls : list) {
//                stt++;
//                Object[] row = {
//                    stt,
//                    ls.getTenNV(),
//                    ls.getNgayTao(),
//                    ls.getFormattedNgayCapNhat(),
//                    lyDo,};
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
//            e.printStackTrace();
//        }
//    }
    void fillTim2() {
        DefaultTableModel model = (DefaultTableModel) tblTimeLine2.getModel();
        model.setRowCount(0);
        int stt = 0;
        String lyDo = "....";
        String mahd = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
        try {

            List<LichSuHoaDon> list = lsdao.selectByKeyword(mahd);
            for (LichSuHoaDon ls : list) {
                stt++;
                Object[] row = {
                    stt,
                    ls.getMaNV(),
                    ls.getFormattedNgayTT2(),
                    ls.getFormattedNgayCapNhat(),
                    lyDo,};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
            e.printStackTrace();
        }
    }

    void fillLocDuLieu(int page, int limit) {
        int TuSo = Integer.parseInt(txtTu.getText());
        int DenSo = Integer.parseInt(txtDen.getText());
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);

        try {
            List<HoaDon> list = dao.paging2(TuSo, DenSo, page, limit);
            int stt = 0;
            for (HoaDon hd : list) {
                stt++;
                Object[] row = {
                    stt,
                    hd.getMaHD(),
                    hd.getNgayTao(),
                    hd.getNgayTT(),
                    hd.getTongTien(),
                    hd.getMaNV(),
                    hd.getTenKH(),
                    hd.getDiaChi(),
                    hd.getSDT(),
                    hd.getTrangThaiA()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!");
            e.printStackTrace();
        }

    }

    boolean check() {
        if (txtTu.getText().isEmpty() || txtDen.getText().isEmpty()) {

            return false;
        }
        return true;
    }

//    public void tableChanged() {
//        int selectedRow = tblChiTiet2.getSelectedRow();
//        int checkboxColumnIndex = 0;
//
//        if (selectedRow != -1) {
//            Boolean isChecked = (Boolean) tblChiTiet2.getValueAt(selectedRow, checkboxColumnIndex);
//            System.out.println("Checkbox ở dòng " + selectedRow + " được chọn: " + isChecked);
//        } else {
//            System.out.println("Chọn một dòng trước khi lấy giá trị checkbox.");
//        }
//    }
//    void delete1mon() {
//        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn không", "", JOptionPane.YES_NO_OPTION);
//        String mahd = txtTimkiemLS1.getText();
//        if (a == 0) {
//            try {
//                hdctdao.tra1mon(mahd);
//                JOptionPane.showMessageDialog(this, "Đã Trả thành công!");
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Trả thất bại!");
//                e.printStackTrace();
//            }
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
                JText2 = new javax.swing.JLabel();
                btnTimKiem = new com.polyshoes.swing.Button();
                button1 = new com.polyshoes.swing.Button();
                btnThem = new com.polyshoes.swing.Button();
                btnCapNhat1 = new com.polyshoes.swing.Button();
                btnCapNhat3 = new com.polyshoes.swing.Button();
                jPanel12 = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                tblChiTiet = new com.polyshoes.swing.table.Table();
                jLabel22 = new javax.swing.JLabel();
                jPanel14 = new javax.swing.JPanel();
                jScrollPane6 = new javax.swing.JScrollPane();
                tblTimeLine2 = new com.polyshoes.swing.table.Table();
                jPanel6 = new javax.swing.JPanel();
                jLabel27 = new javax.swing.JLabel();
                txtTimkiemLS2 = new javax.swing.JTextField();
                jLabel19 = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                jLabel39 = new javax.swing.JLabel();
                JTextSDT3 = new javax.swing.JLabel();
                jLabel42 = new javax.swing.JLabel();
                jLabel43 = new javax.swing.JLabel();
                JTextKhachHang3 = new javax.swing.JLabel();
                JTextHoaDon3 = new javax.swing.JLabel();
                jLabel44 = new javax.swing.JLabel();
                JTextDiaChi = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                JTextTongTien3 = new javax.swing.JLabel();
                jPanel8 = new javax.swing.JPanel();
                jScrollPane12 = new javax.swing.JScrollPane();
                tblChiTiet3 = new com.polyshoes.swing.table.Table();
                jPanel4 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                btnTraHang = new com.polyshoes.swing.Button();
                jLabel1 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                JTextArea = new javax.swing.JTextArea();
                JTextKH = new javax.swing.JLabel();
                JTextTienGocHoaDon = new javax.swing.JLabel();
                JTextTienGocTraHang = new javax.swing.JLabel();
                JTextTienThua = new javax.swing.JLabel();
                jPanel9 = new javax.swing.JPanel();
                jScrollPane13 = new javax.swing.JScrollPane();
                tblChiTiet4 = new com.polyshoes.swing.table.Table();
                ckBox2 = new javax.swing.JCheckBox();
                jPanel2 = new javax.swing.JPanel();
                btnTraHang1 = new com.polyshoes.swing.Button();
                btnTraHang2 = new com.polyshoes.swing.Button();

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
                                {null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "STT", "Mã hóa đơn", "Ngày tạo", "Ngày thanh toán", "Tổng tiền", "Mã nhân viên", "Tên khách hàng", "Địa chỉ", "SĐT", "Trạng thái"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, true, false, false
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

                JText2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                JText2.setText("1");

                btnTimKiem.setBackground(new java.awt.Color(204, 255, 255));
                btnTimKiem.setBorder(null);
                btnTimKiem.setForeground(new java.awt.Color(51, 51, 255));
                btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/3.png"))); // NOI18N
                btnTimKiem.setText("Tìm kiếm");
                btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTimKiemActionPerformed(evt);
                        }
                });

                button1.setBackground(new java.awt.Color(153, 204, 255));
                button1.setText("Lọc");
                button1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button1ActionPerformed(evt);
                        }
                });

                btnThem.setBackground(new java.awt.Color(204, 255, 255));
                btnThem.setBorder(null);
                btnThem.setForeground(new java.awt.Color(51, 51, 255));
                btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/them.png"))); // NOI18N
                btnThem.setText("Tạo hóa đơn mới");
                btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnThem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnThemActionPerformed(evt);
                        }
                });

                btnCapNhat1.setBackground(new java.awt.Color(204, 255, 255));
                btnCapNhat1.setForeground(new java.awt.Color(51, 51, 255));
                btnCapNhat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/hoadon.png"))); // NOI18N
                btnCapNhat1.setText("In hóa đơn");
                btnCapNhat1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnCapNhat1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCapNhat1ActionPerformed(evt);
                        }
                });

                btnCapNhat3.setBackground(new java.awt.Color(204, 255, 255));
                btnCapNhat3.setBorder(null);
                btnCapNhat3.setForeground(new java.awt.Color(51, 51, 255));
                btnCapNhat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/export.png"))); // NOI18N
                btnCapNhat3.setText("Xuất danh sách");
                btnCapNhat3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnCapNhat3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCapNhat3ActionPerformed(evt);
                        }
                });

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
                                                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(334, Short.MAX_VALUE))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addGap(18, 18, 18)
                                                .addComponent(JText2)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNext)
                                                .addGap(348, 348, 348)
                                                .addComponent(btnCapNhat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCapNhat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(74, 74, 74)))
                                .addContainerGap())
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(txtTimKiem)
                                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(cboThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCapNhat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNext)
                                        .addComponent(JText2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLast)
                                        .addComponent(btnCapNhat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
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
                                .addContainerGap(10, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                jPanel12Layout.setVerticalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(51, 51, 255));
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
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                );
                jPanel14Layout.setVerticalGroup(
                        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(570, 570, 570)
                                .addComponent(jLabel22)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel22)
                                .addGap(3, 3, 3)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1306, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 726, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                );

                materialTabbed1.addTab("Hóa Đơn", jPanel1);

                jPanel6.setBackground(new java.awt.Color(255, 255, 255));

                jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel27.setForeground(new java.awt.Color(102, 204, 255));
                jLabel27.setText("Trả Hàng");

                txtTimkiemLS2.setText("Mã Hóa Đơn");
                txtTimkiemLS2.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                txtTimkiemLS2FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                txtTimkiemLS2FocusLost(evt);
                        }
                });
                txtTimkiemLS2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtTimkiemLS2ActionPerformed(evt);
                        }
                });

                jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel19.setText("Tìm kiếm hóa đơn");

                jPanel7.setBackground(new java.awt.Color(255, 255, 255));
                jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));

                jLabel39.setText("Địa chỉ:");

                JTextSDT3.setText("X");

                jLabel42.setText("Số điện thoại: ");

                jLabel43.setText("Khách hàng:");

                JTextKhachHang3.setText("X");

                JTextHoaDon3.setText("X");

                jLabel44.setText("Mã hóa đơn : ");

                JTextDiaChi.setText("X");

                jLabel3.setText("Tổng Tiền:");

                JTextTongTien3.setForeground(new java.awt.Color(255, 51, 51));
                JTextTongTien3.setText("X");

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JTextKhachHang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(JTextTongTien3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addComponent(jLabel42)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(JTextSDT3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addComponent(jLabel39)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(JTextDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addContainerGap())
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextHoaDon3, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                                        .addContainerGap()))
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel43)
                                        .addComponent(JTextKhachHang3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel42)
                                        .addComponent(JTextSDT3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel39)
                                        .addComponent(JTextDiaChi))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JTextTongTien3)
                                        .addComponent(jLabel3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel44)
                                                .addComponent(JTextHoaDon3))
                                        .addContainerGap(142, Short.MAX_VALUE)))
                );

                jPanel8.setBackground(new java.awt.Color(255, 255, 255));
                jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin đơn hàng"));

                jScrollPane12.setBorder(null);

                tblChiTiet3.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "STT", "Mã SPCT", "Tên sản phẩm", "Số lượng", "Đơn giá", "Tổng tiền"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblChiTiet3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblChiTiet3MouseClicked(evt);
                        }
                });
                jScrollPane12.setViewportView(tblChiTiet3);

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Quét QR"));
                jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));
                jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Thanh Toán"));

                btnTraHang.setBackground(new java.awt.Color(153, 204, 255));
                btnTraHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/reset.png"))); // NOI18N
                btnTraHang.setText("Trả hàng");
                btnTraHang.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTraHangActionPerformed(evt);
                        }
                });

                jLabel1.setText("Tên khách hàng:");

                jLabel6.setText("Tổng tiền gốc của hóa đơn:");

                jLabel7.setText("Tổng tiền gốc của sẩn phẩm trả hàng:");

                jLabel8.setText("Tiền thừa:");

                jLabel9.setText("Ghi chú:");

                JTextArea.setColumns(20);
                JTextArea.setRows(5);
                jScrollPane1.setViewportView(JTextArea);

                JTextKH.setText("X");

                JTextTienGocHoaDon.setText("X");

                JTextTienGocTraHang.setText("X");

                JTextTienThua.setText("X");

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(JTextTienThua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(JTextTienGocTraHang, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(JTextTienGocHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(JTextKH, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(77, Short.MAX_VALUE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnTraHang, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27))))
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnTraHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(JTextKH, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(JTextTienGocHoaDon))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(JTextTienGocTraHang))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(JTextTienThua))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(51, Short.MAX_VALUE))
                );

                jPanel9.setBackground(new java.awt.Color(255, 255, 255));
                jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách sản phẩm trả hàng"));

                jScrollPane13.setBorder(null);

                tblChiTiet4.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "", "STT", "Mã SPCT", "Tên sản phẩm", "Hãng", "Màu sắc", "Số lượng", "Đơn giá", "Thành tiền"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
                        };
                        boolean[] canEdit = new boolean [] {
                                true, false, false, false, false, false, false, false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblChiTiet4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblChiTiet4MouseClicked(evt);
                        }
                });
                jScrollPane13.setViewportView(tblChiTiet4);

                ckBox2.setText("Trả hàng tất cả");
                ckBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ckBox2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane13)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ckBox2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel9Layout.setVerticalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                );

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                btnTraHang1.setBackground(new java.awt.Color(153, 204, 255));
                btnTraHang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/reset.png"))); // NOI18N
                btnTraHang1.setText("Quét QR");
                btnTraHang1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTraHang1ActionPerformed(evt);
                        }
                });

                btnTraHang2.setBackground(new java.awt.Color(153, 204, 255));
                btnTraHang2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/reset.png"))); // NOI18N
                btnTraHang2.setText("Trả tất cả");
                btnTraHang2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTraHang2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap(92, Short.MAX_VALUE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(jLabel19)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtTimkiemLS2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(134, 134, 134)
                                                                .addComponent(btnTraHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel27)
                                                                .addGap(266, 266, 266)))
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(214, 214, 214))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                                .addComponent(btnTraHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(52, 52, 52))))))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel27)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel19)
                                                        .addComponent(txtTimkiemLS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnTraHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnTraHang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(131, Short.MAX_VALUE))
                );

                materialTabbed1.addTab("Trả hàng ", jPanel6);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

    private void ckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckBox2ActionPerformed
        boolean isSelected = ckBox2.isSelected();
        if (isSelected == true) {
            for (int row = 0; row < tblChiTiet4.getRowCount(); row++) {
                tblChiTiet4.setValueAt(isSelected, row, 0);
            }
        } else {
            for (int row = 0; row < tblChiTiet4.getRowCount(); row++) {
                tblChiTiet4.setValueAt(false, row, 0);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ckBox2ActionPerformed

    private void tblChiTiet4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTiet4MouseClicked
        showData70();


    }//GEN-LAST:event_tblChiTiet4MouseClicked

    private void btnTraHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHangActionPerformed
        if (ckBox2.isSelected()) {
            String mahd = txtTimkiemLS2.getText();
            hdctdao.traALll(mahd);
            hdctdao.traALll2(mahd);
            TimKiemTheoBang7();

            JOptionPane.showMessageDialog(this, "Đã Trả thành công!");
            try {
                TimKiemTheoBang11();
            } catch (Exception e) {
            }

        } else {
            int selectedRow = tblChiTiet4.getSelectedRow();
            int checkboxColumnIndex = 0;
            String mahd = txtTimkiemLS2.getText();

            if (selectedRow != -1) {
                Boolean isChecked = (Boolean) tblChiTiet4.getValueAt(selectedRow, checkboxColumnIndex);
                System.out.println("Checkbox ở dòng " + selectedRow + " được chọn: " + isChecked);
                if (isChecked == true) {
                    String soLuong = (String) tblChiTiet4.getValueAt(tblChiTiet4.getSelectedRow(), 6);
                    String masp = (String) tblChiTiet4.getValueAt(tblChiTiet4.getSelectedRow(), 2);
                    hdctdao.tra1mon(soLuong, mahd, masp);
                    JOptionPane.showMessageDialog(this, "Đã Trả thành công!");
                    TimKiemTheoBang7();
                    TimKiemTheoBang11();

                } else {
                    JOptionPane.showMessageDialog(this, "Mời bạn chọn món đồ cần trả");
                }

            } else {

            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraHangActionPerformed

    private void txtTimkiemLS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemLS2ActionPerformed
        TimKiemTheoBang7();
        showData7();
//        TimKiemTheoBang4();
    }//GEN-LAST:event_txtTimkiemLS2ActionPerformed

    private void txtTimkiemLS2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemLS2FocusLost
        if (txtTimkiemLS2.getText().length() == 0) {
            addPlaceHolderStyle(txtTimkiemLS2);
            txtTimkiemLS2.setText("Mã Hóa Đơn");
        }          // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemLS2FocusLost

    private void txtTimkiemLS2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemLS2FocusGained
        if (txtTimkiemLS2.getText().equals("Mã Hóa Đơn")) {
            txtTimkiemLS2.setText(null);
            removePlaceHolderStyle(txtTimkiemLS2);

        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemLS2FocusGained

    private void btnCapNhat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhat3ActionPerformed

        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("HoaDon");
            XSSFRow row = null;
            Cell cell = null;
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
            //            ListDS = DSdao.select();
            //
            //            for (int i = 0; i < 10; i++) {
            //                row = sheet.createRow(4 + i);
            //                cell = row.createCell(0, CellType.STRING);
            //                cell.setCellValue(i + 1);
            //
            //                cell=row.createCell(1, CellType.STRING);
            //                cell.setCellValue(l);
            //
            //            }
            ListDS = DSdao.select();
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
            File f = new File("C:\\Users\\ASUS\\Desktop\\duan1//HoaDon2.xlsx");
            try {
                FileOutputStream fis = new FileOutputStream(f);
                wordkbook.write(fis);
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Xuất thanh cong");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Loi mo file");
        }
    }//GEN-LAST:event_btnCapNhat3ActionPerformed

    private void btnCapNhat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhat1ActionPerformed
        String mahd = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
        PrintHoaDon2 frame2 = new PrintHoaDon2(mahd);
    }//GEN-LAST:event_btnCapNhat1ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        JOptionPane.showMessageDialog(this, "Chức năng đang phát triển!");        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (check()) {
            fillLocDuLieu(0, 5);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        fillTimKiemHD();   // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLastbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastbtnThemActionPerformed
        if (pageIndex == 0) {

        } else {
            try {
                if (pageIndex >= 0) {
                    pageIndex--;
                    this.load(pageIndex, 5);
                    JText2.setText(String.valueOf(pageIndex + 1));
                } else {
                    pageIndex = 0;
                    this.load(pageIndex, 5);
                    JText2.setText(String.valueOf(pageIndex + 1));
                }
            } catch (Exception e) {
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastbtnThemActionPerformed

    private void btnNextbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextbtnThemActionPerformed
        if (pageIndex >= 0) {
            pageIndex++;
            this.load(pageIndex, 5);
            JText2.setText(String.valueOf(pageIndex + 1));
        } else {
            pageIndex = 0;
            this.load(pageIndex, 5);
            JText2.setText(String.valueOf(pageIndex + 1));
        }  // TODO add your handling code here:
    }//GEN-LAST:event_btnNextbtnThemActionPerformed

    private void txtTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuActionPerformed

    private void cboThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThanhToanActionPerformed
        fillComBoThanhToan();        // TODO add your handling code here:
    }//GEN-LAST:event_cboThanhToanActionPerformed

    private void cboTrangThaicboTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrangThaicboTrangThaiActionPerformed
        fillComBo();        // TODO add your handling code here:
    }//GEN-LAST:event_cboTrangThaicboTrangThaiActionPerformed

    private void txtTimKiemtxtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemtxtTimKiemActionPerformed
        fillTimKiemHD();        // TODO add your handling code here:
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
        fillTim2();
        TimKiemTheoBang();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHoaDontblHoaDonMouseClicked

    private void tblChiTiet3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTiet3MouseClicked
        TimKiemTheoBang4();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblChiTiet3MouseClicked

    private void btnTraHang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHang1ActionPerformed

        initWebcam();
    }//GEN-LAST:event_btnTraHang1ActionPerformed

    private void btnTraHang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHang2ActionPerformed
        TimKiemTheoBang12();
    }//GEN-LAST:event_btnTraHang2ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel JText2;
        private javax.swing.JTextArea JTextArea;
        private javax.swing.JLabel JTextDiaChi;
        private javax.swing.JLabel JTextHoaDon3;
        private javax.swing.JLabel JTextKH;
        private javax.swing.JLabel JTextKhachHang3;
        private javax.swing.JLabel JTextSDT3;
        private javax.swing.JLabel JTextTienGocHoaDon;
        private javax.swing.JLabel JTextTienGocTraHang;
        private javax.swing.JLabel JTextTienThua;
        private javax.swing.JLabel JTextTongTien3;
        private com.polyshoes.swing.Button btnCapNhat1;
        private com.polyshoes.swing.Button btnCapNhat3;
        private javax.swing.JButton btnLast;
        private javax.swing.JButton btnNext;
        private com.polyshoes.swing.Button btnThem;
        private com.polyshoes.swing.Button btnTimKiem;
        private com.polyshoes.swing.Button btnTraHang;
        private com.polyshoes.swing.Button btnTraHang1;
        private com.polyshoes.swing.Button btnTraHang2;
        private com.polyshoes.swing.Button button1;
        private javax.swing.JComboBox<String> cboThanhToan;
        private javax.swing.JComboBox<String> cboTrangThai;
        private javax.swing.JCheckBox ckBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel39;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel42;
        private javax.swing.JLabel jLabel43;
        private javax.swing.JLabel jLabel44;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel14;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane12;
        private javax.swing.JScrollPane jScrollPane13;
        private javax.swing.JScrollPane jScrollPane19;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane6;
        private com.polyshoes.swing.tabbed.MaterialTabbed materialTabbed1;
        private com.polyshoes.swing.table.Table tblChiTiet;
        private com.polyshoes.swing.table.Table tblChiTiet3;
        private com.polyshoes.swing.table.Table tblChiTiet4;
        private com.polyshoes.swing.table.Table tblHoaDon;
        private com.polyshoes.swing.table.Table tblTimeLine2;
        private javax.swing.JTextField txtDen;
        private javax.swing.JTextField txtTimKiem;
        private javax.swing.JTextField txtTimkiemLS2;
        private javax.swing.JTextField txtTu;
        // End of variables declaration//GEN-END:variables
}
