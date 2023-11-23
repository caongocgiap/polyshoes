package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.MauSac;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MauSacDAO {

        public void insert(MauSac model) {
                String sql = "INSERT INTO [dbo].[Mau_Sac]([Ma], [Ten]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }

        public void update(MauSac model) {
                String sql = "UPDATE Mau_Sac SET Ma=?, Ten=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }

        private List<MauSac> select(String sql, Object... args) {
                List<MauSac> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        MauSac model = new MauSac(rs.getString(1), rs.getString(2));
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

        public List<MauSac> select() {
                String sql = "SELECT Ma, Ten FROM Mau_Sac";
                return select(sql);
        }

        public MauSac findById(String macd) {
                String sql = "SELECT Ma, Ten FROM Mau_Sac WHERE Ma =?";
                List<MauSac> list = select(sql, macd);
                return !list.isEmpty() ? list.get(0) : null;
        }

        public int getId(String ma) {
                String sql = "SELECT ID FROM Mau_Sac WHERE Ma =?";
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
