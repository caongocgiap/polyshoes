package com.qrcodewebcam;

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
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ReadQrcode extends javax.swing.JFrame implements Runnable, ThreadFactory {

        private WebcamPanel panel = null;
        private Webcam webcam = null;
        private Executor executor = Executors.newSingleThreadExecutor(this);

        public ReadQrcode() {
                initComponents();
                initWebcam();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                pnlCam = new javax.swing.JPanel();
                txtKetQua = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                pnlCam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                getContentPane().add(pnlCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
                getContentPane().add(txtKetQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 540, 50));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        /**
         * @param args the command line arguments
         */
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
                        java.util.logging.Logger.getLogger(ReadQrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ReadQrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ReadQrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ReadQrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ReadQrcode().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel pnlCam;
        private javax.swing.JTextField txtKetQua;
        // End of variables declaration//GEN-END:variables

        private void initWebcam() {
                Dimension size = WebcamResolution.QVGA.getSize();
                webcam = Webcam.getWebcams().get(0);
                webcam.setViewSize(size);

                panel = new WebcamPanel(webcam);
                panel.setPreferredSize(size);
                panel.setFPSDisplayed(true);

                pnlCam.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

                executor.execute(this);
        }

        @Override
        public Thread newThread(Runnable r) {
                Thread t = new Thread(r, "My Thread");
                t.setDaemon(true);
                return t;
        }

        @Override
        public void run() {
                do {
                        try {
                                Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }

                        Result result = null;
                        BufferedImage image = null;

                        if (webcam.isOpen()) {
                                continue;
                        }

                        LuminanceSource source = new BufferedImageLuminanceSource(image);

                        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

                        try {
                                result = new MultiFormatReader().decode(bitmap);
                        } catch (NotFoundException e) {
                        }

                        if (result != null) {
                                txtKetQua.setText(result.getText());
                        }

                } while (true);
        }

}
