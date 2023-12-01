package com.polyshoes.dao.HoaDon;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.HoaDon;
import com.polyshoes.model.sanpham.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDao {

    public List<HoaDon> select() {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Hoa_Don.TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "where Hoa_Don.Deleted = 0 ORDER BY Hoa_Don.ID DESC";
        return select(sql);
    }

    public void delete(String keyword) {
        String sql = "UPDATE Hoa_Don SET trangthai = 2 , Deleted = 1 WHERE MaHD = ?";
        JdbcHelper.executeUpdate(sql, keyword);
    }

    public HoaDon findById(String keyword) {
        String sql = "SELECT id,idNhanVien, Hoa_Don.MaHD, Hoa_Don.SDT, Hoa_Don.TenNguoiNhan, \n"
                + "Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Hoa_Don.DiaChi,\n"
                + "Hoa_Don.TrangThai,Hoa_Don.TongTien\n"
                + "FROM Hoa_Don where Hoa_Don.TenNguoiNhan like ?";
        List<HoaDon> list = select(sql, "%" + keyword + "%");
        return list.size() > 0 ? list.get(0) : null;
    }

    public void inHoaDon(String MAHD) {
        String sql = "UPDATE Hoa_Don SET trangthai = 0, Deleted = 1 WHERE MaHD = ?";
        JdbcHelper.executeUpdate(sql, MAHD);
    }

    public List<HoaDon> selectByTenKN(String keyword) {
        String sql = "SELECT * FROM Hoa_Don WHERE deleted = 0 and TenNguoiNhan LIKE ?";
        return select(sql, "%" + keyword + "%");
    }

    public List<HoaDon> selectByLSSS(String keyword) {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,SUM(Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia) as TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + " from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + " join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "\n"
                + "  where Hoa_Don.Deleted = 0  and Hoa_Don.mahd=?\n"
                + "group by  Hoa_Don.id,\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don.NgayTao,\n"
                + "    Hoa_Don.NgayThanhToan,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "    Hoa_Don.DiaChi,\n"
                + "    Hoa_Don.TenNguoiNhan,\n"
                + "    Hoa_Don.SDT,\n"
                + "    Hoa_Don.TrangThai;";
        return select(sql, keyword);
    }

    public List<HoaDon> selectByLSSS2(String mahd, String keyword) {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,SUM(Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia) as TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "from San_Pham join San_Pham_Chi_Tiet on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "join Nha_San_Xuat on Nha_San_Xuat.ID = San_Pham_Chi_Tiet.IDNSX\n"
                + "join Hoa_Don_Chi_Tiet on San_Pham_Chi_Tiet.id =Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join Hoa_Don on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.id\n"
                + "join Mau_Sac on Mau_Sac.ID = San_Pham_Chi_Tiet.IDMauSac\n"
                + "join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "join Size on Size.ID = San_Pham_Chi_Tiet.IDSize\n"
                + "where Hoa_Don.MaHD =? and San_Pham.Ma = ?\n"
                + "group by Hoa_Don.id,\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don.NgayTao,\n"
                + "    Hoa_Don.NgayThanhToan,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "    Hoa_Don.DiaChi,\n"
                + "    Hoa_Don.TenNguoiNhan,\n"
                + "    Hoa_Don.SDT,\n"
                + "    Hoa_Don.TrangThai;\n";

        return select(sql, mahd, keyword);
    }

    public List<HoaDon> selectByHD(String keyword) {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Hoa_Don.TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "where Hoa_Don.MaHD = ?";
        return select(sql, keyword);
    }

    public List<HoaDon> selectByMaNV(String keyword) {
        String sql = "SELECT * FROM Hoa_Don WHERE deleted = 0 and IDNhanVien = ?";
        return select(sql, keyword);
    }

    public List<HoaDon> selectByKeyword(String MAHD, String tenNguoiNhan, String MaNV, String SDT) {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Hoa_Don_Chi_Tiet.SoLuong,Hoa_Don_Chi_Tiet.Gia,SUM(Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia) as TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + " from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + " join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + " where hoa_don.Deleted = 0 and hoa_don_chi_tiet.soluong != 0 and MAHD = ? or tenNguoiNhan like ? or MaNV = ? or Hoa_Don.SDT = ?\n"
                + "\n"
                + "group by  Hoa_Don.id,\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don.NgayTao,\n"
                + "    Hoa_Don.NgayThanhToan,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "    Hoa_Don.DiaChi,\n"
                + "    Hoa_Don.TenNguoiNhan,\n"
                + "    Hoa_Don.SDT,\n"
                + "    Hoa_Don.TrangThai;";
        return select(sql, MAHD, "%" + tenNguoiNhan + "%", MaNV, SDT);
    }

    public List<HoaDon> paging2(int TuSo, int DenSo, int page, int limit) {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Hoa_Don.TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "where TongTien BETWEEN ? AND ? AND Hoa_Don.deleted = 0\n"
                + "ORDER BY ID DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return select(sql, TuSo, DenSo, page * limit, limit);
    }

    public List<HoaDon> selectTrangThai(int keyword) {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Hoa_Don.TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "where Hoa_Don.Deleted = 0 and Hoa_Don.TrangThai = ?";
        return select(sql, keyword);
    }

    public List<HoaDon> selectThanhToan(String keyword) {
        String sql = "SELECT hoa_don.ID, hoa_don.MaHD, hoa_don.NgayTao, hoa_don.NgayThanhToan, hoa_don.TongTien, Nhan_Vien.MaNV, hoa_don.TenNguoiNhan,hoa_don.DiaChi,hoa_don.SDT, hoa_don.TrangThai\n"
                + "               FROM Hoa_Don\n"
                + "              join Nhan_Vien on Nhan_Vien.ID = Hoa_Don.IDNhanVien\n"
                + "               JOIN Hinh_Thuc_TT ON Hinh_Thuc_TT.IDHoaDon = Hoa_Don.ID\n"
                + "               JOIN Thanh_Toan ON Thanh_Toan.id = Hinh_Thuc_TT.IDThanhToan\n"
                + "              WHERE hoa_don.deleted =0 and  Thanh_Toan.MoTa LIKE ?";
        return select(sql, "%" + keyword + "%");
    }

    public void updateTraHang(String MAHD) {
        String sql = "update Hoa_Don_Chi_Tiet \n"
                + "set Hoa_Don_Chi_Tiet.TrangThai = 0\n"
                + "from Hoa_Don_Chi_Tiet \n"
                + "join Hoa_Don on Hoa_Don.id = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "where Hoa_Don.MaHD = ?";
        JdbcHelper.executeUpdate(sql, MAHD);
    }

    public void updateTra1Hang(String MAHD, String Ten) {
        String sql = "update Hoa_Don_Chi_Tiet \n"
                + "set Hoa_Don_Chi_Tiet.TrangThai = 1\n"
                + "from Hoa_Don_Chi_Tiet \n"
                + "join Hoa_Don on Hoa_Don.id = Hoa_Don_Chi_Tiet.IDHoaDon\n"
                + "join San_Pham_Chi_Tiet on San_Pham_Chi_Tiet.ID = Hoa_Don_Chi_Tiet.IDSanPhamCT\n"
                + "join San_Pham on San_Pham.ID = San_Pham_Chi_Tiet.IDSanPham\n"
                + "where Hoa_Don.MaHD = ? San_Pham.Ten like ";
        JdbcHelper.executeUpdate(sql, MAHD, "%" + Ten + "%");
    }

    private List<HoaDon> select(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon model = readFromResultSet(rs);
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

    private HoaDon readFromResultSet(ResultSet rs) throws SQLException {
        HoaDon model = new HoaDon();
        model.setID(rs.getInt("ID"));
//        model.setIDNhanVien(rs.getInt("IDNhanVien"));
        model.setMaHD(rs.getString("MAHD"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setNgayTT(rs.getDate("NgayThanhToan"));
        model.setTongTien(rs.getDouble("TongTien"));
        model.setMaNV(rs.getString("MaNV"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setTenKH(rs.getString("TenNguoiNhan"));
        model.setSDT(rs.getString("SDT"));
        model.setTrangThai(rs.getInt("TrangThai"));

        return model;
    }

    public List<HoaDon> paging(int page, int limit) {
        String sql = "	select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,SUM(Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia) as TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "               from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "               join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "                 where Hoa_Don.Deleted = 0\n"
                + "				 group by \n"
                + "				 Hoa_Don.id,Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "               ORDER BY ID DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return select(sql, page, limit);
    }

    public List<HoaDon> paging3(int page, int limit) {
        String sql = "select Hoa_Don.id, Hoa_Don.MaHD,Hoa_Don.NgayTao,Hoa_Don.NgayThanhToan,SUM(Hoa_Don_Chi_Tiet.SoLuong*Hoa_Don_Chi_Tiet.Gia) as TongTien,Nhan_Vien.MaNV,Hoa_Don.DiaChi,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,Hoa_Don.SDT,Hoa_Don.TrangThai\n"
                + "     from Hoa_Don join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "          join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "               where Hoa_Don.Deleted = 0\n"
                + "        		 group by \n"
                + "    		 Hoa_Don.id,Hoa_Don.MaHD,Hoa_Don.NgayTao,\n"
                + "			 Hoa_Don.NgayThanhToan,Nhan_Vien.MaNV,\n"
                + "			 Hoa_Don.DiaChi,Hoa_Don.DiaChi,Hoa_Don.TenNguoiNhan,\n"
                + "			 Hoa_Don.SDT,Hoa_Don.TrangThai,Hoa_Don.NgayCapnhat\n"
                + "              ORDER BY Hoa_Don.NgayCapnhat DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return select(sql, page, limit);
    }
//     public List<HoaDon> paging(int page, int limit) {
//        String sql = "	 SELECT * FROM Hoa_Don WHERE deleted = 0\n"
//                + "ORDER BY ID DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
//        return select(sql, page, limit);
//    }

    /**
     * Bán hàng - đừng xóa nhé
     */
//    public List<HoaDon> selectHDBanHang() {
//            String sql = "SELECT    Hoa_Don.MaHD, CONVERT(VARCHAR(20), Hoa_Don.NgayTao, 103) AS NgayTao, CONVERT(VARCHAR(20),Hoa_Don.NgayThanhToan, 103) AS NgayThanhToan,\n" +
//                        "Hoa_Don.TrangThai, Nhan_Vien.MaNV, Khach_Hang.HoTen, Hoa_Don.TongTien, Thanh_Toan.HinhThuc\n" +
//                        "FROM Hoa_Don LEFT JOIN Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID LEFT JOIN\n" +
//                        "Thanh_Toan ON Hoa_Don.ID = Thanh_Toan.ID LEFT JOIN\n" +
//                        "Khach_Hang ON Hoa_Don.IDKhachHang = Khach_Hang.ID";
//            return selectBanHang(sql);
//    }
    final String GET_IDHD_BY_MA = "{CALL Get_HD_By_MaHD(?,?)}";

    public List<HoaDon> getHD_ByMa(String maHD, int trangThai) {
        return selectBanHang(GET_IDHD_BY_MA, maHD, trangThai);
    }

    public List<HoaDon> selectBanHang(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon model = new HoaDon(rs.getInt(1), rs.getString(2), rs.getDate(3),
                            rs.getDate(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getInt(9) == 0);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    public void thanhToan(String maHD) {
        String sql = "UPDATE Hoa_Don SET TrangThai = 0 WHERE MaHD = ?";
        JdbcHelper.executeUpdate(sql, maHD);
    }

}
