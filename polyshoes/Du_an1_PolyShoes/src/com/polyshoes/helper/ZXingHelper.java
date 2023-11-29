package com.polyshoes.helper;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ZXingHelper {

        public static byte[] getQRCodeImage(String text, int width, int height) {
                try {
                        QRCodeWriter qrCodeWrite = new QRCodeWriter();
                        BitMatrix bitMatrix = qrCodeWrite.encode(text, BarcodeFormat.QR_CODE, width, height);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        MatrixToImageWriter.writeToStream(bitMatrix, "png", byteArrayOutputStream);
                        return byteArrayOutputStream.toByteArray();
                } catch (WriterException | IOException e) {
                        return null;
                }
        }
}
