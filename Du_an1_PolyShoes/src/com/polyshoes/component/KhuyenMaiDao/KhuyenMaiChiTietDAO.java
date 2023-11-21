/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.component.KhuyenMaiDao;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.trangchu.KhuyenMaiChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quan
 */
public class KhuyenMaiChiTietDAO {
    
    
    public void insert(KhuyenMaiChiTiet model) {
        String sql = "INSERT INTO Khuyen_Mai_Chi_Tiet (SoTienGiam, TrangThai, NguoiTao,NgayTao, NguoiCapNhat, NgayCapNhat) VALUES (?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql,
                model.getSoTienGiam(), model.getTrangThai(),
                model.getNguoiTao(), model.getNgayTao(),
                model.getNguoiCapNhat(), model.getNgayCapNhat()
        );
    }
    public void update(KhuyenMaiChiTiet model){
        String sql = "";
        JdbcHelper.executeUpdate(sql, 
                            model);
    }
    
    public List<KhuyenMaiChiTiet> select() {
        String sql = "  SELECT Khuyen_Mai.Ma, Khuyen_Mai.MoTa, Khuyen_Mai.NgayBatDau, Khuyen_Mai.NgayKetThuc, Khuyen_Mai_Chi_Tiet.SoTienGiam,Khuyen_Mai.TrangThai, Khuyen_Mai_Chi_Tiet.NguoiTao, Khuyen_Mai_Chi_Tiet.NgayTao, Khuyen_Mai_Chi_Tiet.NguoiCapNhat, \n" +
"                  Khuyen_Mai_Chi_Tiet.NgayCapNhat\n" +
"FROM     Khuyen_Mai LEFT JOIN\n" +
"                  Khuyen_Mai_Chi_Tiet ON Khuyen_Mai.ID = Khuyen_Mai_Chi_Tiet.IDKhuyenMai WHERE Khuyen_Mai.Deleted = 0  ORDER BY Khuyen_Mai.ID";
        return select(sql);
    }
    
    public KhuyenMaiChiTiet findByID(String maKM) {
        String sql = "SELECT Khuyen_Mai.Ma, Khuyen_Mai.MoTa, Khuyen_Mai.NgayBatDau, Khuyen_Mai.NgayKetThuc, Khuyen_Mai.TrangThai, Khuyen_Mai_Chi_Tiet.SoTienGiam, Khuyen_Mai_Chi_Tiet.NguoiTao, Khuyen_Mai_Chi_Tiet.NgayTao, \n" +
"         Khuyen_Mai_Chi_Tiet.NguoiCapNhat, Khuyen_Mai_Chi_Tiet.NgayCapNhat\n" +
"  FROM   Khuyen_Mai INNER JOIN Khuyen_Mai_Chi_Tiet ON Khuyen_Mai.ID = Khuyen_Mai_Chi_Tiet.IDKhuyenMai WHERE Ma = ?";
        List<KhuyenMaiChiTiet> lst = select(sql, maKM);
        return lst.size() > 0 ? lst.get(0) : null;
    }
    private List<KhuyenMaiChiTiet> select(String sql, Object... args) {
        List<KhuyenMaiChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhuyenMaiChiTiet model = readFormResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;
    }
    private KhuyenMaiChiTiet readFormResultSet(ResultSet rs) throws SQLException {
        KhuyenMaiChiTiet model = new KhuyenMaiChiTiet();
        model.setMa(rs.getString("ma"));
        model.setSoTienGiam(rs.getDouble("soTienGiam"));
        model.setTrangThai(rs.getInt("trangThai"));
        model.setNgayBatDau(rs.getDate("ngayBatDau"));
        model.setNgayKetThuc(rs.getDate("ngayKetThuc"));
        model.setNguoiTao(rs.getInt("nguoiTao"));
        model.setNgayTao(rs.getDate("ngayTao"));
        model.setNguoiCapNhat(rs.getInt("nguoiCapNhat"));
        model.setNgayCapNhat(rs.getDate("ngayCapNhat"));
        model.setMoTa(rs.getString("moTa"));
        return model;
    }
}
