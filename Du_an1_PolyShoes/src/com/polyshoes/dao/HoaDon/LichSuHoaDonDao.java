package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.DBconnect;
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

    public List<LichSuHoaDon> selectTenNV(String MaNV) {
        String sql = "select Nhan_Vien.TenNV,Nhan_Vien.MaNV from hoa_don\n"
                + "join nhan_vien on hoa_don.Idnhanvien = nhan_vien.ID\n"
                + "where Hoa_Don.MaHD =";
        return select(sql, MaNV);
    }

    public List<LichSuHoaDon> selectByKeyword(String TenKH) {
        String sql = "SELECT  Lich_Su_Hoa_Don.ID, Nhan_Vien.TenNV,\n"
                + "             Nhan_Vien.MaNV, Hoa_Don.TenNguoiNhan, Hoa_Don.TongTien, \n"
                + "              Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan,Hoa_Don.NgayCapNhat, Lich_Su_Hoa_Don.TrangThai\n"
                + "                FROM Lich_Su_Hoa_Don INNER JOIN\n"
                + "                 Hoa_Don ON Lich_Su_Hoa_Don.IDHoaDon = Hoa_Don.ID INNER JOIN\n"
                + "             Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID where hoa_don.mahd = ?";
        return select(sql, TenKH);
    }
     public List<LichSuHoaDon> selectByKeyword2(String TenKH) {
        String sql = "SELECT  Lich_Su_Hoa_Don.ID, Nhan_Vien.TenNV,\n"
                + "             Nhan_Vien.MaNV, Hoa_Don.TenNguoiNhan, Hoa_Don.TongTien, \n"
                + "              Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan, Hoa_Don.NgayCapNhat, Lich_Su_Hoa_Don.TrangThai\n"
                + "                FROM Lich_Su_Hoa_Don INNER JOIN\n"
                + "                 Hoa_Don ON Lich_Su_Hoa_Don.IDHoaDon = Hoa_Don.ID INNER JOIN\n"
                + "             Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID where hoa_don.mahd = ?";
        return select(sql, TenKH);
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
        model.setTrangThai(rs.getInt("TrangThai"));
        model.setNgayCapNhat(rs.getDate("ngaycapnhat"));
        return model;
    }

    public void delete(String MAHD) {
        String sql = "UPDATE Hoa_Don SET trangthai = 0, Deleted = 0 WHERE TenNguoiNhan like ?";
        JdbcHelper.executeUpdate(sql, "%" + MAHD + "%");
    }

    public List<LichSuHoaDon> paging(int page, int limit) {
        String sql = " SELECT  Lich_Su_Hoa_Don.ID, Nhan_Vien.TenNV, \n"
                + "                Nhan_Vien.MaNV, Hoa_Don.TenNguoiNhan, Hoa_Don.TongTien, \n"
                + "                Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Hoa_Don.TrangThai\n"
                + "                FROM Lich_Su_Hoa_Don INNER JOIN\n"
                + "                 Hoa_Don ON Lich_Su_Hoa_Don.IDHoaDon = Hoa_Don.ID INNER JOIN\n"
                + "                Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "				where hoa_don.Deleted = 1\n"
                + "				ORDER BY Hoa_Don.TenNguoiNhan DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return select(sql, page, limit);
    }

}
