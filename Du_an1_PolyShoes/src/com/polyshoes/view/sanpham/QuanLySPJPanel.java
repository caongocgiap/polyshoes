
package com.polyshoes.view.sanpham;

public class QuanLySPJPanel extends javax.swing.JPanel {

        public QuanLySPJPanel() {
                initComponents();
                
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                tabTong = new javax.swing.JTabbedPane();
                tab1 = new com.polyshoes.view.sanpham.SanPhamJPanel();
                tab2 = new com.polyshoes.view.sanpham.QLSPJPanel();
                tab3 = new com.polyshoes.view.sanpham.ThuocTinhJPanel();

                setBackground(new java.awt.Color(255, 255, 255));
                setPreferredSize(new java.awt.Dimension(1058, 730));
                setLayout(new java.awt.BorderLayout());

                tabTong.setBackground(new java.awt.Color(255, 255, 255));
                tabTong.setForeground(new java.awt.Color(255, 255, 255));
                tabTong.setMinimumSize(new java.awt.Dimension(993, 650));
                tabTong.setPreferredSize(new java.awt.Dimension(1058, 720));
                tabTong.addTab("Sản phẩm", tab1);

                tab2.setForeground(new java.awt.Color(255, 255, 255));
                tabTong.addTab("Sản phẩm chi tiết", tab2);
                tabTong.addTab("Thuộc tính", tab3);

                add(tabTong, java.awt.BorderLayout.PAGE_START);
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.view.sanpham.SanPhamJPanel tab1;
        private com.polyshoes.view.sanpham.QLSPJPanel tab2;
        private com.polyshoes.view.sanpham.ThuocTinhJPanel tab3;
        private javax.swing.JTabbedPane tabTong;
        // End of variables declaration//GEN-END:variables
}
