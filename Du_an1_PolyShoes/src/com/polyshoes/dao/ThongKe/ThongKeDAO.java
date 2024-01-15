/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.dao.ThongKe;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.ThongKe.ThongKe;
import com.polyshoes.model.trangchu.KhuyenMai;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;

/**
 *
 * @author quan
 */
public class ThongKeDAO {

    public List<ThongKe> selectAll() {
        String sql = "SELECT \n"
                + "    SUM (Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia) AS DOANHTHU , \n"
                + "    Hoa_Don_Chi_Tiet.SoLuong, \n"
                + "    Hoa_Don_Chi_Tiet.Gia, \n"
                + "    Hoa_Don.TongTien, \n"
                + "    Hoa_Don_Chi_Tiet.ID, \n"
                + "    Hoa_Don.TrangThai, \n"
                + "    Hoa_Don.MaHD, \n"
                + "    Hoa_Don.NgayTao\n"
                + "	FROM \n"
                + "    Hoa_Don \n"
                + "	INNER JOIN\n"
                + "    Hoa_Don_Chi_Tiet ON Hoa_Don.ID = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "	GROUP BY \n"
                + "    Hoa_Don.MaHD, \n"
                + "    Hoa_Don_Chi_Tiet.ID, \n"
                + "    Hoa_Don_Chi_Tiet.SoLuong, \n"
                + "    Hoa_Don_Chi_Tiet.Gia, \n"
                + "    Hoa_Don.TongTien, \n"
                + "    Hoa_Don.TrangThai, \n"
                + "    Hoa_Don.NgayTao;";
        return select(sql);
    }

    public List<ThongKe> selectThoiGian(String TuSo, String DenSo) {
        String sql = "SELECT\n"
                + "    SUM(Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia) AS DOANHTHU,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "    Hoa_Don.TongTien,\n"
                + "    Hoa_Don_Chi_Tiet.ID,\n"
                + "    Hoa_Don.TrangThai,\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don.NgayTao\n"
                + "FROM\n"
                + "    Hoa_Don\n"
                + "INNER JOIN\n"
                + "    Hoa_Don_Chi_Tiet ON Hoa_Don.ID = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "WHERE\n"
                + "    Hoa_Don.NgayTao BETWEEN ? AND ?\n"
                + "GROUP BY\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don_Chi_Tiet.ID,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia, \n"
                + "    Hoa_Don.TongTien, \n"
                + "    Hoa_Don.TrangThai,\n"
                + "    Hoa_Don.NgayTao;";
        return selectThoiGian(TuSo, DenSo);
    }

    private List<ThongKe> select(String sql, Object... args) {
        List<ThongKe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    ThongKe model = readFormResultSet(rs);
                    list.add(model);
                }

            } catch (Exception e) {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;
    }

    private ThongKe readFormResultSet(ResultSet rs) throws SQLException {
        ThongKe model = new ThongKe();
        model.setDoanhThu(rs.getDouble("DOANHTHU"));
        model.setSoHoaDon(rs.getInt("SoLuong"));
        model.setSoKhachHang(rs.getInt("SoLuong")); // Điều chỉnh tên cột
        model.setSoHoaDOnHuy(rs.getInt("SoLuong")); // Điều chỉnh tên cột
        model.setMaHoaDon(rs.getString("MaHD"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setTongTien(rs.getDouble("TongTien"));
        return model;
    }
}
