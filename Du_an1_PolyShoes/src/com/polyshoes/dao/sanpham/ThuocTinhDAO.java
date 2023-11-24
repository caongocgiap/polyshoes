package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.ThuocTinh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThuocTinhDAO {

        String getThuocTinh = "{CALL getThuocTinh(?)}";
        String themThuocTinh = "{CALL themThuocTinh(?,?,?)}";
        String updateThuocTinh = "{CALL updateThuocTinh(?,?,?)}";
        String xoaThuocTinh = "{CALL xoaThuocTinh(?,?,?)}";
        String getIDByTen = "{CALL getIDByTen(?,?)}";

        public List<ThuocTinh> selectBySQL(String sql, Object... args) {
                List<ThuocTinh> list = new ArrayList<>();
                try {
                        ResultSet rs = JdbcHelper.executeQuery(sql, args);
                        while (rs.next()) {
                                ThuocTinh thuocTinh = new ThuocTinh(rs.getInt(1), rs.getString(2), rs.getString(3));
                                list.add(thuocTinh);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return list;
        }

        public List<ThuocTinh> select(String tenBang) {
                return selectBySQL(getThuocTinh, tenBang);
        }

        public void insert(String tenBang, ThuocTinh model) {
                JdbcHelper.executeUpdate(themThuocTinh, tenBang, model.generateCode(), model.getTen());
        }

        public void update(String tenBang, int id, ThuocTinh objThuocTinh) {
                JdbcHelper.executeUpdate(updateThuocTinh, tenBang, id, objThuocTinh.getTen());
        }

        public void delete(String tenBang, int id, int deleted) {
                JdbcHelper.executeUpdate(xoaThuocTinh, tenBang, id, deleted);
        }

        public ThuocTinh getByName(String tenBang, String ten) {
                List<ThuocTinh> list = selectBySQL(getIDByTen, tenBang, ten);
                if (list.isEmpty()) {
                        return null;
                }
                return list.get(0);
        }
       
}
