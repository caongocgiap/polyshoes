package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.NhaSanXuat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NSXDAO {

        public void insert(NhaSanXuat model) {
                String sql = "INSERT INTO [dbo].[Nha_San_Xuat]([Ma], [Ten]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }

        public void update(NhaSanXuat model) {
                String sql = "UPDATE Nha_San_Xuat SET Ma=?, Ten=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }

        private List<NhaSanXuat> select(String sql, Object... args) {
                List<NhaSanXuat> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        NhaSanXuat model = new NhaSanXuat(rs.getString(1), rs.getString(2));
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

        public List<NhaSanXuat> select() {
                String sql = "SELECT Ma, Ten FROM Nha_San_Xuat";
                return select(sql);
        }

        public NhaSanXuat findById(String macd) {
                String sql = "SELECT Ma, Ten FROM Nha_San_Xuat WHERE Ma =?";
                List<NhaSanXuat> list = select(sql, macd);
                return !list.isEmpty() ? list.get(0) : null;
        }

        public int getId(String ma) {
                String sql = "SELECT ID FROM Nha_San_Xuat WHERE Ma =?";
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
