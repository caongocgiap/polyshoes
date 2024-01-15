/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.model.ThongKe;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author quan
 */
public class QuanLyThongKe {
    private ThongKeService thongkeService = null;

    public QuanLyThongKe() {
        thongkeService = new ThongKeImplen();
    }
    public void setDateToChart(JPanel jpnItem){
        List<ThongKe> lst = thongkeService.getListByThongKe();
        
        if (lst != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (ThongKe thongKe : lst) {
                dataset.addValue(thongKe.getDoanhThu(), "Thống Kê", thongKe.getNgayTao());
            }
            JFreeChart chart = ChartFactory.createBarChart("Biểu Đồ Doanh Thu Cửa Hàng",
                    "Thời Gian", "Doanh Thu", dataset);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
            
            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }
    
}
