
package com.qrcode;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.polyshoes.view.banhang.BanHangJPanel2;
import com.polyshoes.view.sanpham.SanPhamChiTietJFrame;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QR_Code extends javax.swing.JFrame implements  Runnable, ThreadFactory {

        private WebcamPanel panel = null;
        private Webcam webcam = null;
        private Executor executor = Executors.newSingleThreadExecutor(this);
        
        public QR_Code() {
                initComponents();
                initWebcam();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel2 = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Polyshoes");
                setResizable(false);

                jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(QR_Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(QR_Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(QR_Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(QR_Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new QR_Code().setVisible(true);
                        }
                });
        }
        
        private void initWebcam() {
                Dimension size = WebcamResolution.QVGA.getSize();
                webcam = Webcam.getWebcams().get(0);
                webcam.setViewSize(size);
                
                panel = new WebcamPanel(webcam);
                panel.setPreferredSize(size);
                panel.setFPSDisplayed(true);
                
                jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));
                
                executor.execute(this);
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel jPanel2;
        // End of variables declaration//GEN-END:variables

        @Override
        public void run() {
                do {
                        try {
                                Thread.sleep(100);
                        } catch (InterruptedException ex) {
                                Logger.getLogger(QR_Code.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        Result result = null;
                        BufferedImage image = null;
                        
                        if(webcam.isOpen()) {
                                if((image = webcam.getImage()) == null) {
                                        continue;
                                }
                        }
                        
                        LuminanceSource source = new BufferedImageLuminanceSource(image);
                        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                        
                        try {
                                result = new MultiFormatReader().decode(bitmap);
                        } catch (NotFoundException ex) {
                                Logger.getLogger(QR_Code.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        if(result != null) {
                                SanPhamChiTietJFrame.maSPCT = result.getText();
                                BanHangJPanel2.maSPChiTiet = result.getText();
                                new SanPhamChiTietJFrame().setVisible(true);
                                webcam.close();
                                this.setVisible(false);
                                return;
                        }
                } while(true);
        }

        @Override
        public Thread newThread(Runnable r) {
                Thread t = new Thread(r, "My Thread");
                t.setDaemon(true);
                return t;
        }
}
