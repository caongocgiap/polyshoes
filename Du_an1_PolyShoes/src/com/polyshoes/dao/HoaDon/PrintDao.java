package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.PrintHoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrintDao {

    public List<PrintHoaDon> selectaa(String MaHD) {
        String sql = "					 	select\n"
                + "                			San_Pham.Ten,	\n"
                + "                			Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "                                	Hoa_Don_Chi_Tiet.Gia,\n"
                + "                					(Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia) as ThanhTien,\n"
                + "                					 sum(ThanhTien) as tongTien,\n"
                + "									 Sum(Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia)/100 * Voucher.PhanTramGiam as GiamGia\n"
                + "                					from Hoa_Don\n"
                + "                					join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "                					join San_Pham_Chi_Tiet on San_Pham_Chi_Tiet.id = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "                					join San_Pham on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "									join Voucher on Voucher.id = Hoa_Don.IDVoucher\n"
                + "                					where hoa_don.mahd = ?\n"
                + "                					 GROUP BY\n"
                + "                                	san_pham.Ten,  \n"
                + "                                	Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "                                	Hoa_Don_Chi_Tiet.Gia,\n"
                + "									Voucher.PhanTramGiam,\n"
                + "                                    (Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia)";
        return select(sql, MaHD);
    }

//    public List<PrintHoaDon> select2(String MaHD) {
//        String sql = "	select top 1\n" +
//"					San_Pham.Ten,	\n" +
//"					Hoa_Don_Chi_Tiet.SoLuong,\n" +
//"                	Hoa_Don_Chi_Tiet.Gia,\n" +
//"					(Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia) as ThanhTien,\n" +
//"					 sum(ThanhTien) as tongTien\n" +
//"					from Hoa_Don\n" +
//"					join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n" +
//"					join San_Pham_Chi_Tiet on San_Pham_Chi_Tiet.id = Hoa_Don_Chi_Tiet.IDSanPhamCT\n" +
//"					join San_Pham on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n" +
//"					where hoa_don.mahd = ?\n" +
//"					 GROUP BY\n" +
//"                	san_pham.Ten,  \n" +
//"                	Hoa_Don_Chi_Tiet.SoLuong,\n" +
//"                	Hoa_Don_Chi_Tiet.Gia,\n" +
//"                    (Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia)\n" +
//"					ORDER BY  tongTien DESC";
//        return select(sql, MaHD);
//    }
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
        pt.setTenSP(rs.getString("Ten"));
        pt.setGiamGia(rs.getDouble("GiamGia"));
        pt.setSoLuong(rs.getInt("SoLuong"));
        pt.setGiaTien(rs.getDouble("Gia"));
        pt.setThanhTien(rs.getDouble("ThanhTien"));
        pt.setTongTien(rs.getDouble("TongTien"));

        return pt;
    }
}
