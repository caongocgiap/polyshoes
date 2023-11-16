package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.HinhAnh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HinhAnhDAO {
        public void insert(HinhAnh model) {
                String sql = "INSERT INTO [dbo].[Hinh_Anh]([URL], [Cover]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }
        
        // chua nghi ra rang buoc
//        public void update(HinhAnh model) {
//                String sql = "UPDATE Hinh_Anh SET URL=?, Cover=? WHERE IDSanPhamCT=?";
//                JdbcHelper.executeUpdate(sql, model.get(), model.getTen(), model.getMa());
//        }
        
        private List<HinhAnh> select(String sql, Object...args) {
                List<HinhAnh> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        HinhAnh model = new HinhAnh(rs.getString(1), (rs.getInt(2) == 1));
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
        
        public List<HinhAnh> select() {
                String sql = "SELECT URL, Cover FROM Hinh_Anh";
                return select(sql);
        }
        
        public HinhAnh findById(String ma) {
                String sql = "SELECT URL, Cover FROM Hinh_Anh WHERE ID =?";
                List<HinhAnh> list = select(sql, ma);
                return !list.isEmpty() ? list.get(0) : null;
        }
        
        public int getId(String ma) {
                String sql = "SELECT ID FROM Hinh_Anh WHERE Ma =?";
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
}
