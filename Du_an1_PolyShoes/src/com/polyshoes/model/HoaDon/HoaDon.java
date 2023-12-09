package com.polyshoes.model.HoaDon;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class HoaDon {

        private int ID;
        private String MaHD;
        private Date NgayTao;
        private Date NgayTT;
        private double TongTien;
        private String MaNV;
        private String TenKH;
        private String SDT;
        private int TrangThai;
        private String DiaChi;
        private int IDNhanVien;
        private boolean HTTT;
        private double soTienGiam;

        public HoaDon() {
        }

        public HoaDon(int ID, String MaHD, Date NgayTao, Date NgayTT, String MaNV, String TenKH, double TongTien, double soTienGiam, boolean HTTT) {
                this.ID = ID;
                this.MaHD = MaHD;
                this.NgayTao = NgayTao;
                this.NgayTT = NgayTT;
                this.MaNV = MaNV;
                this.TenKH = TenKH;
                this.TongTien = TongTien;
                this.soTienGiam = soTienGiam;
                this.HTTT = HTTT;
        }
        
        public HoaDon(int ID, String MaHD, Date NgayTao, Date NgayTT, double TongTien, String MaNV, String TenKH, String SDT, int TrangThai, String DiaChi, int IDNhanVien) {
                this.ID = ID;
                this.MaHD = MaHD;
                this.NgayTao = NgayTao;
                this.NgayTT = NgayTT;
                this.TongTien = TongTien;
                this.MaNV = MaNV;
                this.TenKH = TenKH;
                this.SDT = SDT;
                this.TrangThai = TrangThai;
                this.DiaChi = DiaChi;
                this.IDNhanVien = IDNhanVien;
        }

        public boolean isHTTT() {
                return HTTT;
        }

        public void setHTTT(boolean HTTT) {
                this.HTTT = HTTT;
        }

        public double getSoTienGiam() {
                return soTienGiam;
        }

        public void setSoTienGiam(double soTienGiam) {
                this.soTienGiam = soTienGiam;
        }

        public int getID() {
                return ID;
        }

        public void setID(int ID) {
                this.ID = ID;
        }

        public String getMaHD() {
                return MaHD;
        }

        public void setMaHD(String MaHD) {
                this.MaHD = MaHD;
        }

        public Date getNgayTao() {
                return NgayTao;
        }

        public void setNgayTao(Date NgayTao) {
                this.NgayTao = NgayTao;
        }

        public Date getNgayTT() {
                return NgayTT;
        }

        public void setNgayTT(Date NgayTT) {
                this.NgayTT = NgayTT;
        }

        public double getTongTien() {
                return TongTien;
        }

        public void setTongTien(double TongTien) {
                this.TongTien = TongTien;
        }

        public String getMaNV() {
                return MaNV;
        }

        public void setMaNV(String MaNV) {
                this.MaNV = MaNV;
        }

        public String getTenKH() {
                return TenKH;
        }

        public void setTenKH(String TenKH) {
                this.TenKH = TenKH;
        }

        public String getSDT() {
                return SDT;
        }

        public void setSDT(String SDT) {
                this.SDT = SDT;
        }

        public int getTrangThai() {
                return TrangThai;
        }

        public void setTrangThai(int TrangThai) {
                this.TrangThai = TrangThai;
        }

        public String getDiaChi() {
                return DiaChi;
        }

        public void setDiaChi(String DiaChi) {
                this.DiaChi = DiaChi;
        }

        public int getIDNhanVien() {
                return IDNhanVien;
        }

        public void setIDNhanVien(int IDNhanVien) {
                this.IDNhanVien = IDNhanVien;
        }

        public String getMax() {
                if (MaNV == getMaNV()) {
                        return "MANV" + getMaNV();
                } else {
                        return "MANV" + getMaNV();
                }

        }

        public String getIDHoaDon() {
                if (MaNV == getMaNV()) {
                        return "HD" + getID();
                } else {
                        return "HD" + getID();
                }

        }

        public String getTrangThaiA() {
                switch (getTrangThai()) {
                        case 0:
                                return "Chưa thanh toán";
                        case 1:
                                return "Đã thanh toán";
                        case 2:
                                return "Đã hủy thanh toán";
                        default:
                                return null;
                }
        }

        public String getFormattedTao() {
                if (NgayTao != null) {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        return dateFormat.format(NgayTao);
                } else {
                        return null;
                }
        }

        public String getFormattedTT() {
                if (NgayTT != null) {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        return dateFormat.format(NgayTao);
                } else {
                        return null;
                }
        }

        public String getNgayTTAsString() {
                if (NgayTT != null) {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        return dateFormat.format(NgayTT);
                } else {
                        return null; // or an empty string based on your requirements
                }
        }

        public String getNgayTaoString() {
                if (NgayTao != null) {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        return dateFormat.format(NgayTao);
                } else {
                        return null; // or an empty string based on your requirements
                }
        }

        public static String generateCode() {
                Random random = new SecureRandom();
                StringBuilder code = new StringBuilder(CODE_LENGTH);

                for (int i = 0; i < CODE_LENGTH; i++) {
                        int randomIndex = random.nextInt(CHARACTERS.length());
                        code.append(CHARACTERS.charAt(randomIndex));
                }

                return "HD-" + code.toString();
        }
        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        private static final int CODE_LENGTH = 5;

}
