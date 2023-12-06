/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.dao.khachhang;

import com.polyshoes.model.khachhang.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.helper.JdbcHelper;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class KhachHangDao {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void insert(KhachHang model) {
        String sql = "INSERT INTO Khach_hang( MaKH,HoTen,SDT,GioiTinh,DiaChi) VALUES( ?, ?,?,?,?)";
        JdbcHelper.executeUpdate(sql,model.todataROw());

    }

    public void update(KhachHang model) {
        String sql = "UPDATE Khach_hang SET HoTen=?,SDT=?,GioiTinh=? where MaKH= ? ";
        JdbcHelper.executeUpdate(sql,
                model.getHoTen(),
                model.getSDT(),
                model.isGioitinh(),
                model.getMaKH());

    }

//    public void updateDiaChi(KhachHang model) {
//        String sql = "update DiaChi set Tinh =?,Xa =?,Quan =?  from DiaChi join Khach_Hang on Khach_Hang.ID = DiaChi.ID where MaKH=?";
//        JdbcHelper.executeUpdate(sql,
//                model.getQuan(),
//                model.getTinh(),
//                model.getXa(),
//                model.getMaKH());
//
//    }
//     public void update1(KhachHang model) {
//        String sql = "UPDATE Khach_hang SET DiaChi=? where MaKH= ? ";
//        JdbcHelper.executeUpdate(sql,
//                model.getDiaChi(),
//                model.getMaKH());
//
//    }

    public KhachHang findById(String MaKH) {
        String sql = "  SELECT * FROM Khach_hang WHERE MaKH = ?";
        List<KhachHang> list = select(sql, MaKH);
        return !list.isEmpty() ? list.get(0) : null;
//        return findById(sql);
////  return list.size() > 0 ? list.get(0) : null;
    }



    public KhachHang findByKhachHang(String MaKH) {
        String sql = "SELECT MaKH ,HoTen FROM Khach_Hang WHERE MaKH = ?";
        List<KhachHang> list = select3(sql, MaKH);
        return !list.isEmpty() ? list.get(0) : null;
    }

//    public List<KhachHang> selectByDiaCHi(String MaKH) {
//        String sql = "select MaKH ,HoTen from Khach_Hang where MaKH  like ?";
//        return select(sql, "%" + MaKH + "%");
//    }
    public List<KhachHang> selectByALL(String MaKH, String HoTen, String SDT) {
        String sql = "  SELECT  Khach_Hang.MaKH, Khach_Hang.HoTen,DiaChi.Tinh,DiaChi.Quan,DiaChi.Xa, Khach_Hang.SDT,CONCAT(DiaChi.Xa ,',' ,DiaChi.Quan,',' ,DiaChi.Tinh)  AS DiaChiChiTiet, Khach_Hang.GioiTinh\n"
                + "FROM     DiaChi INNER JOIN  Khach_Hang ON DiaChi.ID = Khach_Hang.ID WHERE MaKH like ? or HoTen like ? or SDT like ? ";
        return select(sql, "%" + MaKH + "%", "%" + HoTen + "%", "%" + SDT + "%");
    }

    public List<KhachHang> selectByALLLS(String MaKH, String HoTen, String SDT, String MaHD) {
        String sql = "SELECT Khach_Hang.MaKH, Hoa_Don.MaHD, Khach_Hang.HoTen,Khach_Hang.SDT,CONCAT(DiaChi.Xa ,',' ,DiaChi.Quan,',' ,DiaChi.Tinh) AS DiaChiChiTiet\n"
                + ", Hoa_Don.NgayNhan, Hoa_Don.TongTien, Hoa_Don.TrangThai FROM  Khach_Hang INNER JOIN\n"
                + "                  Hoa_Don ON Khach_Hang.ID = Hoa_Don.ID  INNER JOIN DiaChi ON Khach_Hang.ID = DiaChi.ID  WHERE MaKH like ? or HoTen like ? or SDT like ? or MaHD like ?";
        return select1(sql, "%" + MaKH + "%", "%" + HoTen + "%", "%" + SDT + "%", "%" + MaHD + "%");
    }

    public KhachHang findById1(String MaKH) {
        String sql = "  SELECT * FROM Khach_hang WHERE MaKH = ?";
        List<KhachHang> list = select(sql, MaKH);
        return !list.isEmpty() ? list.get(0) : null;
    }

    public List<KhachHang> select() {
        String sql = "select * from Khach_Hang";
        return select(sql);
    }

    public List<KhachHang> selectHoaDon() {
        String sql = "SELECT  Hoa_Don.MaHD,Khach_Hang.MaKH,Khach_Hang.HoTen, Hoa_Don.NgayNhan,Hoa_Don.TongTien, Hoa_Don.TrangThai\n"
                + "FROM Khach_Hang INNER JOIN  Hoa_Don ON Khach_Hang.ID = Hoa_Don.IDKhachHang ";
        return select1(sql);
    }

    public List<KhachHang> selectHoaDon1(String MaKH) {
        String sql = "SELECT kh.MaKH,hd.MaHD, kh.HoTen,kh.SDT,kh.DiaChi,hd.NgayNhan,hd.TongTien, hd.TrangThai from Khach_Hang kh  join Hoa_Don hd on kh.ID = hd.IDKhachHang";
        return select1(sql, "%" + MaKH + "%");
    }

    public void delete(String MaKH) {
        String sql = "update Khach_Hang set Deleted = 1 where MaKH = ?";
        JdbcHelper.executeUpdate(sql, MaKH);
    }

    public void deleteDiaChi(String MaKH) {
        String sql = "delete from DiaChi join Khach_Hang on Khach_Hang.ID = DiaChi.ID WHERE Khach_Hang.MaKH = ?";
        JdbcHelper.executeUpdate(sql, MaKH);
    }

    private List<KhachHang> select(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private List<KhachHang> select3(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang model = readFromResultSet3(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private List<KhachHang> select1(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang model = readFromResultSet1(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<KhachHang> paging(int page, int limit) {
        String sql = "SELECT Khach_Hang.ID,Khach_Hang.MaKH, Khach_Hang.HoTen, Khach_Hang.SDT,Khach_Hang.Deleted,CONCAT(DiaChi.Xa ,',' ,DiaChi.Quan,',' ,DiaChi.Tinh) AS DiaChiChiTiet ,DiaChi.Tinh,DiaChi.Quan,DiaChi.Xa, Khach_Hang.GioiTinh\n"
                + "FROM  Khach_Hang INNER JOIN DiaChi ON Khach_Hang.ID = DiaChi.ID   WHERE Khach_Hang.Deleted = 0 ORDER BY ID DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return select(sql, page, limit);
    }

    private KhachHang readFromResultSet(ResultSet rs) throws SQLException {
        KhachHang model = new KhachHang();
        model.setMaKH(rs.getString("MaKH"));
        model.setHoTen(rs.getString("HoTen"));
        model.setSDT(rs.getString("SDT"));
        model.setDiaChi(rs.getString("DiaChi"));
        model.setGioitinh(rs.getBoolean("GioiTinh"));
        return model;
    }

    private KhachHang readFromResultSet3(ResultSet rs) throws SQLException {
        KhachHang model = new KhachHang();
        model.setMaKH(rs.getString("MaKH"));
        model.setHoTen(rs.getString("HoTen"));
        return model;
    }

    private KhachHang readFromResultSet1(ResultSet rs) throws SQLException {
        KhachHang model = new KhachHang();
        model.setMaHD(rs.getString("MaHD"));
        model.setMaKH(rs.getString("MaKH"));
        model.setHoTen(rs.getString("HoTen"));
        model.setSDT(rs.getString("SDT"));
        model.setDiaChi(rs.getString("DiaChiChiTiet"));
        model.setNgayGiaoDich(rs.getDate("NgayNhan"));
        model.setTongTien(rs.getInt("TongTien"));
        model.setTrangThai1(rs.getInt("TrangThai"));
        return model;
    }

    private List<KhachHang> selectBanHang(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang model = readFromResultSetBanhang(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private KhachHang readFromResultSetBanhang(ResultSet rs) throws SQLException {
        KhachHang model = new KhachHang();
        model.setMaKH(rs.getString("MaKH"));
        model.setHoTen(rs.getString("HoTen"));
        model.setSDT(rs.getString("SDT"));
        model.setGioitinh(rs.getBoolean("GioiTinh"));
        model.setDiaChi(rs.getString("DiaChi"));

        return model;
    }

    // Những đoạn code gọi bên phần chọn khách hàng 
    
    public List<KhachHang> findAll(String key) {
        String sql = " SELECT MaKH, HoTen, SDT, GioiTinh, DiaChi from Khach_Hang where MaKH Like ? or SDT like ? or HoTen like ? or DiaChi like ?  ";
        List<KhachHang> list = selectBanHang(sql, "%" + key + "%", "%" + key + "%","%" + key + "%","%" + key + "%");
        return list;
    }

    public List<KhachHang> select2() {
        String sql = "SELECT MaKH, HoTen, SDT, GioiTinh, DiaChi from Khach_Hang";
        return selectBanHang(sql);
    }
        public KhachHang findByMaKH(String MaKH) {
        String sql = "SELECT MaKH, HoTen, SDT, GioiTinh, DiaChi from Khach_Hang where MaKH = ? ";
        List<KhachHang> list = select(sql, MaKH);
        return !list.isEmpty() ? list.get(0) : null;
//        return findById(sql);
////  return list.size() > 0 ? list.get(0) : null;
    }
}
