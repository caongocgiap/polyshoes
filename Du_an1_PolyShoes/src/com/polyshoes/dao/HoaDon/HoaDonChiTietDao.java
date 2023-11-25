package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.HoaDon.HoaDonChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoaDonChiTietDao {

    public List<HoaDonChiTiet> selectByKeyword(String MaHD) {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + " as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + " ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "where hoa_don_chi_tiet.soLuong  !=0 and Hoa_Don.MaHD = ?";
        return select(sql, MaHD);
    }

    public List<HoaDonChiTiet> selectByKeyword3() {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + " as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + " ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n";
        return select(sql);
    }

    public List<HoaDonChiTiet> selectByKeyword1(String MaHD) {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + " as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + " ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "where Hoa_don_chi_Tiet.soluong !=0 and  Hoa_Don.MaHD = ?";
        return select(sql, MaHD);
    }

    public List<HoaDonChiTiet> selectByTramotmon(String MaHD, String MaSP) {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + " as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + " ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "where  Hoa_Don.MaHD = ? and san_pham.ma = ?";
        return select(sql, MaHD, MaSP);
    }

    public List<HoaDonChiTiet> selectByTraHang(String MaHD) {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + "as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + ",Sum(Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia) as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "where San_Pham.Ma = ?\n"
                + "group by San_Pham_Chi_Tiet.ID,\n"
                + "    San_Pham.Ma,\n"
                + "    San_Pham.Ten,\n"
                + "    Nha_San_Xuat.Ten,\n"
                + "    Mau_Sac.Ten,\n"
                + "    Size.Size,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "    Hoa_Don_Chi_Tiet.TrangThai;";
        return select(sql, MaHD);
    }

    public void tra1mon(String soLuong, String mahd, String masp) {
        String sql = "update Hoa_Don_Chi_Tiet \n"
                + "set Hoa_Don_Chi_Tiet.TrangThai = 0 , Hoa_Don_Chi_Tiet.soLuong = Hoa_Don_Chi_Tiet.soLuong - ?\n"
                + "                from Hoa_Don_Chi_Tiet \n"
                + "                join Hoa_Don on Hoa_Don.id = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "                join San_Pham_Chi_Tiet on San_Pham_Chi_Tiet.ID = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "                join San_Pham on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "                where Hoa_Don.MaHD = ? and San_Pham.Ma = ?";
        JdbcHelper.executeUpdate(sql, soLuong, mahd, masp);
    }

    public void traALll(String mahd) {
        String sql = "update Hoa_Don_Chi_Tiet \n"
                + "set Hoa_Don_Chi_Tiet.TrangThai = 0\n"
                + "from Hoa_Don_Chi_Tiet \n"
                + "join Hoa_Don on Hoa_Don.id = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "join San_Pham_Chi_Tiet on San_Pham_Chi_Tiet.ID = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join San_Pham on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "where Hoa_Don.MaHD = ? ";
        JdbcHelper.executeUpdate(sql, mahd);
    }

    public void traALll2(String mahd) {
        String sql = "UPDATE Hoa_Don \n"
                + "SET Hoa_Don.Deleted = 1\n"
                + "FROM Hoa_Don WHERE Hoa_Don.MaHD = ?";
        JdbcHelper.executeUpdate(sql, mahd);
    }

    public List<HoaDonChiTiet> selectByLichSu(String keyword) {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "where Hoa_Don_Chi_Tiet.Deleted =0 and Hoa_Don.TenNguoiNhan like ?";
        return select(sql, "%" + keyword + "%");
    }

    public List<HoaDonChiTiet> selectByTraHang1(String mahd, String keyword) {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham.Ma,San_Pham.Ten,Nha_San_Xuat.Ten as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "join Nhan_Vien on Nhan_Vien.id =Hoa_Don.IDNhanVien\n"
                + "where Hoa_Don_Chi_Tiet.trangthai = 1 and Hoa_Don.MaHD = ? and San_Pham.Ma = ? ";
        return select(sql, mahd, keyword);
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

    private HoaDonChiTiet readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonChiTiet model = new HoaDonChiTiet();
        try {
            model.setID(rs.getInt("ID"));
            model.setMaSPCT(rs.getString("Ma"));
            model.setTenSp(rs.getString("Ten"));
            model.setHang(rs.getString("Ten2"));
            model.setColor(rs.getString("Ten3"));
            model.setSize(rs.getInt("Size"));
            model.setSoLuong(rs.getInt("SoLuong"));
            model.setDonGia(rs.getDouble("Gia"));
            model.setTrangThai(rs.getInt("TrangThai"));
            model.setTongTien(rs.getDouble("ThanhTien"));
        } catch (SQLException e) {
            // Handle exceptions related to column names or data type conversions
            throw new SQLException("Error reading data from ResultSet: " + e.getMessage(), e);
        }
        return model;
    }
}
