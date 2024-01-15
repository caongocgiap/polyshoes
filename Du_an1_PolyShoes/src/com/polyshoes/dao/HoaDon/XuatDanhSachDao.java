package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.polyshoes.model.HoaDon.XuatDanhSach;

public class XuatDanhSachDao {

  
    public List<XuatDanhSach> select(String mahd) {
        String sql = "  select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Nhan_Vien.MaNV, Khach_Hang.DiaChi AS DiaChi,Khach_Hang.HoTen as TenNguoiNhan,Khach_Hang.SDT as SDT,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + "                Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia\n"
                + "                ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "                from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "                join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "                join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "                join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "                join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "                join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "                join Nhan_Vien on Nhan_Vien.id = Hoa_Don.IDNhanVien\n"
                + "		join Khach_Hang on Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "                where Hoa_Don.MaHD = ?";

        return select(sql, mahd);
    }

    private List<XuatDanhSach> select(String sql, Object... args) {
        List<XuatDanhSach> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    XuatDanhSach model = readFromResultSet(rs);
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

    private XuatDanhSach readFromResultSet(ResultSet rs) throws SQLException {
        XuatDanhSach model = new XuatDanhSach();
        model.setId(rs.getInt("ID"));
        model.setMaHD(rs.getString("MaHD"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setNgayTT(rs.getDate("NgayThanhToan"));
        model.setMaNV(rs.getString("MaNV"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setTenNguoiNhan(rs.getString("TenNguoiNhan"));
        model.setSDT(rs.getString("SDT"));
        model.setMaSP(rs.getString("Ma"));
        model.setTenSP(rs.getString("ten"));
        model.setHang(rs.getString("Ten2"));
        model.setMau(rs.getString("Ten3"));
        model.setSize(rs.getInt("Size"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setGiaBan(rs.getDouble("Gia"));
        model.setThanhTien(rs.getDouble("ThanhTien"));
        return model;
    }
}
