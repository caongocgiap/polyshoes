package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoaDonChiTietDao {

    public List<HoaDonChiTiet> select() {
        String sql = "SELECT ID, IDSanPhamCT, SoLuong, Gia, TrangThai,SoLuong*Gia as ThanhTien\n"
                + "FROM Hoa_Don_Chi_Tiet ";
        return select(sql);
    }

    public List<HoaDonChiTiet> selectByKeyword(String keyword) {
        String sql = "ID, IDSanPhamCT, SoLuong, Gia, TrangThai, TrangThai,SoLuong*Gia as ThanhTien\n"
                + "FROM Hoa_Don_Chi_Tiet where IDHoaDon = ?";
        return select(sql, "%" + keyword + "%");
    }

    private List<HoaDonChiTiet> select(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonChiTiet model = readFromResultSet(rs);
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

    public HoaDonChiTiet findById(String mahd) {
        String sql = "ID, IDSanPhamCT, SoLuong, Gia, TrangThai, TrangThai,SoLuong*Gia as ThanhTien\n"
                + "FROM Hoa_Don_Chi_Tiet where IDHoaDon =?";
        List<HoaDonChiTiet> list = select(sql, mahd);
        return list.size() > 0 ? list.get(0) : null;
    }

    private HoaDonChiTiet readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonChiTiet model = new HoaDonChiTiet();
        model.setID(rs.getInt("ID"));
        model.setMaSPCT(rs.getString("IDSanPhamCT"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setDonGia(rs.getDouble("Gia"));
        model.setTrangThai(rs.getBoolean("TrangThai"));
        model.setTongTien(rs.getDouble("ThanhTien"));
        return model;
    }
}
