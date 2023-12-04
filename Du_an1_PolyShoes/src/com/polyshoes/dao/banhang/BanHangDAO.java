package com.polyshoes.dao.banhang;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.HoaDon;

public class BanHangDAO {
        final String TAO_HD = "{CALL Tao_Hoa_Don(?,?,?)}";
        final String BAN_HANG = "{CALL Them_HDCT(?,?,?)}";
        final String GIAM_SL_GIO_HANG = "{CALL Giam_SL_GioHang(?,?,?)}";
        
        public void taoHD(int idNV, int idKH) {
                HoaDon hd = new HoaDon();
                JdbcHelper.executeUpdate(TAO_HD, idNV, idKH, hd.generateCode());
        }
        
        public void huyHD(String maHD) {
                String sql = "UPDATE Hoa_Don SET Deleted = 1, TrangThai = 2 WHERE MaHD = ?";
                JdbcHelper.executeUpdate(sql, maHD);
        }
        
        public void banHang(String maSPCT, int SLBan, int idHD) {
                JdbcHelper.executeUpdate(BAN_HANG, maSPCT, SLBan, idHD);
        }
        
        public void giamSL(int soLuong, int idSPCT, String maSPCT) {
                JdbcHelper.executeUpdate(GIAM_SL_GIO_HANG, soLuong, idSPCT, maSPCT);
        }
}
