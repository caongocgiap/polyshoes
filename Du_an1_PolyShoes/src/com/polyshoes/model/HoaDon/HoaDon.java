package com.polyshoes.model.HoaDon;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoaDon implements Serializable {

    private int ID;
    private String MaHD;
    private Date NgayTao;
    private Date NgayTT;
    private double TongTien;
    private String MaNV;
    private String TenKH;
    private boolean TrangThai;

    public HoaDon() {
    }

    public HoaDon(int ID, String MaHD, Date NgayTao, Date NgayTT, double TongTien, String MaNV, String TenKH, boolean TrangThai) {
        this.ID = ID;
        this.MaHD = MaHD;
        this.NgayTao = NgayTao;
        this.NgayTT = NgayTT;
        this.TongTien = TongTien;
        this.MaNV = MaNV;
        this.TenKH = TenKH;
        this.TrangThai = TrangThai;
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

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMax() {
        if (MaNV == getMaNV()) {
            return "MANV" + getMaNV();
        } else {
            return "MANV" + getMaNV();
        }

    }

    public String getTrangThai() {
        if (TrangThai == true) {
            return "Đã thanh toán";
        } else {
            return "Chưa thanh toán";
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

    @Override
    public String toString() {
        if (TrangThai == true) {
            return "Đã thanh toán";
        } else {
            return "Chưa thanh toán";
        }
    }

}
