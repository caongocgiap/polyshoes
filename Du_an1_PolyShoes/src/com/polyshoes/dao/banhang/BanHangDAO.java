package com.polyshoes.dao.banhang;

import com.polyshoes.helper.JdbcHelper;
import com.polyshoes.model.HoaDon.HoaDon;

public class BanHangDAO {
        final String TAO_HD = "{CALL Tao_Hoa_Don(?,?,?)}";
        final String BAN_HANG = "{CALL Them_HDCT(?,?,?)}";
        
        public void taoHD(int idNV, int idKH) {
                HoaDon hd = new HoaDon();
                JdbcHelper.executeUpdate(TAO_HD, idNV, idKH, hd.generateCode());
        }
        
        public void banHang(String maSPCT, int SLBan, int idHD) {
                JdbcHelper.executeUpdate(BAN_HANG, maSPCT, SLBan, idHD);
        }
}
