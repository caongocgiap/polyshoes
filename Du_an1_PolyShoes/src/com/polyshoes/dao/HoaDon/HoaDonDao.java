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


    public void delete(String keyword) {
        String sql = "UPDATE Hoa_Don SET trangthai = 2 , Deleted = 1 WHERE MaHD = ?";
        JdbcHelper.executeUpdate(sql, keyword);
    }

    public void inHoaDon(String MAHD) {
        String sql = "UPDATE Hoa_Don SET trangthai = 0, Deleted = 1 WHERE MaHD = ?";
        JdbcHelper.executeUpdate(sql, MAHD);
    }

    public void InsertHanhDongTimKiem(String MAHD) {
        String sql = "	INSERT INTO [dbo].[Lich_Su_Hoa_Don] (\n"
                + "    [IDHoaDon],\n"
                + "    [ThoiGian],\n"
                + "    [HanhDong],\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + ")\n"
                + "SELECT\n"
                + "    [ID],\n"
                + "    GETDATE() AS [ThoiGian], -- Giả sử ThoiGian là dấu thời gian cho hành động\n"
                + "    5 AS [HanhDong], -- Giả sử 1 đại diện cho hành động bạn muốn ghi log\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    GETDATE() AS  [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + "FROM\n"
                + "    [dbo].[hoa_don]\n"
                + "WHERE\n"
                + "    [MaHD] = ?;";
        JdbcHelper.executeUpdate(sql, MAHD);
    }

    public void InsertHanhDongInHoaDon(String MAHD) {
        String sql = "	INSERT INTO [dbo].[Lich_Su_Hoa_Don] (\n"
                + "    [IDHoaDon],\n"
                + "    [ThoiGian],\n"
                + "    [HanhDong],\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + ")\n"
                + "SELECT\n"
                + "    [ID],\n"
                + "    GETDATE() AS [ThoiGian], -- Giả sử ThoiGian là dấu thời gian cho hành động\n"
                + "    7 AS [HanhDong], -- Giả sử 1 đại diện cho hành động bạn muốn ghi log\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    GETDATE() AS  [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + "FROM\n"
                + "    [dbo].[hoa_don]\n"
                + "WHERE\n"
                + "    [MaHD] = ?;";
        JdbcHelper.executeUpdate(sql, MAHD);
    }

    public void InsertHanhDongXuatDanhSach(String MAHD) {
        String sql = "	INSERT INTO [dbo].[Lich_Su_Hoa_Don] (\n"
                + "    [IDHoaDon],\n"
                + "    [ThoiGian],\n"
                + "    [HanhDong],\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + ")\n"
                + "SELECT\n"
                + "    [ID],\n"
                + "    GETDATE() AS [ThoiGian], -- Giả sử ThoiGian là dấu thời gian cho hành động\n"
                + "    8 AS [HanhDong], -- Giả sử 1 đại diện cho hành động bạn muốn ghi log\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    GETDATE() AS  [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + "FROM\n"
                + "    [dbo].[hoa_don]\n"
                + "WHERE\n"
                + "    [MaHD] = ?;";
        JdbcHelper.executeUpdate(sql, MAHD);
    }

    public void InsertHanhDongQR(String MAHD) {
        String sql = "	INSERT INTO [dbo].[Lich_Su_Hoa_Don] (\n"
                + "    [IDHoaDon],\n"
                + "    [ThoiGian],\n"
                + "    [HanhDong],\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + ")\n"
                + "SELECT\n"
                + "    [ID],\n"
                + "    GETDATE() AS [ThoiGian], -- Giả sử ThoiGian là dấu thời gian cho hành động\n"
                + "    6 AS [HanhDong], -- Giả sử 1 đại diện cho hành động bạn muốn ghi log\n"
                + "    [TrangThai],\n"
                + "    [NguoiTao],\n"
                + "    [NgayTao],\n"
                + "    [NguoiCapNhat],\n"
                + "    GETDATE() AS  [NgayCapNhat],\n"
                + "    [Deleted]\n"
                + "FROM\n"
                + "    [dbo].[hoa_don]\n"
                + "WHERE\n"
                + "    [MaHD] = ?;";
        JdbcHelper.executeUpdate(sql, MAHD);
    }

    public List<HoaDon> selectByTenKN(String keyword) {
        String sql = "SELECT * FROM Hoa_Don WHERE deleted = 0 and TenNguoiNhan LIKE ?";
        return select(sql, "%" + keyword + "%");
    }

    public List<HoaDon> selectByLSSS(String keyword) {
        String sql = "select\n"
                + "    ROW_NUMBER() OVER (ORDER BY Hoa_Don.Id DESC) AS stt,\n"
                + "    Hoa_Don.id,\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don.NgayTao,\n"
                + "    Hoa_Don.NgayThanhToan,\n"
                + "    Hoa_Don_Chi_Tiet.SoLuong,\n"
                + "    Hoa_Don_Chi_Tiet.Gia,\n"
                + "	Hoa_Don.TongTien as TongTien,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "   Khach_Hang.DiaCHi as DiaChi,\n"
                + "    Khach_Hang.HoTen as HoTen,\n"
                + "    Khach_Hang.SDT as SDT,\n"
                + "    Hoa_Don.TrangThai\n"
                + "from\n"
                + "    Hoa_Don\n"
                + "join Nhan_Vien on Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "join Hoa_Don_Chi_Tiet on Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "join Khach_Hang on Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "where\n"
                + "    Hoa_Don.Deleted = 0 and Hoa_Don.maHD = ?\n";
 
        return select(sql, keyword);
    }

    public List<HoaDon> selectByKeyword(String MAHD, String tenNguoiNhan, String MaNV, String SDT) {
        String sql = "SELECT\n"
                + "    ROW_NUMBER() OVER (ORDER BY Hoa_Don.Id DESC) AS stt,\n"
                + "                    Hoa_Don.id,\n"
                + "                    Hoa_Don.MaHD,\n"
                + "                    Hoa_Don.NgayTao,\n"
                + "                    Hoa_Don.NgayThanhToan,\n"
                + "                   Hoa_Don.TongTien AS TongTien,\n"
                + "                    Nhan_Vien.MaNV,\n"
                + "                    Khach_Hang.DiaChi AS DiaChi,\n"
                + "                    Khach_Hang.HoTen,\n"
                + "                    Khach_Hang.SDT,\n"
                + "                    Hoa_Don.TrangThai\n"
                + "                FROM\n"
                + "                    Hoa_Don\n"
                + "                JOIN\n"
                + "                    Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "                JOIN\n"
                + "                    Hoa_Don_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "                JOIN\n"
                + "                    Khach_Hang ON Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "                WHERE\n"
                + "                   hoa_don.Deleted = 0 and hoa_don_chi_tiet.soluong != 0 and MAHD = ? or HoTen like ? or MaNV = ? or Hoa_Don.SDT = ?\n";

        return select(sql, MAHD, "%" + tenNguoiNhan + "%", MaNV, SDT);
    }

    public List<HoaDon> pagingLoc(int TuSo, int DenSo, int page, int limit) {
        String sql = "	SELECT\n"
                + "    ROW_NUMBER() OVER (ORDER BY Hoa_Don.Id DESC) AS stt,\n"
                + "                    Hoa_Don.id,\n"
                + "                    Hoa_Don.MaHD,\n"
                + "                    Hoa_Don.NgayTao,\n"
                + "                    Hoa_Don.NgayThanhToan,\n"
                + "                     Hoa_Don.TongTien AS TongTien,\n"
                + "                    Nhan_Vien.MaNV,\n"
                + "                   Khach_Hang.DiaChi  AS DiaChi,\n"
                + "                    Khach_Hang.HoTen,\n"
                + "                    Khach_Hang.SDT,\n"
                + "                    Hoa_Don.TrangThai\n"
                + "                FROM\n"
                + "                    Hoa_Don\n"
                + "                JOIN\n"
                + "                    Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "                JOIN\n"
                + "                    Hoa_Don_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "                JOIN\n"
                + "                    Khach_Hang ON Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "				Join \n"
                + "					Voucher on Voucher.id = Hoa_Don.IDVoucher\n"
                + "                WHERE\n"
                + "                    TongTien BETWEEN ? AND ? AND Hoa_Don.Deleted = 0\n"
                + "	 ORDER BY Hoa_Don.NgayCapnhat DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return select(sql, TuSo, DenSo, page * limit, limit);
    }

    public List<HoaDon> selectTrangThai(int keyword) {
        String sql = "SELECT\n"
                + "    ROW_NUMBER() OVER (ORDER BY Hoa_Don.Id DESC) AS stt,\n"
                + "    Hoa_Don.id,\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don.NgayTao,\n"
                + "    Hoa_Don.NgayThanhToan,\n"
                + "    Hoa_Don.TongTien AS TongTien,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "    Khach_Hang.DiaChi AS DiaChi,\n"
                + "    Khach_Hang.HoTen,\n"
                + "    Khach_Hang.SDT,\n"
                + "    Hoa_Don.TrangThai\n"
                + "FROM\n"
                + "    Hoa_Don\n"
                + "JOIN\n"
                + "    Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "JOIN\n"
                + "    Hoa_Don_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "JOIN\n"
                + "    Khach_Hang ON Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "WHERE\n"
                + "    Hoa_Don.Deleted = 0 and Hoa_Don.TrangThai = ?\n";

        return select(sql, keyword);
    }

    public List<HoaDon> selectThanhToan(String keyword) {
        String sql = "SELECT\n"
                + "    ROW_NUMBER() OVER (ORDER BY Hoa_Don.Id DESC) AS stt,\n"
                + "    Hoa_Don.id,\n"
                + "    Hoa_Don.MaHD,\n"
                + "    Hoa_Don.NgayTao,\n"
                + "    Hoa_Don.NgayThanhToan,\n"
                + "    Hoa_Don.TongTien AS TongTien,\n"
                + "    Nhan_Vien.MaNV,\n"
                + "   Khach_Hang.diachi AS DiaChi,\n"
                + "    Khach_Hang.HoTen,\n"
                + "    Khach_Hang.SDT,\n"
                + "    Hoa_Don.TrangThai\n"
                + "FROM\n"
                + "    Hoa_Don\n"
                + "JOIN\n"
                + "    Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "JOIN\n"
                + "    Hoa_Don_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "JOIN\n"
                + "    Khach_Hang ON Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "JOIN \n"
                + "	Hinh_Thuc_TT ON Hinh_Thuc_TT.IDHoaDon = Hoa_Don.ID\n"
                + "JOIN \n"
                + "	Thanh_Toan ON Thanh_Toan.id = Hinh_Thuc_TT.IDThanhToan\n"
                + "WHERE\n"
                + "    Hoa_Don.Deleted = 0 and Thanh_Toan.MoTa LIKE ?\n";
        return select(sql, "%" + keyword + "%");
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
        model.setStt(rs.getInt("stt"));
//        model.setIDNhanVien(rs.getInt("IDNhanVien"));
        model.setMaHD(rs.getString("MAHD"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setNgayTT(rs.getDate("NgayThanhToan"));
        model.setTongTien(rs.getDouble("TongTien"));
        model.setMaNV(rs.getString("MaNV"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setTenKH(rs.getString("HoTen"));
        model.setSDT(rs.getString("SDT"));
        model.setTrangThai(rs.getInt("TrangThai"));

        return model;
    }

    public List<HoaDon> paging3(int page, int limit) {
        String sql = "SELECT\n"
                + "        ROW_NUMBER() OVER (ORDER BY Hoa_Don.Id DESC) AS stt,\n"
                + "        Hoa_Don.ID,\n"
                + "        Hoa_Don.MaHD,\n"
                + "        Hoa_Don.NgayTao,\n"
                + "        Hoa_Don.NgayThanhToan,\n"
                + "        Hoa_Don.TongTien,\n"
                + "        Nhan_Vien.MaNV,\n"
                + "        khach_hang.diachi AS DiaChi,\n"
                + "        Khach_Hang.HoTen,\n"
                + "        Khach_Hang.SDT,\n"
                + "        Hoa_Don.TrangThai\n"
                + "    FROM\n"
                + "        Hoa_Don\n"
                + "    LEFT JOIN\n"
                + "        Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID\n"
                + "    LEFT JOIN\n"
                + "        Hoa_Don_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID\n"
                + "    LEFT JOIN\n"
                + "        Khach_Hang ON Khach_Hang.id = Hoa_Don.IDKhachHang\n"
                + "    WHERE\n"
                + "        Hoa_Don.Deleted = 0\n"
                + "ORDER BY Hoa_Don.NgayThanhToan DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
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
    final String GET_HD_BY_MA = "{CALL Get_HD_By_MaHD(?,?)}";

    public List<HoaDon> getHD_ByMa(String maHD, int trangThai) {
        return selectBanHang(GET_HD_BY_MA, maHD, trangThai);
    }

    public List<HoaDon> selectBanHang(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon model = new HoaDon(rs.getInt("ID"), rs.getString("MaHD"), rs.getDate("NgayTao"),
                            rs.getString("MaNV"), rs.getInt("TongSP"), rs.getDouble("TongTien"), rs.getInt("TrangThai"), rs.getDate("NgayThanhToan"));
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
