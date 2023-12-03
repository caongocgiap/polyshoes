/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.TraHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TraHangDao {

    public List<TraHang> selectALL(String MaHD) {
        String sql = "select San_Pham.Ma,San_Pham.Ten,TraHang.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + ",(TraHang.SoLuong)*Hoa_Don_Chi_Tiet.Gia as ThanhTien ,TraHang.LyDoTraHang\n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "join TraHang on TraHang.IDHoaDonChiTiet = Hoa_Don_Chi_Tiet.id\n"
                + "where Hoa_Don.MaHD = ?";
        return select(sql, MaHD);
    }
      public List<TraHang> selectALL2() {
        String sql = "select San_Pham.Ma,San_Pham.Ten,TraHang.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + ",(TraHang.SoLuong)*Hoa_Don_Chi_Tiet.Gia as ThanhTien ,TraHang.LyDoTraHang\n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "join TraHang on TraHang.IDHoaDonChiTiet = Hoa_Don_Chi_Tiet.id";
             
        return select(sql);
    }

    private List<TraHang> select(String sql, Object... args) {
        List<TraHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    TraHang model = readFromResultSet(rs);
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

    private TraHang readFromResultSet(ResultSet rs) throws SQLException {
        TraHang model = new TraHang();
         model.setMaSP(rs.getString("Ma"));
         model.setTenSP(rs.getString("Ten"));
         model.setSoLuong(rs.getInt("SoLuong"));
         model.setGia(rs.getDouble("gia"));
         model.setTrangThai(rs.getInt("TrangThai"));
         model.setThanhTien(rs.getDouble("ThanhTien"));
         model.setLyDo(rs.getString("LyDoTraHang"));

        return model;
    }
}
