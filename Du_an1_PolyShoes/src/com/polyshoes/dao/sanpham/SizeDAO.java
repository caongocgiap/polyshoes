package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.Size;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SizeDAO {
        public void insert(Size model) {
                String sql = "INSERT INTO [dbo].[Size]([Ma], [Size]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }
        
        public void update(Size model) {
                String sql = "UPDATE Size SET Size=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }
        
        private List<Size> select(String sql, Object...args) {
                List<Size> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        Size model = new Size(rs.getString(1), rs.getString(2));
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
        
        public List<Size> select() {
                String sql = "SELECT ID, Ma, Size FROM Size";
                return select(sql);
        }
        
        public Size findById(String ma) {
                String sql = "SELECT Ma, Size FROM Size WHERE Ma =?";
                List<Size> list = select(sql, ma);
                return !list.isEmpty() ? list.get(0) : null;
        }
        
        public int getId(String ma) {
                String sql = "SELECT ID FROM Size WHERE Ma =?";
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
