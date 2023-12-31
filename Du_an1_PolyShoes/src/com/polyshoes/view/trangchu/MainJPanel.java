package com.polyshoes.view.trangchu;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.border.EmptyBorder;

public class MainJPanel extends javax.swing.JPanel {

    public MainJPanel() {
        initComponents();
        setOpaque(false);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 20, 10, 20));
    }

    public void showForm(Component form) {
        removeAll();
        add(form);
        repaint();
        revalidate();
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                setBackground(new java.awt.Color(255, 255, 255));
                setForeground(new java.awt.Color(255, 255, 255));
                setOpaque(false);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        // End of variables declaration//GEN-END:variables
}
