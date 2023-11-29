package com.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.view.sanpham.SanPhamChiTietJPanel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TaiMaQR {
        
        public static String maSPCT;

        public static void taiQR() {
                String fileName = maSPCT + ".png";
                String filePath = "D:\\" + fileName;
                try {
                        QRCodeWriter qrCodeWriter = new QRCodeWriter();
                        BitMatrix bitMatrix = qrCodeWriter.encode(maSPCT, BarcodeFormat.QR_CODE, 300, 300);

                        BufferedImage bufferedImage = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
                        Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();
                        graphics.setColor(Color.WHITE);
                        graphics.fillRect(0, 0, 300, 300);
                        graphics.setColor(Color.BLACK);

                        for (int i = 0; i < 300; i++) {
                                for (int j = 0; j < 300; j++) {
                                        if (bitMatrix.get(i, j)) {
                                                graphics.fillRect(i, j, 1, 1);
                                        }
                                }
                        }
                        ImageIO.write(bufferedImage, "png", new File(filePath));
                        System.out.println("QR Code đã được lưu tại: " + filePath);
                        DialogHelper.alert(new SanPhamChiTietJPanel(), "QR Code đã được lưu tại: " + filePath);
                } catch (WriterException | IOException e) {
                        e.printStackTrace();
                        DialogHelper.alert(new SanPhamChiTietJPanel(), "Lưu mã thất bại!");
                }
        }
}
