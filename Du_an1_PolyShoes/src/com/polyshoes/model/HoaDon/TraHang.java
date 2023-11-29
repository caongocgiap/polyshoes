
package com.polyshoes.model.HoaDon;


public class TraHang {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double gia;
    private int trangThai;
    private double thanhTien;
    private String lyDo;

    public TraHang() {
    }

    public TraHang(String maSP, String tenSP, int soLuong, double gia, int trangThai, double thanhTien, String lyDo) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.gia = gia;
        this.trangThai = trangThai;
        this.thanhTien = thanhTien;
        this.lyDo = lyDo;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

  
   
   
    
}
