package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamCTDAO {
        
        final String GET_ALL = "{CALL get_ALL_SPCT(?,?)}";
        final String GET_DELETED = "{CALL get_SPCT_Deleted(?, ?, ?, ?)}";
        final String PAGGINH_BY_MA = "{CALL pagging_SPCT_By_Ma(?,?,?)}";
        final String GET_BY_MA = "{CALL get_1SPCT_ByMa(?)}";
        final String INSERT = "{CALL them_SPCT(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        final String UPDATE = "{CALL update_SPCT(?,?,?,?,?,?,?,?,?,?,?,?,?)}";

        private List<SanPhamChiTiet> select(String sql, Object... args) {
                List<SanPhamChiTiet> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        SanPhamChiTiet model = new SanPhamChiTiet(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                                                rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
                                                rs.getInt(12), rs.getDouble(13), rs.getInt(14), rs.getDouble(15), String.valueOf(rs.getInt(16)));
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

        public List<SanPhamChiTiet> selectAll(int page, int limit) {
                List<SanPhamChiTiet> list = select(GET_ALL, page, limit);
                return list.isEmpty() ? null : list;
        }
        
        public List<SanPhamChiTiet> selectDeleted(String maSP, int deleted, int page, int limit) {
                List<SanPhamChiTiet> list = select(GET_DELETED, maSP, deleted, page, limit);
                return list.isEmpty() ? null : list;
        }
        
        public List<SanPhamChiTiet> paging(String ma, int page, int limit) {
                return select(PAGGINH_BY_MA, ma, page, limit);
        }
        
        public SanPhamChiTiet getByMa(String maSPCT) {
                return select(GET_BY_MA, maSPCT).get(0);
        }
        
        public void insert(Object... args) {
                JdbcHelper.executeUpdate(INSERT, args);
        }
        
        public void update(Object... args) {
                JdbcHelper.executeUpdate(UPDATE, args);
        }
}
