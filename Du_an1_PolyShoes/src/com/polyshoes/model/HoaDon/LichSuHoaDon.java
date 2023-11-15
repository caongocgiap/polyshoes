package com.polyshoes.model.HoaDon;

import java.util.Date;

public class LichSuHoaDon {

    private int ID;
    private String TenNV;
    private String MaNV;
    private String TenKH;
    private double TongTien;
    private Date NgayTao;
    private Date NgayTT;
    private boolean TrangThai;

    public LichSuHoaDon() {
    }

    public LichSuHoaDon(int ID, String TenNV, String MaNV, String TenKH, double TongTien, Date NgayTao, Date NgayTT, boolean TrangThai) {
        this.ID = ID;
        this.TenNV = TenNV;
        this.MaNV = MaNV;
        this.TenKH = TenKH;
        this.TongTien = TongTien;
        this.NgayTao = NgayTao;
        this.NgayTT = NgayTT;
        this.TrangThai = TrangThai;
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

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMax() {
        if (MaNV == getMaNV()) {
            return "MANV"+getMaNV();
        } else {
            return "MANV"+getMaNV();
        }

    }

    public String getTrangThai() {
        if (TrangThai == true) {
            return "đã thanh toán";
        } else {
            return "chưa thanh toán";
        }
    }

}
