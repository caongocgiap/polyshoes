
package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO {
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
        
        private List<SanPham> select(String sql, Object...args) {
                List<SanPham> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        SanPham model = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4) == 1);
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
        
        public List<SanPham> select() {
                String sql = "SELECT Ma, Ten, MoTa, TrangThai FROM San_Pham WHERE Deleted = 0";
                return select(sql);
        }
        
        public SanPham findById(String ma) {
                String sql = "SELECT Ma, Ten,  MoTa, TrangThai FROM San_Pham WHERE Ma =?";
                List<SanPham> list = select(sql, ma);
                return !list.isEmpty() ? list.get(0) : null;
        }
        
        public int getId(String ma) {
                String sql = "SELECT ID FROM San_Pham WHERE Ma =?";
                ResultSet rs = null;
                int id = 0;
                try {
                        rs = JdbcHelper.executeQuery(sql, ma);
                        while(rs.next()) {
                                id = rs.getInt(1);
                                return id;
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return 0;
        }
        
        public List<SanPham> paging(int page, int limit) {
                String sql = "select Ma, Ten, MoTa, TrangThai from San_Pham WHERE Deleted = 0 ORDER BY id DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
                return select(sql, page, limit);
        }
}
