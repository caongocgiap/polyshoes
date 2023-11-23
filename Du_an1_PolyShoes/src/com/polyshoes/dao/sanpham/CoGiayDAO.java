package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.CoGiay;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoGiayDAO {

        public void insert(CoGiay model) {
                String sql = "INSERT INTO [dbo].[Co_Giay]([Ma], [Ten]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }

        public void update(CoGiay model) {
                String sql = "UPDATE Co_Giay SET Ma=?, Ten=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }

        private List<CoGiay> select(String sql, Object... args) {
                List<CoGiay> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        CoGiay model = new CoGiay(rs.getString(1), rs.getString(2));
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

        public List<CoGiay> select() {
                String sql = "SELECT Ma, Ten FROM Co_Giay";
                return select(sql);
        }

        public CoGiay findById(String macd) {
                String sql = "SELECT Ma, Ten FROM Co_Giay WHERE Ma =?";
                List<CoGiay> list = select(sql, macd);
                return !list.isEmpty() ? list.get(0) : null;
        }

        public int getId(String ma) {
                String sql = "SELECT ID FROM Co_Giay WHERE Ma =?";
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
