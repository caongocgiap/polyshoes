package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO {

        String getSP_All = "{CALL get_All_SP}";
        String findByMa = "{CALL getIDSP_ByMa(?)}";
        String get_SP_Deleted = "{CALL get_SP_Deleted(?,?,?)}";

        public int insert(SanPham model) {
                String sql = "INSERT INTO [dbo].[San_Pham]([Ma], [Ten], [MoTa], [TrangThai]) VALUES(?, ?, ?, ?)";
                return JdbcHelper.executeUpdate(sql, model.toInsert());
        }

        public void update(SanPham model) {
                String sql = "UPDATE [dbo].[San_Pham] SET [Ten] = ?, [MoTa] = ?, [TrangThai] = ? WHERE [Ma] = ?";
                JdbcHelper.executeUpdate(sql, model.getTen(), model.getMoTa(), model.isTrangThai(), model.getMa());
        }

        public void delete(String ma) {
                String sql = "UPDATE [dbo].[San_Pham] SET [Deleted] = 1 WHERE [Ma] = ?";
                JdbcHelper.executeUpdate(sql, ma);
        }

        private List<SanPham> select(String sql, Object... args) {
                List<SanPham> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        SanPham model = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6) == 1);
                                        list.add(model);
                                }
                        } finally {
                                rs.getStatement().getConnection().close();
                        }
                } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                        throw new RuntimeException(ex);
                }
                return list;
        }

        public List<SanPham> selectAll() {
                return select(getSP_All);
        }

        public List<SanPham> selectSP_Deleted(int deleted, int page, int limit) {
                return select(get_SP_Deleted, deleted, page, limit);
        }

        public SanPham findByMa(String ma) {
                return select(findByMa, ma).get(0);
        }

        public List<SanPham> paging(int page, int limit) {
                String sql = "SELECT San_Pham.id,Ma,Ten,MoTa,COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) AS TongSoLuongTon,\n"
                        + "CASE WHEN COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) > 0 THEN 1 ELSE 0 END AS TrangThai\n"
                        + "FROM San_Pham LEFT JOIN San_Pham_Chi_Tiet ON San_Pham.id = San_Pham_Chi_Tiet.IDSanPham\n"
                        + "GROUP BY San_Pham.id,Ma,Ten,MoTa ORDER BY id DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
                return select(sql, page, limit);
        }

        public List<SanPham> pagingDeleted(int deleted, int page, int limit) {
                return select(get_SP_Deleted, deleted, page, limit);
        }
        
        
}
