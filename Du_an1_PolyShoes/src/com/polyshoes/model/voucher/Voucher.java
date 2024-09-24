package com.polyshoes.model.voucher;

import com.polyshoes.dao.NhanVien.NhanVienDao;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Voucher {

        int stt;
        private int id;
        private String ma;
        private String ten;
        private Date ngayBD;
        private Date ngayKT;
        private int soLuong;
        private double giaTriMin;
        private int phanTramGiam;
        private double giamToiDa;
        private Date ngayTao;
        private int nguoiTao;
        private int trangThai; // 0: Đang diễn ra, 1: Sắp diễn ra, 2: Đã kết thúc
        
        NhanVienDao nvDao = new NhanVienDao();

        public Voucher() {
        }
        
        public Voucher(String ten) {
                this.ten = ten;
        }

        public Voucher(int stt, int id, String ma, String ten, Date ngayBD, Date ngayKT, int soLuong, double giaTriMin, int phanTramGiam, double giamToiDa, Date ngayTao, int nguoiTao, int trangThai) {
                this.stt = stt;
                this.id = id;
                this.ma = ma;
                this.ten = ten;
                this.ngayBD = ngayBD;
                this.ngayKT = ngayKT;
                this.soLuong = soLuong;
                this.giaTriMin = giaTriMin;
                this.phanTramGiam = phanTramGiam;
                this.giamToiDa = giamToiDa;
                this.ngayTao = ngayTao;
                this.nguoiTao = nguoiTao;
                this.trangThai = trangThai;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getMa() {
                return ma;
        }

        public void setMa(String ma) {
                this.ma = ma;
        }

        public String getTen() {
                return ten;
        }

        public void setTen(String ten) {
                this.ten = ten;
        }

        public Date getNgayBD() {
                return ngayBD;
        }

        public void setNgayBD(Date ngayBD) {
                this.ngayBD = ngayBD;
        }

        public Date getNgayKT() {
                return ngayKT;
        }

        public void setNgayKT(Date ngayKT) {
                this.ngayKT = ngayKT;
        }

        public int getSoLuong() {
                return soLuong;
        }

        public void setSoLuong(int soLuong) {
                this.soLuong = soLuong;
        }

        public int getPhanTramGiam() {
                return phanTramGiam;
        }

        public void setPhanTramGiam(int phanTramGiam) {
                this.phanTramGiam = phanTramGiam;
        }

        public double getGiaTriMin() {
                return giaTriMin;
        }

        public void setGiaTriMin(double giaTriMin) {
                this.giaTriMin = giaTriMin;
        }

        public double getGiamToiDa() {
                return giamToiDa;
        }

        public void setGiamToiDa(double giamToiDa) {
                this.giamToiDa = giamToiDa;
        }

        public Date getNgayTao() {
                return ngayTao;
        }

        public int getNguoiTao() {
                return nguoiTao;
        }

        public void setNguoiTao(int nguoiTao) {
                this.nguoiTao = nguoiTao;
        }

        public void setNgayTao(Date ngayTao) {
                this.ngayTao = ngayTao;
        }

        public int getTrangThai() {
                return trangThai;
        }

        public void setTrangThai(int trangThai) {
                this.trangThai = trangThai;
        }

        @Override
        public String toString() {
                return ma + " - " + String.valueOf(phanTramGiam) + "%";
        }

        public Object[] toDataRow() {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                NumberFormat tienFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                String trangThaiHT;
                trangThaiHT = switch (trangThai) {
                        case 0 -> "Sắp diễn ra";
                        case 1 -> "Đang diễn ra";
                        case 2 -> "Đã kết thúc";
                        default -> "Đã hủy";
                };
                return new Object[]{
                        stt, ma, ten, dateFormat.format(ngayBD), dateFormat.format(ngayKT), soLuong, tienFormat.format(giaTriMin), 
                        phanTramGiam + "%", tienFormat.format(giamToiDa), dateFormat.format(ngayTao), nvDao.getMaById(nguoiTao), trangThaiHT
                };
        }
        
        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        private static final int CODE_LENGTH = 5;

        public static String generateCode() {
                Random random = new SecureRandom();
                StringBuilder code = new StringBuilder(CODE_LENGTH);
                for (int i = 0; i < CODE_LENGTH; i++) {
                        int randomIndex = random.nextInt(CHARACTERS.length());
                        code.append(CHARACTERS.charAt(randomIndex));
                }
                return "VC-" + code.toString();
        }
}
