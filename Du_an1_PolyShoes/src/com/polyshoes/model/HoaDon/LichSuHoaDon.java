package com.polyshoes.model.HoaDon;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class LichSuHoaDon {

    private int ID;
    private String TenNV;
    private String MaNV;
    private String TenKH;
    private double TongTien;
    private Date NgayTao;
    private Date NgayTT;
    private int TrangThai;
    private String ngayCapNhat;

    public LichSuHoaDon() {
    }

    public LichSuHoaDon(int ID, String TenNV, String MaNV, String TenKH, double TongTien, Date NgayTao, Date NgayTT, int TrangThai, String ngayCapNhat) {
        this.ID = ID;
        this.TenNV = TenNV;
        this.MaNV = MaNV;
        this.TenKH = TenKH;
        this.TongTien = TongTien;
        this.NgayTao = NgayTao;
        this.NgayTT = NgayTT;
        this.TrangThai = TrangThai;
        this.ngayCapNhat = ngayCapNhat;
    }

    public String getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(String ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
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

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
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

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMax() {
        if (MaNV == getMaNV()) {
            return "MANV" + getMaNV();
        } else {
            return "MANV" + getMaNV();
        }

    }

    public String getTrangThaiA() {
        switch (getTrangThai()) {
            case 0:
                return "Đã thanh toán";
            case 1:
                return "Bán hàng";
            case 2:
                return "Hủy hóa đơn";
            default:
                return null;
        }
    }
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int CODE_LENGTH = 8;

    public String genMaNV() {
        Random random = new SecureRandom();
        StringBuilder code = new StringBuilder(CODE_LENGTH);

        for (int i = 0; i < CODE_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            code.append(CHARACTERS.charAt(randomIndex));
        }
        return genMaNV();
    }

    public String getFormattedTao() {
        if (NgayTao != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return dateFormat.format(NgayTao);
        } else {
            return null;
        }
    }

    public String getFormattedNgayCapNhat() {
        if (ngayCapNhat != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
            return dateFormat.format(ngayCapNhat);
        } else {
            return null;
        }
    }

    public String getFormattedNgayTT2() {
        if (ngayCapNhat != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
            return dateFormat.format(ngayCapNhat);
        } else {
            return null;
        }
    }

    public String ThoiGian() {
        if (ngayCapNhat != null) {
            String ketQua = ngayCapNhat.substring(11, 16); // Lấy từ vị trí 11 đến 15
            return ketQua;
        } else {
            return null;
        }

    }
     public String NgayCapS() {
        if (ngayCapNhat != null) {
            String ketQua = ngayCapNhat.substring(0, 10); // Lấy từ vị trí 11 đến 15
            return ketQua;
        } else {
            return null;
        }

    }
}
