package com.polyshoes.component;

public class ProfileJPanel extends javax.swing.JPanel {

    public ProfileJPanel() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lblTenApp = new javax.swing.JLabel();

                lblTenApp.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
                lblTenApp.setForeground(new java.awt.Color(224, 224, 224));
                lblTenApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/logo.png"))); // NOI18N
                lblTenApp.setText(" PolyShoes");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTenApp, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTenApp, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel lblTenApp;
        // End of variables declaration//GEN-END:variables
}
