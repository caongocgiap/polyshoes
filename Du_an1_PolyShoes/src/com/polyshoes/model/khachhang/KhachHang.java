/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.khachhang;

import com.polyshoes.swing.table.EventAction;
import com.polyshoes.swing.table.ModelAction;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    
    private String tinh,quan,xa;
    

    private String MaHD;
    private Date NgayGiaoDich;
    private int TongTien;
    private int TrangThai1;
    

    private String MaKH ,HoTen, SDT, DiaChi; 
    private boolean gioitinh;
    private int TrangThai;
    
   private int id;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
   

    public KhachHang() {

    }

    public KhachHang(String tinh, String quan, String xa) {
        this.tinh = tinh;
        this.quan = quan;
        this.xa = xa;
    }
    

    public KhachHang(int id, String MaKH, String HoTen,String DiaChi ,String SDT,  boolean gioitinh, int TrangThai) {
            this.id = id;
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.gioitinh = gioitinh;
        this.TrangThai = TrangThai;
    }

    public KhachHang(String MaHD, Date NgayGiaoDich, int TongTien, int TrangThai1) {
        this.MaHD = MaHD;
        this.NgayGiaoDich = NgayGiaoDich;
        this.TongTien = TongTien;
        this.TrangThai1 = TrangThai1;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }
    
    

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(Date NgayGiaoDich) {
        this.NgayGiaoDich = NgayGiaoDich;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public int getTrangThai1() {
        return TrangThai1;
    }

    public void setTrangThai1(int TrangThai1) {
        this.TrangThai1 = TrangThai1;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int CODE_LENGTH = 8;

    public static String generateCode() {
        Random random = new SecureRandom();
        StringBuilder code = new StringBuilder(CODE_LENGTH);

        for (int i = 0; i < CODE_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            code.append(CHARACTERS.charAt(randomIndex));
        }

        return code.toString();
    }

    public Object[] toInsert1() {
        this.setMaKH(generateCode());
        return new Object[]{this.MaHD, this.NgayGiaoDich, this.TongTien, this.TrangThai1};
    }

    public Object[] toInsert() {
        this.setMaKH(generateCode());
        return new Object[]{this.MaKH, this.HoTen, this.SDT, this.DiaChi, this.gioitinh};
    }

    public Object[] todataROw() {
        return new Object[]{this.MaKH, this.HoTen, this.SDT, this.gioitinh,this.DiaChi};
    }
//     public Object[] todataROw1(EventAction event) {
//        return new Object[]{this.MaKH, this.HoTen, this.SDT, this.gioitinh,this.tinh,this.quan,this.xa,new ModelAction(this,event)};
//    }

}
