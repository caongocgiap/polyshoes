package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.PrintHoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrintDao {

    public List<PrintHoaDon> select(String MaHD) {
        String sql = "SELECT \n"
                + "    Hoa_Don.TenNguoiNhan,\n"
                + "	san_pham.Ten,\n"
                + "    Thanh_Toan.MoTa,\n"
                + "	Hoa_Don.SDT,\n"
                + "    Hoa_Don.DiaChi,\n"
                + "	Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "	Hoa_Don_Chi_Tiet.Gia,\n"
                + "    (Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia) as ThanhTien,\n"
                + "    sum(ThanhTien) as tongTien\n"
                + "FROM \n"
                + "    San_Pham \n"
                + "    JOIN San_Pham_Chi_Tiet ON San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "    JOIN Nha_San_Xuat ON Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "    JOIN Hoa_Don_Chi_Tiet ON San_Pham_Chi_Tiet.id = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "    JOIN Hoa_Don ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "    JOIN Mau_Sac ON Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "    JOIN Size ON Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "    JOIN Nhan_Vien ON Nhan_Vien.id = Hoa_Don.IDNhanVien\n"
                + "    JOIN Hinh_Thuc_TT ON Hinh_Thuc_TT.IDHoaDon = Hoa_Don.id\n"
                + "    JOIN Thanh_Toan ON Thanh_Toan.ID = Hinh_Thuc_TT.IDThanhToan\n"
                + "		where hoa_don.mahd =?\n"
                + "GROUP BY\n"
                + "    Hoa_Don.TenNguoiNhan,\n"
                + "    Thanh_Toan.MoTa,\n"
                + "	san_pham.Ten,\n"
                + "    Hoa_Don.DiaChi,\n"
                + "		Hoa_Don.SDT,\n"
                + "	Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "	Hoa_Don_Chi_Tiet.Gia,\n"
                + "    (Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia);";
        return select(sql, MaHD);
    }
     public List<PrintHoaDon> select2(String MaHD) {
        String sql = "SELECT TOP 1\n"
                + "                   Hoa_Don.TenNguoiNhan,\n"
                + "                	san_pham.Ten,\n"
                + "                    Thanh_Toan.MoTa,\n"
                + "                	Hoa_Don.SDT,\n"
                + "                    Hoa_Don.DiaChi,\n"
                + "                	Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "                	Hoa_Don_Chi_Tiet.Gia,\n"
                + "                    (Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia) as ThanhTien,\n"
                + "                    sum(ThanhTien) as tongTien\n"
                + "                FROM \n"
                + "                    San_Pham \n"
                + "                    JOIN San_Pham_Chi_Tiet ON San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "                    JOIN Nha_San_Xuat ON Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "                    JOIN Hoa_Don_Chi_Tiet ON San_Pham_Chi_Tiet.id = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "                    JOIN Hoa_Don ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "                    JOIN Mau_Sac ON Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "                    JOIN Size ON Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "                    JOIN Nhan_Vien ON Nhan_Vien.id = Hoa_Don.IDNhanVien\n"
                + "                    JOIN Hinh_Thuc_TT ON Hinh_Thuc_TT.IDHoaDon = Hoa_Don.id\n"
                + "                    JOIN Thanh_Toan ON Thanh_Toan.ID = Hinh_Thuc_TT.IDThanhToan\n"
                + "                		where hoa_don.mahd = ?\n"
                + "                GROUP BY\n"
                + "                    Hoa_Don.TenNguoiNhan,\n"
                + "                    Thanh_Toan.MoTa,\n"
                + "                	san_pham.Ten,\n"
                + "                    Hoa_Don.DiaChi,\n"
                + "                		Hoa_Don.SDT,\n"
                + "                	Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "                	Hoa_Don_Chi_Tiet.Gia,\n"
                + "                    (Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia)\n"
                + "					ORDER BY\n"
                + "    tongTien DESC;";
        return select(sql, MaHD);
    }


    private List<PrintHoaDon> select(String sql, Object... args) {
        List<PrintHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    PrintHoaDon model = readFromResultSet(rs);
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

    private PrintHoaDon readFromResultSet(ResultSet rs) throws SQLException {
        PrintHoaDon pt = new PrintHoaDon();
        pt.setTenNM(rs.getString("TenNguoiNhan"));
        pt.setTenSP(rs.getString("Ten"));
        pt.setHinhThuc(rs.getString("MoTa"));
        pt.setDiaChi(rs.getString("DiaChi"));
        pt.setSoLuong(rs.getInt("SoLuong"));
        pt.setGiaTien(rs.getDouble("Gia"));
        pt.setThanhTien(rs.getDouble("ThanhTien"));
        pt.setTongTien(rs.getDouble("TongTien"));
        pt.setSDT(rs.getString("SDT"));

        return pt;
    }
}
