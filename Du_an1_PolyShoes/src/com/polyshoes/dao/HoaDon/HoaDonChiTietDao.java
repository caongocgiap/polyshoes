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
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham_chi_tiet.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
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
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham_chi_Tiet.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + " as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,(Hoa_Don_Chi_Tiet.SoLuong - TraHang.SoLuong)as SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + " ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "join TraHang on TraHang.IDHoaDonChiTiet = Hoa_Don_Chi_Tiet.id \n"
                + "where Hoa_don_chi_Tiet.soluong !=0 and  Hoa_Don.MaHD = ?";
        return select(sql, MaHD);
    }

    public List<HoaDonChiTiet> selectByTraHang2(String MaHD) {
        String sql = "	SELECT\n"
                + "    Hoa_Don.id,\n"
                + "    San_Pham_Chi_Tiet.Ma,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "	San_Pham.Ten,\n"
                + "	Nha_San_Xuat.Ten as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "    SUM(Hoa_Don_Chi_Tiet.SoLuong * Hoa_Don_Chi_Tiet.Gia) AS thanhTien,\n"
                + "    Hoa_Don.TongTien AS TongTien,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "    (DiaChi.Xa + ', ' + DiaChi.Quan + ', ' + DiaChi.Tinh) AS DiaChi,\n"
                + "    Khach_Hang.HoTen AS HoTen,\n"
                + "    Khach_Hang.SDT AS SDT,\n"
                + "    Hoa_Don.TrangThai\n"
                + "FROM\n"
                + "    Hoa_Don\n"
                + "JOIN Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "JOIN Hoa_Don_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "JOIN Khach_Hang ON Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "JOIN DiaChi ON DiaChi.IDKhachHang = Khach_Hang.ID\n"
                + "JOIN San_Pham_Chi_Tiet ON San_Pham_Chi_Tiet.id = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "JOIN San_Pham ON San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Size on Size.id = San_Pham_Chi_Tiet.IDSize\n"
                + "join Mau_Sac on Mau_Sac.id = San_Pham_Chi_Tiet.IDMauSac\n"
                + "WHERE\n"
                + "    Hoa_Don.Deleted = 0 AND Hoa_Don.maHD = ?\n"
                + "GROUP BY\n"
                + "    Hoa_Don.id,\n"
                + "    San_Pham_Chi_Tiet.Ma,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "    Hoa_Don.TongTien,\n"
                + "	San_Pham.Ten,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "	Nha_San_Xuat.Ten,\n"
                + "	Mau_Sac.Ten,\n"
                + "    DiaChi.Xa,\n"
                + "	Size,\n"
                + "    DiaChi.Quan,\n"
                + "    DiaChi.Tinh,\n"
                + "    Khach_Hang.HoTen,\n"
                + "    Khach_Hang.SDT,\n"
                + "    Hoa_Don.TrangThai;";
        return select(sql, MaHD);
    }

    public List<HoaDonChiTiet> selectByTramotmon(String MaHD, String MaSP) {
        String sql = "select San_Pham_Chi_Tiet.ID,San_Pham_chi_tiet.Ma,San_Pham.Ten,Nha_San_Xuat.Ten\n"
                + " as Ten2,Mau_Sac.Ten as  Ten3,Size.Size,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,Hoa_Don_Chi_Tiet.TrangThai\n"
                + " ,Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia as ThanhTien \n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "where  Hoa_Don.MaHD = ? and San_Pham_chi_tiet.ma = ?";
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

    public void tra1mon(int soLuong, String lydo, String mahd, String masp) {
        String sql = "update TraHang set TraHang.soluong = TraHang.soluong + ? ,TraHang.LyDoTraHang= ?\n"
                + "from TraHang \n"
                + "join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.ID = TraHang.IDHoaDonChiTiet\n"
                + "join Hoa_Don on Hoa_Don.id = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "join San_Pham_Chi_Tiet on San_Pham_Chi_Tiet.ID = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join San_Pham on San_Pham.id =San_Pham_Chi_Tiet.IDSanPham\n"
                + "where Hoa_Don.MaHD =? and San_Pham_chi_tiet.ma = ?";
        JdbcHelper.executeUpdate(sql, soLuong, lydo, mahd, masp);
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

    public void traALll3(String mahd) {
        String sql = "update Hoa_Don set Hoa_Don.TrangThai = 3\n"
                + "where Hoa_Don.MaHD =?";
        JdbcHelper.executeUpdate(sql, mahd);
    }

    public void traVeSoLuong(int soLuong, String MaSP) {
        String sql = "update San_Pham_Chi_Tiet set SoLuongTon = SoLuongTon + ?\n"
                + "where San_Pham_Chi_Tiet.Ma = ?";
        JdbcHelper.executeUpdate(sql, soLuong, MaSP);
    }

    public void traVeSoLuongall(String MaHD) {
        String sql = "update San_Pham_Chi_Tiet set SoLuongTon = SoLuongTon + Hoa_Don_Chi_Tiet.SoLuong\n"
                + "from San_Pham_Chi_Tiet join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDSanPhamCT = San_Pham_Chi_Tiet.id\n"
                + "join Hoa_Don on Hoa_Don.id = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "where Hoa_Don.MaHD = ?";
        JdbcHelper.executeUpdate(sql, MaHD);
    }

    public void traALll2(String mahd, String lydo) {
        String sql = "update TraHang set TraHang.soluong = Hoa_Don_Chi_Tiet.SoLuong,traHang.LyDoTraHang=? \n"
                + "from TraHang \n"
                + "join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.ID = TraHang.IDHoaDonChiTiet\n"
                + "join Hoa_Don on Hoa_Don.id = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "join San_Pham_Chi_Tiet on San_Pham_Chi_Tiet.ID = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join San_Pham on San_Pham.id =San_Pham_Chi_Tiet.IDSanPham\n"
                + "where Hoa_Don.MaHD =?";
        JdbcHelper.executeUpdate(sql, lydo, mahd);
    }

    public void traALll4(String mahd) {
        String sql = "update hoa_don set hoa_don.ngaycapnhat = getdate()"
                + "where mahd = ?";
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

    /**
     * Bán hàng - đừng xóa nhé
     */
    private List<HoaDonChiTiet> selectBanHang(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonChiTiet model = new HoaDonChiTiet();
                    model.setMaSPCT(rs.getString(1));
                    model.setTenSp(rs.getString(2));
                    model.setColor(rs.getString(3));
                    model.setCoGiay(rs.getString(4));
                    model.setSize(rs.getInt(5));
                    model.setDonGia(rs.getDouble(6));
                    model.setSoLuong(rs.getInt(7));
                    model.setTongTien(rs.getDouble(8));
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

    public List<HoaDonChiTiet> selectHDBanHang(String maHD) {
        String sql = """
                         SELECT    San_Pham_Chi_Tiet.Ma, San_Pham.Ten, Mau_Sac.Ten, Co_Giay.Ten, Size.size, 
                                Hoa_Don_Chi_Tiet.Gia, Hoa_Don_Chi_Tiet.SoLuong, Hoa_Don_Chi_Tiet.ThanhTien
                         FROM         Hoa_Don_Chi_Tiet LEFT JOIN
                         Thanh_Toan ON Hoa_Don_Chi_Tiet.ID = Thanh_Toan.ID LEFT JOIN
                         San_Pham_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDSanPhamCT = San_Pham_Chi_Tiet.ID LEFT JOIN
                         Mau_Sac ON San_Pham_Chi_Tiet.IDMauSac = Mau_Sac.ID LEFT JOIN
                         Co_Giay ON San_Pham_Chi_Tiet.IDCoGiay = Co_Giay.ID LEFT JOIN
                         Size ON San_Pham_Chi_Tiet.IDSize = Size.ID LEFT JOIN
                         San_Pham ON San_Pham_Chi_Tiet.IDSanPham = San_Pham.ID LEFT JOIN
                         Hoa_Don ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID WHERE Hoa_Don.MaHD = ?""";
        return selectBanHang(sql, maHD);
    }
}
