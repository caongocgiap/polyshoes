package com.polyshoes.swing.table;

import com.polyshoes.model.khachhang.KhachHang;


public interface EventAction {

    public void delete(int row);

    public void onEdit(int row);
}
