/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.trangchu;

import java.awt.Checkbox;
import java.util.Date;

/**
 *
 * @author quan
 */
public class KhuyenMaiChiTiet {
    
    private Checkbox checkAll;
    private String ma;
    private double soTienGiam;
    private int trangThai;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int nguoiTao;
    private Date ngayTao;
    private int nguoiCapNhat;
    private Date ngayCapNhat;
    private String moTa;
    private boolean deleted;
    
    public KhuyenMaiChiTiet() {
    }

    public KhuyenMaiChiTiet(Checkbox checkAll, String ma, double soTienGiam, int trangThai, Date ngayBatDau,Date ngayKetThuc, int nguoiTao, Date ngayTao, int nguoiCapNhat, Date ngayCapNhat,String moTa, boolean deleted) {
        
        this.checkAll = checkAll;
        this.ma = ma;
        this.soTienGiam = soTienGiam;
        this.trangThai = trangThai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.nguoiCapNhat = nguoiCapNhat;
        this.ngayCapNhat = ngayCapNhat;
        this.moTa = moTa;
        this.deleted = deleted;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public double getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(double soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    public int getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(int nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getNguoiCapNhat() {
        return nguoiCapNhat;
    }

    public void setNguoiCapNhat(int nguoiCapNhat) {
        this.nguoiCapNhat = nguoiCapNhat;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }
    
    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    
    public Checkbox getcheckAll(){
        return checkAll;
    }
    public void setcheckAll(){
        this.checkAll = checkAll;
    }
}
