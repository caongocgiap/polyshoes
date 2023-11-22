/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.HoaDon;

import com.polyshoes.dao.HoaDon.HoaDonChiTietDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.polyshoes.dao.HoaDon.HoaDonDao;
import com.polyshoes.dao.HoaDon.LichSuHoaDonDao;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import com.polyshoes.model.HoaDon.LichSuHoaDon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author ASUS
 */
public class HoaDonJPanel41 extends javax.swing.JPanel {

    int index = -1;
    HoaDonDao dao = new HoaDonDao();
    LichSuHoaDonDao lsdao = new LichSuHoaDonDao();
    private List<HoaDon> ListHD = new ArrayList<>();
    HoaDonChiTietDao hdctdao = new HoaDonChiTietDao();
    private int pageIndex = 0;

    public HoaDonJPanel41() {
        initComponents();

//        TimKiemTheoBang();
        setBackground(Color.WHITE);
//        filltableLichSu(0, 5);
//        fillComBoBoxTrangThai();
        load(0, 5);
        addPlaceHolderStyle(txtTimKiem);
        tblHoaDon.fixTable(jScrollPane19);

        tblTimeLine1.fixTable(jScrollPane9);
        tblTimeLine2.fixTable(jScrollPane6);
        tblChiTiet2.fixTable(jScrollPane8);

        tblChiTiet.fixTable(jScrollPane2);
//        tblLichSu.fixTable(jScrollPane2);
//        String mahd = (String) tblLichSu.getValueAt(0, 3);
//        String mahd = (String) tblHoaDon.getValueAt(0, 1);
//        System.out.println(mahd + "");
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/yyyy HH:mm");

    }

//    private void initWebcam() {
//        Dimension size = WebcamResolution.QVGA.getSize();
//        webcam = Webcam.getWebcams().get(0); //0 is default webcam
//        webcam.setViewSize(size);
//
//        PanelWeb = new WebcamPanel(webcam);
//        PanelWeb.setPreferredSize(size);
//        PanelWeb.setFPSDisplayed(true);
//
//        jPanel2.add(PanelWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 180));
//
//        executor.execute(this);
//    }

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

//    void updateTraHang() {
//        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn không", "", JOptionPane.YES_NO_OPTION);
//        String mahd = txtTraHang.getText();
//        if (a == 0) {
//            try {
//                dao.updateTraHang(mahd);
//                JOptionPane.showMessageDialog(this, "Đã trả thành công!");
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Trả thất bại!");
//                e.printStackTrace();
//            }
//        }
//    }
//
//    void updateTra1Hang() {
//        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn không", "", JOptionPane.YES_NO_OPTION);
//        String mahd = txtTraHang.getText();
//        String ten = (String) tblSanPham1.getValueAt(tblSanPham1.getSelectedRow(), 1);
//        if (a == 0) {
//            try {
//                dao.updateTra1Hang(mahd, ten);
//                JOptionPane.showMessageDialog(this, "Đã trả thành công!");
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Trả thất bại!");
//                e.printStackTrace();
//            }
//        }
//    }
//
//    void inHoaDon() {
//        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn không", "", JOptionPane.YES_NO_OPTION);
//        String mahd = (String) tblHoaDon.getValueAt(tblHoaDon.getSelectedRow(), 1);
//        if (a == 0) {
//            try {
//                dao.inHoaDon(mahd);
//                JOptionPane.showMessageDialog(this, "In thành công!");
//                load(0, 5);
////                filltableLichSu(0, 5);
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "In thất bại!");
//                e.printStackTrace();
//            }
//        }
//    }
//    void KhoiPhuc() {
//        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn không", "", JOptionPane.YES_NO_OPTION);
//        String mahd = (String) tblLichSu.getValueAt(tblLichSu.getSelectedRow(), 3);
//        if (a == 0) {
//            try {
//                lsdao.delete(mahd);
//                JOptionPane.showMessageDialog(this, "Khôi phục thành công!");
//                load(0, 5);
//                filltableLichSu(0, 5);
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Khôi phục thất bại!");
//                e.printStackTrace();
//            }
//        }
//    }
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

    void fillTimkiemLS2() {
        DefaultTableModel model = (DefaultTableModel) tblTimeLine1.getModel();
        model.setRowCount(0);
        int stt = 0;
        String lyDo = "....";
        try {
            String mahd = txtTimkiemLS1.getText();
            List<LichSuHoaDon> list = lsdao.selectByKeyword(mahd);
            for (LichSuHoaDon ls : list) {
                stt++;
                Object[] row = {
                    stt,
                    ls.getTenNV(),
                    ls.getNgayTao(),
                    ls.getFormattedNgayCapNhat(),
                    lyDo,};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi truy van du lieu!!");
            e.printStackTrace();
        }
    }

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
    void TimKiemTheoBang3() {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet2.getModel();
        model.setRowCount(0);
        String mahd = txtTimkiemLS1.getText();
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
    void showData5() {
        try {
            String mahd = txtTimkiemLS1.getText();
            List<HoaDon> model = dao.selectByLSSS(mahd);
            for (HoaDon x : model) {
                JTextHoaDon2.setText(x.getMaHD());
                JTextKhachHang2.setText(x.getTenKH());
                JTextSDT2.setText(x.getSDT());
                JTextNgayTao2.setText(x.getNgayTaoString());
                JTextNgayTT2.setText(x.getNgayTTAsString());
                JTextArea2.setText(x.getDiaChi());
                JTextTrangThai2.setText(x.getTrangThaiA());
                JTextTongTien2.setText(String.valueOf(x.getTongTien()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void showData6() {
        try {
            String mahd = txtTimkiemLS1.getText();
            List<LichSuHoaDon> model = lsdao.selectByKeyword(mahd);
            for (LichSuHoaDon x : model) {
                JTextTenNhanVien1.setText(x.getTenNV());
                JTextMaNhanVien1.setText(x.getMaNV());
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
                    ls.getTenNV(),
                    ls.getFormattedTao(),
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

    public void tableChanged() {
        int selectedRow = tblChiTiet2.getSelectedRow();
        int checkboxColumnIndex = 0;

        if (selectedRow != -1) {
            Boolean isChecked = (Boolean) tblChiTiet2.getValueAt(selectedRow, checkboxColumnIndex);
            System.out.println("Checkbox ở dòng " + selectedRow + " được chọn: " + isChecked);
        } else {
            System.out.println("Chọn một dòng trước khi lấy giá trị checkbox.");
        }
    }

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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtTimkiemLS1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        JTextArea2 = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        JTextNgayTT2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        JTextNgayTao2 = new javax.swing.JLabel();
        JTextSDT2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        JTextKhachHang2 = new javax.swing.JLabel();
        JTextHoaDon2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        JTextMaNhanVien1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        JTextTenNhanVien1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        JTextTrangThai2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        JTextTongTien2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblChiTiet2 = new com.polyshoes.swing.table.Table();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblTimeLine1 = new com.polyshoes.swing.table.Table();
        ckboxAll = new javax.swing.JCheckBox();
        btnTimkiemLS4 = new com.polyshoes.swing.Button();
        btnTimkiemLS3 = new com.polyshoes.swing.Button();
        PanelWeb = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1058, 741));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1058, 741));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn"));

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
        if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
            tblHoaDon.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblHoaDon.getColumnModel().getColumn(1).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblHoaDon.getColumnModel().getColumn(2).setPreferredWidth(30);
            tblHoaDon.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

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

        btnNext.setBackground(new java.awt.Color(153, 204, 255));
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextbtnThemActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(153, 204, 255));
        btnLast.setText("<<");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastbtnThemActionPerformed(evt);
            }
        });

        JText2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JText2.setText("1");

        btnTimKiem.setBackground(new java.awt.Color(153, 204, 255));
        btnTimKiem.setText("Tìm kiếm");
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

        btnThem.setBackground(new java.awt.Color(153, 204, 255));
        btnThem.setText("Tạo hóa đơn mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat1.setBackground(new java.awt.Color(153, 204, 255));
        btnCapNhat1.setText("In hóa đơn");
        btnCapNhat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhat1ActionPerformed(evt);
            }
        });

        btnCapNhat3.setBackground(new java.awt.Color(153, 204, 255));
        btnCapNhat3.setText("Xuất danh sách");
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
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane19)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLast)
                        .addGap(27, 27, 27)
                        .addComponent(JText2)
                        .addGap(36, 36, 36)
                        .addComponent(btnNext)
                        .addGap(343, 343, 343)
                        .addComponent(btnCapNhat1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
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
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCapNhat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapNhat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNext)
                        .addComponent(JText2)
                        .addComponent(btnLast)))
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
                "STT", "Người tạo", "Ngày tạo", "Ngày cập nhật", "Lý do"
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
        if (tblTimeLine2.getColumnModel().getColumnCount() > 0) {
            tblTimeLine2.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel22)
                .addGap(3, 3, 3)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hóa Đơn", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 204, 255));
        jLabel24.setText("Trả Hàng");

        txtTimkiemLS1.setText("Mã Hóa Đơn");
        txtTimkiemLS1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemLS1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemLS1FocusLost(evt);
            }
        });
        txtTimkiemLS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemLS1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Tìm kiếm hóa đơn");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin "));

        JTextArea2.setColumns(20);
        JTextArea2.setRows(5);
        jScrollPane10.setViewportView(JTextArea2);

        jLabel38.setText("Địa chỉ:");

        jLabel37.setText("Ngày thanh toán:");

        JTextNgayTT2.setText("X");

        jLabel36.setText("Ngày tạo: ");

        JTextNgayTao2.setText("X");

        JTextSDT2.setText("X");

        jLabel35.setText("Số điện thoại: ");

        jLabel34.setText("Khách hàng:");

        JTextKhachHang2.setText("X");

        JTextHoaDon2.setText("X");

        jLabel33.setText("Mã hóa đơn : ");

        jLabel32.setText("Mã nhân viên:");

        JTextMaNhanVien1.setText("X");

        jLabel31.setText("Tên nhân viên:");

        JTextTenNhanVien1.setText("X");

        jLabel30.setText("Trạng thái:");

        JTextTrangThai2.setText("X");

        jLabel29.setText("Tổng tiền:");

        JTextTongTien2.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextNgayTao2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(195, 195, 195)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextNgayTT2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextSDT2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTextHoaDon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JTextKhachHang2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTextTenNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextMaNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTextTrangThai2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTextTongTien2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(JTextHoaDon2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(JTextKhachHang2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(JTextSDT2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(JTextNgayTao2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(JTextNgayTT2))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel38))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(JTextTenNhanVien1))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(JTextTrangThai2)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(JTextMaNhanVien1)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTextTongTien2)
                                .addComponent(jLabel29))
                            .addGap(168, 168, 168)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblChiTiet2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "STT", "Mã SPCT", "Tên sản phẩm", "Hãng", "Màu", "Size", "Số lượng", "Trạng thái", "Đơn giá", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblChiTiet2);
        if (tblChiTiet2.getColumnModel().getColumnCount() > 0) {
            tblChiTiet2.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1278, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblTimeLine1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Người tạo", "Ngày tạo", "Ngày cập nhật", "Lý do"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblTimeLine1);
        if (tblTimeLine1.getColumnModel().getColumnCount() > 0) {
            tblTimeLine1.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        ckboxAll.setText("Chọn tất cả");
        ckboxAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxAllActionPerformed(evt);
            }
        });

        btnTimkiemLS4.setBackground(new java.awt.Color(153, 204, 255));
        btnTimkiemLS4.setText("Trả hàng");
        btnTimkiemLS4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnTimkiemLS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemLS4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(ckboxAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimkiemLS4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimkiemLS4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckboxAll))
                .addGap(18, 18, 18))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        btnTimkiemLS3.setBackground(new java.awt.Color(153, 204, 255));
        btnTimkiemLS3.setText("Tìm kiếm");
        btnTimkiemLS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemLS3ActionPerformed(evt);
            }
        });

        PanelWeb.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelWebLayout = new javax.swing.GroupLayout(PanelWeb);
        PanelWeb.setLayout(PanelWebLayout);
        PanelWebLayout.setHorizontalGroup(
            PanelWebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanelWebLayout.setVerticalGroup(
            PanelWebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1063, 1063, 1063))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimkiemLS1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimkiemLS3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(584, 584, 584)
                                .addComponent(jLabel24)))
                        .addGap(438, 438, 438)
                        .addComponent(PanelWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtTimkiemLS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiemLS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Thông tin");

        jTabbedPane1.addTab("Trả hàng", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimkiemLS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemLS4ActionPerformed
//        delete1mon();
//        TimKiemTheoBang3();
        // TODO add your handling code here:
//        String mahd = (String) tblChiTiet2.getValueAt(tblChiTiet2.(), 2);
//        System.out.println("" + mahd);
        if (ckboxAll.isSelected()) {
            String mahd = txtTimkiemLS1.getText();
            hdctdao.traALll(mahd);
            TimKiemTheoBang3();
            JOptionPane.showMessageDialog(this, "Đã Trả thành công!");

        } else {
            int selectedRow = tblChiTiet2.getSelectedRow();
            int checkboxColumnIndex = 0;
            String mahd = txtTimkiemLS1.getText();

            if (selectedRow != -1) {
                Boolean isChecked = (Boolean) tblChiTiet2.getValueAt(selectedRow, checkboxColumnIndex);
                System.out.println("Checkbox ở dòng " + selectedRow + " được chọn: " + isChecked);
                if (isChecked == true) {
                    String masp = (String) tblChiTiet2.getValueAt(tblChiTiet2.getSelectedRow(), 2);
                    hdctdao.tra1mon(mahd, masp);
                    JOptionPane.showMessageDialog(this, "Đã Trả thành công!");
                    TimKiemTheoBang3();
                } else {
                    JOptionPane.showMessageDialog(this, "Mời bạn chọn món đồ cần trả");
                }

            } else {

            }
        }


    }//GEN-LAST:event_btnTimkiemLS4ActionPerformed

    private void btnTimkiemLS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemLS3ActionPerformed
        TimKiemTheoBang3();
        fillTimkiemLS2();
        showData5();
        showData6();// TODO add your handling code here:
    }//GEN-LAST:event_btnTimkiemLS3ActionPerformed

    private void txtTimkiemLS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemLS1ActionPerformed
        fillTimkiemLS2();
        TimKiemTheoBang3();
        showData5();
        showData6();// TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemLS1ActionPerformed

    private void txtTimkiemLS1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemLS1FocusLost
        if (txtTimkiemLS1.getText().length() == 0) {
            addPlaceHolderStyle(txtTimkiemLS1);
            txtTimkiemLS1.setText("Mã Hóa Đơn");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemLS1FocusLost

    private void txtTimkiemLS1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemLS1FocusGained
        if (txtTimkiemLS1.getText().equals("Mã Hóa Đơn")) {
            txtTimkiemLS1.setText(null);
            removePlaceHolderStyle(txtTimkiemLS1);

        }          // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemLS1FocusGained

    private void btnCapNhat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhat3ActionPerformed
        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("danhsach");
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
            cell.setCellValue("Tồng tiền");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Mã nhân viên");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Tên khách hàng");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("SDT");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Trạng thái");
            ListHD = dao.select();
            for (int i = 0; i < ListHD.size(); i++) {
                row = sheet.createRow(4 + i);
                cell = row.createCell(0, CellType.NUMERIC);
                cell.setCellValue(i + 1);
                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(ListHD.get(i).getMaNV());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(ListHD.get(i).getNgayTaoString());

                cell = row.createCell(3, CellType.BLANK);
                cell.setCellValue(ListHD.get(i).getNgayTTAsString());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(ListHD.get(i).getTongTien());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(ListHD.get(i).getMax());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(ListHD.get(i).getTenKH());

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue(ListHD.get(i).getSDT());

                cell = row.createCell(8, CellType.STRING);
                cell.setCellValue(ListHD.get(i).getTrangThaiA());

            }

            File f = new File("C:\\Users\\ASUS\\Desktop\\duan1//danhsach.xlsx");
            try {
                FileOutputStream fis = new FileOutputStream(f);
                wordkbook.write(fis);
                fis.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "in thanh cong");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Loi mo file");
        }// TODO add your handlin  // TODO add your handling code here:
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

    private void ckboxAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxAllActionPerformed

        boolean isSelected = ckboxAll.isSelected();
        if (isSelected == true) {
            for (int row = 0; row < tblChiTiet2.getRowCount(); row++) {
                tblChiTiet2.setValueAt(isSelected, row, 0);
            }
        } else {
            for (int row = 0; row < tblChiTiet2.getRowCount(); row++) {
                tblChiTiet2.setValueAt(false, row, 0);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ckboxAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JText2;
    private javax.swing.JTextArea JTextArea2;
    private javax.swing.JLabel JTextHoaDon2;
    private javax.swing.JLabel JTextKhachHang2;
    private javax.swing.JLabel JTextMaNhanVien1;
    private javax.swing.JLabel JTextNgayTT2;
    private javax.swing.JLabel JTextNgayTao2;
    private javax.swing.JLabel JTextSDT2;
    private javax.swing.JLabel JTextTenNhanVien1;
    private javax.swing.JLabel JTextTongTien2;
    private javax.swing.JLabel JTextTrangThai2;
    private javax.swing.JPanel PanelWeb;
    private com.polyshoes.swing.Button btnCapNhat1;
    private com.polyshoes.swing.Button btnCapNhat3;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private com.polyshoes.swing.Button btnThem;
    private com.polyshoes.swing.Button btnTimKiem;
    private com.polyshoes.swing.Button btnTimkiemLS3;
    private com.polyshoes.swing.Button btnTimkiemLS4;
    private com.polyshoes.swing.Button button1;
    private javax.swing.JComboBox<String> cboThanhToan;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JCheckBox ckboxAll;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.polyshoes.swing.table.Table tblChiTiet;
    private com.polyshoes.swing.table.Table tblChiTiet2;
    private com.polyshoes.swing.table.Table tblHoaDon;
    private com.polyshoes.swing.table.Table tblTimeLine1;
    private com.polyshoes.swing.table.Table tblTimeLine2;
    private javax.swing.JTextField txtDen;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimkiemLS1;
    private javax.swing.JTextField txtTu;
    // End of variables declaration//GEN-END:variables
}
