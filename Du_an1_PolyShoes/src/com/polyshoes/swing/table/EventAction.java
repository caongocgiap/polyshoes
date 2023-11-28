package com.polyshoes.swing.table;

import com.polyshoes.model.sanpham.SanPham;


public interface EventAction {

    public void delete(SanPham sanPham);

    public void update(SanPham sanPham);
}
