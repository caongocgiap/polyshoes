package com.polyshoes.view.thongke;

import com.polyshoes.chart.ModelChart;
import java.awt.Color;

public class Form_1 extends javax.swing.JPanel {

    public Form_1() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init() {
        chart.addLegend("Khách mới", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Khách cũ", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Sản phẩm mới", new Color(5, 125, 0), new Color(95, 209, 69));
        chart.addLegend("Sản phẩm cũ", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addData(new ModelChart("Tháng 7", new double[]{500, 200, 80, 89}));
        chart.addData(new ModelChart("Tháng 8", new double[]{600, 750, 90, 150}));
        chart.addData(new ModelChart("Tháng 9", new double[]{200, 350, 460, 900}));
        chart.addData(new ModelChart("Tháng 10", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("Tháng 11", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("Tháng 12", new double[]{190, 280, 81, 200}));
        chart.start();
        lineChart.addLegend("Khách mới", new Color(12, 84, 175), new Color(0, 108, 247));
        lineChart.addLegend("Khách cũ", new Color(54, 4, 143), new Color(104, 49, 200));
        lineChart.addLegend("Sản phẩm mới", new Color(5, 125, 0), new Color(95, 209, 69));
        lineChart.addLegend("Sản phẩm cũ", new Color(186, 37, 37), new Color(241, 100, 120));
        lineChart.addData(new ModelChart("Tháng 7", new double[]{500, 200, 80, 89}));
        lineChart.addData(new ModelChart("Tháng 8", new double[]{600, 750, 90, 150}));
        lineChart.addData(new ModelChart("Tháng 9", new double[]{200, 350, 460, 900}));
        lineChart.addData(new ModelChart("Tháng 10", new double[]{480, 150, 750, 700}));
        lineChart.addData(new ModelChart("Tháng 11", new double[]{350, 540, 300, 150}));
        lineChart.addData(new ModelChart("Tháng 12", new double[]{190, 280, 81, 200}));
        lineChart.start();
        progress1.start();
        progress2.start();
        progress3.start();
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                roundPanel1 = new com.polyshoes.swing.RoundPanel();
                jPanel1 = new javax.swing.JPanel();
                progress1 = new com.polyshoes.swing.progress.Progress();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                progress2 = new com.polyshoes.swing.progress.Progress();
                jLabel3 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                progress3 = new com.polyshoes.swing.progress.Progress();
                jLabel4 = new javax.swing.JLabel();
                roundPanel2 = new com.polyshoes.swing.RoundPanel();
                chart = new com.polyshoes.chart.Chart();
                roundPanel3 = new com.polyshoes.swing.RoundPanel();
                lineChart = new com.polyshoes.chart.LineChart();

                setBackground(new java.awt.Color(255, 255, 255));

                roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
                roundPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                jPanel1.setOpaque(false);

                progress1.setBackground(new java.awt.Color(66, 246, 84));
                progress1.setForeground(new java.awt.Color(19, 153, 32));
                progress1.setValue(60);

                jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(102, 102, 102));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Tổng số khách hàng");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(progress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                jLabel2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 255));
                jLabel2.setText("Thống kê hàng tháng");
                jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                jPanel2.setOpaque(false);

                progress2.setBackground(new java.awt.Color(132, 66, 246));
                progress2.setForeground(new java.awt.Color(64, 18, 153));
                progress2.setValue(70);

                jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(102, 102, 102));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Tổng sản phẩm");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(progress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                jPanel3.setOpaque(false);

                progress3.setBackground(new java.awt.Color(66, 193, 246));
                progress3.setForeground(new java.awt.Color(26, 132, 181));
                progress3.setValue(85);

                jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(102, 102, 102));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("Tổng doanh thu");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(progress3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(progress3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
                roundPanel1.setLayout(roundPanel1Layout);
                roundPanel1Layout.setHorizontalGroup(
                        roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                roundPanel1Layout.setVerticalGroup(
                        roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );

                roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
                roundPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
                roundPanel2.setLayout(roundPanel2Layout);
                roundPanel2Layout.setHorizontalGroup(
                        roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                roundPanel2Layout.setVerticalGroup(
                        roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
                roundPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
                roundPanel3.setLayout(roundPanel3Layout);
                roundPanel3Layout.setHorizontalGroup(
                        roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lineChart, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                                .addContainerGap())
                );
                roundPanel3Layout.setVerticalGroup(
                        roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.chart.Chart chart;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private com.polyshoes.chart.LineChart lineChart;
        private com.polyshoes.swing.progress.Progress progress1;
        private com.polyshoes.swing.progress.Progress progress2;
        private com.polyshoes.swing.progress.Progress progress3;
        private com.polyshoes.swing.RoundPanel roundPanel1;
        private com.polyshoes.swing.RoundPanel roundPanel2;
        private com.polyshoes.swing.RoundPanel roundPanel3;
        // End of variables declaration//GEN-END:variables
}
