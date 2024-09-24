package com.polyshoes.model.HoaDon;

import java.util.Date;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class HoaDonChiTiet {

    private int ID;
    private String MaSPCT;
    private String Hang;
    private String MaHD;
    private String Color;
    private int Size;
    private String coGiay;
    private int SoLuong;
    private Double DonGia;
    private int TrangThai;
    private Double TongTien;
    private String TenSp;
    private HoaDon HoaDon;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int ID, String MaSPCT, String Hang, String MaHD, String Color, int Size, int SoLuong, Double DonGia, int TrangThai, Double TongTien, String TenSp, HoaDon HoaDon) {
        this.ID = ID;
        this.MaSPCT = MaSPCT;
        this.Hang = Hang;
        this.MaHD = MaHD;
        this.Color = Color;
        this.Size = Size;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.TrangThai = TrangThai;
        this.TongTien = TongTien;
        this.TenSp = TenSp;
        this.HoaDon = HoaDon;
    }

        public HoaDonChiTiet(String MaSPCT, int SoLuong, Double DonGia, Double TongTien, String TenSp) {
                this.MaSPCT = MaSPCT;
                this.SoLuong = SoLuong;
                this.DonGia = DonGia;
                this.TongTien = TongTien;
                this.TenSp = TenSp;
        }
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

        public String getCoGiay() {
                return coGiay;
        }

        public void setCoGiay(String coGiay) {
                this.coGiay = coGiay;
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

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
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

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public HoaDon getHoaDon() {
        return HoaDon;
    }

    public void setHoaDon(HoaDon HoaDon) {
        this.HoaDon = HoaDon;
    }

    public boolean getTrangXep() {
        if (getTrangThai() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public String getTrangXe2p() {
        if (getTrangThai() == 0) {
            return "Đã trả hàng";
        } else {
            return "Đã hoàn thành";
        }

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
}
