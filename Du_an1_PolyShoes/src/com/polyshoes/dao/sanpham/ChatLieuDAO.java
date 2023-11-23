package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.ChatLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChatLieuDAO {

        public void insert(ChatLieu model) {
                String sql = "INSERT INTO [dbo].[Chat_Lieu]([Ma], [Ten]) VALUES(?, ?)";
                JdbcHelper.executeUpdate(sql, model.toInsert());
        }

        public void update(ChatLieu model) {
                String sql = "UPDATE Chat_Lieu SET Ma=?, Ten=? WHERE Ma=?";
                JdbcHelper.executeUpdate(sql, model.getMa(), model.getTen(), model.getMa());
        }

        private List<ChatLieu> select(String sql, Object... args) {
                List<ChatLieu> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        ChatLieu model = new ChatLieu(rs.getString(1), rs.getString(2));
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

        public List<ChatLieu> select() {
                String sql = "SELECT Ma, Ten FROM Chat_Lieu";
                return select(sql);
        }

        public ChatLieu findById(String macd) {
                String sql = "SELECT Ma, Ten FROM Chat_Lieu WHERE Ma =?";
                List<ChatLieu> list = select(sql, macd);
                return !list.isEmpty() ? list.get(0) : null;
        }
        
        public int getId(String ma) {
                String sql = "SELECT ID FROM Chat_Lieu WHERE Ma =?";
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
