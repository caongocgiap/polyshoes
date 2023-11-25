package com.polyshoes.view.trangchu;

import com.polyshoes.model.trangchu.Card;
import com.polyshoes.swing.icon.GoogleMaterialDesignIcons;
import com.polyshoes.swing.icon.IconFontSwing;
import java.awt.Color;
import javax.swing.Icon;

public class TrangChuJPanel extends javax.swing.JPanel {

        public TrangChuJPanel() {
                initComponents();
                table1.fixTable(jScrollPane1);
                setOpaque(false);
                initData();
        }

        private void initData() {
                initCardData();
        }

        private void initCardData() {
                Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
                card1.setData(new Card("Tổng khách hàng hôm nay", 2, 60, icon1));
                Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.MONETIZATION_ON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
                card2.setData(new Card("Tổng doanh thu hôm nay", 890000, 80, icon2));
                Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
                card3.setData(new Card("Tổng hóa đơn", 2, 80, icon3));
                Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.BUSINESS_CENTER, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
                card4.setData(new Card("Hóa đơn đã hủy", 0, 0, icon4));
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                card1 = new com.polyshoes.component.CardJPanel();
                jLabel1 = new javax.swing.JLabel();
                card2 = new com.polyshoes.component.CardJPanel();
                card3 = new com.polyshoes.component.CardJPanel();
                card4 = new com.polyshoes.component.CardJPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                table1 = new com.polyshoes.swing.table.Table();

                card1.setColorGradient(new java.awt.Color(211, 28, 215));

                jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(4, 72, 210));
                jLabel1.setText("Dashboard / Home");

                card2.setBackground(new java.awt.Color(10, 30, 214));
                card2.setColorGradient(new java.awt.Color(72, 111, 252));

                card3.setBackground(new java.awt.Color(194, 85, 1));
                card3.setColorGradient(new java.awt.Color(255, 212, 99));

                card4.setBackground(new java.awt.Color(60, 195, 0));
                card4.setColorGradient(new java.awt.Color(208, 255, 90));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(76, 76, 76));
                jLabel5.setText("Thông tin chung");
                jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                table1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane1.setViewportView(table1);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1))
                                .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.component.CardJPanel card1;
        private com.polyshoes.component.CardJPanel card2;
        private com.polyshoes.component.CardJPanel card3;
        private com.polyshoes.component.CardJPanel card4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private com.polyshoes.swing.table.Table table1;
        // End of variables declaration//GEN-END:variables
}
