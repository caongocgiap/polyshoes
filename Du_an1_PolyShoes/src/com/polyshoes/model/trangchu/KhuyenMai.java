/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.trangchu;

import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author quan
 */
public class KhuyenMai implements Serializable {

    private String ma;
    private String moTa;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int trangThai;
    private int nguoiTao;
    private Date ngayTao;
    private int nguoiCapNhat;
    private Date ngayCapNhat;
    private boolean deleted;
    private double soTienGiam;

    public KhuyenMai() {
    }

    public KhuyenMai(String ma, String moTa, Date ngayBatDau, Date ngayKetThuc, int trangThai, int nguoiTao, Date ngayTao, int nguoiCapNhat, Date ngayCapNhat, boolean deleted, double soTienGiam) {
        this.ma = ma;
        this.moTa = moTa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.nguoiCapNhat = nguoiCapNhat;
        this.ngayCapNhat = ngayCapNhat;
        this.deleted = deleted;
        this.soTienGiam = soTienGiam;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getsoTienGiam() {
        return soTienGiam;
    }

    public void setsoTienGiam(double soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Object[] todataRow() {
        return new Object[]{this.ma, this.moTa, this.ngayBatDau, this.ngayKetThuc, this.trangThai, this.nguoiTao, this.ngayTao, this.nguoiCapNhat, this.ngayCapNhat, this.soTienGiam};
    }
}
