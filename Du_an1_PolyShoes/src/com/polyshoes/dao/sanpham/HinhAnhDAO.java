package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;

public class HinhAnhDAO {
        
        public int insert(int idSPCT, String URL) {
                String sql = "INSERT INTO Hinh_Anh (IDSanPhamCT, URL) VALUES (?,?)";
                return JdbcHelper.executeUpdate(sql, idSPCT, URL);
        }
}
