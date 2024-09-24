/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.ThongKe;

import java.util.Date;

/**
 *
 * @author quan
 */
public class ThongKe {
    private double doanhThu;
    private int soHoaDon;
    private int soKhachHang;//N
    private int soHoaDOnHuy;
    private String maHoaDon;
    private Date ngayTao;
    private double tongTien;

    public ThongKe() {
    }

    public ThongKe(double doanhThu, int soHoaDon, int soKhachHang, int soHoaDOnHuy, String maHoaDon, Date ngayTao, double tongTien) {
        this.doanhThu = doanhThu;
        this.soHoaDon = soHoaDon;
        this.soKhachHang = soKhachHang;
        this.soHoaDOnHuy = soHoaDOnHuy;
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public int getSoKhachHang() {
        return soKhachHang;
    }

    public void setSoKhachHang(int soKhachHang) {
        this.soKhachHang = soKhachHang;
    }

    public int getSoHoaDOnHuy() {
        return soHoaDOnHuy;
    }

    public void setSoHoaDOnHuy(int soHoaDOnHuy) {
        this.soHoaDOnHuy = soHoaDOnHuy;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    
    
}
