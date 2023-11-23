/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.NhanVien;

import java.util.Date;

/**
 *
 * @author Vu Hieu
 */
public class NhanVien {

   private int id;
    private int chucVu;
    private String manv;
    private String email;
    private String matKhau;
    private String cccd;
    private String tennv;
    private Date ngaySinh;
    private String sdt;
    private String diaChi;
    private int gioiTinh;
    private int trangThai = 1;

    public NhanVien(int id, int chucVu, String manv, String email, String matKhau, String cccd, String tennv, Date ngaySinh, String sdt, String diaChi, int gioiTinh, int trangThai) {
        this.id = id;
        this.chucVu = chucVu;
        this.manv = manv;
        this.email = email;
        this.matKhau = matKhau;
        this.cccd = cccd;
        this.tennv = tennv;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public NhanVien(int id, int chucVu, String manv, String email, String cccd, String tennv, Date ngaySinh, String sdt, String diaChi, int gioiTinh) {
        this.id = id;
        this.chucVu = chucVu;
        this.manv = manv;
        this.email = email;
        this.cccd = cccd;
        this.tennv = tennv;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    
    



    public NhanVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    


    public String hienThiChucVu() {
        if (chucVu == 1) {
            return "Quản Lý";
        } else {
            return "Nhân Viên";
        }
    }

    public String hienThiTrangThai() {
        if (trangThai == 1) {
            return "Đang làm";
        } else {
            return "Nghỉ làm";
        }
    }

    public String hienThiGioiTinh() {
        if (gioiTinh == 1) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", chucVu=" + chucVu + ", manv=" + manv + ", email=" + email + ", matKhau=" + matKhau + ", cccd=" + cccd + ", tennv=" + tennv + ", sdt=" + sdt + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }

    public Object[] toDataRow() {
        
    
        return new Object[]{this.chucVu, this.manv,this.email, this.matKhau, this.cccd, this.tennv, this.ngaySinh,this.sdt, this.diaChi,  this.gioiTinh,this.trangThai};
        
    }
   
}
