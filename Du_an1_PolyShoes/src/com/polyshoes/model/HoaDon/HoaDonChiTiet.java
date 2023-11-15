package com.polyshoes.model.HoaDon;

import java.util.Date;

public class HoaDonChiTiet {

    private int ID;
    private String MaSPCT;
    private String Hang;
    private String Color;
    private int Size;
    private int SoLuong;
    private Double DonGia;
    private boolean TrangThai;
    private Double TongTien;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int ID, String MaSPCT, String Hang, String Color, int Size, int SoLuong, Double DonGia, boolean TrangThai, Double TongTien) {
        this.ID = ID;
        this.MaSPCT = MaSPCT;
        this.Hang = Hang;
        this.Color = Color;
        this.Size = Size;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TrangThai = TrangThai;
        this.TongTien = TongTien;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaSPCT() {
        return MaSPCT;
    }

    public void setMaSPCT(String MaSPCT) {
        this.MaSPCT = MaSPCT;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }
      public String getMaCT() {
        if (MaSPCT == getMaSPCT()) {
            return "MaSP"+getMaSPCT();
        } else {
            return "MaSP"+getMaSPCT();
        }
    }
}
