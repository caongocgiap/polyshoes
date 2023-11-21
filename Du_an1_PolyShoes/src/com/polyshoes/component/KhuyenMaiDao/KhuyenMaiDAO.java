/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.component.KhuyenMaiDao;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.trangchu.KhuyenMai;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quan
 */
public class KhuyenMaiDAO {
//    Connection con = null;
//    PreparedStatement ps = null;

    public void insert(KhuyenMai model) {
        String sql = "  INSERT INTO Khuyen_Mai (Ma, MoTa, NgayKetThuc, TrangThai) VALUES (?,?,?,?)";
        JdbcHelper.executeUpdate(sql,
                model.getMa(), model.getMoTa(),
                model.getNgayKetThuc(),
                model.getTrangThai()
        );
    }

    public void update(KhuyenMai model) {
        String sql = "UPDATE Khuyen_Mai SET MoTa=?, NgayBatDau = ?, NgayKetThuc = ?, TrangThai =? WHERE Ma = ?";
        JdbcHelper.executeUpdate(sql,
                model.getMoTa(),
                model.getNgayBatDau(), model.getNgayKetThuc(),
                model.getTrangThai(),
                model.getMa());
    }

    public void delete(String ma) {
        String sql = "DELETE FROM Khuyen_Mai WHERE Ma = ?";
        JdbcHelper.executeUpdate(sql, ma);
    }

    public List<KhuyenMai> select() {
        String sql = "SELECT Ma, MoTa, NgayBatDau, NgayKetThuc, TrangThai from Khuyen_Mai WHERE Deleted = 0";
        return select(sql);
    }

    public KhuyenMai findByID(String maKM) {
        String sql = "SELECT Ma, MoTa, NgayBatDau, NgayKetThuc, TrangThai FROM Khuyen_Mai WHERE Ma = ?";
        List<KhuyenMai> lst = select(sql, maKM);
        return lst.size() > 0 ? lst.get(0) : null;
    }
    
     public List<KhuyenMai> findByMa(String maKM) {
        String sql = "SELECT Ma, MoTa, NgayBatDau, NgayKetThuc, TrangThai FROM Khuyen_Mai WHERE Ma = ?";
        return select(sql, maKM);
    }
    public KhuyenMai findByTrangThai(int trangThai) {
        String sql = "SELECT Ma, MoTa, NgayBatDau, NgayKetThuc, TrangThai FROM Khuyen_Mai WHERE TrangThai = ?";
        List<KhuyenMai> lst = select(sql, trangThai);
        return lst.size() > 0 ? lst.get(0) : null;
    }

    private List<KhuyenMai> select(String sql, Object... args) {
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhuyenMai model = readFormResultSet(rs);
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

    private KhuyenMai readFormResultSet(ResultSet rs) throws SQLException {
        KhuyenMai model = new KhuyenMai();
        model.setMa(rs.getString("ma"));
        model.setMoTa(rs.getString("moTa"));
        model.setNgayBatDau(rs.getDate("ngayBatDau"));
        model.setNgayKetThuc(rs.getDate("ngayKetThuc"));
        model.setTrangThai(rs.getInt("trangThai"));
        return model;
    }

    public List<KhuyenMai> paging(int page, int limit) {
        String sql = "  SELECT Ma, MoTa, NgayBatDau, NgayKetThuc, TrangThai from Khuyen_Mai WHERE Deleted = 0 ORDER BY id DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return select(sql, page, limit);
    }

}
