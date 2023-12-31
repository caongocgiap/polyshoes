/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.swing.table;

import com.polyshoes.view.glasspanepopup.GlassPanePopup;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author quan
 */
public class MessageThanhCongJpanel extends javax.swing.JPanel {

    /**
     * Creates new form Message
     */
    public MessageThanhCongJpanel() {
        initComponents();
        setOpaque(false);
        txt.setBackground(new Color(0,0,0,0));
        txt.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();
        super.paintComponent(grphcs);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JLabel();
        btnCo = new com.polyshoes.swing.table.ButtonMessage();

        setBackground(new java.awt.Color(255, 255, 255));

        txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt.setText("Thêm Thành Công !");

        btnCo.setBackground(new java.awt.Color(102, 255, 102));
        btnCo.setText("OK");
        btnCo.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_btnCoActionPerformed
    public void eventOK(ActionListener event){
        btnCo.addActionListener(event);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.polyshoes.swing.table.ButtonMessage btnCo;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
