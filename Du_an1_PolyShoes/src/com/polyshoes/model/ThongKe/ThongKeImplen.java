/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.ThongKe;

import com.polyshoes.dao.ThongKe.ThongKeDAO;
import java.util.List;

/**
 *
 * @author quan
 */
public class ThongKeImplen implements ThongKeService{
    
    private ThongKeDAO thongKeDao = null;

    public ThongKeImplen() {
        thongKeDao = new ThongKeDAO();
    }
    
    @Override
    public List<ThongKe> getListByThongKe() {
        return thongKeDao.selectAll();
    }
    
}
