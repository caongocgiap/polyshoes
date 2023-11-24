package com.polyshoes.dao.sanpham;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.sanpham.SanPhamChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamCTDAO {
        
        final String PAGGINH_BY_MA = "{CALL pagging_SPCT_By_Ma(?,?,?)}";
        final String THEM_SPCT = "{CALL them_SPCT(?,?,?,?,?,?,?,?,?,?,?,?)}";
        final String GET_1SPCT_BY_MA = "{CALL get_1SPCT_ByMa(?)}";

        private List<SanPhamChiTiet> select(String sql, Object... args) {
                List<SanPhamChiTiet> list = new ArrayList<>();
                try {
                        ResultSet rs = null;
                        try {
                                rs = JdbcHelper.executeQuery(sql, args);
                                while (rs.next()) {
                                        SanPhamChiTiet model = new SanPhamChiTiet(rs.getString(1), rs.getString(2), rs.getString(3),
                                                rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
                                                rs.getInt(11), rs.getDouble(12), rs.getInt(13), rs.getDouble(14), rs.getString(15));
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

        public List<SanPhamChiTiet> select() {
                String sql = "SELECT    San_Pham.Ma, San_Pham.Ten, Danh_Muc.Ten, Thuong_Hieu.Ten, Xuat_Xu.Ten, Nha_San_Xuat.Ten, Chat_Lieu.Ten, De_Giay.Ten, Co_Giay.Ten, \n"
                        + "                      Mau_Sac.Ten AS Expr8, Size.Size, San_Pham_Chi_Tiet.Gia, San_Pham_Chi_Tiet.SoLuongTon, San_Pham_Chi_Tiet.KhoiLuong, San_Pham_Chi_Tiet.TrangThai\n"
                        + "FROM         San_Pham_Chi_Tiet INNER JOIN\n"
                        + "                      San_Pham ON San_Pham_Chi_Tiet.IDSanPham = San_Pham.ID INNER JOIN\n"
                        + "                      Size ON San_Pham_Chi_Tiet.IDSize = Size.ID INNER JOIN\n"
                        + "                      Thuong_Hieu ON San_Pham_Chi_Tiet.IDThuongHieu = Thuong_Hieu.ID INNER JOIN\n"
                        + "                      Xuat_Xu ON San_Pham_Chi_Tiet.IDXuatXu = Xuat_Xu.ID INNER JOIN\n"
                        + "                      Mau_Sac ON San_Pham_Chi_Tiet.IDMauSac = Mau_Sac.ID INNER JOIN\n"
                        + "                      Nha_San_Xuat ON San_Pham_Chi_Tiet.IDNSX = Nha_San_Xuat.ID INNER JOIN\n"
                        + "                      De_Giay ON San_Pham_Chi_Tiet.IDDeGiay = De_Giay.ID INNER JOIN\n"
                        + "                      Danh_Muc ON San_Pham_Chi_Tiet.IDDanhMuc = Danh_Muc.ID INNER JOIN\n"
                        + "                      Co_Giay ON San_Pham_Chi_Tiet.IDCoGiay = Co_Giay.ID INNER JOIN\n"
                        + "                      Chat_Lieu ON San_Pham_Chi_Tiet.IDChatLieu = Chat_Lieu.ID";
                return select(sql);
        }
        
        public List<SanPhamChiTiet> paging(String ma, int page, int limit) {
                return select(PAGGINH_BY_MA, ma, page, limit);
        }
        
        public SanPhamChiTiet getByMa(String maSPCT) {
                return select(GET_1SPCT_BY_MA, maSPCT).get(0);
        }
        
        public void insertSPCT(Object... args) {
                JdbcHelper.executeUpdate(THEM_SPCT, args);
        }
}
