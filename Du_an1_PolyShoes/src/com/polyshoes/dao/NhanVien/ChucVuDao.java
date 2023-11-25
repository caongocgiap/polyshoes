/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.dao.NhanVien;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.NhanVien.ChucVu;
import com.polyshoes.model.NhanVien.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vu Hieu
 */
public class ChucVuDao {
     String SELECT_ALL_SQL = "select * from [dbo].[Chuc_Vu]";

    public List<ChucVu> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }
    

    protected List<ChucVu> selectBySQL(String sql, Object... args) {
        List<ChucVu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                ChucVu entity = new ChucVu();
                entity.setId(rs.getInt("id"));
                entity.setMaCV(rs.getString("Ma"));
                entity.setTenCV(rs.getString("Ten"));
              
                
                
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
