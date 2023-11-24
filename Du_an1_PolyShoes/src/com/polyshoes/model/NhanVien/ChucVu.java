/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.NhanVien;

/**
 *
 * @author Vu Hieu
 */
public class ChucVu {
    private int id;
    private String maCV;
    private String tenCV;

    public ChucVu(int id, String maCV, String tenCV) {
        this.id = id;
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public ChucVu(String maCV, String tenCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public ChucVu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    @Override
    public String toString() {
        return tenCV;
    }
    public Object[] toDataRow(){
        return new Object[]{this.id,this.maCV,this.tenCV};
    }
}
