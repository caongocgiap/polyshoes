package com.polyshoes.dao.voucher;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.voucher.Voucher;
import com.polyshoes.view.dangnhap.Auth;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class VoucherDAO {

        final String INSERT = "{CALL Them_Voucher(?,?,?,?,?,?,?,?,?)}";

        private List<Voucher> select(String sql, Object... args) {
                List<Voucher> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        Voucher model = new Voucher(
                                                rs.getInt(1),
                                                rs.getInt(2),
                                                rs.getString(3),
                                                rs.getString(4),
                                                rs.getDate(5),
                                                rs.getDate(6),
                                                rs.getInt(7),
                                                rs.getDouble(8),
                                                rs.getInt(9),
                                                rs.getDouble(10),
                                                rs.getDate(11),
                                                rs.getInt(12),
                                                rs.getInt(13)
                                        );
                                        list.add(model);
                                }
                        } finally {
                                rs.getStatement().getConnection().close();
                        }
                } catch (SQLException ex) {
                        ex.printStackTrace();
                        throw new RuntimeException(ex);
                }
                return list;
        }

        public int insert(Voucher model) {
                System.out.println("ID nhân viên: " + Auth.user.getId());
                return JdbcHelper.executeUpdate(INSERT, model.getMa(), model.getTen(), model.getNgayBD(), model.getNgayKT(), model.getSoLuong(),
                        model.getGiaTriMin(), model.getPhanTramGiam(), model.getGiamToiDa(), Auth.user.getId());
        }

        public List<Voucher> selectAll() {
                String sql = """
                             SELECT ROW_NUMBER() OVER (ORDER BY Id DESC), ID, Ma, Voucher.Ten, NgayBD, NgayKT, 
                             SoLuong, GTToiThieu, PhanTramGiam, GiamToiDa, NgayTao, NguoiTao, TrangThai FROM Voucher""";
                return select(sql);
        }
        
        public List<Voucher> selectByTrangThai(int trangThai) {
                String sql = """
                             SELECT ROW_NUMBER() OVER (ORDER BY Id DESC), ID, Ma, Voucher.Ten, NgayBD, NgayKT, 
                             SoLuong, GTToiThieu, PhanTramGiam, GiamToiDa, NgayTao, NguoiTao, TrangThai FROM Voucher WHERE TrangThai = ?""";
                return select(sql, trangThai);
        }
        
        public List<Voucher> selectByTen(String tenKM) {
                String sql = """
                             SELECT ROW_NUMBER() OVER (ORDER BY Id DESC), ID, Ma, Voucher.Ten, NgayBD, NgayKT, 
                             SoLuong, GTToiThieu, PhanTramGiam, GiamToiDa, NgayTao, NguoiTao, TrangThai FROM Voucher WHERE Ten LIKE ?""";
                return select(sql, tenKM);
        }
        
        public int updateSoLuong(int idVoucher) {
                String sql = "UPDATE Voucher SET SoLuong = SoLuong - 1 WHERE ID = ?";
                return JdbcHelper.executeUpdate(sql, idVoucher);
        }
        
        public int updateTrangThai(int trangThai, String ma) {
                String sql = "UPDATE Voucher SET TrangThai = ? WHERE Ma = ?";
                return JdbcHelper.executeUpdate(sql, trangThai, ma);
        }
}
