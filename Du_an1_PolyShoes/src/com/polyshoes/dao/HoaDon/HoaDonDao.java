package com.polyshoes.dao.HoaDon;


import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDao {

    Connection con = null;

    PreparedStatement ps = null;

    String sql = null;

    ResultSet rs = null;
    public List<HoaDon> select() {
        String sql = "SELECT * FROM Hoa_Don WHERE deleted = 0";
        return select(sql);
    }

//    public void insert(HoaDon model) {
//        String sql = "INSERT INTO Hoa_Don  VALUES (?, ?, ?, ?, ?, ?)";
//        JdbcHelper.executeUpdate(sql,
//                model.getMaCD(),
//                model.getTenCD(),
//                model.getHocPhi(),
//                model.getThoiLuong(),
//                model.getHinh(),
//                model.getMoTa());
//    }
//
//    //câu lệnh cập nhập dữ liệu vào sql
//    public void update(HoaDon model) {
//        String sql = "UPDATE Hoa_Don SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
//        JdbcHelper.executeUpdate(sql,
//                model.getTenCD(),
//                model.getHocPhi(),
//                model.getThoiLuong(),
//                model.getHinh(),
//                model.getMoTa(),
//                model.getMaCD());
//    }
//    //câu lệnh xóa dữ liệu  sql
//
//    public void delete(String MAHD) {
//        String sql = "DELETE FROM Lich_Su_Hoa_Don\n"
//                + "WHERE IDHoaDon IN (SELECT ID FROM Hoa_Don WHERE mahd = ?)\n"
//                + "DELETE FROM Hoa_Don\n"
//                + "where mahd = ?";
//        JdbcHelper.executeUpdate(sql, MAHD, MAHD);
//
//    }
    public void delete(String MAHD) {
        String sql ="UPDATE Hoa_Don SET Deleted = 1 WHERE MaHD = ?";
        JdbcHelper.executeUpdate(sql, MAHD);
    }
//     public int deleteBang(String MAHD) {//them dl vao data sinhvien
//        sql = "UPDATE Hoa_Don SET Deleted = 1 WHERE MaHD = ?";
//
//        try {
//            con = DBConnect.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, MAHD);
//            return ps.executeUpdate();
//            //insert.delete,update
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }

    public HoaDon findById(String macd) {
        String sql = "SELECT * FROM Hoa_Don WHERE MAHD=?";
        List<HoaDon> list = select(sql, macd);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<HoaDon> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM Hoa_Don WHERE MAHD LIKE ?";
        return select(sql, "%" + keyword + "%");
    }
    public List<HoaDon> selectTrangThai(String keyword) {
        String sql = "SELECT * FROM Hoa_Don WHERE TrangThai = ?";
        return select(sql, keyword);
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
   
        model.setMaHD(rs.getString("MaHD"));
        model.setNgayTao(rs.getDate("NgayTao"));
        model.setNgayTT(rs.getDate("NgayThanhToan"));
        model.setTongTien(rs.getDouble("TongTien"));
        model.setMaNV(rs.getString("IDNhanVien"));
        model.setTenKH(rs.getString("TenNguoiNhan"));
        model.setTrangThai(rs.getBoolean("TrangThai"));
        return model;
    }

}
