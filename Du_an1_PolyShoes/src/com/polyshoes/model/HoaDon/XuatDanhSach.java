/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.HoaDon;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class XuatDanhSach {
    
    private int id;
    private String MaHD;
    private Date ngayTao;
    private Date ngayTT;
    private String MaNV;
    private String TenNguoiNhan;
    private String DiaChi;
    private String SDT;
    private String MaSP;
    private String TenSP;
    private String hang;
    private String mau;
    private int Size;
    private int soLuong;
    private double GiaBan;
    private double ThanhTien;

    public XuatDanhSach() {
    }

    public XuatDanhSach(int id, String MaHD, Date ngayTao, Date ngayTT, String MaNV, String TenNguoiNhan, String DiaChi, String SDT, String MaSP, String TenSP, String hang, String mau, int Size, int soLuong, double GiaBan, double ThanhTien) {
        this.id = id;
        this.MaHD = MaHD;
        this.ngayTao = ngayTao;
        this.ngayTT = ngayTT;
        this.MaNV = MaNV;
        this.TenNguoiNhan = TenNguoiNhan;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.hang = hang;
        this.mau = mau;
        this.Size = Size;
        this.soLuong = soLuong;
        this.GiaBan = GiaBan;
        this.ThanhTien = ThanhTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayTT() {
        return ngayTT;
    }

    public void setNgayTT(Date ngayTT) {
        this.ngayTT = ngayTT;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

     public String getNgayTTAsString() {
        if (ngayTT != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.format(ngayTT);
        } else {
            return null; // or an empty string based on your requirements
        }
    }

    public String getNgayTaoString() {
        if (ngayTao != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.format(ngayTao);
        } else {
            return null; // or an empty string based on your requirements
        }
    }
    
    

}
