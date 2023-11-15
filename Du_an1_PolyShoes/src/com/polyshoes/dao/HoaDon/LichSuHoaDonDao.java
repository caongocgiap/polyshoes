package com.polyshoes.dao.HoaDon;


import com.polyshoes.helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.polyshoes.model.HoaDon.LichSuHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LichSuHoaDonDao {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<LichSuHoaDon> select() {
        String sql = "SELECT  Lich_Su_Hoa_Don.ID, Nhan_Vien.TenNV, \n"
                + "Nhan_Vien.MaNV, Hoa_Don.TenNguoiNhan, Hoa_Don.TongTien, \n"
                + "Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Lich_Su_Hoa_Don.TrangThai\n"
                + "FROM Lich_Su_Hoa_Don INNER JOIN\n"
                + " Hoa_Don ON Lich_Su_Hoa_Don.IDHoaDon = Hoa_Don.ID INNER JOIN\n"
                + "Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID";
        return select(sql);
    }

    public List<LichSuHoaDon> selectByKeyword(String keyword) {
        String sql = "SELECT  Lich_Su_Hoa_Don.ID, Nhan_Vien.TenNV,\n"
                + "             Nhan_Vien.MaNV, Hoa_Don.TenNguoiNhan, Hoa_Don.TongTien, \n"
                + "              Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Lich_Su_Hoa_Don.TrangThai\n"
                + "                FROM Lich_Su_Hoa_Don INNER JOIN\n"
                + "                 Hoa_Don ON Lich_Su_Hoa_Don.IDHoaDon = Hoa_Don.ID INNER JOIN\n"
                + "             Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID where TenNguoiNhan LIKE ?";
        return select(sql, "%" + keyword + "%");
    }

    private List<LichSuHoaDon> select(String sql, Object... args) {
        List<LichSuHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    LichSuHoaDon model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private LichSuHoaDon readFromResultSet(ResultSet rs) throws SQLException {
        LichSuHoaDon model = new LichSuHoaDon();
        model.setID(rs.getInt("ID"));
        model.setTenNV(rs.getString("TenNV"));
        model.setMaNV(rs.getString("MaNV"));
        model.setTenKH(rs.getString("TenNguoiNhan"));
        model.setTongTien(rs.getDouble("TongTien"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setNgayTT(rs.getDate("NgayThanhToan"));
        model.setTrangThai(rs.getBoolean("TrangThai"));
        return model;
    }

}
