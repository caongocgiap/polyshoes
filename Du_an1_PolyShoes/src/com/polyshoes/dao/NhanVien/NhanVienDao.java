/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.dao.NhanVien;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.NhanVien.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vu Hieu
 */
public class NhanVienDao {

    String SELECT_ALL_SQL = "select *  from [dbo].[Nhan_Vien] ORDER BY NgayTao desc";
    String SELECT_BY_ID_SQL = "select * from [dbo].[Nhan_Vien] WHERE MaNV= ?";
    String SELECT_BY_ID_SQLTrangThai = "select * from [dbo].[Nhan_Vien] WHERE TrangThai = ?";

    String INSERT_SQL = "INSERT INTO [dbo].[Nhan_Vien] (IDChucVu,MaNV,Email,MatKhau,CCCD,TenNV,NgaySinh,SDT,DiaChi,GioiTinh,TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE [dbo].[Nhan_Vien] SET IDChucVu=?,Email=?,CCCD=?,TenNV=?,NgaySinh=?,SDT=?,DiaChi=?,GioiTinh=?,TrangThai=? WHERE MaNV=?";
    String UPDATEMK_SQL = "UPDATE [dbo].[Nhan_Vien] SET MatKhau = ? WHERE MaNV=?";
    String SELECT_BY_FIND = "SELECT * FROM [dbo].[Nhan_Vien] WHERE MaNV LIKE ? or Email LIKE ? or TenNV LIKE ? or SDT LIKE ?  or DiaChi LIKE ?";

    String SELECT_COUNT = "SELECT count(*) FROM [dbo].[Nhan_Vien]";
    String SELECT_LOATDATA = "select top 5 * from [dbo].[Nhan_Vien] where MaNV not in (select top 1 MaNV from [dbo].[Nhan_Vien]  )";
    String SELECT_DELETE = "UPDATE [dbo].[Nhan_Vien] SET TrangThai=0 WHERE MaNV = ?";
    String SELECT_DELETE1 = "UPDATE [dbo].[Nhan_Vien] SET TrangThai=1 WHERE MaNV = ?";

    public List<NhanVien> selectAll2() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    public List<NhanVien> selectAll(long trang) {
        return this.selectBySQL("select top 7 * from [dbo].[Nhan_Vien] where MaNV not in (select top " + (trang * 7 - 7) + " MaNV from [dbo].[Nhan_Vien] ORDER BY NgayTao desc ) ORDER BY NgayTao desc");
    }

    public int select_COUNT() {
        int count = 0;

        try {
            ResultSet rs = JdbcHelper.executeQuery(SELECT_COUNT);
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return count;
    }

    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NhanVien> selectTrangThai(int trangThai) {
        List<NhanVien> list = this.selectBySQL(SELECT_BY_ID_SQLTrangThai, trangThai);
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public List<NhanVien> Find(String ma, String email, String ten, String sdt, String diaChi) {
        List<NhanVien> list = this.selectBySQL(SELECT_BY_FIND, "%" + ma + "%", "%" + email + "%", "%" + ten + "%", "%" + sdt + "%", "%" + diaChi + "%");
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public void insert(NhanVien entity) {
        JdbcHelper.executeUpdate(INSERT_SQL, entity.toDataRow());

    }

    public void update(NhanVien entity) {
        JdbcHelper.executeUpdate(UPDATE_SQL,
                entity.getChucVu(),
                entity.getEmail(),
                entity.getCccd(),
                entity.getTennv(),
                entity.getNgaySinh(),
                entity.getSdt(),
                entity.getDiaChi(),
                entity.getGioiTinh(),
                entity.getTrangThai(),
                entity.getManv()
        );
    }

    public void updateMK(NhanVien entity) {
        JdbcHelper.executeUpdate(UPDATEMK_SQL,
                entity.getMatKhau(),
                entity.getManv()
        );
    }

    public void delete(NhanVien entity) {
        JdbcHelper.executeUpdate(SELECT_DELETE,
                entity.getManv()
        );
    }

    public void KhoiPhuc(NhanVien entity) {
        JdbcHelper.executeUpdate(SELECT_DELETE1,
                entity.getManv()
        );
    }

    protected List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setId(rs.getInt("ID"));
                entity.setChucVu(rs.getInt("IDChucVu"));
                entity.setManv(rs.getString("MaNV"));
                entity.setEmail(rs.getString("Email"));
                entity.setSdt(rs.getString("SDT"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setCccd(rs.getString("CCCD"));
                entity.setGioiTinh(rs.getInt("GioiTinh"));
                entity.setTennv(rs.getString("TenNV"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setTrangThai(rs.getInt("TrangThai"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    

    
    
    
}
