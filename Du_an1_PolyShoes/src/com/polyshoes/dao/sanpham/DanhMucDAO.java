package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.DanhMuc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DanhMucDAO {

        public void insert(DanhMuc model) {
                String sql = "INSERT INTO [dbo].[Danh_Muc]([Ma], [Ten]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }

        public void update(DanhMuc model) {
                String sql = "UPDATE Danh_Muc SET Ma=?, Ten=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }

        private List<DanhMuc> select(String sql, Object... args) {
                List<DanhMuc> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        DanhMuc model = new DanhMuc(rs.getString(1), rs.getString(2));
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

        public List<DanhMuc> select() {
                String sql = "SELECT Ma, Ten FROM Danh_Muc";
                return select(sql);
        }

        public DanhMuc findById(String macd) {
                String sql = "SELECT Ma, Ten FROM Danh_Muc WHERE Ma =?";
                List<DanhMuc> list = select(sql, macd);
                return !list.isEmpty() ? list.get(0) : null;
        }

        public int getId(String ma) {
                String sql = "SELECT ID FROM Danh_Muc WHERE Ma =?";
                ResultSet rs = null;
                int id = 0;
                try {
                        rs = JdbcHelper.executeQuery(sql, ma);
                        while (rs.next()) {
                                id = rs.getInt(1);
                                return id;
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return 0;
        }
}
