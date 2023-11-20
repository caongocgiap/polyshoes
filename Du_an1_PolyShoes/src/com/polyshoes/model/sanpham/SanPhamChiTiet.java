package com.polyshoes.model.sanpham;

import java.security.SecureRandom;
import java.util.Random;

public class SanPhamChiTiet {

        private String ma;
        private String ten;
        private String danhMuc;
        private String thuongHieu;
        private String xuatXu;
        private String nsx;
        private String chatLieu;
        private String deGiay;
        private String coGiay;
        private String mauSac;
        private int size;
        private double gia;
        private int soLuongTon;
        private double  khoiLuong;
        private String trangThai;

        public SanPhamChiTiet() {
        }

        public SanPhamChiTiet(String ma, String ten, String danhMuc, String thuongHieu, String xuatXu, String NSX, String chatLieu, 
                String deGiay, String coGiay, String mauSac, int Size, double gia, int soLuongTon, double khoiLuong, String trangThai) {
                this.ma = ma;
                this.ten = ten;
                this.danhMuc = danhMuc;
                this.thuongHieu = thuongHieu;
                this.xuatXu = xuatXu;
                this.nsx = NSX;
                this.chatLieu = chatLieu;
                this.deGiay = deGiay;
                this.coGiay = coGiay;
                this.mauSac = mauSac;
                this.size = Size;
                this.gia = gia;
                this.soLuongTon = soLuongTon;
                this.khoiLuong = khoiLuong;
                this.trangThai = trangThai;
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

        public String getDanhMuc() {
                return danhMuc;
        }

        public void setDanhMuc(String danhMuc) {
                this.danhMuc = danhMuc;
        }

        public String getThuongHieu() {
                return thuongHieu;
        }

        public void setThuongHieu(String thuongHieu) {
                this.thuongHieu = thuongHieu;
        }

        public String getXuatXu() {
                return xuatXu;
        }

        public void setXuatXu(String xuatXu) {
                this.xuatXu = xuatXu;
        }

        public String getNSX() {
                return nsx;
        }

        public void setNSX(String NSX) {
                this.nsx = NSX;
        }

        public String getChatLieu() {
                return chatLieu;
        }

        public void setChatLieu(String chatLieu) {
                this.chatLieu = chatLieu;
        }

        public String getDeGiay() {
                return deGiay;
        }

        public void setDeGiay(String deGiay) {
                this.deGiay = deGiay;
        }

        public String getCoGiay() {
                return coGiay;
        }

        public void setCoGiay(String coGiay) {
                this.coGiay = coGiay;
        }

        public String getMauSac() {
                return mauSac;
        }

        public void setMauSac(String mauSac) {
                this.mauSac = mauSac;
        }

        public int getSize() {
                return size;
        }

        public void setSize(int Size) {
                this.size = Size;
        }

        public double getGia() {
                return gia;
        }

        public void setGia(double gia) {
                this.gia = gia;
        }

        public int getSoLuongTon() {
                return soLuongTon;
        }

        public void setSoLuongTon(int soLuongTon) {
                this.soLuongTon = soLuongTon;
        }

        public double getKhoiLuong() {
                return khoiLuong;
        }

        public void setKhoiLuong(double khoiLuong) {
                this.khoiLuong = khoiLuong;
        }

        public String getTrangThai() {
                return trangThai;
        }

        public void setTrangThai(String trangThai) {
                this.trangThai = trangThai;
        }
        
        public Object[] toDataRow() {
                return new Object[] {
                        ma, ten, danhMuc, xuatXu, nsx, mauSac, size, thuongHieu, chatLieu, deGiay, coGiay, khoiLuong, gia, soLuongTon, trangThai
                };
        }
        
        public Object[] toInsert() {
                setMa(generateCode());
                return new Object[] {
                        ma, ten, danhMuc, xuatXu, nsx, mauSac, size, thuongHieu, chatLieu, deGiay, coGiay, khoiLuong, gia, soLuongTon, trangThai
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
                return "SPCT-" + code.toString();
        }
}
