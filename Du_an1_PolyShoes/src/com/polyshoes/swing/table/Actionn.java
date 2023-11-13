package com.polyshoes.swing.table;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actionn extends javax.swing.JPanel {

        public Actionn(ModelAction data) {
                initComponents();
                cmdEdit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
//                                data.getEvent().update(data.getStudent());
                        }
                });
                cmdDelete.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
//                                data.getEvent().delete(data.getStudent());
                        }
                });
        }

        @Override
        protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.setColor(new Color(230, 230, 230));
                grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                cmdEdit = new com.polyshoes.swing.Button();
                cmdDelete = new com.polyshoes.swing.Button();

                cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/edit.png"))); // NOI18N

                cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/delete.png"))); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmdDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button cmdDelete;
        private com.polyshoes.swing.Button cmdEdit;
        // End of variables declaration//GEN-END:variables
}
