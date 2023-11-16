package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.XuatXu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class XuatXuDAO {
        public void insert(XuatXu model) {
                String sql = "INSERT INTO [dbo].[Xuat_Xu]([Ma], [Ten]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }
        
        public void update(XuatXu model) {
                String sql = "UPDATE Xuat_Xu SET Ma=?, Ten=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }
        
        private List<XuatXu> select(String sql, Object...args) {
                List<XuatXu> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        XuatXu model = new XuatXu(rs.getString(1), rs.getString(2));
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
        
        public List<XuatXu> select() {
                String sql = "SELECT Ma, Ten FROM Xuat_Xu";
                return select(sql);
        }
        
        public XuatXu findById(String macd) {
                String sql = "SELECT Ma, Ten FROM Xuat_Xu WHERE Ma =?";
                List<XuatXu> list = select(sql, macd);
                return !list.isEmpty() ? list.get(0) : null;
        }
        
        public int getId(String ma) {
                String sql = "SELECT ID FROM Xuat_Xu WHERE Ma =?";
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
