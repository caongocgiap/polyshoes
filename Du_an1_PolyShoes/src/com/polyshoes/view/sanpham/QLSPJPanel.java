package com.polyshoes.view.sanpham;

public class QLSPJPanel extends javax.swing.JPanel {

        public QLSPJPanel() {
                initComponents();
                this.init();
        }
        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                tabTong = new com.polyshoes.swing.tabbed.MaterialTabbed();
                tab1 = new com.polyshoes.swing.tabbed.PanelRound();
                sanPhamJPanel1 = new com.polyshoes.view.sanpham.SanPhamJPanel();
                tab2 = new com.polyshoes.swing.tabbed.PanelRound();
                sanPhamChiTietJPanel2 = new com.polyshoes.view.sanpham.SanPhamChiTietJPanel();
                tab3 = new com.polyshoes.swing.tabbed.PanelRound();
                thuocTinhJPanel1 = new com.polyshoes.view.sanpham.ThuocTinhJPanel();

                setBackground(new java.awt.Color(255, 255, 255));

                tab1.setBackground(new java.awt.Color(255, 255, 255));
                tab1.setLayout(new java.awt.BorderLayout());
                tab1.add(sanPhamJPanel1, java.awt.BorderLayout.CENTER);

                tabTong.addTab("Sản phẩm", tab1);

                tab2.setBackground(new java.awt.Color(255, 255, 255));
                tab2.setLayout(new java.awt.BorderLayout());
                tab2.add(sanPhamChiTietJPanel2, java.awt.BorderLayout.CENTER);

                tabTong.addTab("Chi tiết sản phẩm", tab2);

                tab3.setBackground(new java.awt.Color(255, 255, 255));
                tab3.setLayout(new java.awt.BorderLayout());
                tab3.add(thuocTinhJPanel1, java.awt.BorderLayout.CENTER);

                tabTong.addTab("Thuộc tính sản phẩm", tab3);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.view.sanpham.SanPhamChiTietJPanel sanPhamChiTietJPanel2;
        private com.polyshoes.view.sanpham.SanPhamJPanel sanPhamJPanel1;
        private com.polyshoes.swing.tabbed.PanelRound tab1;
        private com.polyshoes.swing.tabbed.PanelRound tab2;
        private com.polyshoes.swing.tabbed.PanelRound tab3;
        private com.polyshoes.swing.tabbed.MaterialTabbed tabTong;
        private com.polyshoes.view.sanpham.ThuocTinhJPanel thuocTinhJPanel1;
        // End of variables declaration//GEN-END:variables

        private void init() {
                
        }
}
