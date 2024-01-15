package com.polyshoes.model.HoaDon;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintHoaDon {

    private String TenNM;
    private String hinhThuc;
    private String DiaChi;
    private String TenSP;
    private int SoLuong;
    private double GiaTien;
    private double ThanhTien;
    private double TongTien;
    private String SDT;
    private double giamGia;

    public PrintHoaDon() {
    }

    public PrintHoaDon(String TenNM, String hinhThuc, String DiaChi, String TenSP, int SoLuong, double GiaTien, double ThanhTien, double TongTien, String SDT, double giamGia) {
        this.TenNM = TenNM;
        this.hinhThuc = hinhThuc;
        this.DiaChi = DiaChi;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.GiaTien = GiaTien;
        this.ThanhTien = ThanhTien;
        this.TongTien = TongTien;
        this.SDT = SDT;
        this.giamGia = giamGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

  
    public String getTenNM() {
        return TenNM;
    }

    public void setTenNM(String TenNM) {
        this.TenNM = TenNM;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getFormattedTongTien() {
        // Convert double to BigDecimal for precise currency handling
        BigDecimal tongTienBigDecimal = BigDecimal.valueOf(TongTien);

        // Set the locale to the desired one, e.g., Locale.US for US dollars
        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        // Format the TongTien as currency
        return currencyFormatter.format(tongTienBigDecimal);
    }

    public String getFormattedThanhTien() {
        // Convert double to BigDecimal for precise currency handling
        BigDecimal tongTienBigDecimal = BigDecimal.valueOf(ThanhTien);

        // Set the locale to the desired one, e.g., Locale.US for US dollars
        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        // Format the TongTien as currency
        return currencyFormatter.format(tongTienBigDecimal);
    }
       public String getFormattedGiaTien() {
        // Convert double to BigDecimal for precise currency handling
        BigDecimal tongTienBigDecimal = BigDecimal.valueOf(GiaTien);

        // Set the locale to the desired one, e.g., Locale.US for US dollars
        Locale locale = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        // Format the TongTien as currency
        return currencyFormatter.format(tongTienBigDecimal);
    }

}
