package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.ThuongHieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThuongHieuDAO {
        public void insert(ThuongHieu model) {
                String sql = "INSERT INTO [dbo].[Thuong_Hieu]([Ma], [Ten]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }
        
        public void update(ThuongHieu model) {
                String sql = "UPDATE Thuong_Hieu SET Ma=?, Ten=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }
        
        private List<ThuongHieu> select(String sql, Object...args) {
                List<ThuongHieu> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        ThuongHieu model = new ThuongHieu(rs.getString(1), rs.getString(2));
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
        
        public List<ThuongHieu> select() {
                String sql = "SELECT Ma, Ten FROM Thuong_Hieu";
                return select(sql);
        }
        
        public ThuongHieu findById(String macd) {
                String sql = "SELECT Ma, Ten FROM Thuong_Hieu WHERE Ma =?";
                List<ThuongHieu> list = select(sql, macd);
                return !list.isEmpty() ? list.get(0) : null;
        }
        
        public int getId(String ma) {
                String sql = "SELECT ID FROM Thuong_Hieu WHERE Ma =?";
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
